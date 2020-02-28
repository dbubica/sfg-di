package guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel;

import guru.springframework.sfgdi.dependencyinversionprinciple.highlevel.Switchable;

public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan: fan is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: fan is OFF.");
    }
}
