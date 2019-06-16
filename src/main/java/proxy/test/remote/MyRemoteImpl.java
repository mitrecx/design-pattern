package proxy.test.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author cx
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "server says: hello..";
    }

    public static void main(String[] args) {
        try {
            // create registry
            LocateRegistry.createRegistry(8810);
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://localhost:8810/RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
