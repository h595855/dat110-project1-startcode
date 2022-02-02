package no.hvl.dat110.messaging;


import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;

import no.hvl.dat110.TODO;

public class MessagingClient {
	
	private String server;
	private int port;
	
	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	// connect to messaging server
	public Connection connect () {
			
		
		Connection connection = null;
		
		
		// TODO - START
		try {
		Socket clientSocket = new Socket(server, port);
		
		connection = new Connection(clientSocket);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create TCP socket for client and connection
		
		
		// TODO - END
		return connection;
	}
}
