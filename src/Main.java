public class Main {
        public static void main(String[] args) {


            int balance = 100;
            int deposit = 2000;
            int bonus = 0;
            if (deposit >= 1000) {
                bonus = deposit  / 100;
            } else {
                bonus = 0;
            }
            int overallBalance = balance + deposit + bonus ;
            System.out.println("Ваш баланс:"+ overallBalance);
            System.out.println("Ваши начисленные бонусы:"+ bonus);
        }
    }

