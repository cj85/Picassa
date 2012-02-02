package model.choice;

import model.RGBColor;
import model.util.ColorCombinations;

public class InfiniteProduct extends Infinite{

	
	 RGBColor operator(RGBColor left, RGBColor right) {		
		return ColorCombinations.multiply(left, right);
	}

}
