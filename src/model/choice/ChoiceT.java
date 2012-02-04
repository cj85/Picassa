package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceT extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return ColorCombinations.t(currentTime);
	}

}