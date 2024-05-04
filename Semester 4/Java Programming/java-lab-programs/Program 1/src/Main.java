class Person{
    String name;
    int age;
    Person(String name,int age){
        this.age = age;
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        //Q1. WAP to create classes objects and constructors
        Person p1 = new Person("Anshuman",20);
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}