package carlosvarela_lab6;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.*;
public class principal extends javax.swing.JFrame {

    static Persona usuarioActivo;
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
        jd_buzon = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_buzonentrada = new javax.swing.JList<>();
        bt_actualizarMensajes = new javax.swing.JButton();
        cbx_tipo_mensajes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        pop_opciones = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Marcar = new javax.swing.JMenuItem();
        Desmarcar = new javax.swing.JMenuItem();
        jd_enviarMensaje = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pf_ingresarContraseñaLogIn = new javax.swing.JPasswordField();
        tf_ingresarNombreLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
                            .addComponent(tf_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ingresar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ingresar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dc_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_ingresar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_confirmar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
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
                    .addComponent(tf_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jScrollPane1.setViewportView(jl_buzonentrada);

        bt_actualizarMensajes.setText("Actualizar");
        bt_actualizarMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_actualizarMensajesMouseClicked(evt);
            }
        });

        cbx_tipo_mensajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leidos", "No leidos", "Importantes" }));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Elija el tipo de mensaje: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(25, 25, 25)
                        .addComponent(cbx_tipo_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(bt_actualizarMensajes)
                            .addGap(288, 288, 288))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tipo_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bt_actualizarMensajes)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jMenu1.setText("Mensajeria ");

        jMenuItem1.setText("Enviar Mensaje");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

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
        pop_opciones.add(Eliminar);

        Marcar.setText("Marcar como importante");
        pop_opciones.add(Marcar);

        Desmarcar.setText("Desmarcar como importante");
        pop_opciones.add(Desmarcar);

        jPanel5.setBackground(new java.awt.Color(177, 82, 19));

        jLabel13.setText("Correo:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel13)
                .addContainerGap(553, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel13)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_enviarMensajeLayout = new javax.swing.GroupLayout(jd_enviarMensaje.getContentPane());
        jd_enviarMensaje.getContentPane().setLayout(jd_enviarMensajeLayout);
        jd_enviarMensajeLayout.setHorizontalGroup(
            jd_enviarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_enviarMensajeLayout.setVerticalGroup(
            jd_enviarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(tf_ingresarNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(pf_ingresarContraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_login))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                            personas.add(new Persona(nombre, apellido, correo, nacionalidad, contraseña, fecha_nacimiento, numero));
                            dm.crearCarpeta(nombre);
                            tf_ingresar_nombre.setText("");
                            tf_ingresar_correo.setText("");
                            tf_ingresar_telefono.setText("");
                            pf_confirmar_contraseña.setText("");
                            pf_ingresar_contraseña.setText("");
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

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        String nombre, contraseña;
        nombre = tf_ingresarNombreLogin.getText();
        contraseña  = pf_ingresarContraseñaLogIn.getText();
        usuarioActivo = LogIn(nombre, contraseña);
        if (usuarioActivo!=null) {
            JOptionPane.showMessageDialog(this, "Bienvenido");
        }else{
            JOptionPane.showMessageDialog(this, "Contraseña o nombre incorrectos");
        }
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_actualizarMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_actualizarMensajesMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_buzonentrada.getModel();
        if (cbx_tipo_mensajes.getSelectedItem().toString().equals("Leidos")) {
            for (int i = 0; i < usuarioActivo.getLeidos().size(); i++) {
                modelo.addElement(usuarioActivo.getLeidos().get(i).getEmisor()+"\n");
            }
        }else if (cbx_tipo_mensajes.getSelectedItem().toString().equals("No leidos")) {
            for (int i = 0; i < usuarioActivo.getNoleidos().size(); i++) {
                modelo.addElement(usuarioActivo.getNoleidos().get(i).getEmisor()+"\n");
            }
        }else if (cbx_tipo_mensajes.getSelectedItem().toString().equals("Importantes")) {
            for (int i = 0; i < usuarioActivo.getImportantes().size(); i++) {
                modelo.addElement(usuarioActivo.getImportantes().get(i).getEmisor()+"\n");
            }
        }
    }//GEN-LAST:event_bt_actualizarMensajesMouseClicked

    public Persona LogIn(String nombre, String contraseña){
        for (Persona t : personas) {
            if (t.getNombre().equals(nombre)&&t.getContraseña().equals(contraseña)) {
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_buzon;
    private javax.swing.JDialog jd_enviarMensaje;
    private javax.swing.JDialog jd_ingresar_usuario;
    private javax.swing.JList<String> jl_buzonentrada;
    private javax.swing.JPasswordField pf_confirmar_contraseña;
    private javax.swing.JPasswordField pf_ingresarContraseñaLogIn;
    private javax.swing.JPasswordField pf_ingresar_contraseña;
    private javax.swing.JPopupMenu pop_opciones;
    private javax.swing.JTextField tf_ingresarNombreLogin;
    private javax.swing.JTextField tf_ingresar_correo;
    private javax.swing.JTextField tf_ingresar_nombre;
    private javax.swing.JTextField tf_ingresar_telefono;
    // End of variables declaration//GEN-END:variables
    ArrayList<Persona> personas = new ArrayList();
}
