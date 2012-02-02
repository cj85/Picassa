package model.choice;

import java.util.ArrayList;

import model.Expression;
import model.RGBColor;
import model.util.ColorCombinations;

public class InfiniteAverage extends InfiniteSum{
	final public RGBColor calculate(ArrayList<Expression> myOperand, double x,
			double y) {
		RGBColor sum=super.calculate(myOperand, x, y);
		RGBColor denominator=new RGBColor(myOperand.size());
		return ColorCombinations.divide(sum, denominator);
	}
}
