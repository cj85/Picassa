package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceRandom extends Choice {

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		return ColorCombinations.random();

	}

}
