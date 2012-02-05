package model.choice.InfiniteOperator;

import model.RGBColor;
import model.util.ColorCombinations;

public class InfiniteSum extends InfiniteOperator{
 RGBColor operator(RGBColor left, RGBColor right){
	return ColorCombinations.add(left, right);
}
}
