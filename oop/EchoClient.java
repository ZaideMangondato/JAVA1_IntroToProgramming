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
import java.util.*;
public class EchoClient {
    public static void main(String[]args){
        Scanner keyB = new Scanner(System.in);
        Socket client=null;
         DataInputStream input =null;
        DataOutputStream output = null;
    try{   
        client= new Socket(InetAddress.getLocalHost(),1254);
       input =  new DataInputStream(client.getInputStream());
       output = new DataOutputStream(client.getOutputStream());
       System.out.println("Client: ");
       output.writeUTF(keyB.readLine());
   
        while(true){
          System.out.println("Client: ");
          output.writeUTF(""+keyB.nextLine());
          
      
    }}catch(Exception e){System.out.println("Problem occured"+e.getMessage());}
}
}