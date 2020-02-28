package guru.springframework.sfgdi.openclosedprinciple;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor -> isValidClaim(): Validating health ins. claim ... ");
        return true;
    }

}
