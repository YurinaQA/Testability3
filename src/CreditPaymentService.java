public class CreditPaymentService {

    public double calculate(int loanAmount, int loanTerm, double percentCredit) {
        double monthPercent = percentCredit / (100 * 12); //Процентная ставка
        double result = loanAmount * ((monthPercent * Math.pow((1 + monthPercent), loanTerm)) / (Math.pow((1 + monthPercent), loanTerm) - 1));
        return result;
    }
}

