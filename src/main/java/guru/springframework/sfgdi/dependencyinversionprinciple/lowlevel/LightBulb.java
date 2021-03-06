package guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel;

import guru.springframework.sfgdi.dependencyinversionprinciple.highlevel.Switchable;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb: light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: light is OFF");
    }
}
