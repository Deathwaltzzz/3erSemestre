import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declaracion y creacion del scanner para entrada de datos
        Triangulo[] objTri = new Triangulo[10]; //Declaracion y creacion de un objeto Triangulo de 10 casillas, inciso A)
        objTri[9] = new Triangulo(); //Declaracion y creacion del objTri con indice 9, inciso B)
        float ladoA,ladoB,ladoC; //declaracion de lados float para pasar al triangulo
        for(int i = 0 ; i < 4 ; i++){ //Ciclo for para poder introducir los datos, inciso c)
            System.out.println("Lado A del triangulo "+(i+1)+": "); //Se pide el primer dato y se captura con Scanner
            ladoA = sc.nextFloat();
            System.out.println("Lado B del triangulo "+(i+1)+": "); //Se pide el segundo dato y se captura con Scanner
            ladoB = sc.nextFloat();
            System.out.println("Lado C del triangulo "+(i+1)+": "); //Se pide el tercer dato y se captura con Scanner
            ladoC = sc.nextFloat();
            objTri[i] = new Triangulo(ladoA,ladoB,ladoC); //Se crea el objeto Triangulo del indice correspondiente con los datos
            //entrados en el scanner
        }
        ladoA = objTri[0].getLado1();
        ladoB = objTri[0].getLado2();
        ladoC = objTri[0].getLado3();
        objTri[8] = new Triangulo(ladoA,ladoB,ladoC); //Se declara y crea el objeto 8, el penultimo y se asigna valores, inciso D

        for(int i = 0 ; i<objTri.length; i++){ //Ciclo para mostrar los datos, inciso E)
            if(objTri[i] != null){
                System.out.println("Triangulo "+ (i+1) + " :");
                System.out.println("Datos del triangulo: "+"\n"+objTri[i]);
                System.out.println("Area: " + objTri[i].calcularArea());
                System.out.println("Perimetro: "+ objTri[i].calcularPerimetro());
                System.out.println("Tipo de triangulo: "+ objTri[i].tipoDeTriangulo());
            }else{
                System.out.println("El triangulo "+(i+1)+" no existe");
            }
        }
    }
}
