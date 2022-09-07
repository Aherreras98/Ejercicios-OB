public class Main {

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setNombre("Pablo");
        persona.setEdad(24);
        persona.setTelefono(603298174);

        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        int telefono = persona.getTelefono();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
}