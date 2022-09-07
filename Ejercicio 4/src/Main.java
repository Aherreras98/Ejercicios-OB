public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 35;
        cliente.nombre = "Carlos";
        cliente.telefono = 924568012;
        cliente.credito = 2000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 28;
        trabajador.nombre = "Maria";
        trabajador.telefono = 607321264;
        trabajador.salario = 1300;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}