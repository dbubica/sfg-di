package guru.springframework.sfgdi.dependencyinversionprinciple.highlevel;

import guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel.LightBulb;

public class ElectricPowerSwitch implements Switch {

    public Switchable switchableDevice;
    public boolean on;

    public ElectricPowerSwitch(Switchable switchableDevice) {
        this.switchableDevice = switchableDevice;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        if(isOn()) {
            switchableDevice.turnOff();
            this.on = false;
        } else {
            switchableDevice.turnOn();
            this.on = true;
        }
    }
}
