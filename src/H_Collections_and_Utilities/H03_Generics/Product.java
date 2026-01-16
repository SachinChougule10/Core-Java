package H_Collections_and_Utilities.H03_Generics;

public class Product <T, U> {
    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}

// with type parameters, you can have more than one type, we can have two or more different types
