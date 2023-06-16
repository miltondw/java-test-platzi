package vercel.miltondw.payments;

public class PaymentResponse {
    enum PaymnetStatus{
        OK,ERROR
    }
    private PaymnetStatus status;

    public PaymentResponse(PaymnetStatus status) {
        this.status = status;
    }

    public PaymnetStatus getStatus() {
        return status;
    }
}
