package busquedaPatrones;

public class BusquedaPatrones {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        stringMatch(text,pattern);
        text = "geeksforgeeks is a coding website for geeks";
        pattern = "geeks";
        stringMatch(text,pattern);

    }
    public static void stringMatch(String text, String pattern){
        int len_t = text.length();
        int len_p = pattern.length();
        int k =0, i = 0, j = 0;

        //averiguar la posicion del patron buscado
        for(i = 0 ; i <=(len_t - len_p);i++){
            for(j = 0 ; j < len_p ; j++){
                if(text.charAt(i+j) != pattern.charAt(j))
                    break;
            }
            if(j == len_p){
                k++;
                System.out.println("Patron encontrado en la posicion: " + i);
            }
        }

        if(k == 0){
            System.out.println("No se encontrado coincidencias!");
        }else{
            System.out.println("total de instancias encontradas = " + k);
        }
    }
}
