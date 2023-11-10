/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import Interfaz.VentanaSerializacion;
import java.awt.EventQueue;

public class Principal {
    
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
