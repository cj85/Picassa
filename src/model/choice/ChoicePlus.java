package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoicePlus extends Choice {
	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y) {
		return ColorCombinations.add(myOperand.get(0).evaluate(x, y), myOperand
				.get(1).evaluate(x, y));
	}
}