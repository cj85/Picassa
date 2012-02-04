package model.choice;

import java.util.HashMap;

import model.choice.let.ChoiceLet;



 public class ChoiceFactory{
		private static HashMap<String, Choice> myMap = new HashMap<String, Choice>();
	static {
		myMap.put("VALUE", new ChoiceValue());
		myMap.put("plus", new ChoicePlus());
		myMap.put("minus", new ChoiceMinus());
		myMap.put("mul", new ChoiceMul());
		myMap.put("div", new ChoiceDiv());
		myMap.put("mod", new ChoiceMod());
		myMap.put("exp", new ChoiceExp());
		myMap.put("neg", new ChoiceNeg());
		myMap.put("color", new ChoiceColor());
		myMap.put("x", new ChoiceX());
		myMap.put("y", new ChoiceY());
		myMap.put("random", new ChoiceRandom());
		myMap.put("floor", new ChoiceFloor());
		myMap.put("ceil", new ChoiceCeil());
		myMap.put("abs", new ChoiceAbs());
		myMap.put("clamp", new ChoiceClamp());
		myMap.put("wrap", new ChoiceWrap());
		myMap.put("sin", new ChoiceSin());
		myMap.put("let",new ChoiceLet() );
		myMap.put("cos", new ChoiceCos());
		myMap.put("tan", new ChoiceTan());
		myMap.put("atan", new ChoiceAtan());
		myMap.put("log", new ChoiceLog());
		myMap.put("rgbToYCrCb",new ChoiceRgbToYCrCb());
		myMap.put("yCrCbtoRGB", new ChoiceYCrCbtoRGB());
		myMap.put("perlinColor", new ChoicePerlinColor());
		myMap.put("perlinBW", new ChoicePerlinBW());
		myMap.put("+", new ChoicePlus());
		myMap.put("-", new ChoiceMinus());
		myMap.put("*", new ChoiceMul());
		myMap.put("/", new ChoiceDiv());
		myMap.put("%", new ChoiceMod());
		myMap.put("^", new ChoiceExp());
		myMap.put("!", new ChoiceNeg());
		myMap.put("sum",new ChoiceSum());
		myMap.put("product", new ChoiceProduct());
		myMap.put("average", new ChoiceAverage());
		myMap.put("min", new ChoiceMin());
		myMap.put("Max", new ChoiceMax());
		myMap.put("if", new ChoiceIf());
		myMap.put("t", new ChoiceT());
	}

	static public Choice chooseoperation(String command) {
		return myMap.get(command);
	}
	
}