public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loanTerm = 24; // месяцев Срок кредита
        int loanAmount = 1_000_000; //рублей Сумма кредита
        double percentCredit = 9.99; //Процент кредита

        double monthPayment = (int) (service.calculate(loanAmount, loanTerm, percentCredit));

        System.out.println("Сумма кредита = " + loanAmount + " руб.");
        System.out.println("Ежемесячный платеж = " + Math.round(monthPayment) + " руб.");
        System.out.println("Процентная ставка = " + percentCredit + " %");

    }
}

