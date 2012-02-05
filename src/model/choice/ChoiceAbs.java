package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceAbs extends Choice {

	public ChoiceAbs() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return ColorCombinations.abs(myOperand.get(0).evaluate(x, y, currentTime));
	}

}
