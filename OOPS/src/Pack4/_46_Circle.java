package Pack4;

public class _46_Circle {
	double radius; 
	_46_Circle() 
	{
		 
	}
	_46_Circle(double r)
	{
		
		this.radius=r;
	}
	double getArea()
	{
		double area=3.14*radius*radius;
		if(radius<0)
			return -1;
		else
		return area;
	}

}
