

public class Asessment {
    private String stName;
    private int ID;
    private String dateOfSubmission;
    private double marks;
    private double stProgress;

    public Asessment(String stName,int ID, String dateOfSubmission, double marks) {
        this.stName=stName;
        this.ID = ID;
        this.dateOfSubmission = dateOfSubmission;
        this.marks = marks;
    }
    public Asessment(){

    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(String dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getStProgress() {
        return stProgress;
    }

    public void setStProgress(double stProgress) {
        this.stProgress = stProgress;
    }

    /*public void displayAssessmentInfo(){
        System.out.println("Assessment ID:   "+ID);
        System.out.println("Date of submission: "+dateOfSubmission);
        System.out.println("Marks: "+marks);
    }*/

    public boolean isCompleted(){
        return  marks>40;
    }
}
