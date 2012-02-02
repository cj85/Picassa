package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceAverage extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		this.checkoperandnumber(myOperand, 0);
		return new InfiniteAverage().calculate(myOperand, x, y);
	}

}
