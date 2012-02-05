package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.choice.InfiniteOperator.InfiniteMin;

public class ChoiceMin extends Choice{

	public ChoiceMin() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		// TODO Auto-generated method stub
		return new InfiniteMin().calculate(myOperand, x, y, currentTime);
	}

}
