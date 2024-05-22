import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws IOException, InterruptedException {

        int selecOpcionUsuario = 0;
        ConsultaValorMoneda consulta = new ConsultaValorMoneda();
        ArrayList<Conversiones>  listaDeConversiones = new ArrayList<>();

        System.out.println("**********************************************************************************\n");
        System.out.println("*** Bienvenido al conversor de moneda ***\n");

        while (selecOpcionUsuario !=3){
            Opciones opciones = new Opciones();
            opciones.menuInicio();
            selecOpcionUsuario = Opciones.opcionUsuario();



            switch (selecOpcionUsuario){
                case 1:
                    Opciones.divisasDisponibles("inicial");
                    String monedaBase = Opciones.leerOpcionMoneda();
                    Opciones.divisasDisponibles("final");
                    String monedaFinal = Opciones.leerOpcionMoneda();
                    double cantidadMoneda = Opciones.usuarioCantidadMoneda();
                    Moneda moneda = consulta.consultaMoneda(monedaBase);
                    double tasaDeConversion = moneda.getConversionRate(monedaFinal.toUpperCase());
                    double cantidadObtenida = Opciones.cantidadObtenida(monedaBase, cantidadMoneda, tasaDeConversion, monedaFinal);
                    Conversiones nuevaConversion = new Conversiones(monedaBase, monedaFinal, cantidadMoneda, cantidadObtenida);
                    listaDeConversiones.add(nuevaConversion);

                    break;

                case 2:
                    Opciones.imprimirConversiones(listaDeConversiones);
                    break;

                case 3:
                    System.out.println("Saliendo del programa");

                    break;

                default:
                    System.out.println("opcion no valida, por favor elija una opcion del menu");
            }
        }

    }
}
