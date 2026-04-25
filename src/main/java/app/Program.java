
package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.Controlador;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();

        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
