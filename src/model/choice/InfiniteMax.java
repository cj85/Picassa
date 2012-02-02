package model.choice;

import model.RGBColor;

public class InfiniteMax extends Infinite{
	 RGBColor operator(RGBColor left, RGBColor right){
		 double leftsum=left.getRed()+left.getGreen()+left.getBlue();
		 double rightsum=right.getRed()+right.getGreen()+right.getBlue();
		 if(leftsum>rightsum)
			 return left;
		 else return right;
		 }
}
