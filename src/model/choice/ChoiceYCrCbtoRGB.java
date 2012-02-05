package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorModel;

public class ChoiceYCrCbtoRGB extends Choice{

	public ChoiceYCrCbtoRGB( ) {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		return ColorModel.ycrcb2rgb(myOperand.get(0).evaluate(x, y, currentTime));
	}

}
