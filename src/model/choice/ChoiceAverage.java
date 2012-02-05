package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.choice.InfiniteOperator.InfiniteAverage;

public class ChoiceAverage extends Choice{

	public ChoiceAverage( ) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return new InfiniteAverage().calculate(myOperand, x, y, currentTime);
	}

}
