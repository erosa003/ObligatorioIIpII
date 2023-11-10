/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Sistema;
import java.awt.EventQueue;
import java.awt.Dimension;

public class MenuGeneral extends javax.swing.JFrame {

    Sistema sistema;

    public MenuGeneral() {
        this.sistema = sistema;
        initComponents();
    }

    MenuGeneral(Sistema sistema) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistroTematica = new javax.swing.JButton();
        btnAltaPosultante = new javax.swing.JButton();
        btnBajaPostulante = new javax.swing.JButton();
        btnRegistroEvaluador = new javax.swing.JButton();
        btnIngresoEntrevistas = new javax.swing.JButton();
        btnRegistroPuestos = new javax.swing.JButton();
        btnConsultaPuesto = new javax.swing.JButton();
        btnHistoriaPostulante = new javax.swing.JButton();
        btnConsultaTematica = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(338, 251));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(338, 251));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistroTematica.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistroTematica.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistroTematica.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistroTematica.setText("Registro Tematica");
        btnRegistroTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroTematicaMouseClicked(evt);
            }
        });
        btnRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTematicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroTematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        btnAltaPosultante.setBackground(new java.awt.Color(204, 204, 204));
        btnAltaPosultante.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAltaPosultante.setForeground(new java.awt.Color(51, 51, 51));
        btnAltaPosultante.setText("Alta Postulante");
        btnAltaPosultante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPosultanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltaPosultante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        btnBajaPostulante.setBackground(new java.awt.Color(204, 204, 204));
        btnBajaPostulante.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBajaPostulante.setForeground(new java.awt.Color(51, 51, 51));
        btnBajaPostulante.setText("Baja Postulante");
        btnBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaPostulanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBajaPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));

        btnRegistroEvaluador.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistroEvaluador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistroEvaluador.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistroEvaluador.setText("Registro Evaluador");
        btnRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEvaluadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroEvaluador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 30));

        btnIngresoEntrevistas.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresoEntrevistas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnIngresoEntrevistas.setForeground(new java.awt.Color(51, 51, 51));
        btnIngresoEntrevistas.setText("Ingreso Entrevistas");
        btnIngresoEntrevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoEntrevistasActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresoEntrevistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 30));

        btnRegistroPuestos.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistroPuestos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistroPuestos.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistroPuestos.setText("Registro Puestos");
        btnRegistroPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPuestosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        btnConsultaPuesto.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultaPuesto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnConsultaPuesto.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultaPuesto.setText("Consulta Puesto");
        btnConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPuestoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, 30));

        btnHistoriaPostulante.setBackground(new java.awt.Color(204, 204, 204));
        btnHistoriaPostulante.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnHistoriaPostulante.setForeground(new java.awt.Color(51, 51, 51));
        btnHistoriaPostulante.setText("Historia Postulante");
        btnHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaPostulanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoriaPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, 30));

        btnConsultaTematica.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultaTematica.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnConsultaTematica.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultaTematica.setText("Consulta Tematica");
        btnConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaTematicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaTematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, 30));

        btnFin.setBackground(new java.awt.Color(204, 204, 204));
        btnFin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnFin.setForeground(new java.awt.Color(51, 51, 51));
        btnFin.setText("Fin");
        getContentPane().add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel1.setText("GESTIÓN DE PERSONAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 40, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTematicaActionPerformed
        RegistroTematica registroTematicaWindow = new RegistroTematica(this.sistema);
        registroTematicaWindow.setVisible(true);

    }//GEN-LAST:event_btnRegistroTematicaActionPerformed

    private void btnRegistroPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPuestosActionPerformed
        RegistroPuestos RegistroPuestosWindow = new RegistroPuestos();
        RegistroPuestosWindow.setVisible(true);
    }//GEN-LAST:event_btnRegistroPuestosActionPerformed

    private void btnRegistroTematicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroTematicaMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_btnRegistroTematicaMouseClicked

    private void btnAltaPosultanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaPosultanteActionPerformed
        AltaPostulante AltaPostulanteWindow = new AltaPostulante(this.sistema);
        AltaPostulanteWindow.setVisible(true);
    }//GEN-LAST:event_btnAltaPosultanteActionPerformed

    private void btnBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaPostulanteActionPerformed
        BajaPostulante BajaPostulanteWindow = new BajaPostulante();
        BajaPostulanteWindow.setVisible(true);
    }//GEN-LAST:event_btnBajaPostulanteActionPerformed

    private void btnRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEvaluadorActionPerformed
        RegistroEvaluador RegistroEvaluadorWindow = new RegistroEvaluador(this.sistema);
        RegistroEvaluadorWindow.setVisible(true);
    }//GEN-LAST:event_btnRegistroEvaluadorActionPerformed

    private void btnIngresoEntrevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoEntrevistasActionPerformed
        IngresoEntrevistas IngresoEntrevistaWindow = new IngresoEntrevistas(this.sistema);
        IngresoEntrevistaWindow.setVisible(true);
    }//GEN-LAST:event_btnIngresoEntrevistasActionPerformed

    private void btnConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPuestoActionPerformed
        ConsultaPuestos ConsultaPuestosWindow = new ConsultaPuestos();
        ConsultaPuestosWindow.setVisible(true);
    }//GEN-LAST:event_btnConsultaPuestoActionPerformed

    private void btnHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaPostulanteActionPerformed
        HistoriaPostulante HistoriaPostulanteWindow = new HistoriaPostulante();
        HistoriaPostulanteWindow.setVisible(true);
    }//GEN-LAST:event_btnHistoriaPostulanteActionPerformed

    private void btnConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaTematicaActionPerformed
        ConsultaTematica ConsultaTematicaWindow = new ConsultaTematica(this.sistema);
        ConsultaTematicaWindow.setVisible(true);
    }//GEN-LAST:event_btnConsultaTematicaActionPerformed

    public static void main(String args[]) {

        MenuGeneral ventana = new MenuGeneral();
        ventana.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaPosultante;
    private javax.swing.JButton btnBajaPostulante;
    private javax.swing.JButton btnConsultaPuesto;
    private javax.swing.JButton btnConsultaTematica;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnHistoriaPostulante;
    private javax.swing.JButton btnIngresoEntrevistas;
    private javax.swing.JButton btnRegistroEvaluador;
    private javax.swing.JButton btnRegistroPuestos;
    private javax.swing.JButton btnRegistroTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
