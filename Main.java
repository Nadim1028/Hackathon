package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private static int port = 4040;

    public static void main(String[] args)
    {

        try
        {
            ServerSocket server = new ServerSocket(port);

            System.out.println("The Server is started.");

            while (true)
            {
                System.out.println("Waiting for the connection... ...");
                Socket client = server.accept();
                System.out.println("Connected with the " + client.getRemoteSocketAddress());
                ServeClient Client1 = new ServeClient(client);
                    Client1.start();
            }


        }

        catch (IOException e)
        {
            System.out.println("Can not start the server! The error is: " + e.getMessage());
        }

    }



}
