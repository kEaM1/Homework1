public class Main {
    public static void main(String[] args) {
        int [] sayilar = new int[] {1, 2, 5, 7, 9, 0};
        int aranacak= 5;
        boolean varMı=true;
        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMı=true;
                break;
            }
        }if (varMı){
            System.out.println("Var";
        }else {
            System.out.println("yok");
        }

            }
        }
    }
}