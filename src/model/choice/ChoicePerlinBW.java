package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.PerlinNoise;

public class ChoicePerlinBW extends Choice {

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		return PerlinNoise.greyNoise(myOperand.get(0).evaluate(x, y), myOperand
				.get(1).evaluate(x, y));
	}

}
