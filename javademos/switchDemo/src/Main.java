public class Main {
    public static void main(String[] args) {
        char grade = 'L';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok İyi : Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Giriniz");
        }
    }
}