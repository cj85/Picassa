package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceProduct extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
	return new InfiniteProduct().calculate(myOperand, x, y);
	}

}
