package model;

import model.ParserException.Type;
import model.choice.ChoiceFactory;
//import model.util.ColorCombinations;
import java.util.*;

/**
 * An Expression represents a mathematical expression as a tree.
 * 
 * In this format, the internal nodes represent mathematical functions and the
 * leaves represent constant values.
 * 
 * @author former student solution
 * @author Robert C. Duvall (added comments, some code)
 */

public class Expression {
	private RGBColor myValue;
	private String myCommand;
	private ArrayList<Expression> myOperand = new ArrayList<Expression>();

	/**
	 * Create expression representing the given constant value
	 */
	private void Constructor(RGBColor value, String command,
			ArrayList<Expression> list) {
		myValue = value;
		myCommand = command;
		if (list!=null && !list.isEmpty())
			myOperand.addAll(list);
	}

	public Expression(RGBColor value) {
		Constructor(value, null, null);
	}

	public Expression(String command, RGBColor value) {
		Constructor(value, command, null);
	}
	/**
	 * Create expression representing the given operation between the two given
	 * sub-expressions.
	 */
	public Expression(String command, ArrayList<Expression> list) {
		Constructor(null, command, list);
	}

	public Expression(String command) {
		Constructor(null, command, null);
	}
	public Expression (String command,Expression realexpression){
		ArrayList<Expression> realvalue =new ArrayList<Expression>();
		realvalue.add(realexpression);
		 Constructor(null,command,realvalue);
	}

	/**
	 * @return value of expression
	 */
	public RGBColor evaluate(double x, double y) {

	//	RGBColor myTmp = ChoiceFactory.chooseoperation(myCommand).calculate(
		//		myOperand, x, y);
		if (ChoiceFactory.chooseoperation(myCommand) != null)
			return ChoiceFactory.chooseoperation(myCommand).calculate(
					myOperand, x, y);
		else
			throw new ParserException("Unknown Command " + myCommand,
					Type.UNKNOWN_COMMAND);

	}

	public RGBColor getRgbcolor() {
		return myValue;
	}
	public String getCommand(){
		return myCommand;
	}
	
	public void setCommand(String command){
		myCommand=command;
	}
	public ArrayList<Expression> getOperandList(){
		return myOperand;
	}
	public void addNode(int index,Expression node){
	
		myOperand.add(index,node);
//	System.out.println(myOperand.size());
	}
	public void removeNode(int index){
		myOperand.remove(index);
	}

	/**
	 * @return string representation of expression
	 */
	public String toString() {
		StringBuffer result = new StringBuffer();
		if (myCommand == null) {
			result.append(myValue);
		} else {
			result.append("(");
			result.append(" " + myCommand + " ");
			result.append(myOperand.get(0).toString());
			result.append(myOperand.get(1).toString());
			result.append(")");
		}
		return result.toString();
	}
}
