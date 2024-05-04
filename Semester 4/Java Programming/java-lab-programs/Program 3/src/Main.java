public class Main {
    public static void main(String[] args) {
        //Q3. Write a program to overload methods and constructor
        Person p1 = new Person("Shikha");
        Person p2 = new Person("Anshu","black","CEO");
        Person p3 = new Person("Lakshay","black","Founder",20);

        int output1 = Person.sum(3,3);
        double output2 = Person.sum(4.22,78.3);
        String output3 = Person.sum("Lakshay","Kamat");
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}