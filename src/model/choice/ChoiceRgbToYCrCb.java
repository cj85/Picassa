package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorModel;

public class ChoiceRgbToYCrCb extends Choice{

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		return ColorModel.rgb2ycrcb(myOperand.get(0).evaluate(x, y));
	}

}