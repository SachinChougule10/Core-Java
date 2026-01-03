package G_Object_Oriented_Programming.G02_Constructors;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;


    // the parameter's name in the constructor should not be necessarily same as that of the attributes

    Student(String name, int age, double gpa){              // since we are receiving arguments, we need a matching set of parameters

        this.name = name;                       // syntax :- this. name_of_the attribute = parameter that we receive
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        // we don't always necessarily need to assign arguments to these attributes, for eg :- we can assign 'true' for 'is_Enrolled' for all the students

        // to assign some of these attributes, we are going to use 'this keyword'
    }

    // we automatically call this constructor, when we instantiate (create) the object of that class
    // i.e. when we write 'new name_of_the class();' in our case, 'Student student1 = new Student();'
    // When we do this, behind the scenes we are calling the constructor

    // this keyword :- refers to the object we are currently constructing, or working with
    // imagine we are working with 'student1 object', suppose the 'this keyword' in 'this.name = name' is replaced with 'student1',
    // so it becomes :- 'student1.name = name' , we are assigning student1's name as the parameter we receive, i.e. 'Spongebob'
    // Thus that becomes :- student1.name = "Spongebob";
    // same for others

    void study(){
        System.out.println(this.name + " is studying!");
    }

    // after assigning values to the attributes using constructor, we can use them within methods too (as we used 'this.name' in study() method)


}

// by using constructors we can create object with unique values
// If we would like to have each object a unique student name, we can do it with the help of a constructor
// To set up a constructor, we type the name of the class, we need a set of parenthesis, then a set of curly braces