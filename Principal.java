import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener {
  private JMenuBar mb;
  private JMenu mOptions, mCompute, mAbout, mBackground;
  private JMenuItem iCompute, iRed, iBlack, iPurple, iCreator, iEnd, iNew;
  private JLabel lblLogo, lblWelcome, lbTitle, lblName, lblLFather, lblLMother, lblDepartment, lblAntiquity, lblResult, lblFooter;
  private JTextField txtName, txtLFather, txtLMother;
  private JComboBox cDepartment, cAntiquity;
  private JScrollPane scrollTextArea;
  private JTextArea textArea;

  public Principal(){
    /*CONSTRUCTOR*/
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("assets/img/icon.png")).getImage());
    String nameUser = "";

    /*Recuperando variables del formulario Bienvenida*/
    Bienvenida formBienvenida = new Bienvenida();
    nameUser = formBienvenida.nameUser;

    /*Barra de menú*/
    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    /*Menú Options en la barra de menú*/
    mOptions = new JMenu("Options");
    mOptions.setBackground(new Color(255,0,0));
    mOptions.setFont(new Font("Andale Mono",1,14));
    mOptions.setForeground(new Color(255,255,255));
    mb.add(mOptions);

    /*Menú Compute en la barra de menú*/
    mCompute = new JMenu("Compute");
    mCompute.setBackground(new Color(255,0,0));
    mCompute.setFont(new Font("Andale Mono",1,14));
    mCompute.setForeground(new Color(255,255,255));
    mb.add(mCompute);

    /*Menú About en la barra de menú*/
    mAbout = new JMenu("About");
    mAbout.setBackground(new Color(255,0,0));
    mAbout.setFont(new Font("Andale Mono",1,14));
    mAbout.setForeground(new Color(255,255,255));
    mb.add(mAbout);

    mBackground = new JMenu("Color de fondo");
    mBackground.setFont(new Font("Andale Mono", 1, 14));
    mBackground.setForeground(new Color(255, 0, 0));
    mOptions.add(mBackground);

    iCompute = new JMenuItem("Vacaciones");
    iCompute.setFont(new Font("Andale Mono", 1, 14));
    iCompute.setForeground(new Color(255, 0, 0));
    mCompute.add(iCompute);
    iCompute.addActionListener(this);

    iRed = new JMenuItem("Red");
    iRed.setFont(new Font("Andale Mono", 1, 14));
    iRed.setForeground(new Color(255, 0, 0));
    mBackground.add(iRed);
    iRed.addActionListener(this);

    iBlack = new JMenuItem("Black");
    iBlack.setFont(new Font("Andale Mono", 1, 14));
    iBlack.setForeground(new Color(255, 0, 0));
    mBackground.add(iBlack);
    iBlack.addActionListener(this);

    iPurple = new JMenuItem("Purple");
    iPurple.setFont(new Font("Andale Mono", 1, 14));
    iPurple.setForeground(new Color(255, 0, 0));
    mBackground.add(iPurple);
    iPurple.addActionListener(this);

    iNew = new JMenuItem("Nuevo");
    iNew.setFont(new Font("Andale Mono", 1, 14));
    iNew.setForeground(new Color(255, 0, 0));
    mOptions.add(iNew);
    iNew.addActionListener(this);

    iCreator = new JMenuItem("El creador");
    iCreator.setFont(new Font("Andale Mono", 1, 14));
    iCreator.setForeground(new Color(255, 0, 0));
    mAbout.add(iCreator);
    iCreator.addActionListener(this);

    iEnd = new JMenuItem("Salir");
    iEnd.setFont(new Font("Andale Mono", 1, 14));
    iEnd.setForeground(new Color(255, 0, 0));
    mOptions.add(iEnd);
    iEnd.addActionListener(this);

    ImageIcon imagen = new ImageIcon("assets/img/logo-coca.png");
    lblLogo = new JLabel(imagen);  
    lblLogo.setBounds(5,5,250,100);
    add(lblLogo);

    lblWelcome = new JLabel("Bienvenido "+nameUser);  
    lblWelcome.setBounds(280,30,300,50);
    lblWelcome.setFont(new Font("Andale Mono", 1, 25));
    lblWelcome.setForeground(new Color(255, 255, 255));
    add(lblWelcome);

    lbTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    lbTitle.setBounds(45,140,900,25);
    lbTitle.setFont(new Font("Andale Mono", 0, 24));
    lbTitle.setForeground(new Color(255, 255, 255));
    add(lbTitle);

    lblName = new JLabel("Nombre:");
    lblName.setBounds(25,188,180,25);
    lblName.setFont(new Font("Andale Mono", 1, 12));
    lblName.setForeground(new Color(255, 255, 255));
    add(lblName);

    txtName = new JTextField();
    txtName.setBounds(25,213,150,25);
    txtName.setBackground(new java.awt.Color(224, 224, 224));
    txtName.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtName.setForeground(new java.awt.Color(255, 0, 0));
    add(txtName);

    lblLFather = new JLabel("Apellido Paterno:");
    lblLFather.setBounds(25,248,180,25);
    lblLFather.setFont(new Font("Andale Mono", 1, 12));
    lblLFather.setForeground(new Color(255, 255, 255));
    add(lblLFather);

    txtLFather = new JTextField();
    txtLFather.setBounds(25,273,150,25);
    txtLFather.setBackground(new java.awt.Color(224, 224, 224));
    txtLFather.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtLFather.setForeground(new java.awt.Color(255, 0, 0));
    add(txtLFather);

    lblLMother = new JLabel("Apellido Materno:");
    lblLMother.setBounds(25,308,180,25);
    lblLMother.setFont(new Font("Andale Mono", 1, 12));
    lblLMother.setForeground(new Color(255, 255, 255));
    add(lblLMother);

    txtLMother = new JTextField();
    txtLMother.setBounds(25,334,150,25);
    txtLMother.setBackground(new java.awt.Color(224, 224, 224));
    txtLMother.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtLMother.setForeground(new java.awt.Color(255, 0, 0));
    add(txtLMother);

    lblDepartment = new JLabel("Selecciona el Departamento:");
    lblDepartment.setBounds(220,188,180,25);
    lblDepartment.setFont(new Font("Andale Mono", 1, 12));
    lblDepartment.setForeground(new Color(255, 255, 255));
    add(lblDepartment);

    cDepartment = new JComboBox();
    cDepartment.setBounds(220,213,220,25);
    cDepartment.setBackground(new java.awt.Color(224, 224, 224));
    cDepartment.setFont(new java.awt.Font("Andale Mono", 1, 14));
    cDepartment.setForeground(new java.awt.Color(255, 0, 0));
    add(cDepartment);
    cDepartment.addItem("");
    cDepartment.addItem("Atención al Cliente");
    cDepartment.addItem("Departamento de Logística");
    cDepartment.addItem("Departamento de Gerencia");

    lblAntiquity = new JLabel("Selecciona la Antigüedad:");
    lblAntiquity.setBounds(220,248,180,25);
    lblAntiquity.setFont(new Font("Andale Mono", 1, 12));
    lblAntiquity.setForeground(new Color(255, 255, 255));
    add(lblAntiquity);

    cAntiquity = new JComboBox();
    cAntiquity.setBounds(220,273,220,25);
    cAntiquity.setBackground(new java.awt.Color(224, 224, 224));
    cAntiquity.setFont(new java.awt.Font("Andale Mono", 1, 14));
    cAntiquity.setForeground(new java.awt.Color(255, 0, 0));
    add(cAntiquity);
    cAntiquity.addItem("");
    cAntiquity.addItem("1 año de servicio");
    cAntiquity.addItem("2 a 6 años de servicio");
    cAntiquity.addItem("7 años o más de servicio");

    lblResult = new JLabel("Resultado del Cálculo:");
    lblResult.setBounds(220,307,180,25);
    lblResult.setFont(new Font("Andale Mono", 1, 12));
    lblResult.setForeground(new Color(255, 255, 255));
    add(lblResult);

    textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setBackground(new Color(224, 224, 224));
    textArea.setFont(new Font("Andale Mono", 1, 11));
    textArea.setForeground(new Color(255, 0, 0));
    textArea.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
    scrollTextArea = new JScrollPane(textArea);
    scrollTextArea.setBounds(220,333,385,90);
    add(scrollTextArea); 

    lblFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    lblFooter.setBounds(135,445,500,30);
    lblFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
    lblFooter.setForeground(new java.awt.Color(255, 255, 255));
    add(lblFooter);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == iCompute) {
      String firstName = txtName.getText().trim();
      String lastNameF = txtLFather.getText().trim();
      String lastNameM = txtLMother.getText().trim();
      String department = cDepartment.getSelectedItem().toString().trim();
      String antiquity = cAntiquity.getSelectedItem().toString().trim();

      if (firstName.equals("")) {
        JOptionPane.showMessageDialog(null,"Debes ingresar el primer nombre");
      }else if (lastNameF.equals("")) {
        JOptionPane.showMessageDialog(null,"Debes ingresar el primer apellido");
      }else if (lastNameM.equals("")) {
        JOptionPane.showMessageDialog(null,"Debes ingresar el segundo apellido");
      }else if (department.equals("")) {
        JOptionPane.showMessageDialog(null,"Seleccione un departamento");
      }else if (antiquity.equals("")) {
        JOptionPane.showMessageDialog(null,"Seleccione la antiguedad del trabajador");
      }else{
        if (department.equals("Atención al Cliente")) {
          if (antiquity.equals("1 año de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 6 días de vacaciones.");
          }
          if (antiquity.equals("2 a 6 años de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 14 días de vacaciones.");
          }
          if (antiquity.equals("7 años o más de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 20 días de vacaciones.");
          }
        }

        if (department.equals("Departamento de Logística")) {
          if (antiquity.equals("1 año de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 7 días de vacaciones.");
          }
          if (antiquity.equals("2 a 6 años de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 15 días de vacaciones.");
          }
          if (antiquity.equals("7 años o más de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 22 días de vacaciones.");
          }
        }

        if (department.equals("Departamento de Gerencia")) {
          if (antiquity.equals("1 año de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 10 días de vacaciones.");
          }
          if (antiquity.equals("2 a 6 años de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 20 días de vacaciones.");
          }
          if (antiquity.equals("7 años o más de servicio")){
            textArea.setText(
              "\n   El trabajador "+firstName+" "+lastNameF+" "+lastNameM+
              "\n   quien labora en "+department+" con "+antiquity+
              "\n   recibe 30 días de vacaciones.");
          }
        }
      }
    }
    if (e.getSource() == iRed){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if (e.getSource() == iBlack){
      getContentPane().setBackground(new Color(0,0,0));
    }
    if (e.getSource() == iPurple){
      getContentPane().setBackground(new Color(51,0,51));
    }
    if (e.getSource() == iNew){  
      txtName.setText("");
      txtLFather.setText("");
      txtLMother.setText("");
      cDepartment.setSelectedIndex(0);
      cAntiquity.setSelectedIndex(0);
      textArea.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
    }
    if (e.getSource() == iEnd){
      Bienvenida formBienvenida = new Bienvenida();
      formBienvenida.setBounds(0,0,350,450);
      formBienvenida.setVisible(true);
      formBienvenida.setResizable(false);
      formBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if (e.getSource() == iCreator){
      JOptionPane.showMessageDialog(null,"Desarrollado por Edicson Abel González Chirinos\n https://youtube.com/edicsonabel");
    }
  }

  public static void main(String args[]) {
    Principal formPrincipal = new Principal();
    formPrincipal.setBounds(0,0,640,535);
    formPrincipal.setVisible(true);
    formPrincipal.setResizable(false);
    formPrincipal.setLocationRelativeTo(null);
  } 
}