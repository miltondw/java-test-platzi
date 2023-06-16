package vercel.miltondw.payments;

public class PaymentReq {
    private double amount;

    public PaymentReq(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
