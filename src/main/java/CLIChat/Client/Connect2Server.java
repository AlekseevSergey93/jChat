package CLIChat.Client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connect2Server {

    public Socket connect(String inServerAddress, int inPort) {
        System.out.println("Trying to connect to the server...");
        try {
            Socket socket = new Socket(inServerAddress, inPort);
            System.out.println("Connection established.");
            return socket;
        } catch (UnknownHostException e) {
            System.err.println("Server unavailable.");
            System.exit(1);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

