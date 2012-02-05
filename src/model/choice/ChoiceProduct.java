package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.choice.InfiniteOperator.InfiniteProduct;

public class ChoiceProduct extends Choice{

	public ChoiceProduct( ) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
	return new InfiniteProduct().calculate(myOperand, x, y, currentTime);
	}

}
