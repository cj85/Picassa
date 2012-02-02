package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceMin extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		// TODO Auto-generated method stub
		return new InfiniteMin().calculate(myOperand, x, y);
	}

}
