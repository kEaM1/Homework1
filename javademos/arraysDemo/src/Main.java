public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Nisa";
        String ogrenci3 = "Engin";
        String ogrenci4 = "Sude";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);


        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}