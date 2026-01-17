package H_Collections_and_Utilities.H04_Enums;

public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    // common convention to define enum constants is that we write them in capital letters

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }
    // when we define these enum constants we are automatically going to call the constructor for this enum class and pass in value

    public int getDayNumber(){
        return this.dayNumber;
    }
}


/*
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
This is one of the core concepts of OOP: encapsulation

 Why is dayNumber private and getDayNumber() public?
    1. dayNumber is private because:

    You do not want other classes or code to modify it.

    Enums represent fixed constants, so the values inside them should never change.

    By making it private, only the enum itself can access or modify the variable.

    It protects the internal data from accidental changes.

    In simple words:
    Private = keep it safe and locked inside the class.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Why is getDayNumber() public?

    Because other parts of your program need to read the value, but should not be allowed to change it.

    Public getter provides controlled access.

    Getter only returns the value — it never modifies it.

    Other classes can read the number (1–7) without breaking the enum structure.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
In simple words:
    Public getter = allow reading safely without allowing changes.

Putting it together (Encapsulation):

    Encapsulation = Hiding data + Allowing safe access.

    --------------------------------------------------------------------------------------------------------------------------------------
    Member	                      |                  Access	                    |                         Why?                            |
    --------------------------------------------------------------------------------------------------------------------------------------
    private int dayNumber	      |          Not accessible outside	            |      Protect the data (cannot modify enum values)       |
    public int getDayNumber()	  |             Accessible	                    |       Allow reading the day number safely               |
    --------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Simple analogy:

    Think of dayNumber like a bank locker:

        The locker itself is private → nobody can directly open it.

        But people can ask the bank for information → "What's inside?"
        The bank gives the info through a public method (getter).

        This ensures safety + access
*/