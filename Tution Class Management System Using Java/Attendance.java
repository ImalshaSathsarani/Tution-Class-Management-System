

public class Attendance {
    private String StudentName;
    private int a_Month;
    private String a_date;
    private String attendanceStatus;

    public Attendance(String studentName, int a_Month,String a_date, String attendanceStatus) {
        StudentName = studentName;
        this.a_Month = a_Month;
        this.a_date=a_date;
        this.attendanceStatus = attendanceStatus;
    }
    public Attendance(){

    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getA_Month() {
        return a_Month;
    }

    public void setA_Month(int a_Month) {
        this.a_Month = a_Month;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public void displayAttendanceDetails(Attendance rep){
        System.out.println("Student name:"+rep.getStudentName());
        System.out.println("Month:"+rep.getA_Month());
        System.out.println("Date:"+rep.getA_date());
        System.out.println("Attendance Status:"+rep.getAttendanceStatus());
    }
}
