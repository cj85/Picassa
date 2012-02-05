package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;

class ChoiceX extends Choice {
	public ChoiceX( ) {
		super(-1);
		// TODO Auto-generated constructor stub
	}

	public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y, double currentTime) {
		return new RGBColor(x);
	}
}