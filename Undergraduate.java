package Myjava;


	public class Undergraduate extends Student {

	    Boolean honors; 
	    public Undergraduate(String newmajor, double newgpa, int newcreditHours, Boolean newhonors) {
	        super(newmajor, newgpa, newcreditHours);
	        honors = newhonors;
	    }
	    public Boolean isHonors() {
	        return honors;
	    }

	    public String toString() { 
	        return major +", " + gpa +", " + getYear() +", " + honors;
	    }
	}

