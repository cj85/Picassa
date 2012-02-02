package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

class ChoiceY extends Choice {
	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y) {
		return ColorCombinations.y(y);
	}
}