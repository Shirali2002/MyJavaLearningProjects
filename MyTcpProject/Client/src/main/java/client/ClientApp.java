package client;

import lombok.SneakyThrows;
import util.FileUtility;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientApp {
    public void start(){
        clientMenu();
    }

    public void clientMenu(){
        String clientName = clientInputStr("Enter your name:");
        String clientSurname = clientInputStr("Enter your surname:");
        String filePath = clientInputStr("Please note the link where the file you want to send is located:");

        Map<String,String> map=new HashMap<String,String>();
        String[] receiverIpAndPort = clientInputStr("Enter the ip and port of the person (server) you want to send this file to (as 192.168.1.1:5678):").split(":");
        String receiverIp = receiverIpAndPort[0].strip();
        int receiverPort = Integer.parseInt(receiverIpAndPort[1].strip());

        sendMessage(receiverPort, receiverIp, filePath);

        System.out.println("Mission completed.");
    }

    public String clientInputStr(String requirement){
        System.out.println(requirement);
        return new Scanner(System.in).next();
    }

    @SneakyThrows
    public void sendMessage(int receiverPort, String receiverIp, String filePath){
        Socket socket = new Socket(receiverIp, receiverPort);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] byteArr = FileUtility.readBytes(filePath);
        dataOutputStream.writeInt(byteArr.length);
        dataOutputStream.write(byteArr);
        socket.close();
    }
}
