package Pack4;

public class _46_Cylender extends _46_Circle {
	double height;
	_46_Cylender() 
	{
		
	}
	_46_Cylender(double r,double h)
	{
		this.radius=r;
		this.height=h;
	}
	double getVolume()
	{
		double volume=3.14*radius*radius*height;
		if(height<0)
			return -1;
		else return volume;
	}
	

}
