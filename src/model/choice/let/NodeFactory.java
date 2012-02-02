package model.choice.let;

import java.util.HashMap;

import model.Expression;
import model.RGBColor;

public class NodeFactory {
	private HashMap<String, Node> myNodeMap = new HashMap<String, Node>();
	private String mySearchedVariable;
	private String myDoubleRegexCommand;

	NodeFactory(String searchedName, String DOUBLEREGEXCOMMAND) {
		mySearchedVariable = searchedName;
		myDoubleRegexCommand = DOUBLEREGEXCOMMAND;
		myNodeMap.put(mySearchedVariable, new NodeTarget());
		myNodeMap.put(myDoubleRegexCommand, new NodeTransit());
		myNodeMap.put(null, new NodeOther());
	}

	public void variableToValue( RGBColor settedValue,
			Expression searchedNode) {
		String command=searchedNode.getCommand();
//		System.out.println("-------start");//
//		System.out.println(command);//
		if (myNodeMap.containsKey(command))
			myNodeMap.get(command).variableToValue( settedValue,
					searchedNode, mySearchedVariable, myDoubleRegexCommand);
		else
			myNodeMap.get(null).variableToValue( settedValue, searchedNode,
					mySearchedVariable, myDoubleRegexCommand);
//		System.out.println("-------end");//
	}

	public void valueToVariable( Expression searchedNode) {
//		System.out.println("-------start go back");//
		String command=searchedNode.getCommand();
		if (myNodeMap.containsKey(command))
			myNodeMap.get(command).valueToVariable( searchedNode,
					mySearchedVariable, myDoubleRegexCommand);
		else
			myNodeMap.get(null).valueToVariable( searchedNode,
					mySearchedVariable, myDoubleRegexCommand);
//		System.out.println("-------end go back");//
	}

}
