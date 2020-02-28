package guru.springframework.sfgdi.interfacesegregationprinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyBuilderTest {

    @Test
    void buildToyHouse() throws Exception {
        ToyBuilder toyBuilder = new ToyBuilder();
        System.out.println(toyBuilder.buildToyHouse());
    }

    @Test
    void buildToyCar() {
        System.out.println(ToyBuilder.buildToyCar());
    }

    @Test
    void buildToyPlane() {
        System.out.println(ToyBuilder.buildToyPlane());
    }

    @Test
    void testBuildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(1075.00);
        toyHouse.setColor("Orange");
        System.out.println(toyHouse);
    }
}