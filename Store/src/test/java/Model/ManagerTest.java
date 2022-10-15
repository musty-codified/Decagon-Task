package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {
    Manager manager = new Manager();
    @Test
    void hireCashier_WhenManagerHire_ApplicantSuccessful(){
        Applicant applicant = new Applicant();
        String result= applicant.applyPosition(applicant);
        Assertions.assertEquals(result, "Congratulations", "Applicant did not get hired");

    }

}