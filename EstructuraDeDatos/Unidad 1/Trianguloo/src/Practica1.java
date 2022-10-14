public class Practica1 {
    public static void main(String[] args) {
        Triangulo tri1; //declara el primer objeto
        Triangulo tri2 = new Triangulo(); //declara y crea el segundo objeto
        tri1 = new Triangulo(8.7f); //crear el primer objeto
        System.out.println("1er triangulo: \n" + tri1);
        //tri1.setLado3(25f);
       // System.out.println("1er triangulo despues de modificar lado 3: \n" + tri1);
        System.out.println("2do triangulo: \n" + tri2);
        System.out.println("Area del 1er triangulo: "+ tri1.calcularArea());
        System.out.println("Permietro del 2do triangulo: \n" + tri2.calcularPerimetro());
    }
}