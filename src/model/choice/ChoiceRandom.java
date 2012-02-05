package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceRandom extends Choice {

	public ChoiceRandom( ) {
		super(-1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return ColorCombinations.random();

	}

}
