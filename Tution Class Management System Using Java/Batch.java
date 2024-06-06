import java.util.ArrayList;
import java.util.Date;

public class Batch {
    public ArrayList<Student> enrolledStudents;
    private Date startDate;
    private double totalFeesGotInMonth;
    private double totalFeesGotOverall;
    public ArrayList<PaymentReport> paidStudents;

    public ArrayList<Attendance> attendanceReport;



    public Batch(Date startDate,double totalFeesGotInMonth,double totalFeesGotOverall) {
        this.startDate = startDate;
        this.totalFeesGotInMonth = totalFeesGotInMonth;
        this.totalFeesGotOverall = totalFeesGotOverall;

        paidStudents = new ArrayList<>();
        attendanceReport=new ArrayList<>();
        enrolledStudents=new ArrayList<>();

    }
    public Batch() {

    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getTotalFeesGotInMonth() {
        return totalFeesGotInMonth;
    }

    public void setTotalFeesGotInMonth(double totalFeesGotInMonth) {
        this.totalFeesGotInMonth = totalFeesGotInMonth;
    }

    public double getTotalFeesGotOverall() {
        return totalFeesGotOverall;
    }

    public void setTotalFeesGotOverall(double totalFeesGotOverall) {
        this.totalFeesGotOverall = totalFeesGotOverall;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public void totalPaymentForMonth(int month) {
        double totalFeesGotInMonth=0;
        for (PaymentReport report : paidStudents) {
            if (report.getPaidMonth() == month) {
                totalFeesGotInMonth += report.getAmountPaid();
            }
        }
        System.out.println("The total payment for the month is: "+totalFeesGotInMonth);

    }

    public void totalPaymentOverall(){
        double totalFeesOverall=0;
        for(PaymentReport report:paidStudents){
            totalFeesOverall+=report.getAmountPaid();
        }System.out.println("The total payment until the current month: "+totalFeesOverall);


    }
    public  void payForMonth(PaymentReport record){
        record.setHasPaidMonthlyFee(true);
       paidStudents.add(record);

    }

    public void  displayNotPaidStudents(int month) {
        boolean found = false;
        for (Student student : enrolledStudents) {
            found = false;

            for (PaymentReport report : paidStudents) {
                if (report.getPaidMonth() == month && report.getStName().equals(student.getName())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student  " +  student.getName() +  " has not paid for the month: " + month);

            }
        }
    }
public void markAttendance(Attendance attReport){
        attendanceReport.add(attReport);

}

public void displayAttendance(int month){
        for (Attendance attReport:attendanceReport){
            if(attReport.getA_Month()==month){
                attReport.displayAttendanceDetails(attReport);
            }else {
                System.out.println("Details  not found");
            }

        }

}

}





