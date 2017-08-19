

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class PortListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int portNumber = Integer.parseInt(args[0]);

		try {
		ServerSocket serverSocket = new ServerSocket(portNumber);
			while(true){
				
			    
			    Socket clientSocket = serverSocket.accept();
			    PrintWriter out =
			        new PrintWriter(clientSocket.getOutputStream(), true);
			    BufferedReader in = new BufferedReader(
			        new InputStreamReader(clientSocket.getInputStream()));
				
			    System.out.println(new Date() + " incoming.");
			    clientSocket.close();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
