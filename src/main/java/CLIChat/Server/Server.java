package CLIChat.Server;

import CLIChat.Converter.InStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9999);
    while (!Thread.interrupted()) {
      Socket clientSocket = serverSocket.accept();
      if (clientSocket != null) {
        System.out.println("123");
        int b;
        InputStreamReader i = new InputStreamReader(clientSocket.getInputStream());
        InputStreamReader br2 = new InputStreamReader((clientSocket.getInputStream()));
        System.out.println(br2);
        BufferedReader br3 = new BufferedReader(br2);
        System.out.println(br3);
        String str = String.valueOf(i.read());
        System.out.println("2");
        byte[] array2 = str.getBytes();
        System.out.println("3");
        ByteArrayInputStream br = new ByteArrayInputStream(array2);
        System.out.println("4");
        while((b = br.read()) != -1)
        System.out.print((char)b);
      }
    }
}}
