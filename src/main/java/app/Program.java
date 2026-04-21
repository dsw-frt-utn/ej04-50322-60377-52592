package app;
import views.ListarVehiculosView;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.Menu;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();

        new Menu().setVisible(true);
    }
}
