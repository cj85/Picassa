package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.*;

public class ChoiceFloor extends Choice{


	public ChoiceFloor( ) {
		super(1);
		// TODO Auto-generated constructor stub
	}

	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		RGBColor color=myOperand.get(0).evaluate(x, y, currentTime);
		return ColorCombinations.floor(color);
	}

}
