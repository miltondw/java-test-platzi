package vercel.miltondw.payments;

public interface PaymentGateway {
    PaymentResponse reqPayment(PaymentReq req);
}
