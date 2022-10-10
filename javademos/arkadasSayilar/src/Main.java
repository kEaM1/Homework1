public class Main {
    public static void main(String[] args) {
        int as = 220;
        int as1 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < as; i++) {
            if (as % i == 0) {
                toplam1 += i;
            }
        }
        for (int i = 1; i < as1; i++) {
            if (as1 % i == 0) {
                toplam2 += i;
            }
        }
        if (toplam1 == as1) {
            if (toplam2 == as) {
                System.out.println("Dogru");
            }
        } else {
            System.out.println("Yanlış");
        }
    }


}