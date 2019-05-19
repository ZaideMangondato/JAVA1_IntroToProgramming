



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class HedgeYourBet extends JFrame {
     
    JMenuBar hMenubar = new JMenuBar();
    JMenu hFile = new JMenu("File");
    JMenuItem newGame = new JMenuItem("New Game");
    String path  = "e:/score.txt";
    public static void main(String args[]){
        try{
        HedgeYourBet window = new HedgeYourBet();
        window.setVisible(true);
        }catch(Exception x){}
    }
        JLabel title = new JLabel("Each question has one correct answer");
        JLabel one = new JLabel("If you check 1 choices and it is correct = 5 pts");
        JLabel two = new JLabel("If you check 2 choices and 1 of it is correct then = 2 pts");
        JLabel three = new JLabel("If you check all 3 choices = 1 pt");
	JLabel direction = new JLabel("Choose the correct answer for question below");
	String q1 = ("Qestion 1: Who is our national hero?");
	String q2 = ("Qestion 2: Who is the father of Philippine revolution?");
	String q3 = ("Qestion 3: Who is the brains of revolution?");
	String q4 = ("Qestion 4: Who is died on Bagumbayan?");
	String q5 = ("Qestion 5: Who is the founder of Katipunan?");
	JLabel question = new JLabel(q1);
	JCheckBox q1a = new JCheckBox("Jose Rizal");
	JCheckBox q1b = new JCheckBox("Andres Bonifacio");
	JCheckBox q1c = new JCheckBox("Apolinario Mabini");
	JButton submit = new JButton("Submit");
	int point = 0;
        int count = 0;
        String stored_point = "";
	JLabel points = new JLabel ("You have "+point+" points");
 
   	public HedgeYourBet()throws FileNotFoundException
    {
    	setTitle("Hedge Your Bet: Quiz Game!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,400);
        setLocation(400,100);
     	Container pane = getContentPane();
    	pane.setLayout(new FlowLayout());;
    	pane.add(title);
    	pane.add(one);
  	pane.add(two);
    	pane.add(three);
    	pane.add(direction);
    	pane.add(question);
    	JPanel one = new JPanel();
    	one.add(q1a);
    	one.add(q1b);
    	one.add(q1c);
    	JPanel submit2 = new JPanel();
    	submit2.add(submit);
    	submit2.add(points);
	pane.add(one);
    	pane.add(submit2);
    	ClickButtonListener clickListener = new ClickButtonListener();
        submit.addActionListener(clickListener);
        hFile.add(newGame);
        hMenubar.add(hFile);
        setJMenuBar(hMenubar);
        
        String s ="";
        try{
        s = choose(new File(path));
        int previous = Integer.parseInt(s);
        if(previous >= 0){
        JOptionPane.showMessageDialog(null, "Previous Score: " + previous);
        }
        }catch(Exception g){}
        
        newGame.addActionListener( 
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        setVisible(false);
                        main(null);
                        String s ="";
                        try{
                        s = choose(new File(path));
                        }catch(Exception g){}
                        JOptionPane.showMessageDialog(null, "Previous Score: " + s);
                    }
                });
    }
 
	public class ClickButtonListener implements ActionListener {
        
            public void actionPerformed (ActionEvent e)
        {               
                        
			if (question.getText().equals(q1)){
                            if(q1c.isSelected() && q1b.isSelected() && q1a.isSelected())
    			{
    				point += 1;
    			}
 
    			else if(q1a.isSelected() && q1b.isSelected() && !q1c.isSelected() || q1a.isSelected() && q1c.isSelected() && !q1b.isSelected() )
    			{
    				point += 2;
    			}
    			else if(q1a.isSelected() && !q1b.isSelected() && !q1c.isSelected())
    			{
    				point +=5;
    			}
    			q1a.setSelected(false);
    			q1b.setSelected(false);
    			q1c.setSelected(false);
    			points.setText("You have "+point+" points");
			question.setText(q2);	
			}
 
			else if (question.getText().equals(q2))
			{
				if(q1c.isSelected() && q1b.isSelected() && q1a.isSelected())
    			{
    				point += 1;
    			}
 
    			else if(q1b.isSelected() && q1a.isSelected() && !q1c.isSelected() || q1b.isSelected() && q1c.isSelected() && !q1a.isSelected() )
    			{
    				point += 2;
    			}
    			else if(q1b.isSelected() && !q1a.isSelected() && !q1c.isSelected())
    			{
    				point +=5;
    			}
    			q1a.setSelected(false);
    			q1b.setSelected(false);
    			q1c.setSelected(false);
    			points.setText("You have "+point+" points");
			question.setText(q3);
			}
 
			else if (question.getText().equals(q3))
			{
        		if(q1c.isSelected() && q1b.isSelected() && q1a.isSelected())
    			{
    				point += 1;
    			}
 
    			else if(q1a.isSelected() && !q1b.isSelected() && q1c.isSelected() || !q1a.isSelected() && q1c.isSelected() && q1b.isSelected() )
    			{
    				point += 2;
    			}
    			else if(!q1a.isSelected() && !q1b.isSelected() && q1c.isSelected())
    			{
    				point +=5;
    			}
    			q1a.setSelected(false);
    			q1b.setSelected(false);
    			q1c.setSelected(false);
			points.setText("You have "+point+" points");
			question.setText(q4);
			 }
 
			else if (question.getText().equals(q4))
			 {
        		if(q1c.isSelected() && q1b.isSelected() && q1a.isSelected())
    			{
    				point += 1;
    			}
    			else if(q1c.isSelected() && q1b.isSelected() && !q1a.isSelected() || q1c.isSelected() && q1a.isSelected() && !q1b.isSelected() )
    			{
    				point += 2;
    			}
    			else if(q1a.isSelected() && !q1b.isSelected() && !q1c.isSelected())
    			{
    				point +=5;
    			}
    			q1a.setSelected(false);
    			q1b.setSelected(false);
    			q1c.setSelected(false);
                        question.setText(q5);
			points.setText("You have "+point+" points");
			 }
 
			else if (question.getText().equals(q5))
			 {
        		if(q1c.isSelected() && q1b.isSelected() && q1a.isSelected())
    			{
    				point += 1;
    			}
 
    			else if(q1a.isSelected() && q1b.isSelected() && !q1c.isSelected() || q1a.isSelected() && q1c.isSelected() && !q1b.isSelected() )
    			{
    				point += 2;
    			}
    			else if(!q1a.isSelected() && q1b.isSelected() && !q1c.isSelected())
    			{
    				point +=5;
    			}
		     	points.setText("You have "+point+" points");
                        
			 }
                       points.setText("You have "+point+" points"); 
                       
                        count++;
                        if (count >= 5&&point>=21) {
                            JOptionPane.showMessageDialog(null, "FANTASTIC!!!");
                            try{
                            Score(point);
                            }
                            catch(Exception f){
                            }
                            submit.setEnabled(false);
                        }
                        else if(count >=5&&point>=15){
                            JOptionPane.showMessageDialog(null, "VERY GOOD!!!");
                            try{
                            Score(point);
                            }
                            catch(Exception f){
                            }
                            submit.setEnabled(false);
                        }
                        else if(count >=5&&point<=14){
                            JOptionPane.showMessageDialog(null, "OK!!!");
                            try{
                            Score(point);
                            }
                            catch(Exception f){
                            }
                            submit.setEnabled(false);
                        }   
        }
            
    }
    public void Score(int p)throws FileNotFoundException, IOException{
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
    
    public static String choose(File f) throws FileNotFoundException
      {
         String result = null;
         int n = 0;
         for(Scanner sc = new Scanner(f); sc.hasNext(); )
         {
           n++;
            String line = sc.nextLine();     
            result = line;  
         }    
         return result;
      }

        
}
