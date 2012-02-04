package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceTan extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		this.checkoperandnumber(myOperand, 1);
		return ColorCombinations.tan(myOperand.get(0).evaluate(x, y, currentTime));
	}

}
