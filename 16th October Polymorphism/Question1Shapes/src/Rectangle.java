
class Rectangle extends Shape {
private int length;
	public Rectangle(int w, int len) {
		super(w);
		length=len;
	}

	public int calculateArea() {
		return width*length;
	}
}
