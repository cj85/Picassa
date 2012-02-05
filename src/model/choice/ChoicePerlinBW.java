package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.PerlinNoise;

public class ChoicePerlinBW extends Choice {

	public ChoicePerlinBW( ) {
		super(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return PerlinNoise.greyNoise(myOperand.get(0).evaluate(x, y, currentTime), myOperand
				.get(1).evaluate(x, y, currentTime));
	}

}
