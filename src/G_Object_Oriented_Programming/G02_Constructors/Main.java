package G_Object_Oriented_Programming.G02_Constructors;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Spongebob",25,3.2);
        Student student2 = new Student("Patrick",26,3.1);
        Student student3 = new Student("Sandy",32,2.7);
        // we need matching set of argument and parameters, in 'objects' as well as 'constructor'

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

    }
}
