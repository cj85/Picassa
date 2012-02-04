package model.util;

import model.RGBColor;


/**
 * Combine two colors by combining their components.
 * 
 * This is a separate class from color since it is just one set of
 * ways to combine colors, many may exist and we do not want to keep
 * modifying the RGBColor class.
 * 
 * @author Robert C. Duvall
 */
public class ColorCombinations
{
    /**
     * Combine two colors by adding their components.
     */
    public static RGBColor add (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() + right.getRed(), 
                            left.getGreen() + right.getGreen(),
                            left.getBlue() + right.getBlue());
    }

    /**
     * Combine two colors by subtracting their components.
     */
    public static RGBColor subtract (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() - right.getRed(), 
                            left.getGreen() - right.getGreen(),
                            left.getBlue() - right.getBlue());
    }

    /**
     * Combine two colors by multiplying their components.
     */
    public static RGBColor multiply (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() * right.getRed(), 
                            left.getGreen() * right.getGreen(),
                            left.getBlue() * right.getBlue());
    }

    /**
     * Combine two colors by dividing their components.
     */
    public static RGBColor divide (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() / right.getRed(), 
                            left.getGreen() / right.getGreen(),
                            left.getBlue() / right.getBlue());
    }
    /**
     * combine two colors by mode their components.
      */
    public static RGBColor mode (RGBColor left, RGBColor right){
    	return new RGBColor(left.getRed() % right.getRed(),
    			             left.getGreen() % right.getGreen(),
    			             left.getBlue() % right.getBlue());
    }
    /**
     * combine two color by exponent their components.
     * */
    public static RGBColor exponent (RGBColor left, RGBColor right){
    	return new RGBColor(Math.pow(left.getRed(), right.getRed() ),
    						  Math.pow(left.getGreen(), right.getGreen()),
    						  Math.pow(left.getBlue(), right.getBlue()));
    }
    /**
     * negate one color  
     * */
    public static RGBColor negate (RGBColor left){
    	return new RGBColor(-left.getRed(),-left.getGreen(),-left.getBlue()); 
    }
    /**
     * calculate every pixels' value  
     * */
    public static RGBColor color (RGBColor r,RGBColor g, RGBColor b){
    	return new RGBColor(r.getRed(),g.getGreen(),b.getBlue());
    }
    public static RGBColor x (double i){
    	return new RGBColor(i); 
    }
    public static RGBColor y (double i){
    	return new RGBColor(i);  
    }
    public static RGBColor random(){
		double red=Math.random()*2-1;
		double green=Math.random()*2-1;
		double blue=Math.random()*2-1;
		return new RGBColor(red, green,blue);
    }

	public static RGBColor floor(RGBColor color) {

		return new RGBColor(Math.floor(color.getRed()), Math.floor(color
				.getGreen()), Math.floor(color.getBlue()));
	}
	public static RGBColor ceil(RGBColor color) {

		return new RGBColor(Math.ceil(color.getRed()), Math.ceil(color
				.getGreen()), Math.ceil(color.getBlue()));
	}
	public static RGBColor abs(RGBColor color){
		return new RGBColor(Math.abs(color.getRed()), Math.abs(color
				.getGreen()), Math.abs(color.getBlue()));
	}

	public static RGBColor clamp(RGBColor color){
		color.clamp();
		return color;
	}
	public static RGBColor wrap(RGBColor color){
		color.wrap();
		return color;
	}
	public static RGBColor sin(RGBColor color){
		return new RGBColor(Math.sin(color.getRed()), Math.sin(color
				.getGreen()), Math.sin(color.getBlue()));
	}
	public static RGBColor cos(RGBColor color){
		return new RGBColor(Math.cos(color.getRed()), Math.cos(color
				.getGreen()), Math.cos(color.getBlue()));
	}
	public static RGBColor tan(RGBColor color){
		return new RGBColor(Math.tan(color.getRed()), Math.tan(color
				.getGreen()), Math.tan(color.getBlue()));
	}
	public static RGBColor atan(RGBColor color){
		return new RGBColor(Math.atan(color.getRed()),Math.atan(color
				.getGreen()), Math.atan(color.getBlue()));
	}
	public static RGBColor log(RGBColor color){
		return new RGBColor(Math.log(color.getRed()),Math.log(color
				.getGreen()), Math.log(color.getBlue()));
	}
	public static RGBColor t(double time){
		return new RGBColor(time);
	}
}
