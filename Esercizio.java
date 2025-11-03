
public class Esercizio {
    
    public static void esercizio1() {
        int[][] M = new int[3][5];

        M[1][0] = 7;
        M[1][1] = 7;
        M[1][2] = 7;
        M[1][3] = 7;
        M[1][4] = 7;

        UtilsMatrice.visualizza(M);
    }
    
    public static void esercizio2() {
        int[][] M = new int[3][5];

        int j = 0;

        while(j < 5){
            M[1][j] = 7;
            ++j;
        }

        UtilsMatrice.visualizza(M);
    }
    
    public static void esercizio3() {

        int[][] M = new int[3][5];

        int i = 0;
        
        while(i < 3){
            M[i][3] = 7;
            ++i;
        }

        UtilsMatrice.visualizza(M);
    }
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ESERCIZIO 1: ");
        System.out.println("----- ----- -----");
        esercizio1();
        
        System.out.println();
        System.out.println("ESERCIZIO 2: ");
        System.out.println("----- ----- -----");
        esercizio2();
        
        System.out.println();
        System.out.println("ESERCIZIO 3: ");
        System.out.println("----- ----- -----");
        esercizio3();
    }
}