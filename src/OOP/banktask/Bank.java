package OOP.banktask;

public class Bank {

    public static void increaseAmount(String identificationNumber, double amount) {
        for (int i = 0; i < Account.customerCount; i++) {
            if (Account.customers[i].getIdentificationNumber().equals(identificationNumber)) {
                double deposit = Account.customers[i].getDeposit();
                deposit = deposit + amount;
                Account.customers[i].setDeposit(deposit);
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Your balance increased successfully!");
        System.out.println("---------------------------------------");
    }

    public static void getAllCustomerInformation(String identificationNumber) {
        for (int i = 0; i < Account.customerCount; i++) {
            if (Account.customers[i].getIdentificationNumber().equals(identificationNumber)) {
                System.out.println("---------------------------------------");
                System.out.println("Name: "+Account.customers[i].getName());
                System.out.println("Name: "+Account.customers[i].getSurname());
                System.out.println("Name: "+Account.customers[i].getDeposit());
                System.out.println("Name: "+Account.customers[i].getIdentificationNumber());
                System.out.println("---------------------------------------");
            }
        }
    }

    public static void sendMoney(String number1, String number2, double amount) {
        for (int i = 0; i < Account.customerCount; i++) {
            if (Account.customers[i].getIdentificationNumber().equals(number1)) {
                double deposit = Account.customers[i].getDeposit();
                deposit = deposit - amount;
                Account.customers[i].setDeposit(deposit);
                for (int j = 0; j < Account.customerCount; j++) {
                    if (Account.customers[j].getIdentificationNumber().equals(number2)) {
                        deposit = Account.customers[j].getDeposit();
                        deposit = deposit + amount;
                        Account.customers[j].setDeposit(deposit);
                    }
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Your money sent successfully!");
        System.out.println("---------------------------------------");
    }

    public static double getTotalDeposit() {
        double totalDeposit = 0;
        for (int i = 0; i < Account.customerCount; i++) {
            totalDeposit = totalDeposit + Account.customers[i].getDeposit();
        }
        return totalDeposit;
    }
}