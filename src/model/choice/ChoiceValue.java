package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public class ChoiceValue extends Choice{

	public ChoiceValue( ) {
		super(-1);
		// TODO Auto-generated constructor stub
	}

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
