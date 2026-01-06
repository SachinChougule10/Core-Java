package G_Object_Oriented_Programming.G07_Super_Keyword;

public class Employee extends Person{
    int salary;

    Employee(String first_name, String last_name, int salary){

        // 'this.first_name = first_name' & 'this.last_name = last_name' will not work

        super(first_name,last_name);
        this.salary = salary;

        // since Employee extends Person and our Person constructor requires first_name and last_name,
        // we have to send our Person constructor these arguments.
        // we will call the constructor of the parent class using the super keyword and then passing in those arguments - first_name & last_name
    }

    void showSalary(){
        System.out.println(this.first_name + "'s salary is: $ " + this.salary);
    }
}
