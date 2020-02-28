package guru.springframework.sfgdi.openclosedprinciple;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor -> isValidClaim(): Validating vehicle ins. claim ... ");
        return true;
    }
}
