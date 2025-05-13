import java.util.Scanner;

public class Conversion {


public static void conversion(String divisa1, String divisa2, MonedaCon monedacon, Scanner scanner){

    double monto;
    double montoConvertido;
    Moneda moneda = monedacon.conversion(divisa1, divisa2);

    System.out.println("Ingrese la cantidad a convertir ("+divisa1+")");
    monto = Double.parseDouble(scanner.nextLine());
    montoConvertido = monto * moneda.conversion_rate();

    System.out.println("La Tasa conversión actual de " + divisa2 +" a "+ divisa1 +" es: "+ moneda.conversion_rate());
    System.out.println(monto + " " + divisa1 + " = " + montoConvertido);

}

public static void conversionDeMonedas(MonedaCon monedaCon, Scanner scanner){

    System.out.println("Ingrese el codigo de moneda a convertir");
    String divisa1 = scanner.nextLine().toUpperCase();

    System.out.println("Ingrese la moneda destino");
    String divisa2 = scanner.nextLine().toUpperCase();

    conversion(divisa1,divisa2,monedaCon,scanner);
}


}
