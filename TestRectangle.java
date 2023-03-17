package Myjava;


	class TestRectangle{

		    public static void main(String[] args) {

		        Rectangle rectangle1 = new Rectangle();
		        rectangle1.setX(2.5f);
		        rectangle1.setY(13.0f);
		        rectangle1.setHeight(14.0f);
		        rectangle1.setWidth(4.0f);
		        System.out.println(rectangle1);

		        Rectangle rectangle2 = new Rectangle();
		        rectangle2.setX(1.5f);
		        rectangle2.setY(8.0f);
		        rectangle2.setHeight(7.0f);
		        rectangle2.setWidth(6.0f);
		        System.out.println(rectangle2);

		        if (Rectangle.isOverlap(rectangle1, rectangle2)){
		            System.out.println("\nRectangle1 and Rectangle2 overlap");
		        }else{
		            System.out.println("\nRectangle1 and Rectangle2 do not overlap");
		        }
		    }
		
		
	}

