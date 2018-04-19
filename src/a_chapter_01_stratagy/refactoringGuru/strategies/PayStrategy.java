package a_chapter_01_stratagy.refactoringGuru.strategies;


public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
