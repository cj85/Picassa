package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.choice.InfiniteOperator.InfiniteMax;

public class ChoiceMax extends Choice{

	public ChoiceMax() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		// TODO Auto-generated method stub
		return new InfiniteMax().calculate(myOperand, x, y, currentTime);
	}

}
