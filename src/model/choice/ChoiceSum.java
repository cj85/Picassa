package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;


public class ChoiceSum extends Choice {
	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		this.checkoperandnumber(myOperand, 0);
		return new InfiniteSum().calculate(myOperand, x, y, currentTime);
	}
}
