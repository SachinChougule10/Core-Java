package G_Object_Oriented_Programming.G03_Overloaded_Constructors;

public class Main {
    public static void main(String[] args){

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick","patrick1@gmail.com");
        User user3 = new User("Sandy","Scheeks2@gmail.com",27);
        User user4 = new User();


        System.out.println(user1.username);
        System.out.println(user1.age);
        System.out.println(user1.email);

        System.out.println(user2.username);
        System.out.println(user2.age);
        System.out.println(user2.email);


        System.out.println(user3.username);
        System.out.println(user3.age);
        System.out.println(user3.email);

        System.out.println(user4.username);
        System.out.println(user4.age);
        System.out.println(user4.email);

    }
}

// overloaded constructors :- Allows a class to have multiple constructors with different parameter lists
//                            Enables objects to be initialized in various ways (by passing in varying amount of parameters)
