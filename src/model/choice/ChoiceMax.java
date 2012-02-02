package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceMax extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		// TODO Auto-generated method stub
		return new InfiniteMax().calculate(myOperand, x, y);
	}

}
