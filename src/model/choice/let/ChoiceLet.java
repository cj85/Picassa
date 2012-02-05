package model.choice.let;

import java.util.ArrayList;
import model.Expression;
import model.RGBColor;
import model.choice.Choice;

public class ChoiceLet extends Choice {

	public ChoiceLet() {
		super(3);

	}

	private String getRealVariableString(Expression node,
			String DOUBLEREGEXCOMMAND) {
		if (node.getCommand() != DOUBLEREGEXCOMMAND)
			return node.getCommand();
		else
			return getRealVariableString(node.getOperandList().get(0),
					DOUBLEREGEXCOMMAND);
	}

	public RGBColor calculate(ArrayList<Expression> operandList, double x,
			double y, double currentTime) {
		RGBColor result;
		String DOUBLEREGEXCOMMAND = "VALUE";
		ArrayList<Expression> myOperand = operandList;
		String searchedName = getRealVariableString(operandList.get(0),
				DOUBLEREGEXCOMMAND);
		RGBColor settedValue = operandList.get(1).evaluate(x, y, currentTime);
		NodeFactory myNodeFactory = new NodeFactory(searchedName,
				DOUBLEREGEXCOMMAND);

		myNodeFactory.variableToValue(settedValue, myOperand.get(2));
		result = myOperand.get(2).evaluate(x, y, currentTime);
		myNodeFactory.valueToVariable(myOperand.get(2));

		return result;
	}

}
