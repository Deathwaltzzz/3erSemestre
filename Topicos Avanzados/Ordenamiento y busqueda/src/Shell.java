import java.util.Random;

public class Shell {
    public static void shellSort(int x[], int n, int incrmnts[], int numinc){
        int incr,j,k,span,y;
        for(incr = 0 ; incr < numinc ; incr++){
            span = incrmnts[incr];
            for(j = span ; j < n ; j++){
                y = x[j];
                for(k = j - span ; k>= 0 && y < x[k] ; k -= span){
                    x[k+span] = x[k];
                }
                x[k+span] = y;
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int x[] = new int[20];
        int[] incrmnts = {5,3,1};
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(300)+1;
        }
        shellSort(x,x.length,incrmnts,incrmnts.length);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}
