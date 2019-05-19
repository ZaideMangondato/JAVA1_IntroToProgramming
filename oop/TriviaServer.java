/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPCaseStudies;
/**
 *
 * @author Student
 */

import java.net.*;
import java.io.*;
import java.util.*;

public class TriviaServer {
    final static int N = 0;
    final static int ASK = 1;
    final static int REPLY = 2;
    String str[];
    LinkedList<String> list = new LinkedList<String>();
    public void addNew(String s) {
        list.add(s);
    }
    public String checkList(String s){
        String invalid = "";
        for(int i=0;i<list.size();i++){
            String aw[] = list.get(i).split("#");
            String check = aw[TriviaServer.N] + "# " + aw[TriviaServer.REPLY];
            System.out.println(check + " " + s);
            if(check.equalsIgnoreCase(s)){
                invalid = "Good Job!";
                break;
            }
            else{
                invalid = "Invalid!";
            }
        }
       return invalid;
    }
    public String getAsk() {
        int random_Q = (int) (Math.random() * 10);
        str = list.get(random_Q).split("#");
        return str[TriviaServer.N] + "# " + str[TriviaServer.ASK];
    }
    public String getReply() {
        int random_Q = (int) (Math.random() * 10);
        str = list.get(random_Q).split("#");
        return str[TriviaServer.N] + "# " + str[TriviaServer.REPLY];
    }
    public static void main(String[] args) {
        TriviaServer x = new TriviaServer();
        int counter = 0;
        x.addNew("1#What is the name of the Longest River in the Philippines?#Cagayan River");
        x.addNew("2#What is the name of the Talles Mountain in the Philippines?#Mount Apo");
        x.addNew("3#What is the name of the Largest Crocs found in Agusan?#Lolong");
        x.addNew("4#Who was the first President of the Philippine Republic?#Emilio Aguinaldo");
        x.addNew("5#What is the name of the Longest underground river in the world?#Puerto Princesa Underground River");
        x.addNew("6#Who was the first Female President of the Philippine Republic?#Corazon Aquino");
        x.addNew("7#Who won the Championship game in the All Filipino PBA Finals?#San Mig Coffee");
        x.addNew("8#Who won the MVP title for the All Filipino PBA Finals?#Mark Barroca");
        x.addNew("9#Who first colonized the Philippines?#Spain");
        x.addNew("10#What is the name of the most translated Philippine poem?#Mi Ultimo Adios");
        ServerSocket server = null;
        Socket client;
            try {
                server = new ServerSocket(10000);
            } catch (IOException ie) {
                System.out.println("Cannot open socket.");
                System.exit(1);
            }
            while(true) {
                try {
                    client = server.accept();
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    InputStream clientIn = client.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
                    String input = br.readLine();

                    if(input.equalsIgnoreCase("request")){
                        pw.println(x.getAsk());
                    }
                    if(input.equalsIgnoreCase("answer")){
                        pw.println("Give your answer in this format<question number># <your answer>");
                    }
                    if(input.equalsIgnoreCase("shutdown")){
                        pw.println("Terminating Session!");
                        server.close();
                        System.exit(0);
                    }
                    pw.println(x.checkList(input));
                } catch (IOException ie) {
            }
      }
}
}