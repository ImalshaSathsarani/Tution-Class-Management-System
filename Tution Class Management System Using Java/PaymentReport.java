
public class PaymentReport  {
    private String stName;
    private boolean hasPaidMonthlyFee=false;
    private int paidMonth;
    private int amountPaid;


    public PaymentReport(String stName,  int paidMonth, int amountPaid) {
        this.stName = stName;
        this.paidMonth = paidMonth;
        this.amountPaid = amountPaid;


    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public boolean isHasPaidMonthlyFee() {
        return hasPaidMonthlyFee;
    }

    public void setHasPaidMonthlyFee(boolean hasPaidMonthlyFee) {
        this.hasPaidMonthlyFee = hasPaidMonthlyFee;
    }

    public int getPaidMonth() {
        return paidMonth;
    }

    public void setPaidMonth(int paidMonth) {
        this.paidMonth = paidMonth;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }
}
