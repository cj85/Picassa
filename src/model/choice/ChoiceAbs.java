package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class ChoiceAbs extends Choice {

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		this.checkoperandnumber(myOperand, 1);
		return ColorCombinations.abs(myOperand.get(0).evaluate(x, y));
	}

}
