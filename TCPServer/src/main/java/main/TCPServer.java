package main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

import util.FileUtility;
import lombok.SneakyThrows;

public class TCPServer {

    public static void main(String[] args) {
        readAsByte();
    }

    @SneakyThrows
    public static void readAsByte() {
        ServerSocket ourServerSocket = new ServerSocket(6789);

        while (true) {
            Socket connection = ourServerSocket.accept();
            System.out.println("New connection accepted.");

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            byte[] arr = readMessage(dataStream);
            System.out.println("Message length2= " + arr.length);
            Files.write(Paths.get("sarkhan.jpg"), arr);
//            FileUtility.writeBytes(arr, "C:\\Users\\Shireli\\Desktop\\fira_mid.docx");
        }
    }

    @SneakyThrows
    public static byte[] readMessage(DataInputStream din) {
        int msgLen = din.readInt();
        System.out.println("message length1= " + msgLen);
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }

//        while (true) {
//            Socket connection = ourServerSocket.accept();
//            System.out.println("New connection accepted.");
//            ByteBuffer bf = ByteBuffer.allocate(8192);
//            BufferedInputStream inFromClient = new BufferedInputStream(connection.getInputStream());
//            while (true) {
//                int b = inFromClient.read();
//                if (b == -1) {
//                    break;
//                }
//                bf.put((byte) b);
//            }
//            FileUtility.writeBytes(bf.array(), "C:\\Users\\Shireli\\Desktop\\fira_mid.docx");
//        }
//}
    @SneakyThrows
    public static void readAsString() {
        ServerSocket ourServerSocket = new ServerSocket(6789);

        while (true) {
            Socket connection = ourServerSocket.accept();
            System.out.println("New connection accepted.");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);

            String messageFromClient = bReader.readLine();
            System.out.println("Message from client = " + messageFromClient);

        }
    }
}
