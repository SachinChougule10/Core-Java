package G_Object_Oriented_Programming.G14_Getters_And_Setters;

public class Car {
    String brand;
    private String model;
    private String name_of_owner;
    private final int registration_number;
    String state;
    String color;
    int price;

    // once we assign a model of a car, we do not want to change it, we can do it by making the attributes - private

    // if we don't want an attribute to be writable, when you declare it you can also add this keyword - final


    Car(String brand, String model, String name_of_owner, int registration_number, String state,String color, int price){
        this.brand = brand;
        this.model = model;
        this.name_of_owner = name_of_owner;
        this.registration_number = registration_number;
        this.state = state;
        this.color = color;
        this.price = price;
    }

    // since the attributes are private, we can't access them outside the class. But there is a way to do so using GETTERS and SETTERS D_Methods.methods
    // we will set up some getter D_Methods.methods first - for model, name_of_owner and price.
    // Here's how we can do that - within the car class we will create a method.
    // We will create a getter method using return type and the naming convention - get followed by the name of the attribute


    String getModel(){
        return this.model;
    }

    String getName_of_owner(){
        return this.name_of_owner;
    }

    // another thing we can do with getter D_Methods.methods, you can add additional logic, so with our getPrice method lets instead return a String, we will return a unit of currency + the price, first we returned int and only the price
    // GETTERS = Methods that make a file READABLE and you can add additional logic when retrieving one of the attributes, in this demonstration we just added the '$' sign

//    int getPrice(){
//        return this.price;
//    }

    String getPrice(){
        return "$" + this.price;
    }

    // Using the setter method :- we don't want the model attribute to be writable, once we've declared it, we don't want to change it. But we can change the name of the owner name and the price.
    // We will declare a setter method for our owner name and price, but not for registration as we don't want his attribute to be writable

    void setName_of_owner(String name_of_owner){
        this.name_of_owner = name_of_owner;                         // assign name_of_owner to the name of owner we receive
    }

//    void setPrice(int price){
//        this.price = price;                                         // assign price to the price we receive
//    }

    // we can also add a logic here, let's add a logic for price of car not be less than 0

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price of the car cannot be less than zero");
        }
        else{
            this.price = price;
        }
    }
}
