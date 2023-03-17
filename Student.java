package Myjava;
public class Student{
    String major;
    double gpa;
    int creditHours;

    public double getgpa() {
        return gpa;
    }
    public String getYear() {
    if (creditHours < 32) {
        return "Freshman";
    }
    else if (creditHours == 32 && creditHours < 64) {
        return "Sophmore";
    }
    else if (creditHours == 64 && creditHours < 96) {
        return "Junior";
    }
    else {
        return "Senior";
    }
    }
    public Student(String newmajor, double newgpa, int newcreditHours) {

        major = newmajor;
        gpa = newgpa;
        creditHours = newcreditHours;

    }
}