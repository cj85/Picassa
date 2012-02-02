package model.choice.let;

import model.Expression;
import model.RGBColor;

public class NodeTransit extends Node {

	@Override
	void variableToValue(RGBColor settedValue, Expression searchedNode,
			String searchedName, String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
//		System.out.println("transit");//
		new NodeFactory(searchedName, DOUBLEREGEXCOMMAND).variableToValue(
				settedValue, searchedNode.getOperandList().get(0));
		
	}

	@Override
	void valueToVariable(Expression searchedNode, String searchedName,
			String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
		new NodeFactory(searchedName, DOUBLEREGEXCOMMAND)
				.valueToVariable(searchedNode.getOperandList().get(0));
	}

}
