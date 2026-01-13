package G_Object_Oriented_Programming.G16_Composition;

public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}
