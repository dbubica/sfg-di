package guru.springframework.sfgdi.openclosedprinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimApprovalManagerTest {

    @Test
    public void testProcessHealthClaim() throws Exception {

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager1 = new ClaimApprovalManager();
        claimApprovalManager1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager2 = new ClaimApprovalManager();
        claimApprovalManager2.processClaim(vehicleInsuranceSurveyor);
    }
}