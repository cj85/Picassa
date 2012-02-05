package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceMod extends Choice {
	public ChoiceMod( ) {
		super(2);
		// TODO Auto-generated constructor stub
	}

	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y, double currentTime) {
		return ColorCombinations.mode(myOperand.get(0).evaluate(x, y, currentTime),
				myOperand.get(1).evaluate(x, y, currentTime));
	}
}