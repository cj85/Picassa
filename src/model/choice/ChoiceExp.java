package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceExp extends Choice {
	public ChoiceExp( ) {
		super(2);
		// TODO Auto-generated constructor stub
	}

	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y, double currentTime) {
		return ColorCombinations.exponent(myOperand.get(0).evaluate(x, y, currentTime),
				myOperand.get(1).evaluate(x, y, currentTime));
	}
}