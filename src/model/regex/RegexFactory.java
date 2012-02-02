package model.regex;

import java.util.ArrayList;
import model.*;

public class RegexFactory{
	private  ArrayList<Regex> myRegexArray=new ArrayList<Regex>();
	public RegexFactory(ParserInput inputstream){
		myRegexArray.add(new DoubleRegex(inputstream)); 
		myRegexArray.add(new ExpressionBeginRegex(inputstream));
		myRegexArray.add(new CoordinateRex(inputstream));
	}
	public ArrayList<Regex> allregex(){return myRegexArray;}
}