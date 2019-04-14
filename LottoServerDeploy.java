
import java.rmi.registry.*;

public class LottoServerDeploy
{
    public static void main(String args[])
        throws Exception
    {
        final int PORT = 12345;
        final int numberOfAllNumbers 	= (int) Integer.parseInt(args[0]);
        final int numberOfWiningNumbers = (int) Integer.parseInt(args[1]);

        Registry registry = LocateRegistry.createRegistry(PORT);
        // Registry registry = LocateRegistry.getRegistry();
        // Create winnners
		List<CurrentAccount> winnersList = new ArrayList<CurrentAccount>();
		Iterator<CurrentAccount> itr = winnersList.iterator();
		for(int idx = 0; idx<numberOfWiningNumbers; ++idx){
			List<CurrentAccount> currentWinnersList = new ArrayList<CurrentAccount>();
			while (itr.hasNext()) {
			    int winner = itr.next();
			    currentWinnersList.add(winner);
			}	
			//while not found a doesent creted in currentwinner
		}

        // Create LottoServers
        for(int idx = 0; idx<numberOfAllNumbers; ++idx){
        	if (winnersList.contains(conta1)) {
        		registry.rebind(idx, new LottoServer(idx,true));
			} else {
        		registry.rebind(idx, new LottoServer(idx,false));
			}
        }
     }
}
