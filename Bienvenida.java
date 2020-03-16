import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
  private JTextField txtName;
  private JLabel lblLogo, lblTitle, lblName, lblCopyRight;
  private JButton btnLogin;
  public static String nameUser = "";

  public Bienvenida(){
  /* CONSTRUCTOR */
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    /*Título de la ventana*/
    setTitle("Bienvenido");
    /*Color de fondo de la ventana*/
    getContentPane().setBackground(new Color(255,0,0));
    /*Icono en la ventana*/
    setIconImage(new ImageIcon(getClass().getResource("assets/img/icon.png")).getImage());
    
    /*Logo*/
    ImageIcon imgLogo = new ImageIcon("assets/img/logo-coca.png");
    lblLogo = new JLabel(imgLogo);
    lblLogo.setBounds(25,15,300,150);
    add(lblLogo);

    /*Etiqueta del título*/
    lblTitle = new JLabel("Sistema de control vacacional");
    lblTitle.setBounds(45,135,300,30);
    lblTitle.setFont(new Font("Andale Mono",3,18));
    lblTitle.setForeground(new Color(255,255,255));
    add(lblTitle);

    /*Etiqueta del nombre a ingresar*/
    lblName = new JLabel("Ingrese un nombre");
    lblName.setBounds(45,212,200,30);
    lblName.setFont(new Font("Andale Mono",1,12));
    lblName.setForeground(new Color(255,255,255));
    add(lblName);

    /*Etiqueta del CopyRight*/
    lblCopyRight = new JLabel("© 2019 The Coca-Cola Company");
    lblCopyRight.setBounds(85,375,300,30);
    lblCopyRight.setFont(new Font("Andale Mono",1,12));
    lblCopyRight.setForeground(new Color(255,255,255));
    add(lblCopyRight);

    /*Campo de texto para el nombre*/
    txtName = new JTextField();
    txtName.setBounds(45,240,255,25);
    txtName.setBackground(new Color(224,224,224));
    txtName.setFont(new Font("Andale Mono",1,14));
    txtName.setForeground(new Color(255,0,0));
    add(txtName);

    /*Botón para login*/
    btnLogin = new JButton("Login");
    btnLogin.setBounds(125,280,100,30);
    btnLogin.setBackground(new Color(255,255,255));
    btnLogin.setFont(new Font("Andale Mono",1,14));
    btnLogin.setForeground(new Color(255,0,0));
    btnLogin.addActionListener(this);
    add(btnLogin);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == btnLogin) {
      nameUser = txtName.getText().trim();
      if (!nameUser.equals("")) {
        Licencia formLicencia = new Licencia();
        formLicencia.setBounds(0,0,600,360);
        formLicencia.setVisible(true);
        formLicencia.setResizable(false);
        formLicencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }else{
        JOptionPane.showMessageDialog(null,"Debes ingresar un nombre");
      }
    }
  }

  public static void main(String[] args) {
    Bienvenida formBienvenida = new Bienvenida();
    formBienvenida.setBounds(0,0,350,450);
    formBienvenida.setVisible(true);
    formBienvenida.setResizable(false);
    formBienvenida.setLocationRelativeTo(null);
  }
}