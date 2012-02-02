package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;


public class ChoiceSum extends Choice {
	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		return new InfiniteSum().calculate(myOperand, x, y);
	}
}
