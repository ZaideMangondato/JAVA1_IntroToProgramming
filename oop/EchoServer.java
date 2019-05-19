/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import java.net.*;
import java.io.*;
public class EchoServer {
    public static void main(String[]args)throws Exception{
        ServerSocket server = new ServerSocket(1254);
        Socket client = server.accept();
        DataInputStream input = new DataInputStream(client.getInputStream());
        DataOutputStream output = new DataOutputStream(client.getOutputStream());
        
        String msg = input.readUTF();
        output.writeUTF(msg);
        client.close();
        server.close();
    }
}
