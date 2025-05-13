import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonedaCon consulta = new MonedaCon();

        int option;
        int salida;


        do {
            System.out.println("-------------------------------");
            System.out.println("Ingresa la opción que deseas");
            System.out.println("1. Lista de conversión");
            System.out.println("2. Convertir");
            System.out.println("9. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("""
                            Lista de conversión actual:
                            
                              "USD":Usa,
                              "AED": United Arab Emirates,
                              "AFN":Afghanistan,
                              "ALL":Albania,
                              "AMD": Armenia,
                              "ANG": Curacao y Saint Maarten,
                              "AOA":Angola,
                              "ARS":Argentina,
                              "AUD":Australia,
                              "AWG":Aruba,
                              "AZN":Azerbaijan,
                              "BAM":Bosnia y Herzegovina,
                              "BBD":Barbados,
                              "BDT":Bangladesh,
                              "BGN":Bulgaria,
                              "BHD": Baréin,
                              "BIF":Burundi,
                              "BMD":Bermudas,
                              "BND":Brunéi,
                              "BOB":Bolivia,
                              "BRL":Brazil,
                              "BSD":Bahamas,
                              "BTN":Bután,
                              "BWP":Botswana,
                              "BYN":Bielorrusia,
                              "BZD":Belize,
                              "CAD":Canadá,
                              "CDF":República Democrática del Congo,
                              "CHF":Suiza y Liechtenstein,
                              "CLP":Chile,
                              "CNY": China,
                              "COP": Colombia,
                              "CRC":Costa Rica,
                              "CUP":Cuba,
                              "CVE":Cabo Verde,
                              "CZK":República Checa,
                              "DJF":Yibuti,
                              "DKK":Dinamarca, Groenlandia e Islas Feroe,
                              "DOP": República Dominicana,
                              "DZD":Argelia,
                              "EGP":Egipto,
                              "ERN": Eritrea,
                              "ETB":Etiopía,
                              "EUR":Zona Euro (muchos países de Europa),
                              "FJD":Fiyi,
                              "FKP":Islas Malvinas,
                              "FOK":Islas Feroe (parte del Reino de Dinamarca),
                              "GBP":Reino Unido,
                              "GEL":Georgia,
                              "GGP":Guernsey (Dependencia de la Corona Británica),
                              "GHS": Ghana,
                              "GIP": Gibraltar (Territorio Británico de Ultramar),
                              "GMD":Gambia,
                              "GNF": Guinea,
                              "GTQ":Guatemala,
                              "GYD":Guyana,
                              "HKD":Hong Kong,
                              "HNL":Honduras,
                              "HRK":Croacia (reemplazado por el EUR en 2023),
                              "HTG":Haití,
                              "HUF":Hungría,
                              "IDR":Indonesia,
                              "ILS":Israel,
                              "IMP":Isla de Man,
                              "INR":India,
                              "IQD":Irak,
                              "IRR":Irán,
                              "ISK":Islandia,
                              "JEP":Jersey,
                              "JMD":Jamaica,
                              "JOD":Jordania,
                              "JPY":Japón,
                              "KES":Kenia,
                              "KGS":Kirguistán,
                              "KHR":Camboya,
                              "KID":Kiribati,
                              "KMF":Comoras,
                              "KRW":Corea del Sur,
                              "KWD":Kuwait,
                              "KYD":Islas Caimán,
                              "KZT": Kazajistán,
                              "LAK":Laos,
                              "LBP": Líbano,
                              "LKR":Sri Lanka,
                              "LRD":Liberia,
                              "LSL":Lesoto,
                              "LYD":Libia,
                              "MAD":Marruecos y Sahara Occidental,
                              "MDL":Moldavia,
                              "MGA":Madagascar,
                              "MKD":Macedonia del Norte,
                              "MMK":Birmania (Myanmar),
                              "MNT":Mongolia,
                              "MOP":Macao,
                              "MRU":Mauritania,
                              "MUR":Mauricio,
                              "MVR":Maldivas,
                              "MWK":Malaui,
                              "MXN":México,
                              "MYR":Malasia,
                              "MZN": Mozambique,
                              "NAD":Namibia,
                              "NGN":Nigeria,
                              "NIO":Nicaragua,
                              "NOK":Noruega,
                              "NPR":Nepal,
                              "NZD":Nueva Zelanda, Islas Cook, Niue, Tokelau y las Islas Pitcairn,
                              "OMR":Omán,
                              "PAB":Panamá,
                              "PEN":Perú,
                              "PGK":Papúa Nueva Guinea,
                              "PHP":Filipinas,
                              "PKR":Pakistán,
                              "PLN":Polonia,
                              "PYG":Paraguay,
                              "QAR":Catar,
                              "RON":Rumania,
                              "RSD": Serbia,
                              "RUB": Rusia,
                              "RWF":Ruanda,
                              "SAR": Arabia Saudita,
                              "SBD":Islas Salomón,
                              "SCR":Seychelles,
                              "SDG":Sudán,
                              "SEK":Suecia,
                              "SGD":Singapur,
                              "SHP":Santa Elena, Ascensión y Tristán da Cunha,
                              "SLE":Sierra Leona,
                              "SLL":Sierra Leona (código antiguo, SLE es el nuevo),
                              "SOS": Somalia,
                              "SRD":Surinam,
                              "SSP":Sudán del Sur,
                              "STN":Santo Tomé y Príncipe,
                              "SYP":Siria,
                              "SZL":Suazilandia (Eswatini),
                              "THB":Tailandia,
                              "TJS":Tayikistán,
                              "TMT":Turkmenistán,
                              "TND":Túnez,
                              "TOP":Tonga,
                              "TRY":Turquía,
                              "TTD":Trinidad y Tobago,
                              "TVD":Tuvalu,
                              "TWD":Taiwán,
                              "TZS":Tanzania,
                              "UAH":Ucrania,
                              "UGX":Uganda,
                              "UYU": Uruguay,
                              "UZS":Uzbekistán,
                              "VES":Venezuela,
                              "VND":Vietnam,
                              "VUV":Vanuatu,
                              "WST": Samoa,
                              "XAF":Comunidad Económica y Monetaria de África Central (CEMAC),
                              "XCD":Organización de Estados del Caribe Oriental (OECS),
                              "XCG":Oro (onza troy) - No es un país,
                              "XDR":Derechos Especiales de Giro (Fondo Monetario Internacional) - No es un país,
                              "XOF":Unión Económica y Monetaria de África Occidental (UEMOA),
                              "XPF":Colectividades francesas del Pacífico (Nueva Caledonia, Polinesia Francesa, Wallis y Futuna),
                              "YER":Yemen,
                              "ZAR":Sudáfrica,
                              "ZMW":Zambia,
                              "ZWL":Zimbabwe
                            """);

                    break;
                case 2:
                    Conversion.conversionDeMonedas(consulta,scanner);
                    break;
                case 9:
                    System.out.println("Gracias por usar el conversor de monedas");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 9);
        scanner.close();
    }

}
