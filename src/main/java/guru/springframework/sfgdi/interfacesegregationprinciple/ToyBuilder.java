package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyBuilder {

    public String buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(75.00);
        toyHouse.setColor("Green");
        return toyHouse.toString();
    }

    public static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("Red");
        toyCar.move();
        return toyCar;
    }

    public static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(375.00);
        toyPlane.setColor("White");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
}
