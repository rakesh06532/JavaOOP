package Pack4;

public class Rectangle2 {
	int x1,x2,y1,y2;
	Rectangle2()
	{
		
	}
	Rectangle2(int x1,int x2,int y1,int y2)
	{
		
	}
	 Rectangle2(int width,int height)
	{
		 x2=width;
		 y2=height;
		
	}
	 int getHeight()
	 {
		 return y2;
	 }
	 int getWidth()
	 {
		 return x2;
	 }
	 int getArea()
	 {
		 int res=x2*y2;
		 return res;
	 }
	 int getPerimeter(int x1,int y1,int x2,int y2)
	 {
		 int y=y2-y1;
		 int x=x2-x1;
		 int res=2*(x+y);
		 return res;
	 }
	 public boolean isPointInside(int pointx, int pointy)
	 {
		 if(pointx<=x2 && pointx>=x1 && pointy<=y2 && pointy>=y1)
			 return true;
		 else return false;
	 }

}
