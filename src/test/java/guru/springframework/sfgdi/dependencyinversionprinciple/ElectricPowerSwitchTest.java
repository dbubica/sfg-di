package guru.springframework.sfgdi.dependencyinversionprinciple;

import guru.springframework.sfgdi.dependencyinversionprinciple.highlevel.ElectricPowerSwitch;
import guru.springframework.sfgdi.dependencyinversionprinciple.highlevel.Switch;
import guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel.Fan;
import guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel.LightBulb;
import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

    @Test
    void pressSwitch() {
        Switch switchLight = new ElectricPowerSwitch(new LightBulb());
        switchLight.press();
        switchLight.press();

        Switch switchFan = new ElectricPowerSwitch(new Fan());
        switchFan.press();
        switchFan.press();
    }
}