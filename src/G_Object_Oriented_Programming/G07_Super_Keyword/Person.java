package G_Object_Oriented_Programming.G07_Super_Keyword;

public class Person {

    String first_name;
    String last_name;

    Person(String first_name, String last_name){

        this.first_name = first_name;
        this.last_name = last_name;
    }

    void showName(){
        System.out.println("Your full name is " + this.first_name + " " + this.last_name);
    }
}
