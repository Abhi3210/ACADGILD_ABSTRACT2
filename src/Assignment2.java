abstract class Figure{
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();	
	
}

class Circle extends Figure{
	double pi=3.14;
	double radius=6;
	double area;
	double perimeter;
	public void findArea(){
		area=pi*radius*radius;
		System.out.println("Area of the circle is :"+area);
	}
	
	public void findPerimeter(){
		perimeter=2*pi*radius;
		System.out.println("Perimeter of the circle is :"+perimeter);
	}
}

class Rectangle extends Figure{
	double length=40;
	double height=6;
	double area;
	double perimeter;
	public void findArea(){
		area=length*height;
		System.out.println("Area of the Rectangle is :"+area);
	}
	
	public void findPerimeter(){
		perimeter=2*(length+height);
		System.out.println("Perimeter of the Rectangle is :"+perimeter);
	}
}

class Triangle extends Figure{
	
	double height=40;
	double base=25;
	double side2=22;
	double side3=20;
	double area;
	double perimeter;
	public void findArea(){
		area=(base*height)/2;
		System.out.println("Area of the Triangle is :"+area);
	}
	
	public void findPerimeter(){
		perimeter=(side2+base+side3);
		System.out.println("Perimeter of the Triangle is :"+perimeter);
	}
}


public class Assignment2 {
   public static void main(String args[]){
	   Circle c=new Circle();
	   c.findArea();
	   c.findPerimeter();
	   Rectangle r=new Rectangle();
	   r.findArea();
	   r.findPerimeter();
	   Triangle t=new Triangle();
	   t.findArea();
	   t.findPerimeter();
   }
}
