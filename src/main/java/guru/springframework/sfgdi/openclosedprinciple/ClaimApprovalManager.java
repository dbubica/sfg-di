package guru.springframework.sfgdi.openclosedprinciple;

public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager -> processClaim(): Claim is valid ... ");
        }
    }
}
