package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public  class Infinite {
	 

	 public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		RGBColor result=myOperand.get(0).evaluate(x, y);
		for (int i = 1; i < myOperand.size(); i++)
			result =operator(result, myOperand.get(i).evaluate(x, y));
		return result;
	}
	

	   RGBColor operator(RGBColor left, RGBColor right){return null;}
}
