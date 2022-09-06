public class Main {

    public static void main(String[] args){
        int numeroIf = -3;

        if (numeroIf > 0)  {
            System.out.println("Positivo");
        } else if (numeroIf < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("0");
        }

        int numeroWhile = 1;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        }
        int numeroDoWhile = 3;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while(numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
            System.out.println(numeroFor);
        }

        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}
