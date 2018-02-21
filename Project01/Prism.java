/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */


public abstract class Prism  
{
	private double height;
	public Prism(double height) {
		this.height = height;
	}
	
	public abstract double calcAreaOfBase();

	
	public double calcVolume() {
		return calcAreaOfBase() * height;
	}
	
	public abstract double calcPerimeter(); 
		
	
	public double calcSA() {
		return (calcPerimeter() * height) + (2 * calcAreaOfBase());
	}
	
	public double round2(double number){
        if(number < 0){//rounds a number that is negative
            number *= -1;//converts the number to a positive number
            if(number * 1000 % 10 < 5){
                number = (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                number = (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
            number *= -1;//converts the number back to a negative number
            return number;
        }
        else{//rounds a number that is positive
            if(number * 1000 % 10 < 5){
                return (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                return (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
        }
    }
}