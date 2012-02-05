package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceT extends Choice{

	public ChoiceT( ) {
		super(-1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return new RGBColor(currentTime);
	}

}
