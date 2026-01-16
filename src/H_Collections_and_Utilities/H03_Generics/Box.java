package H_Collections_and_Utilities.H03_Generics;

// we need to store items of different data types so we use a placeholder to specify it
public class Box <T> {

    T item;             // we don't know the data type, so T can be String, Integer

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}

// our Box class is compatible with all data types

// basically, with our Box class we are writing a logic of how a box works, you put in something and get out something and its compatible with different data types
// we just have to use type argument while creating Box object, we just want Java to know what we are storing within it
