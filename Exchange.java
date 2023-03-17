package Myjava;


	public class Exchange extends Undergraduate {
	    String country; 
	    String year;
	    String degree;

	    public Exchange(String newmajor, double newgpa, int newcreditHours, String newyear, String newcountry, Boolean newhonors) {
	        super(newcountry, newgpa, newcreditHours, newhonors);
	        year = newyear;
	        country = newcountry;
	    }

	    public String getYear() {
	        return year;
	    }
	    public String getCountry() {
	        return country;
	    }

	    public void setdegree(String newdegree) {
	        degree  = newdegree;
	    }

	    public String toString() {
	        return degree +", " + major +", " + gpa +", " + creditHours +", " + country;
	    }
	}

