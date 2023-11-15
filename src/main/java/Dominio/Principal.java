//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;

import Interfaz.VentanaSerializacion;
import java.awt.EventQueue;

public class Principal implements java.io.Serializable {
    
      static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    VentanaSerializacion m = new VentanaSerializacion( sistema);
                    m.setLocationRelativeTo(null);
                    m.setVisible(true);   
                    //MenuGeneral menu = new MenuGeneral();
                    //menu.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
