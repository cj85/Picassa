package model.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Expression;
import model.ParserInput;

abstract public class Regex {
		private Pattern myPattern;
		private int mySkip;
		 ParserInput inputstream;
		 Regex(String regex, int skip, ParserInput input) {
			myPattern = Pattern.compile(regex);
			mySkip = skip;
			inputstream=input;
		}
		public Expression parse(){
			 return parse(readin());
		}
		public Matcher match(String regex){return myPattern.matcher(regex);}
		abstract Expression parse(String regex);

	private String readin() {
			Matcher matcherType = myPattern.matcher(inputstream.getMyInput());
			matcherType.find(0);
			String match = inputstream.substring(matcherType.start(mySkip),
					matcherType.end(mySkip));
			inputstream.move(matcherType.end());
			return match;
		}
	}