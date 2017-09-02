package carlosvarela_lab6;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class principal extends javax.swing.JFrame {

    static Persona usuarioActivo;
    static int posicion;
    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_ingresar_usuario = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dc_fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbx_nacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tf_ingresar_nombre = new javax.swing.JTextField();
        tf_ingresar_correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pf_confirmar_contraseña = new javax.swing.JPasswordField();
        pf_ingresar_contraseña = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        tf_ingresar_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bt_ingresar_usuario = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jd_buzon = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        bt_actualizarMensajes = new javax.swing.JButton();
        cbx_tipo_mensajes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_mensajes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        pop_opciones = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Marcar = new javax.swing.JMenuItem();
        Desmarcar = new javax.swing.JMenuItem();
        jd_enviarMensaje = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_destinatario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        bt_enviarmensajeUsuario = new javax.swing.JButton();
        jd_enviarMensajeNoUnitec = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tf_ingresaCorreoNoUnitec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pf_contraseñaNoUnitec = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        tf_destinatarioNoUnitec = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_descripcionNoUniec = new javax.swing.JTextArea();
        bt_enviarMensajeNoUnitec = new javax.swing.JButton();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pf_ingresarContraseñaLogIn = new javax.swing.JPasswordField();
        tf_ingresarNombreLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jd_ingresar_usuario.setTitle("Ingresar usuario");

        jPanel3.setBackground(new java.awt.Color(185, 44, 44));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar Nombre: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar correro: ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nacionalidad:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de nacimiento:");

        cbx_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honduras", "Nicaragua", "Guatemala", "Panama", "Alahu Akbar", "Brazil", " " }));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña: ");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Confirme de nuevo la contraseña:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N. Telefonico:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Ingresar Usuario");

        bt_ingresar_usuario.setText("Ingresar");
        bt_ingresar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ingresar_usuarioMouseClicked(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Apellido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ingresar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ingresar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dc_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_ingresar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tf_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_confirmar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_ingresar_usuario)
                .addGap(297, 297, 297))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tf_ingresar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_ingresar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dc_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pf_ingresar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pf_confirmar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_ingresar_usuario)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ingresar_usuarioLayout = new javax.swing.GroupLayout(jd_ingresar_usuario.getContentPane());
        jd_ingresar_usuario.getContentPane().setLayout(jd_ingresar_usuarioLayout);
        jd_ingresar_usuarioLayout.setHorizontalGroup(
            jd_ingresar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ingresar_usuarioLayout.setVerticalGroup(
            jd_ingresar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_buzon.setTitle("Buzon de entrada");

        jPanel4.setBackground(new java.awt.Color(47, 89, 94));

        bt_actualizarMensajes.setText("Actualizar");
        bt_actualizarMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_actualizarMensajesMouseClicked(evt);
            }
        });

        cbx_tipo_mensajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leidos", "No leidos", "Importantes" }));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Elija el tipo de mensaje: ");

        jt_mensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jt_mensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_mensajesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jt_mensajes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(25, 25, 25)
                .addComponent(cbx_tipo_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(bt_actualizarMensajes)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tipo_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_actualizarMensajes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Mensajeria ");

        jMenuItem1.setText("Enviar Mensaje");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Enviados");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inicio");

        jMenuItem8.setText("LogOut");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jd_buzon.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_buzonLayout = new javax.swing.GroupLayout(jd_buzon.getContentPane());
        jd_buzon.getContentPane().setLayout(jd_buzonLayout);
        jd_buzonLayout.setHorizontalGroup(
            jd_buzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_buzonLayout.setVerticalGroup(
            jd_buzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Eliminar.setText("Eliminar mensaje");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        pop_opciones.add(Eliminar);

        Marcar.setText("Marcar como importante");
        Marcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcarActionPerformed(evt);
            }
        });
        pop_opciones.add(Marcar);

        Desmarcar.setText("Desmarcar como importante");
        pop_opciones.add(Desmarcar);

        jPanel5.setBackground(new java.awt.Color(177, 82, 19));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Destinatario: ");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_descripcion);

        bt_enviarmensajeUsuario.setText("Enviar");
        bt_enviarmensajeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarmensajeUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tf_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(bt_enviarmensajeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bt_enviarmensajeUsuario)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_enviarMensajeLayout = new javax.swing.GroupLayout(jd_enviarMensaje.getContentPane());
        jd_enviarMensaje.getContentPane().setLayout(jd_enviarMensajeLayout);
        jd_enviarMensajeLayout.setHorizontalGroup(
            jd_enviarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_enviarMensajeLayout.setVerticalGroup(
            jd_enviarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(144, 80, 48));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese correo:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ingrese contraseña:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Destinatario: ");

        ta_descripcionNoUniec.setColumns(20);
        ta_descripcionNoUniec.setRows(5);
        jScrollPane3.setViewportView(ta_descripcionNoUniec);

        bt_enviarMensajeNoUnitec.setText("Enviar");
        bt_enviarMensajeNoUnitec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarMensajeNoUnitecMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_destinatarioNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_contraseñaNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ingresaCorreoNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(bt_enviarMensajeNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ingresaCorreoNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pf_contraseñaNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(tf_destinatarioNoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(bt_enviarMensajeNoUnitec)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_enviarMensajeNoUnitecLayout = new javax.swing.GroupLayout(jd_enviarMensajeNoUnitec.getContentPane());
        jd_enviarMensajeNoUnitec.getContentPane().setLayout(jd_enviarMensajeNoUnitecLayout);
        jd_enviarMensajeNoUnitecLayout.setHorizontalGroup(
            jd_enviarMensajeNoUnitecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_enviarMensajeNoUnitecLayout.setVerticalGroup(
            jd_enviarMensajeNoUnitecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 57, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 57, 74));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar contraseña:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Nombre:");

        bt_login.setText("Ingresar");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrarse");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enviar Mensaje");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(tf_ingresarNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(pf_ingresarContraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_login))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(tf_ingresarNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(pf_ingresarContraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bt_login)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Label que muestra pantalla de ingresar usuario
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        tf_ingresar_nombre.setText("");
        tf_ingresar_correo.setText("");
        tf_ingresar_telefono.setText("");
        pf_confirmar_contraseña.setText("");
        pf_ingresar_contraseña.setText("");
        jd_ingresar_usuario.pack();
        jd_ingresar_usuario.setLocationRelativeTo(null);
        jd_ingresar_usuario.setModal(true);
        jd_ingresar_usuario.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    
    //Ingresa nuevo usuario
    private void bt_ingresar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ingresar_usuarioMouseClicked
        AdministrarPersonas dm = new AdministrarPersonas();
        String nombre, apellido="", contraseña="", contraseña_confirmar, nacionalidad="", correo;
        Date fecha_nacimiento;
        int numero;
        try {
            if (tf_ingresar_nombre.getText().equals("")||tf_ingresar_correo.getText().equals("")
                    ||pf_confirmar_contraseña.getText().equals("")||pf_ingresar_contraseña.getText().equals("")
                    ||dc_fecha_nacimiento.getDate()==null) {
                JOptionPane.showMessageDialog(null, "Llene los espacios");
            }else{
                try {
                    nombre = tf_ingresar_nombre.getText();
                    apellido = tf_apellido.getText();
                    fecha_nacimiento = dc_fecha_nacimiento.getDate();
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Honduras")) {
                        nacionalidad = "Honduras";
                    }
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Nicaragua")) {
                        nacionalidad = "Nicaragua";
                    }
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Guatemala")) {
                        nacionalidad = "Guatemala";
                    }
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Panama")) {
                        nacionalidad = "Panama";
                    }
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Alahu Akbar")) {
                        nacionalidad = "Arabia";
                    }
                    if (cbx_nacionalidad.getSelectedItem().toString().equals("Brazil")) {
                        nacionalidad = "Brazil";
                    }
                    correo = tf_ingresar_correo.getText();
                    numero = Integer.parseInt(tf_ingresar_telefono.getText());
                    if (evaluarCorreo(correo)==false) {
                        JOptionPane.showMessageDialog(null, "Ingrese correo diferente");
                    }else{
                        if (pf_ingresar_contraseña.getText().equals(pf_confirmar_contraseña.getText())) {
                            contraseña = pf_ingresar_contraseña.getText();
                            personas.add(new Persona(nombre, apellido, correo, nacionalidad, contraseña, fecha_nacimiento, numero));
                            dm.crearCarpeta(nombre);
                            tf_ingresar_nombre.setText("");
                            tf_ingresar_correo.setText("");
                            tf_ingresar_telefono.setText("");
                            pf_confirmar_contraseña.setText("");
                            pf_ingresar_contraseña.setText("");
                            tf_apellido.setText("");
                            dc_fecha_nacimiento.setDate(null);
                            JOptionPane.showMessageDialog(null, "Usuario Registrado");
                        }else {
                            JOptionPane.showMessageDialog(null, "Confirme bien su contraseña");
                        }
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_ingresar_usuarioMouseClicked

    
    //LogIn 
    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        String correo, contraseña;
        correo = tf_ingresarNombreLogin.getText();
        contraseña  = pf_ingresarContraseñaLogIn.getText();
        usuarioActivo = LogIn(correo, contraseña);
        if (usuarioActivo!=null) {
            JOptionPane.showMessageDialog(this, "Bienvenido");
            this.setVisible(false);
            tf_ingresarNombreLogin.setText("");
            pf_ingresarContraseñaLogIn.setText("");
            jd_buzon.pack();
            jd_buzon.dispose();
            jd_buzon.setLocationRelativeTo(null);
            jd_buzon.setModal(true);
            jd_buzon.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Contraseña o correo incorrectos");
        }
    }//GEN-LAST:event_bt_loginMouseClicked

    
    //Actualizar Table con la lista de mensajes
    private void bt_actualizarMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_actualizarMensajesMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)jt_mensajes.getModel();
        if (cbx_tipo_mensajes.getSelectedItem().toString().equals("Leidos")) {
            if (usuarioActivo.getLeidos().size()>0) {
                for (int i = 0; i < usuarioActivo.getLeidos().size(); i++) {
                Object row[] = {usuarioActivo.getLeidos().get(i).getEmisor()+"\n"};
                modelo.addRow(row);
                }
            }
        }else if (cbx_tipo_mensajes.getSelectedItem().toString().equals("No leidos")) {
            if (usuarioActivo.getNoleidos().size()>0) {
                for (int i = 0; i < usuarioActivo.getNoleidos().size(); i++) {
                    Object row[] = {usuarioActivo.getNoleidos().get(i).getEmisor()+"\n"};
                    modelo.addRow(row);
                }
            }
        }else if (cbx_tipo_mensajes.getSelectedItem().toString().equals("Importantes")) {
            if (usuarioActivo.getImportantes().size()>0) {
                for (int i = 0; i < usuarioActivo.getImportantes().size(); i++) {
                    Object row[] = {usuarioActivo.getImportantes().get(i).getEmisor()+"\n"};
                    modelo.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_bt_actualizarMensajesMouseClicked

    
    //Poppup_menu eliminar
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)jt_mensajes.getModel() ;
        modelo.removeRow(posicion);
        jt_mensajes.setModel(modelo);
    }//GEN-LAST:event_EliminarActionPerformed

    
    //POPUP_Menu marcarImportante
    private void MarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)jt_mensajes.getModel() ;
        modelo.removeRow(posicion);
    }//GEN-LAST:event_MarcarActionPerformed

    
    //JDialog enviar Mensaje
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_enviarMensaje.pack();
        jd_enviarMensaje.setModal(true);
        jd_enviarMensaje.setLocationRelativeTo(null);
        jd_enviarMensaje.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    //Enviar Mensajes
    private void bt_enviarmensajeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarmensajeUsuarioMouseClicked
        String nombre, descripcion;
        AdministrarPersonas adm = new AdministrarPersonas();
        try {
            nombre = tf_destinatario.getText();
            descripcion = ta_descripcion.getText();
            for (Persona t : personas) {
                if (t.getNombre().equals(nombre)) {
                    //Añade el mensaje al arrayList de usuarios y al usuario que se envio
                    usuarioActivo.getEnviados().add(new Mensaje(descripcion, nombre));
                    t.getNoleidos().add(new Mensaje(descripcion, usuarioActivo.getNombre()));
                    //Escribe en los archivos de texto
                    adm.escribirEnviados(descripcion,nombre,usuarioActivo);
                    adm.escribirNoleidos(descripcion, usuarioActivo.getNombre(), t);
                    JOptionPane.showMessageDialog(null, "Mensaje enviado");
                    tf_destinatario.setText("");
                    ta_descripcion.setText("");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_enviarmensajeUsuarioMouseClicked

    
    //Label envia ventana de usuarios no unitec
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jd_enviarMensajeNoUnitec.pack();
        jd_enviarMensajeNoUnitec.setModal(true);
        jd_enviarMensajeNoUnitec.setLocationRelativeTo(null);
        jd_enviarMensajeNoUnitec.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    
    //Envia mensaje usuarios no de unitec
    private void bt_enviarMensajeNoUnitecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarMensajeNoUnitecMouseClicked
        String correo, contraseña, destinatario, descripcion;
        Persona usuario =null;
        correo = tf_destinatarioNoUnitec.getText();
        contraseña = pf_contraseñaNoUnitec.getText();
        destinatario = tf_destinatarioNoUnitec.getText();
        descripcion = ta_descripcionNoUniec.getText();
        //Evaluar correo no unitec
        for (Persona t : personas) {
            if (t.getCorreo().equals(correo)&&t.getCorreo().contains("@unitec.edu")==false) {
                usuario = t;
            }
        }
        if (usuario!=null) {
            for (Persona a : personas) {
                if (a.getCorreo().equals(destinatario)&&destinatario.contains("@unitec.edu")) {
                    usuario.getEnviados().add(new Mensaje(descripcion, a.getNombre()));
                    tf_destinatarioNoUnitec.setText("");
                    pf_contraseñaNoUnitec.setText("");
                    tf_destinatarioNoUnitec.setText("");
                    ta_descripcionNoUniec.setText("");
                    JOptionPane.showMessageDialog(null, "Se envio mensaje");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro usuario");
        }
    }//GEN-LAST:event_bt_enviarMensajeNoUnitecMouseClicked

    
    //Accion que muestra el popup menu
    private void jt_mensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_mensajesMouseClicked
        if (evt.isMetaDown()) {
            posicion = jt_mensajes.getSelectedRowCount();
            pop_opciones.show(jt_mensajes, evt.getY(), evt.getX());
        }
    }//GEN-LAST:event_jt_mensajesMouseClicked

    //LogOut
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        usuarioActivo = null;
        jd_buzon.setVisible(false);
        JOptionPane.showMessageDialog(jMenu1, "Hasta la vista baby ;v ");
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public Persona LogIn(String correo, String contraseña){
        for (Persona t : personas) {
            if (t.getCorreo().equals(correo)&&t.getCorreo().contains("@unitec.edu")) {
                return t;
            }
        }
        return null;
    }

    public boolean evaluarCorreo(String correo){
        for (Persona persona : personas) {
            if (persona.getCorreo().equals(correo)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Desmarcar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Marcar;
    private javax.swing.JButton bt_actualizarMensajes;
    private javax.swing.JButton bt_enviarMensajeNoUnitec;
    private javax.swing.JButton bt_enviarmensajeUsuario;
    private javax.swing.JButton bt_ingresar_usuario;
    private javax.swing.JButton bt_login;
    private javax.swing.JComboBox<String> cbx_nacionalidad;
    private javax.swing.JComboBox<String> cbx_tipo_mensajes;
    private com.toedter.calendar.JDateChooser dc_fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_buzon;
    private javax.swing.JDialog jd_enviarMensaje;
    private javax.swing.JDialog jd_enviarMensajeNoUnitec;
    private javax.swing.JDialog jd_ingresar_usuario;
    private javax.swing.JTable jt_mensajes;
    private javax.swing.JPasswordField pf_confirmar_contraseña;
    private javax.swing.JPasswordField pf_contraseñaNoUnitec;
    private javax.swing.JPasswordField pf_ingresarContraseñaLogIn;
    private javax.swing.JPasswordField pf_ingresar_contraseña;
    private javax.swing.JPopupMenu pop_opciones;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTextArea ta_descripcionNoUniec;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_destinatario;
    private javax.swing.JTextField tf_destinatarioNoUnitec;
    private javax.swing.JTextField tf_ingresaCorreoNoUnitec;
    private javax.swing.JTextField tf_ingresarNombreLogin;
    private javax.swing.JTextField tf_ingresar_correo;
    private javax.swing.JTextField tf_ingresar_nombre;
    private javax.swing.JTextField tf_ingresar_telefono;
    // End of variables declaration//GEN-END:variables
    ArrayList<Persona> personas = new ArrayList();
}
