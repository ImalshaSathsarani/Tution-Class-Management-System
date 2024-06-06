
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Asessment asessment = new Asessment();
        Batch batch = new Batch();
        batch.enrolledStudents=new ArrayList<>();
        batch.attendanceReport=new ArrayList<>();
        batch.paidStudents=new ArrayList<>();
        student.assessments=new ArrayList<>();



        int choice;
        do{
            System.out.println("1.Add student to the batch");
            System.out.println("2.Remove student from  the batch");
            System.out.println("3.Add a assessment to a student");
            System.out.println("4.Mark the attendance ");
            System.out.println("5.Get the attendance report");
            System.out.println("6.Do the monthly payment");
            System.out.println("7.See the progress of students");
            System.out.println("8.See the total payment for a month");
            System.out.println("9.Show the overall payment to the current month");
            System.out.println("10.Get the name list of students who do not pay for a relevant month");
            System.out.println("11.Exit");
            System.out.println("Enter the choice:");

            choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case  1 :
                    System.out.println("Enter the name of the student:");
                    String name=scanner.nextLine();

                    System.out.println("Enter the address of the student:");
                    String address=scanner.nextLine();
                    System.out.println("Enter the phone number of the student:");
                    int phoneNo=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the school of the student:");
                    String school=scanner.nextLine();
                    System.out.println("Enter the date of registration:");
                    String date=scanner.nextLine();
                    System.out.println("Enter the fee type of the student(full/half):");
                    String feeType=scanner.nextLine();

                    Student newStudent=new Student(name,address,phoneNo,school,date,feeType);
                    batch.addStudent(newStudent);

                    break;

                case 2:
                    System.out.println("Enter the name of the student:");
                    String d_name=scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the address of the student:");
                    String d_address=scanner.nextLine();
                    System.out.println("Enter the phone number of the student:");
                    int d_phoneNo=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the school of the student:");
                    String d_school=scanner.nextLine();
                    System.out.println("Enter the date of registration:");
                    String d_date=scanner.nextLine();
                    System.out.println("Enter the fee type of the student(full/half):");
                    String d_feeType=scanner.nextLine();

                    Student delStudent=new Student(d_name,d_address,d_phoneNo,d_school,d_date,d_feeType);
                    batch.removeStudent(delStudent);

                    break;

                case 3:
                    System.out.println("Enter the name of the student:");
                    String stName=scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the ID of the assessment:");
                    int Id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the date of submission:");
                    String dateOfSubmission=scanner.nextLine();
                    System.out.println("Enter the marks of the assessment:");
                    double marks=scanner.nextDouble();
                    scanner.nextLine();

                    Asessment assessment=new Asessment(stName,Id,dateOfSubmission,marks);
                    student.addAssessment(assessment);

                    break;
                case 4:
                    System.out.println("Enter the name of the student:");
                    String A_name=scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the month(1-12):");
                    int A_month=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the date(YYYY-MM-DD):");
                    String a_date=scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the attendance status(present/absent):");
                    String status=scanner.nextLine();

                    Attendance newAttendanceRep= new Attendance(A_name,A_month,a_date,status);
                    batch.markAttendance(newAttendanceRep);

                    break;
                case 5:
                    System.out.println("Enter the number of month that the attendance wanted:");
                    int n_month=scanner.nextInt();
                    scanner.nextLine();
                    batch.displayAttendance(n_month);

                    break;

                case 6:
                    System.out.println("Enter the Name of the student:");
                    String p_name=scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the paid month's number(1-12):");
                    int p_month=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the amount paid:");
                    int p_amount=scanner.nextInt();

                    PaymentReport newreport=new PaymentReport(p_name,p_month,p_amount);
                    batch.payForMonth(newreport);

                    break;

                case 7:
                   student.displayProgressReport();

                    break;

                case 8:
                    System.out.println("Enter the number of month to get the total payment:");
                    int t_month=scanner.nextInt();
                    batch.totalPaymentForMonth(t_month);
                    break;

                case 9:
                    batch.totalPaymentOverall();
                    break;

                case 10:
                    System.out.println("Enter the month to get the name list:");
                    int N_month=scanner.nextInt();

                    batch.displayNotPaidStudents(N_month);

                    break;

                case 11:
                    System.out.println("Exiting the program...Thank You!!!");
                    break;

            }


        }while(choice!=11);
    }




}