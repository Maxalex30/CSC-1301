package Myjava;
public class Graduate extends Student{

    String degree;
    String concentration;
    int years;

    public Graduate(String newdegree, int newyear, double newgpa, String newmajor, String newconcentration, int newcreditHours) {
        super(newmajor, newgpa, newcreditHours);
        degree = newdegree;
        concentration = newconcentration;
        years = newyear;
    }
    public int getYears() {
        return years;
    }
    public String getConcentration() {
        return concentration;
    }
    public String toString() {
        return major +", " + concentration +", " + years;
    }
}