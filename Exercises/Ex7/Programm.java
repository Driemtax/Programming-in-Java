public class Programm {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.Greet();

        Student student1 = new Student();
        student1.SetAge(23);
        student1.Greet();
        student1.ViewAge();
        student1.Study();

        Teacher teacher1 = new Teacher();
        teacher1.SetAge(55);
        teacher1.Greet();
        teacher1.Explain();
    }
}
