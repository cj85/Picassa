package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceNeg extends Choice {
	public ChoiceNeg( ) {
		super(1);
		// TODO Auto-generated constructor stub
	}

	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y, double currentTime) {
		return ColorCombinations.negate(myOperand.get(0).evaluate(x, y, currentTime));
	}
}