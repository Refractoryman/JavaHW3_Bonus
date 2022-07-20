public class Main {
    public static void main(String[] args) {
       int account = 500;
       int bonusCounting = 100;
       int depositAmount = 1800;
       int bonus;
       if (depositAmount >= 1000) {
           bonus = depositAmount / bonusCounting;
       } else {
           bonus = 0;
       }
       int totalAccount = account + bonus + depositAmount;
        System.out.println("Ваш счет пополнен на: " + depositAmount + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
        System.out.println("Ваш баланс: " + totalAccount + " руб.");

    }

}
