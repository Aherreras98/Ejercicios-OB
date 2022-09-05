public class Main {

    public static void main(String[] args) {
        int resultado;
        resultado = suma(18, 19, 25);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {

        return a + b + c;
    }

}
class Coche {
    public int puertas = 4;

    public void IncrementarPuerta() {

        this.puertas++;
    }
}
