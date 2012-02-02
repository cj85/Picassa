package model.choice.let;

import java.util.ArrayList;
import model.Expression;
import model.RGBColor;
import model.choice.Choice;

public class ChoiceLet extends Choice {
//	private String variablename;
//	private RGBColor variablevalue;
//	private ArrayList<Expression> myOperand;

/*	private void variableToValue(String variableString, RGBColor value,
			Expression expressionNode) {
		Expression real;

		if (expressionNode.getCommand() != null
				&& expressionNode.getCommand().equals(variableString)) {
//			System.out.println("variable -->value if");
			real = new Expression(variableString, value);
			real.addNode(0, null);
			real.addNode(1, expressionNode);
			if(expressionNode.getOperandList().size()>0)
				expressionNode.removeNode(0);
			expressionNode.addNode(0,real);
			expressionNode.setCommand("value");
		} else if(expressionNode.getCommand() != null
				&& expressionNode.getCommand().equals("value")){
//			System.out.println("variable -->value value");
			variableToValue(variableString, value, expressionNode
					.getOperandList().get(0));
		}else{
//			System.out.println("variable -->value else");
			for (int i = 0; i < expressionNode.getOperandList().size(); i++) {
				variableToValue(variableString, value, expressionNode
						.getOperandList().get(i));
			}
		}
	}
	
	private void valueToVariable(String variableString,Expression expressionNode){
		if (expressionNode.getCommand() != null
				&& expressionNode.getCommand().equals(variableString)) {
//			System.out.println("value --> variable if");
			expressionNode.getOperandList().get(1).setCommand(variableString);
			while(expressionNode.getOperandList().size()>0)
				expressionNode.removeNode(0);
		} else if(expressionNode.getCommand() != null
				&& expressionNode.getCommand().equals("value")){
//			System.out.println("value --> variable value");
			valueToVariable(variableString, expressionNode
					.getOperandList().get(0));
		}else{
//			System.out.println("value --> variable else");
			for (int i = 0; i < expressionNode.getOperandList().size(); i++) {
				valueToVariable(variableString, expressionNode
						.getOperandList().get(i));
			}
		}
	}
*/
	private String getRealVariableString(Expression node, String DOUBLEREGEXCOMMAND) {
		if (node.getCommand() != DOUBLEREGEXCOMMAND)
			return node.getCommand();
		else
			return getRealVariableString(node.getOperandList().get(0),DOUBLEREGEXCOMMAND);
	}

	public RGBColor calculate(ArrayList<Expression> operandList, double x,
			double y) {
		RGBColor result;
		String DOUBLEREGEXCOMMAND = "VALUE";
		ArrayList<Expression> myOperand = operandList;
		String searchedName = getRealVariableString(operandList.get(0), DOUBLEREGEXCOMMAND);
		RGBColor settedValue = operandList.get(1).evaluate(x, y);
		NodeFactory myNodeFactory = new NodeFactory(searchedName, DOUBLEREGEXCOMMAND);

		// System.out.println("transform "+variablename);
		 //variableToValue(searchedName, settedValue, myOperand.get(2));
		myNodeFactory.variableToValue(settedValue, myOperand.get(2));
		result = myOperand.get(2).evaluate(x, y);
		myNodeFactory.valueToVariable(myOperand.get(2));
		// System.out.println("inverstransform "+variablename);
	//	 valueToVariable(searchedName,myOperand.get(2));
		return result;
	}

}
