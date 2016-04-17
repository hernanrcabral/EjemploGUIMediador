/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploguimediador;

/**
 *
 * @author Administrador
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MediadorEjemplo implements ActionListener, KeyListener {

    private GUIEjemplo ejemplo = new GUIEjemplo();

    public MediadorEjemplo(){
        ejemplo.setActionListeners(this);
        ejemplo.setKeyListener(this);
        ejemplo.show();
    }

    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.')){
            e.consume();

        }
        if (caracter == '.' && ejemplo.getjTextFieldPrimerNum().getText().contains(".")){
            e.consume();
        }
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ejemplo.getjButtonSumar()){
            float prim = Float.parseFloat(ejemplo.getjTextFieldPrimerNum().getText());
            float seg = Float.parseFloat(ejemplo.getjTextFieldSegundoNum().getText());
            float total = prim + seg;
            ejemplo.getjTextFieldResultado().setText(total+"");
        }
    }

    






}
