public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo(){
        lado1=lado2=lado3=0;
    }
    public Triangulo(float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo(float ladoigual){
        lado1 = lado2 = lado3 = ladoigual;
    }

    public float getLado1(){
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public String toString(){
        return "Lado 1: " + lado1 +
               "\nLado 2: " + lado2 +
               "\nLado 3: " + lado3;
    }

    public float calcularPerimetro(){
        float s = (lado1 + lado2 + lado3);
        return s;
    }
    public float calcularArea(){
        float s = calcularPerimetro() / 2;
        double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return (float)area;
    }

    public String tipoDeTriangulo(){
        if(lado1 == lado2 ||lado1 == lado3 ||lado2 == lado3){ //Revisa la co
            if(lado1 == lado2 && lado2 == lado3){
                return "Equilatero";
            }else{
                return "Isosceles";
            }
        }else{
            return "Escaleno";
        }
    }
}
