package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceIf extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		this.checkoperandnumber(myOperand, 3);
		RGBColor operand0Color=myOperand.get(0).evaluate(x, y, currentTime);
		double flag=operand0Color.getRed()+operand0Color.getGreen()+operand0Color.getBlue();
		if(flag>0)
			return myOperand.get(1).evaluate(x, y, currentTime);
		else
			return myOperand.get(2).evaluate(x, y, currentTime);
	}

}
