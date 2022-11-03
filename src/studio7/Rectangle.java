package studio7;

public class Rectangle {
	
	private int height;
	private int length;
	//private int area;
	//private int parameter;
	
	public Rectangle (int theHeight, int theLength)
	{
		this.height = theHeight;
		this.length = theLength;
		
	}
	public int getHeight() {
		return this.height;
	}
	public int getLength() {
		return this.length;
	}
	public int getArea() {
		return (this.height * this.length);
	}
	
	public int getParameter() {
		return 2*(this.height + this.length);
	}
	
	public boolean getIfSquare() {
		boolean i = false;
		if (this.height==this.length) {
			i = true;
		}
		return i;
	}
	
	public void setHeight(int theHeight) {this.height = theHeight;}
	public void setLength(int theLength) {this.length = theLength;}
	
	

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", length=" + length + "]";
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (4, 4);
		System.out.println(r1);
		System.out.println(r1.getIfSquare());
		Rectangle r2 = new Rectangle (2, 4);
		System.out.println(r2);
		System.out.println(r2.getIfSquare());
	}
	
	

}
