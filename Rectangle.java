package Myjava;

	public class  Rectangle {

	    private double x;
	    private double y;
	    private double width;
	    private double height;

	    public Rectangle() {
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    public void setWidth(double width) {
	        this.width = width;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    @Override
	    public String toString() {
	        return "\nRectangle [" + "x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ']' + " Area of rectangle is " + (this.height * this.width) ;
	    }

	    public static boolean isOverlap(Rectangle r1, Rectangle r2){
	        return r1.x < r2.x + r2.width && r1.x + r1.width > r2.x && r1.y < r2.y + r2.height && r1.y + r1.height > r2.y;
	    }
	}
	