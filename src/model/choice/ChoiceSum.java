package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.choice.InfiniteOperator.InfiniteSum;


public class ChoiceSum extends Choice {
	public ChoiceSum( ) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return new InfiniteSum().calculate(myOperand, x, y, currentTime);
	}
}
