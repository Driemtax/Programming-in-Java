package Ex1;
public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "MyName";
        this.age = 19;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}