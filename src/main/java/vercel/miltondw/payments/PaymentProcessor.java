package vercel.miltondw.payments;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.reqPayment(new PaymentReq(amount));
        if (response.getStatus()== PaymentResponse.PaymnetStatus.OK){
            return true;
        }else{
            return false;
        }
    }
}
