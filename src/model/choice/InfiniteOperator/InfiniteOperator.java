package model.choice.InfiniteOperator;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

public  class InfiniteOperator {
	 

	 public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		RGBColor result=myOperand.get(0).evaluate(x, y, currentTime);
		for (int i = 1; i < myOperand.size(); i++)
			result =operator(result, myOperand.get(i).evaluate(x, y, currentTime));
		return result;
	}
	

	   RGBColor operator(RGBColor left, RGBColor right){return null;}
}
