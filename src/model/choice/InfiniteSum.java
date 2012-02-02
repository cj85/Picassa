package model.choice;

import model.RGBColor;
import model.util.ColorCombinations;

public class InfiniteSum extends Infinite{
 RGBColor operator(RGBColor left, RGBColor right){
	return ColorCombinations.add(left, right);
}
}
