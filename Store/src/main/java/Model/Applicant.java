package Model;
import Enum.Qualification;

public class Applicant extends Person{
    private String position;
    private Qualification qualification;

    public Applicant(String firstName, String lastName, String gender, String age, String email, long contactNo, String position, Qualification qualification) {
        super(firstName, lastName, gender, age, email, contactNo);
        this.position = position;
        this.qualification = qualification;
    }

    public Applicant() {

    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Qualification getQualification() {
        return qualification;
    }
    public void setQualification(Qualification qualification) {
        this. qualification = qualification;
    }

    public String applyPosition(Applicant applicant){
        if(applicant.getQualification().equals(Qualification.BSC)){
            return "Congratulations";
        }
        return "Sorry, you have not met the requirement to be considered for this role";
    }
}
