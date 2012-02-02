package model.choice.let;

import model.Expression;
import model.RGBColor;

abstract public class Node {
	abstract void variableToValue( RGBColor settedValue,
			Expression searchedNode, String searchedName, String DOUBLEREGEXCOMMAND);

	abstract void valueToVariable(
			Expression searchedNode, String searchedName, String DOUBLEREGEXCOMMAND);
}
