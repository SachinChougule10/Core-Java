/*
 Description:
 This program demonstrates inheritance and the use of the super keyword in Java.
 It shows how a subclass calls the parent constructor to initialize inherited fields.

 The example includes:
 - Person superclass with parameterized constructor
 - Student and Employee subclasses extending Person
 - super() constructor chaining
 - Accessing inherited attributes in child methods
*/

package G_Object_Oriented_Programming.G07_Super_Keyword;

public class Main {
    public static void main(String[] args){

        Person person = new Person("Harry","Potter");
        Student student = new Student("Horrid","Henry",3.25);
        Employee employee = new Employee("Spongebob", "Squarepants", 56000);

        System.out.println(person.first_name);
        System.out.println(person.last_name);

        person.showName();

        System.out.println(student.first_name);
        System.out.println(student.last_name);
        System.out.println(student.gpa);

        student.showName();
        student.showGPA();

        employee.showSalary();

    }
}

// super = Refers to the parent class (subclass <- superclass).
// super() is used to call the parent class constructor in a child class.
// Used in constructors and method overriding
// Calls the parent constructor to initialize attributes


// Since the constructor of the parent class Person requires a first_name & last_name, for any children class we create,
// we have to call the constructor of the Parent class using super keyword and pass into it those arguments - first & last name

// If parent has a no-arg constructor, you never need to manually call super(), Java will automatically insert super().
// Java automatically calls super() to ensure the parent’s state is set before the child object starts using it.


// A child class cannot initialize parent A_Basics.variables directly.
//Only the parent constructor can initialize its own fields — that's why we use super().

