package server;

import lombok.SneakyThrows;
import util.FileUtility;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServerApp {
    @SneakyThrows
    public void start() {
        ServerSocket ourServerSocket = new ServerSocket(5678);
        while (true){
            Socket connection = ourServerSocket.accept();
            System.out.println("New connection accepted.");

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            byte[] byteArr = readMessage(dataStream);
            System.out.println("message length2= " + byteArr.length);

            Files.write(Paths.get("/Users/Shireli/Desktop/serverFiles/clientFile.docx"), byteArr);

        }
    }

    @SneakyThrows
    public byte[] readMessage(DataInputStream dataInputStream) {
        int msgLen = dataInputStream.readInt();
        System.out.println("message length1= " + msgLen);
        byte[] msg = new byte[msgLen];
        dataInputStream.readFully(msg);
        return msg;
    }
}
