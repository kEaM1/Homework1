public class Main {
    public static void main(String[] args) {
        char harf = 'A';
        char[] kalinharf = {'A', 'I', 'O', 'U'};

        char[] inceharf = {'E', 'İ', 'Ü', 'Ö'};
        for (char j : inceharf)
            if (j == harf) {
                System.out.println("İnce Harf");
            }
        for (char k : kalinharf) {
            if (k == harf) {
                System.out.println("Kalın Harf");
            }
        }
    }
}

