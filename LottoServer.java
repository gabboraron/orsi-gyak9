import java.rmi.*;
import java.util.Random;

public class LottoServer
    extends java.rmi.server.UnicastRemoteObject
    implements Remote
{
    winners[] = int[4];
    allCreated = false;
    idx = 0
    while !allCreated{
        winners[idx] = random
    }


    boolean nyeroszamE() throws RemoteException
    {
        
    }

    public LottoServer() throws RemoteException
    {
        this("default");
    }

    public LottoServer(String appendTxt) throws RemoteException
    {
        this.appendTxt = appendTxt;
    }

    public String appendTxt(String str) throws RemoteException
    {
        return str + appendTxt;
    }
}