package model.choice;

import java.util.*;

import model.Expression;
import model.ParserException;
import model.RGBColor;
import model.ParserException.Type;


abstract public class Choice {
	public void checkoperandnumber(ArrayList<Expression> myOperand, int expectednumber){
		if(expectednumber==0)
			if(myOperand.size()==0) 
				throw new ParserException("No Operand Number " , Type.UNKNOWN_COMMAND);
			else
				;
		else if(expectednumber!=myOperand.size())
			    throw new ParserException("Wrong Operand Number " , Type.UNKNOWN_COMMAND);
	}
	abstract public RGBColor calculate(ArrayList<Expression> myOperand, double x, double y);
}