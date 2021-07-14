package rmi_cliente_servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Bryan
 */
public class RMI extends UnicastRemoteObject implements Suma{
    
    public RMI() throws RemoteException{};
    
    @Override
    public String suma(String a, String b) throws RemoteException{
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
}
