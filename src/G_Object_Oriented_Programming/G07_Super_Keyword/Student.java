package G_Object_Oriented_Programming.G07_Super_Keyword;

public class Student extends Person{

    double gpa;

    Student(String first_name, String last_name, double gpa){

        // 'this.first_name = first_name' & 'this.last_name = last_name' will not work

        super(first_name,last_name);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first_name+ "'s gpa: "+ this.gpa);
    }
}
