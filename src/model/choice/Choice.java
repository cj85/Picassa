package model.choice;

import java.util.*;

import model.Expression;
import model.ParserException;
import model.RGBColor;
import model.ParserException.Type;

abstract public class Choice {
	private int myExpectedOperandNumber;

	public Choice(int expectednumber) {
		myExpectedOperandNumber = expectednumber;
	}

	public void checkoperandnumber(ArrayList<Expression> myOperand) {
		if (myExpectedOperandNumber == -1)
			return;
		if (myExpectedOperandNumber == 0)
			if (myOperand.indexOf(null) == 0)
				throw new ParserException("No Operand ", Type.UNKNOWN_COMMAND);
			else
				;
		else if (myExpectedOperandNumber != myOperand.size())
			throw new ParserException("Wrong Operand Number ",
					Type.UNKNOWN_COMMAND);
	}

	public RGBColor calculatecolor(ArrayList<Expression> myOperand, double x,
			double y, double currentTime) {
		checkoperandnumber(myOperand);
		return calculate(myOperand, x, y, currentTime);
	}

	abstract public RGBColor calculate(ArrayList<Expression> myOperand,
			double x, double y, double currentTime);
}