package model.regex;
//import java.util.regex.Pattern;

import model.Expression;
import model.ParserInput;

	public class CoordinateRex extends Regex {
		public CoordinateRex(ParserInput input) {
			super("([a-zA-Z]+)",0,input);
		}

		Expression parse(String variable) {
			return new Expression(variable);
		}
	}