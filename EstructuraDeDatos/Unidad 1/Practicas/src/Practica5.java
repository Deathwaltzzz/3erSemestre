public class Practica5 {
    static int[][] prueba1 = {{4,9,2},{3,5,7},{8,1,6}};
    static boolean isMagic = true;
    public static void main(String[] args) {
        resuelve(prueba1);
    }

    public static void resuelve(int[][] m){
        int sum = 0;
        int sumaux = 0;
        for (int i = 0; i < m.length; i++) {
            sum+= m[i][i];
        }
        while (isMagic)
        for (int i = m.length-1; i >= 0; i--) {
            sumaux += m[i][i];
        }
        System.out.println(sumaux);
        if(sum == sumaux){
            System.out.println("El cubo es magico");
            isMagic = false;
        }
    }
}
