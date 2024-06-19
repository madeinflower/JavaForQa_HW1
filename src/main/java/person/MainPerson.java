package person;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Bob Marley", 25);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
