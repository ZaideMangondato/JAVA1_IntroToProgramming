/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPCaseStudies;
/**
 *
 * @author Student
 */

import java.io.*;
import java.net.*;

public class TriviaClient {
    public static void main(String args[]) {
        boolean infinite = true;
        while(infinite){
        try {
            Socket client = new Socket(InetAddress.getLocalHost(), 10000);
            InputStream clientIn = client.getInputStream();
            OutputStream clientOut = client.getOutputStream();
            PrintWriter pw = new PrintWriter(clientOut, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Client: ");
            pw.println(stdIn.readLine());
            System.out.print("Server: ");
            System.out.println(br.readLine());
            pw.close();
            br.close();
            client.close();
        } catch (ConnectException ce) {
            System.out.println("Cannot connect to the server.");
            System.exit(0);
        } catch (IOException ie) {
            System.out.println("I/O Error.");
        }
        }
    }
}

