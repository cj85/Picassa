package model.choice.InfiniteOperator;

import model.RGBColor;

public class InfiniteMin extends InfiniteOperator{
	 RGBColor operator(RGBColor left, RGBColor right){
		 double leftsum=left.getRed()+left.getGreen()+left.getBlue();
		 double rightsum=right.getRed()+right.getGreen()+right.getBlue();
		 if(leftsum>rightsum)
			 return right;
		 else return left;
		 }
}
