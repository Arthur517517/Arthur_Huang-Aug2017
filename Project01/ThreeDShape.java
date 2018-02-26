public abstract class ThreeDShape 
{
	private double volume;
	private double surfaceArea;

	public ThreeDShape()
	{
	this.volume = calcVolume();
	this.surfaceArea = calcSA();
	}

	// Can you write this code for this class or does it need to be overridden by every subclass?
	public abstract double calcVolume();
	// Can you write this code for this class or does it need to be overridden by every subclass?
	public abstract double calcSA();
	
	public double round2(double number)
	{
	       if(number < 0)
	       {//rounds a negative number
	           number *= -1;//convert to positive number
	           if(number * 1000 % 10 < 5)
	           {
	               number = (number * 1000 - number * 1000 % 10) / 1000;
	           }
	           else
	           {
	               number = (10 - number * 1000 % 10 + number * 1000) / 1000;
	           }
	           number *= -1;//convert back to negative
	           return number;
	       }
	       else
	       {//rounds positive num
	           if(number * 1000 % 10 < 5)
	           {
	               return (number * 1000 - number * 1000 % 10) / 1000;
	           }
	           else
	           {
	               return (10 - number * 1000 % 10 + number * 1000) / 1000;
	           }
	       }
	}
}
