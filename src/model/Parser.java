package model;

import java.util.regex.Matcher;

import model.regex.Regex;
import model.regex.RegexFactory;

public class Parser {
	private ParserInput myInputStream;
	private RegexFactory myRexgexArray;
	public Parser(ParserInput input){
		myInputStream = input;
		myRexgexArray=new RegexFactory(input);
	}

	public Expression makeExpression( ) {
		Expression result = parseExpression();
		myInputStream.skipWhiteSpace();
		if (myInputStream.notAtEndOfString()) {
			throw new ParserException(
					"Unexpected characters at end of the string: "
							+ myInputStream.getMyInput(),
					ParserException.Type.EXTRA_CHARACTERS);
		}
		return result;
	}

	public Expression parseExpression() {
		myInputStream.skipWhiteSpace();
		Matcher matcherType;

		for (Regex runRegex : myRexgexArray.allregex()) {
			matcherType = runRegex.match(myInputStream.getMyInput());
			if (matcherType.lookingAt())
				return runRegex.parse();
		}
		return null;
	}

}
