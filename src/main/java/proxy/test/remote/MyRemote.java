package proxy.test.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author cx
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
