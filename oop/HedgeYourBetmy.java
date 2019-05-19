package oop;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class HedgeYourBetmy extends JFrame implements ActionListener
    {
    //Class Main
    JLabel wcL, dirL;
    JButton playB, exit1B;
    //Class Quiz
    JPanel mainP, q1P, q2P, q3P, q4P, q5P, buttonP;
    JLabel q1L, q2L, q3L, q4L, q5L, retry;
    JCheckBox q1a,q1b,q1c,q2a,q2b,q2c,q3a,q3b,q3c,q4a,q4b,q4c,q5a,q5b,q5c;
    int playerPoints =0;
    private int qnum1 = 0;
    JButton submitB, exit2B;
    JButton ok,cancel;
    QButton qb = new QButton();
    
    
    
     String path  = "d:/erase.txt";
    public HedgeYourBetmy()
    {
    super("Hedge Your Bet");
    setVisible(true);
    setSize(300,200);
    setLocation(500,280);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout());
    //**********************
    //**DEFINING J-OBJECTS**
    //**********************
    //JPANEL
    JPanel mainP = new JPanel(new GridLayout(3,1));
    mainP.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"WELCOME"));
    JPanel botP = new JPanel(new GridLayout());
    JPanel bot2P = new JPanel(new GridLayout(1,2));
    //JLABEL
    wcL = new JLabel("HELLO THERE! THIS IS A SIMPLE QUIZ GAME", JLabel.CENTER);
    dirL = new JLabel("Click \"PLAY\" to Start the Game.", JLabel.CENTER);
    //JBUTTON
    playB = new JButton("PLAY");
    exit1B = new JButton("EXIT");
    //***********************
    //**ADDING ON THE FRAME**
    //***********************
    add(mainP);
    mainP.add(wcL);
    mainP.add(dirL);
    mainP.add(botP);
    botP.add(bot2P);
    bot2P.add(playB);
    bot2P.add(exit1B);
    //*******************
    //**ADDING LISTENER**
    //*******************
    playB.addActionListener(this);
    exit1B.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
    try{
        Object o = ae.getSource();
    if(o == playB)
    {
    this.setVisible(false);
    Quiz q = new Quiz();
    q.setVisible(true);
    }
    if(o == exit1B)
    {
    System.exit(0);
    }
    }
    catch(Exception g){}
    
    
    }
    public static void main(String[]args)
    {
        HedgeYourBetmy test = new HedgeYourBetmy();
     try{
        HedgeYourBetmy window = new HedgeYourBetmy();
        window.setVisible(false);
        }catch(Exception x){}
    }
    public class Quiz extends JFrame implements ActionListener
    {
        
        
   
    public Quiz()throws FileNotFoundException 
    {
    super("Quiz Game");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,800);
    setLocation(300,5);
    setLayout(new GridLayout());
    //**********************
    //**DEFINING J-OBJECTS**
    //**********************
    //JPANELS
    mainP = new JPanel(new GridLayout(0,1));
    mainP.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"START!!!"));
    q1P = new JPanel(new GridLayout(4,1));
    q1P.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Question 1"));
  
    q2P = new JPanel(new GridLayout(4,1));
    q2P.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Question 2"));
    q3P = new JPanel(new GridLayout(4,1));
    q3P.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Question 3"));
    q4P = new JPanel(new GridLayout(4,1));
    q4P.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Question 4"));
    q5P = new JPanel(new GridLayout(4,1));
    q5P.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Question 5"));
    buttonP = new JPanel(new GridLayout(1,2));
    //JLABELS
    q1L = new JLabel("Who uses Android OS?");
    q2L = new JLabel("Who uses IOS7?");
    q3L = new JLabel("What is the latest i-series processor of INTEL?");
    q4L = new JLabel("What beverage does the cup in the logo of JAVA contains?");
    q5L = new JLabel("What is Adrian's nickname?");
    //JCHECKBOXES
    //question 1
    q1a = new JCheckBox("Samsung",false);
    q1b = new JCheckBox("IPhone",false);
    q1c = new JCheckBox("Nokia",false);
    //question 2
    q2a = new JCheckBox("Samsung",false);
    q2b = new JCheckBox("IPhone",false);
    q2c = new JCheckBox("Nokia",false);
    //question 3
    q3a = new JCheckBox("Samsung",false);
    q3b = new JCheckBox("IPhone",false);
    q3c = new JCheckBox("Nokia",false); 
    //question 4
    q4a = new JCheckBox("Samsung",false);
    q4b = new JCheckBox("IPhone",false);
    q4c = new JCheckBox("Nokia",false); 
    //question 5
    q5a = new JCheckBox("Samsung",false);
    q5b = new JCheckBox("IPhone",false);
    q5c = new JCheckBox("Nokia",false); 

    //JBUTTON
    submitB = new JButton("SUBMIT");
    exit2B = new JButton("EXIT");
    //***********************k
    //**ADDING ON THE FRAME**
    //***********************
  
    add(mainP);
    mainP.add(q1P);
    q1P.add(q1L);
    q1P.add(q1a);
    q1P.add(q1b);
    q1P.add(q1c);
    mainP.add(q2P);
    q2P.add(q2L);
    q2P.add(q2a);
    q2P.add(q2b);
    q2P.add(q2c);
    mainP.add(q3P);
    q3P.add(q3L);
    q3P.add(q3a);
    q3P.add(q3b);
    q3P.add(q3c);
    mainP.add(q4P);
    q4P.add(q4L);
    q4P.add(q4a);
    q4P.add(q4b);
    q4P.add(q4c);  
    mainP.add(q5P);
    q5P.add(q5L);
    q5P.add(q5a);
    q5P.add(q5b);
    q5P.add(q5c);
    
    mainP.add(buttonP);
    buttonP.add(submitB);
    buttonP.add(exit2B);
    //Adding Listener
    //for JCheckboxes
   
    //for JButtons
    submitB.addActionListener(this);
    exit2B.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ie){
    Object o = ie.getSource();
        if(submitB==o)
        {
        
        }
        if(exit2B==o){
            System.exit(0);
        }
    
     
    if(q1a.isSelected() && q1b.isSelected() && q1c.isSelected())
                {
                    playerPoints += 1;
                }
        else if(q1a.isSelected() && q1b.isSelected() && !q1c.isSelected() 
                ||q1a.isSelected() && q1c.isSelected() && !q1b.isSelected())
                {
                    playerPoints += 2;
               }
        else if(q1a.isSelected() && !q1b.isSelected() && !q1c.isSelected())
    	        {
                    playerPoints +=5;
                }
        if(q2a.isSelected() && q2b.isSelected() && q2c.isSelected())
                {
                    playerPoints += 1;
                }
        else if(q2a.isSelected() && q2b.isSelected() && !q2c.isSelected() 
                ||q2a.isSelected() && q2c.isSelected() && !q2b.isSelected())
                {
                    playerPoints += 2;
                }
        else if(q2a.isSelected() && !q2b.isSelected() && !q2c.isSelected())
    	        {
                    playerPoints +=5;
                }
        if(q3a.isSelected() && q3b.isSelected() && q3c.isSelected())
                {
                    playerPoints += 1;
                }
        else if(q3a.isSelected() && q3b.isSelected() && !q3c.isSelected() 
                ||q3a.isSelected() && q3c.isSelected() && !q3b.isSelected())
                {
                    playerPoints += 2;
                }
        else if(q3a.isSelected() && !q3b.isSelected() && !q3c.isSelected())
    	        {
                    playerPoints +=5;
                }
        if(q4a.isSelected() && q4b.isSelected() && q4c.isSelected())
                {
                    playerPoints += 1;
                }
        else if(q4a.isSelected() && q4b.isSelected() && !q4c.isSelected() 
                ||q4a.isSelected() && q4c.isSelected() && !q4b.isSelected())
                {
                    playerPoints += 2;
                }
        else if(q4a.isSelected() && !q4b.isSelected() && !q4c.isSelected())
    	        {
                    playerPoints +=5;
                }
        if(q5a.isSelected() && q5b.isSelected() && q5c.isSelected())
                {
                    playerPoints += 1;
                }
        else if(q5a.isSelected() && q5b.isSelected() && !q5c.isSelected() 
                ||q5a.isSelected() && q5c.isSelected() && !q5b.isSelected())
                {
                    playerPoints += 2;
                }
        else if(q5a.isSelected() && !q5b.isSelected() && !q5c.isSelected())
    	        {
                    playerPoints +=5;
                }
           
    
           
        if( playerPoints>=21) {
                            JOptionPane.showMessageDialog(null, "FANTASTIC!!!");
                            try{
                            Ibutang(playerPoints);
                            QButton q = new QButton();
                                    
                            q.setVisible(true);
                            
                            }
                            catch(Exception f){
                            }
                            submitB.setEnabled(false);
                        }
                        else if(playerPoints>=15){
                            JOptionPane.showMessageDialog(null, "VERY GOOD!!!");
                            try{
                            Ibutang(playerPoints);
                            QButton q = new QButton();
                            q.setVisible(true);
                            }
                            catch(Exception f){
                            }
                            submitB.setEnabled(false);
                        }
                        else if(playerPoints<=14){
                            JOptionPane.showMessageDialog(null, "OK!!!");
                            try{
                            Ibutang(playerPoints);
                            QButton q = new QButton();
                            q.setVisible(true);
                            }
                            catch(Exception f){
                            }
                            submitB.setEnabled(false);
                        }   
    }
    public void Ibutang(int p)throws FileNotFoundException, IOException{
    String st;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new FileWriter(path, true));
    try{
            st = ""+p;
            pw.println(st);
    }catch (Exception e){}
    finally{
        pw.close();}
    }
    }
    public static String choose(File f) throws FileNotFoundException
      {
         String result = null;
         //Random rand = new Random();
         int n = 0;
         for(Scanner sc = new Scanner(f); sc.hasNext(); )
         {
           n++;
            String line = sc.nextLine();     
            result = line;  
         }    
         return result;
      }
  public class QButton extends JFrame implements ActionListener
    {
      
  public QButton(){
     super("Do You Want to.....");
 
    setVisible(false);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(200,100);
    setLocation(500,280);
    retry = new JLabel("Do you want to play again ?",JLabel.CENTER);
    ok = new JButton("OK");
    cancel = new JButton("Cancel");
    add(retry);
    add(ok);
    add(cancel);
    ok.addActionListener(this);
    cancel.addActionListener(this);
  }
    public void actionPerformed(ActionEvent aw){
      Object o = aw.getSource();
        if(cancel ==o){
            System.exit(0);
        }
         if(ok==o){
        main(null);
        String s ="";       
        try{
         s = choose(new File(path));            
        }catch(Exception g){}
        JOptionPane.showMessageDialog(null, "Previous Score: " + s);
                    }
                }
    
  }
    }
     
    
    
     