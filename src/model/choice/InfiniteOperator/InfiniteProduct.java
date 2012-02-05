package model.choice.InfiniteOperator;

import model.RGBColor;
import model.util.ColorCombinations;

public class InfiniteProduct extends InfiniteOperator{

	
	 RGBColor operator(RGBColor left, RGBColor right) {		
		return ColorCombinations.multiply(left, right);
	}

}
