package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceColor extends Choice {
	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y) {
		return ColorCombinations.color(myOperand.get(0).evaluate(x, y),
				myOperand.get(1).evaluate(x, y), myOperand.get(2)
						.evaluate(x, y));
	}
}