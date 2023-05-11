import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This account is opened in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This processing error occurred. Please, try again");
        } catch (Exception exception) {
            System.out.println("This is not enough money in this account");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This account is opened in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This processing error occurred. Please, try again");
        } catch (Exception exception) {
            System.out.println("This is not enough money in this account");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This account is opened in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This processing error occurred. Please, try again");
        } catch (Exception exception) {
            System.out.println("This is not enough money in this account");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This account is opened in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This processing error occurred. Please, try again");
        } catch (Exception exception) {
            System.out.println("This is not enough money in this account");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This account is opened in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This processing error occurred. Please, try again");
        } catch (Exception exception) {
            System.out.println("This is not enough money in this account");
        } finally {
            System.out.println("Thank you for using our service");
        }
//        try {
//            bankApplication.process("accountId000", 50, "USD");
//            bankApplication.process("accountId003", 250, "HRV");
//            bankApplication.process("accountId001", 50, "EUR");
//            bankApplication.process("accountId001", 50, "USD");
//            bankApplication.process("accountId001", 50, "USD");
//        } catch (WrongAccountException wrongAccountException) {
//            System.out.println("This account doesn't exist");
//        } catch (WrongCurrencyException wrongCurrencyException) {
//            System.out.println("This account is opened in another currency");
//        } catch (WrongOperationException wrongOperationException) {
//            System.out.println("This processing error occurred. Please, try again");
//        } catch (Exception exception) {
//            System.out.println("This is not enough money in this account");
//        } finally {
//            System.out.println("Thank you for using our service");
//        }
    }
}
