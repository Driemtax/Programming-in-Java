public class Student extends Person {
    public void Study(){
        System.out.println("I am studying!");
    }

    public void ViewAge(){
        System.out.printf("My Age is: %d years\n", this.GetAge());
    }
}
