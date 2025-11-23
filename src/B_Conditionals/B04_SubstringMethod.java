/*
    This program demonstrates:

    - How to extract parts of a string using substring(start, end)
    - How to use substring(start) to extract from a position till the end
    - How to combine substring() with indexOf() to dynamically extract
      the username and domain from an email address
*/


package B_Conditionals;

public class B04_SubstringMethod {
    public static void main(String[] args){

        // .substring () :- A method used to extract a portion of a string
        // .substring (start, end)

        String email = "sureshkulkarni9922@gmail.com";
        String email2 = "suresh2529@yahoo.com";
        String username = email.substring(0,14);
        String domain = email.substring(19,28);
        String domain2 = email2.substring(11);

        // using substring with '.indexOf()' :-

        String username1 = email.substring(0,email.indexOf("@"));
        String domain3 = email.substring(email.indexOf("@")+1);
        String domain4 = email.substring(email.indexOf("@")+1);


        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);
        System.out.println("Domain2: "+domain2);
        System.out.println("Username 1: "+username1);
        System.out.println("Domain 3: "+domain3);
        System.out.println("Domain 4: "+domain4);
    }
}
