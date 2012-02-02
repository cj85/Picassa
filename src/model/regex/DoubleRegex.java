package model.regex;
//import java.util.regex.Pattern;


import model.Expression;
import model.ParserInput;
import model.RGBColor;

 public class DoubleRegex extends Regex {
		public DoubleRegex(ParserInput input) {
			super("(\\-?[0-9]+(\\.[0-9]+)?)|(\\.[0-9]+)",0,input);
		}

		Expression parse(String constnumber) {
			double value = Double.parseDouble(constnumber);
			RGBColor gray = new RGBColor(value);

			return new Expression("VALUE",new Expression(gray));
		}

	}