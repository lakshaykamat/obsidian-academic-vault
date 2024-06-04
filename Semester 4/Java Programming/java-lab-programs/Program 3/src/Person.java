public class Person {
    String name,eyeColor,job;
    int age;
    Person(String name){
        this.name = name;
    }
    Person(String name,String eyeColor,String job){
        this.name = name;
        this.eyeColor = eyeColor;
        this.job = job;
    }
    Person(String name,String eyeColor,String job,int age){
        this.name = name;
        this.eyeColor = eyeColor;
        this.job = job;
        this.age = age;
    }

    static int sum(int x,int y){
        return x+y;
    }
    static double sum(double x,double y){
        return x+y;
    }
    static String sum(String x,String y){
        return x+y;
    }
}
