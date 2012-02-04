package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceMinus extends Choice {
	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y, double currentTime) {
		this.checkoperandnumber(myOperand, 2);
		return ColorCombinations.subtract(myOperand.get(0).evaluate(x, y, currentTime),
				myOperand.get(1).evaluate(x, y, currentTime));
	}
}