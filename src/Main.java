import com.oop.practice.ClassAndObject;
import com.oop.practice.Encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ClassAndObject cao = new ClassAndObject("Shankar" ,24,'A');
//        ClassAndObject cao1 = new ClassAndObject("Sai" ,24,'O');
//
//        cao.displayDetails();
//        System.out.println();
//        cao1.displayDetails();

        Encapsulation en = new Encapsulation();
        en.getBalance();
        System.out.println();
        en.depositAmount(1000);
        System.out.println();
        en.depositAmount(-100);
        System.out.println();
        en.depositAmount(0);
        System.out.println();
        en.withdrawAmount(0);
        System.out.println();
        en.withdrawAmount(-100);
        System.out.println();
        en.withdrawAmount(10001);
        System.out.println();
        en.withdrawAmount(900);
    }
}