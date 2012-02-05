package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceWrap extends Choice{

	public ChoiceWrap( ) {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return ColorCombinations.wrap(myOperand.get(0).evaluate(x, y, currentTime));
	}

}
