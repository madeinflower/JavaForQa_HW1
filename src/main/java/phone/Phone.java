package phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this.number = "unknown";
        this.model = "unknown";
        this.weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void printInfo() {
        System.out.println("Number: " + number + ", Model: " + model + ", Weight: " + weight);
    }
}
