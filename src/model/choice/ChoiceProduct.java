package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceProduct extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		this.checkoperandnumber(myOperand, 0);
	return new InfiniteProduct().calculate(myOperand, x, y, currentTime);
	}

}
