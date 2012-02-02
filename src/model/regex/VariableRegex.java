package model.regex;

import model.Expression;
import model.ParserInput;
import model.RGBColor;
//not in use!!!! don't look at it!!!
public class VariableRegex extends Regex{
	public VariableRegex(ParserInput input) {
		super("([a-zA-Z]+)",0,input);
	}

	Expression parse(String constnumber) {
		double value = Double.parseDouble(constnumber);
		RGBColor gray = new RGBColor(value);
		return new Expression(gray);
	}
}
