public class Main {
    public static void main(String[] args) {
        int number = 1;
        int reamainder = number % 2;
        System.out.println(reamainder);

        boolean isPrime = true;

        if (number==){
            System.out.println("Asal Değildir");
            return;
        }
        if (number<2){
            System.out.println("Geçersiz Sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        if (isPrime) {
            System.out.println("Asaldır");
        } else {
            System.out.println("Asal Değildir");
        }


    }


}