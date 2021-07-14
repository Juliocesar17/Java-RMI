package rmi_cliente_servidor;

import java.rmi.Naming;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Cliente {

    public static void main(String[] args) {
        
        String x = "", y = "";
        
        try{
            Suma s = (Suma) Naming.lookup("//192.168.1.73/Suma");
            
            while(true){
                String menu = JOptionPane.showInputDialog(null, "Suma de 2 numeros\n"
                + "1.- Sumar\n"
                + "2.- Salir\n", "Cliente Servidor RPC", JOptionPane.DEFAULT_OPTION);
                
                switch(menu){
                    case "1":
                        x = JOptionPane.showInputDialog(null, "Primer numero", "Suma", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo numero", "Suma", JOptionPane.QUESTION_MESSAGE);
                        
                        JOptionPane.showMessageDialog(null, "La suma es: " + s.suma(x, y));
                        
                        break;
                        
                    case "2":
                        JOptionPane.showMessageDialog(null, "Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        break;
                }
            }
            
        } catch(Exception e){
            
        }
    }
    
}
