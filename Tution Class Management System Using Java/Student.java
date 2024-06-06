import java.util.ArrayList;

public class Student {
    private  String name;
    private String address;
    private int phoneNo;
    private String school;
    private String dateOfRegistration;
    private String feeType;
    public ArrayList<Asessment> assessments;
    private int completedAssessments;

    public Student(String name, String address, int phoneNo, String school, String dateOfRegistration, String feeType) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.school = school;
        this.dateOfRegistration = dateOfRegistration;
        this.feeType = feeType;

        assessments=new ArrayList<>();
    }
    public Student() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public int getCompletedAssessments() {
        return completedAssessments;
    }

    public void setCompletedAssessments(int completedAssessments) {
        this.completedAssessments = completedAssessments;
    }

    public ArrayList<Asessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(ArrayList<Asessment> assessments) {
        this.assessments = assessments;
    }

    public void displayStudentDetails(){
        System.out.println("Student name: "+name);
        System.out.println("Student Address: "+address);
        System.out.println("Student telephone number: "+phoneNo);
        System.out.println("Student school: "+school);
        System.out.println("Student date of registration: "+dateOfRegistration);
        System.out.println("Student fee type: "+feeType);
    }


        public void addAssessment(Asessment assessment ){
            assessments.add(assessment);

}
    public double calculateStProgress(){
         completedAssessments = 0;
        for (Asessment assessment:assessments) {
            if (assessment.isCompleted() ) {
                completedAssessments++;
            }
        }return((double) completedAssessments /10)*100;
    }

    public void displayProgressReport(){
        for(Asessment assessment:assessments){
            System.out.println("The progress of the student "+ assessment.getStName()+" : "+calculateStProgress());
        }
    }







    }







