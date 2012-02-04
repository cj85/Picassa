package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.*;

public class ChoiceFloor extends Choice{


	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		this.checkoperandnumber(myOperand, 1);
		RGBColor color=myOperand.get(0).evaluate(x, y, currentTime);
		return ColorCombinations.floor(color);
	}

}
