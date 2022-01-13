//Источник https://journal.tinkoff.ru/guide/credit-payment/

public class CreditPaymentService {
    public double calculate(int creditTime, double creditTax, int amount) {
        int creditTimeInMon = creditTime * 12;
        double paymentCount = creditTimeInMon; //введен для понятности кода (названия переменных)
        double taxInMon = creditTax / 12 / 100;
        double annuitPreCount = Math.pow((taxInMon + 1), paymentCount); //введен для повышения читаемости
        double annuitKoef = taxInMon * (annuitPreCount / (annuitPreCount - 1));
        double result = amount * annuitKoef; //можно объединить с предыдущей строкой, оставлено для наглядности
        return result;
    }
}
