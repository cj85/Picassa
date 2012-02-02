package model.choice.let;

import model.Expression;
import model.RGBColor;

public class NodeOther extends Node {

	@Override
	void variableToValue(RGBColor settedValue, Expression searchedNode,
			String searchedName, String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
//		System.out.println("other");//
//		System.out.println("searchedNode.getOperandList().size()= "+searchedNode.getOperandList().size());
		if (searchedNode.getOperandList().indexOf(null) == 0) {
//			System.out.println("return!!");//
			return;
		}
		for (int i = 0; i < searchedNode.getOperandList().size(); i++) {
			new NodeFactory(searchedName, DOUBLEREGEXCOMMAND).variableToValue(
					settedValue, searchedNode.getOperandList().get(i));
			
		}
	}

	@Override
	void valueToVariable(Expression searchedNode, String searchedName,
			String DOUBLEREGEXCOMMAND) {
		// TODO Auto-generated method stub
		if (searchedNode.getOperandList().indexOf(null) == 0) {
//			System.out.println("return!!");//
			return;
		}
		for (int i = 0; i < searchedNode.getOperandList().size(); i++)
			new NodeFactory(searchedName, DOUBLEREGEXCOMMAND)
					.valueToVariable(searchedNode.getOperandList().get(i));
	}

}
