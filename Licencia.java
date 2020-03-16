import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener {

  private JLabel lblTitle, lblLogo;
  private JCheckBox checkAcepted;
  private JButton btnDesagree, btnContinue;
  private JScrollPane scrollTextArea;
  private JTextArea textArea;
  String nameUser = "";

  public Licencia(){
  /*CONSTRUCTOR*/
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("assets/img/icon.png")).getImage());

    /*Recuerando variable del formulario Bienvenida*/
    Bienvenida formBienvenida = new Bienvenida();
    nameUser = formBienvenida.nameUser;

    /*Título de terminos y condiciones*/
    lblTitle = new JLabel("TÉRMINOS Y CONDICIONES");
    lblTitle.setBounds(215,5,200,30);
    lblTitle.setFont(new Font("Andale Mono", 1, 14));
    lblTitle.setForeground(new Color(0,0,0));
    add(lblTitle);

    /*TextArea para los terminos y condiciones*/
    textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setFont(new Font("Andale Mono",0,9));
    textArea.setText(
      "\n\n          TÉRMINOS Y CONDICIONES" +
      "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
      "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
      "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
      "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
      "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
      "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
      "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
      "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
      "\n          https://www.youtube.com/ernestoperezm");
    scrollTextArea = new JScrollPane(textArea);
    scrollTextArea.setBounds(10,40,575,200);
    add(scrollTextArea);

    /*Check de aceptar los terminos*/
    checkAcepted = new JCheckBox("Yo "+nameUser+", Acepto los terminos");
    checkAcepted.setBounds(10,250,300,30);
    checkAcepted.addChangeListener(this);
    add(checkAcepted);

    /*Botón Continuar*/
    btnContinue = new JButton("Continuar");
    btnContinue.setBounds(10,290,100,30);
    btnContinue.addActionListener(this);
    btnContinue.setEnabled(false);
    add(btnContinue);

    /*Botón de rechazar los terminos*/
    btnDesagree = new JButton("No Acepto");
    btnDesagree.setBounds(120,290,100,30);
    btnDesagree.addActionListener(this);
    btnDesagree.setEnabled(true);
    add(btnDesagree);

    /*Logo en el formulario*/
    ImageIcon imgLogo = new ImageIcon("assets/img/coca-cola.png");
    lblLogo = new JLabel(imgLogo);
    lblLogo.setBounds(315,135,300,300);
    add(lblLogo);
  }

  public void stateChanged(ChangeEvent e){
    if (checkAcepted.isSelected()) {
      btnContinue.setEnabled(true);
      btnDesagree.setEnabled(false);
    }else{
      btnContinue.setEnabled(false);
      btnDesagree.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == btnContinue) {
      Principal formPrincipal = new Principal();
      formPrincipal.setBounds(0,0,640,535);
      formPrincipal.setVisible(true);
      formPrincipal.setResizable(false);
      formPrincipal.setLocationRelativeTo(null);
      this.setVisible(false);
    }else if (e.getSource() == btnDesagree) {
      Bienvenida formBienvenida = new Bienvenida();
      formBienvenida.setBounds(0,0,350,450);
      formBienvenida.setVisible(true);
      formBienvenida.setResizable(false);
      formBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String[] args) {
    Licencia formLicencia = new Licencia();
    formLicencia.setBounds(0,0,600,360);
    formLicencia.setVisible(true);
    formLicencia.setResizable(false);
    formLicencia.setLocationRelativeTo(null);
  }
}