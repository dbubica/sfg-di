package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyPlane implements Toy, Movable, Flyable {

    double price;
    String color;

    @Override
    public void fly() {
        System.out.println("ToyPlane: plane is flying.");
    }

    @Override
    public void move() {
        System.out.println("ToyPlane: plane is moving");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Movable Flyable ToyPlane {" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
