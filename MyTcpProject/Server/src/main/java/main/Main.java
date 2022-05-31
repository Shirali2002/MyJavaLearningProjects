package main;


import server.ServerApp;

import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ServerApp myServer = new ServerApp();
        myServer.start();
    }




}
