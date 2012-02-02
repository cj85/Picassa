package model.choice.let;

import model.Expression;
import model.RGBColor;

public class NodeTarget extends Node {

	@Override
	void variableToValue(RGBColor settedValue, Expression searchedNode,
			String searchedName, String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
		Expression realNode;
		realNode = new Expression(searchedName, settedValue);
		realNode.addNode(0, null);
		realNode.addNode(1, searchedNode);
		if (searchedNode.getOperandList().size() > 0)
			searchedNode.removeNode(0);
		searchedNode.addNode(0, realNode);
		searchedNode.setCommand(DOUBLEREGEXCOMMAND);
//		System.out.println(searchedNode.getCommand());//
//		System.out.println(realNode.getCommand());//
	}

	@Override
	void valueToVariable(Expression searchedNode, String searchedName,
			String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
		searchedNode.getOperandList().get(1).setCommand(searchedName);
		while (searchedNode.getOperandList().size() > 0)
			searchedNode.removeNode(0);
	}

}
