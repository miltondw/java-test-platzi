package vercel.miltondw.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private  PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;
    @Before
    public void setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }
    @Test
    public void payment_is_correct() {
        Mockito
                .when(paymentGateway.reqPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymnetStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito
                .when(paymentGateway.reqPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymnetStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}