package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceValue extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		if(myOperand.get(0).getCommand()!="VALUE")
		   {return myOperand.get(0).getRgbcolor();}
		else{
		return myOperand.get(0).evaluate(x, y, currentTime);
		} 
	}

}
