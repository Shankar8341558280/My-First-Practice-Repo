import com.oops.practice.CreditCardPayment;
import com.oops.practice.Payment;
import com.oops.practice.PaymentService;
import com.oops.practice.PaypalPayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Payment cardNumber = new CreditCardPayment("9896-2345-6436-2345");
        cardNumber.pay(242);
        PaymentService pymt = new PaymentService(cardNumber);
        pymt.makepayment(989.0);

        Payment acctNo = new PaypalPayment("98765432");
        PaymentService pymt1 = new PaymentService(acctNo);
        pymt1.makepayment(678.0);

    }
}