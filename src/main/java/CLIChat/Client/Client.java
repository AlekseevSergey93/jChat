package CLIChat.Client;

import CLIChat.Converter.InStream;
import CLIChat.Converter.OutStream;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Client {
    private Socket clientSocket;
    private ByteArrayInputStream input;
    private ByteArrayOutputStream output;
    private String serverAddress = "localhost";
    private int port = 9999;

    public void run() {
        clientSocket = new Connect2Server().connect(serverAddress, port);
        String mes = "testPost";

//        try {
        //output = new ByteArrayOutputStream(Integer.parseInt(String.valueOf(clientSocket.getOutputStream())));
        output = new ByteArrayOutputStream();
        while(output.size()!= mes.length()) {
            try {
                output.write(mes.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        for (byte b : mes.getBytes()) {
//            output.write(5);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
            try {
            output.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        }
            //System.out.println(new InStream().fromByte(clientSocket));
        }

    }

//        getIOStreams();
//        processConnection();
//        closeConnection();



//    public String fromByte(ByteArrayOutputStream output) {
//        int b;
//
//        StringBuffer result = null;
//        try (output = clientSocket.getInputStream()) {
//            String str = String.valueOf(i.read());
//            byte[] array = str.getBytes();
//            ByteArrayInputStream br = new ByteArrayInputStream(array);
//            while ((b = br.read()) != -1) {
//                result.append(b);
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return result.toString();
//    }
//    public void getIOStreams() {
//        try {
//            new OutputStreamWriter(clientSocket.getOutputStream());
//            output.flush();
////           input = new ObjectInputStream(clientSocket.getInputStream());
//  //          System.out.println("Client established I/O Stream");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void processConnection() {
//        String inputMessage = "";
//        new Runnable() {
//            //Scanner sc = new Scanner(System.in);
//
//            public void run() {
//                Date date = new Date();
//                String outputMessage = "";
//                do {
//                    outputMessage = sc.nextLine();
//                    sendData( outputMessage);
//                } while (outputMessage.equals("."));
//            }
//        };
//        while (true) {
//
//            try {
//                inputMessage = (String) input.readObject();
//                System.out.println(inputMessage);
//            } catch (ClassNotFoundException e) {
//                 System.err.println("Object of an unknown type was recieved");
//            } catch (IOException e) {
//                e.printStackTrace();
//                System.exit(1);
//            }
//        }
//    }
//
//    public static void sendData(String s) {
//        try {
//            output.writeObject(s);
//            output.flush();
//            if (s.equalsIgnoreCase("/hist")) {
//
//
//
//            } else if (s.equalsIgnoreCase("/snd")) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            //        System.err.println("Error writting the message");
//        }
//    }
//
//
//    public void closeConnection() {
//        try {
//            output.close();
//            input.close();
//            clientSocket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        connect2Server();
//        getIOStreams();
//        processConnection();
//    }

