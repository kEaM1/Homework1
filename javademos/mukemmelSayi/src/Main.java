public class Main {
    public static void main(String[] args) {
        int number=6;
        int bolenler=0;

        for (int i=1;i<number; i++)
            if (number%i==0){
                bolenler +=i;
            }if (bolenler==number){
                System.out.println("Mükemmel Sayıdır");
        }else {
                System.out.println("Mükemmel Sayı Değildir");
        }
    }
}