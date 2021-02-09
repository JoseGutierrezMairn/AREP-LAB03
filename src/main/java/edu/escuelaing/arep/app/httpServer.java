package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class httpServer {
	
	public httpServer() {
		super();
	}
	
	public static void main(String[] args) {
		httpServer server = new httpServer();
		try {
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void start() throws IOException {
		ServerSocket serverSocket = null;
		   try { 
		      serverSocket = new ServerSocket(getPort());
		   } catch (IOException e) {
		      System.err.println("Could not listen on port: 35000.");
		      System.exit(1);
		   }
		   boolean working = true;
		   while(working) {
			   Socket clientSocket = null;
			   try {
			       System.out.println("Listo para recibir ...");
			       clientSocket = serverSocket.accept();
			   } catch (IOException e) {
			       System.err.println("Accept failed.");
			       System.exit(1);
			   }
			   PrintWriter out = new PrintWriter(
			                         clientSocket.getOutputStream(), true);
			   BufferedReader in = new BufferedReader(
			                         new InputStreamReader(clientSocket.getInputStream()));
			   String inputLine, outputLine;
			   while ((inputLine = in.readLine()) != null) {
			      System.out.println("Recibí: " + inputLine);
			      if (!in.ready()) {break; }
			   }
			   outputLine = "HTTP/1.1 200 OK\r\n"
				        + "Content-Type: text/html\r\n"
				         + "\r\n"
				         + "<!DOCTYPE html>\n"
				         + "<html>\n"
				         + "<head>\n"
				         + "<meta charset=\"UTF-8\">\n"
				         + "<title>Title of the document</title>\n"
				         + "</head>\n"
				         + "<body>\n"
				         + "<h1>Mi propio mensaje</h1>\n"
				         + "</body>\n"
				         + "</html>\n";
			    out.println(outputLine);
			    out.close(); 
			    in.close(); 
			    clientSocket.close();
		   }
		    
		    serverSocket.close(); 
		  
	}
	
	private int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 35100; //returns default port if heroku-port isn't set(i.e. on localhost)
	}
}
