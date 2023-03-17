package Myjava;

public class TestStudent {
	   public static void main(String[] args) {

		    Undergraduate Alex = new Undergraduate("Bioinformatics", 3.9, 54, true);
		    Graduate Mary = new Graduate ("Masters", 1, 3.91, "Computer Science", "Data Science", 100);
		    System.out.println("Alex- " + Alex);
		    System.out.println("Mary- " + Mary);

		    Exchange YingShu = new Exchange("Cybersecurity", 3.2, 160,"Fall 2022" ,"Taiwan", false);
		    YingShu.setdegree("Graduate");
		    System.out.println("YingShu- " + YingShu);

		    }
		}


