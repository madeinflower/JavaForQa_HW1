package phone;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "ModelA", 150.0);
        Phone phone2 = new Phone("456-432-777", "ModelB", 170.0);
        Phone phone3 = new Phone("765-654-000", "ModelC", 190.0);

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        phone1.receiveCall("Ann");
        System.out.println("Phone number: " + phone1.getNumber());

        phone2.receiveCall("Alice");
        System.out.println("Phone number: " + phone2.getNumber());

        phone3.receiveCall("Tom");
        System.out.println("Phone number: " + phone3.getNumber());
    }
}
