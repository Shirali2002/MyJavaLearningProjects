package main;

import client.ClientApp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ClientApp myClient = new ClientApp();
        myClient.start();
    }
}
