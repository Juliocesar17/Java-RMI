package servidor_cliente_rcp;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

/**
 *
 * @author Bryan
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Iniciando el servidor");
            
            WebServer server = new WebServer(8080);
            
            Suma suma = new Suma();
            
            server.addHandler("miServidorRPC", suma);
            
            server.start();
            
            JOptionPane.showMessageDialog(null, "Servidor en linea");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
