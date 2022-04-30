package ClientSide;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.PrintWriter;
import java.net.Socket;

public class ServerConnector implements Runnable{

	private Socket server;
	private BufferedReader in;

	
	public ServerConnector(Socket s) throws IOException
	{
		server = s;
		in = new BufferedReader(new InputStreamReader(server.getInputStream()));
	}
	
	public void run() {

		try {
			while(true)
			{
				String serverResponse = in.readLine();
				System.out.println(serverResponse);
			}
			
			
					
		} catch (IOException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	
}
