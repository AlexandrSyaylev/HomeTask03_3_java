//Additional Task 3 for Lection 3 about credit calculating

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.printf("%.2f", service.calculate(1,9.99, 1000000));
        System.out.println("  ");
        System.out.printf("%.2f", service.calculate(2,9.99, 1000000));
        System.out.println("  ");
        System.out.printf("%.2f", service.calculate(3,9.99, 1000000));

    }
}
