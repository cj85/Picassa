package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.PerlinNoise;

public class ChoicePerlinColor extends Choice {

	public ChoicePerlinColor( ) {
		super(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return PerlinNoise.colorNoise(myOperand.get(0).evaluate(x, y, currentTime),
				myOperand.get(1).evaluate(x, y, currentTime));
	}

}
