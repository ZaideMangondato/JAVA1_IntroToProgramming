package oop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JSecretPhrase1 extends JFrame implements ActionListener{
    private String hLetters[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                                 "n","o","p","q","r","s","t","u","v","w","x","y","z",
                                 ".L.",".I.",".F.",".E."}, 
                                 let[];
    LinkedList<String> list = new LinkedList<String>();
    private int random_Q, level=0,
                clue = 0, answer = 1, count = 0;
    protected String str, mstr, astr="", tstr="",arg = "";
    protected JLabel mystery_str = new JLabel("");
    private char ch;
    private Font font_style_4_mstr = new Font("MONOSPACED",Font.BOLD,20),
                 font_style_4_letters = new Font("MONOSPACED",Font.TYPE1_FONT,20),
                 font_style_4_clues = new Font("MONOSPACED",Font.TYPE1_FONT,15),
                 font_style_4_LIFE = new Font("MONOSPACED",Font.TYPE1_FONT,16),
                 font_style_4_WoL = new Font("MONOSPACED",Font.TYPE1_FONT,40);
    
    private final JButton[] letters = new JButton[30];
    private JPanel mystery_Panel = new JPanel();
    private JPanel hLevel_container = new JPanel(new GridLayout(2,5,1,1));
    private int rStr2 = (int)(10.0*Math.random()+1),
                rStr3 = (int)(10.0*Math.random()+1),
                life, g;
    JMenuBar hMenubar = new JMenuBar();
    JMenu hFile = new JMenu("File");
    JMenu Help = new JMenu("Help");
    JMenuItem newGame = new JMenuItem("New Game");
    JMenuItem Cheat = new JMenuItem("Cheat");
    public JSecretPhrase1(){
        setTitle("JSecretPhrase");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setLocation(400,100);
        setVisible(true);
        start();
    }
    public void start(){
        Menu();
    }
    public void Menu(){
        hFile.add(newGame);
        Help.add(Cheat);
        hMenubar.add(hFile);
        hMenubar.add(Help);
        setJMenuBar(hMenubar);
        hActionListeners();
        display_Interface();
    }
    public void hActionListeners(){
        hFile.addActionListener(this);
        newGame.addActionListener( 
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        setVisible(false);
                        main(null);
                    }
                });
        Cheat.addActionListener( 
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Graphics pen = getGraphics();
                        pen.setColor(Color.DARK_GRAY);
                        pen.drawString("ANSWER: "+getastr()+"", 320, 460);
                    }
                });
    }
    public void display_Interface(){
        String random_str;
        JPanel format[] = new JPanel[5];
        for(int i = 0; i < format.length; i++){
        if(i == 0)
                format[0] = new JPanel(new GridLayout(1,2,0,0));
                
            else if(i == 2 || i == 4 || i == 3){
                format[i] = new JPanel();
                
                format[i].setBounds(50, 50, 600, 500);
              
                format[i].setBackground(Color.GREEN);
               
               
            }
            else
                format[i] = new JPanel();
        }     
        format[2].setLayout(new GridLayout(8,9,5,5));
        format[3].setLayout(new BorderLayout());
        format[3].add(format[2], BorderLayout.CENTER);
        
        String[] CA = {};
        list_of_mystery_strings();
        random_Q = (int)(list.size()*Math.random());
        for(int i = 0; i < list.size(); i++){
            CA = list.get(random_Q).split("#");
            str = CA[clue]+"#"+CA[answer];
            setmstr(CA[clue]);
            setastr(CA[answer]);
        }
        String  b = ""+astr.charAt(rStr2),
                a, c = ""+astr.charAt(rStr3);
        for(int i = 0; i < astr.length(); i++){
            a = ""+astr.charAt(i);
            if(a.equalsIgnoreCase(b))
                tstr = tstr+b;
            else if(a.equalsIgnoreCase(c))
                tstr = tstr+c;
            else if(a.equalsIgnoreCase(" "))
                tstr = tstr+" ";
            else
                tstr = tstr+"*";
        }
       JLabel clue_str = new JLabel(mstr);
       clue_str.setLocation(20, 450);
        settstr(tstr);
        for(int g = 0; g < letters.length; g++){
            letters[g] = new JButton(hLetters[g].toUpperCase());
            letters[g].setEnabled(true);
            if(hLetters[g].equalsIgnoreCase(getastr().charAt(rStr2)+"")){
                letters[g].setBackground(Color.WHITE);
                letters[g].setEnabled(false);
            }
            else if(hLetters[g].equalsIgnoreCase(getastr().charAt(rStr3)+"")){
                letters[g].setBackground(Color.WHITE);
                letters[g].setEnabled(false);
            }
            else if(g>25){
                letters[g].setFont(font_style_4_LIFE);
                letters[g].setBackground(Color.PINK);
                letters[g].setVisible(false);
            }
            else{
                letters[g] = new JButton(hLetters[g].toUpperCase());
                letters[g] = new JButton(hLetters[g].toUpperCase());
                letters[g].setFont(font_style_4_letters);
                letters[g].setBackground(Color.RED);
                letters[g].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Graphics pen = getGraphics();
                        String f = "", character_At[] = new String[getastr().length()];
                        int win; 
                        for(int q = 0; q < hLetters.length; q++){
                            if(e.getSource()==letters[q]){
                            setG(q);
                                    for(int x = 0; x < getastr().length(); x++){ 
                                        if ((""+gettstr().charAt(x)).equalsIgnoreCase(""+getastr().charAt(x))){
                                            character_At[x] = gettstr().charAt(x)+"";
                                            f = f + character_At[x];
                                        }
                                        else if(hLetters[getG()].equalsIgnoreCase(getastr().charAt(x)+""))
                                            f = f + getastr().charAt(x);
                                        else if((""+getastr().charAt(x)).equalsIgnoreCase(""+getastr().charAt(rStr2)))
                                            f = f + ""+getastr().charAt(rStr2);
                                        else if((""+getastr().charAt(x)).equalsIgnoreCase(""+getastr().charAt(rStr3)))
                                            f = f + ""+getastr().charAt(rStr3);
                                        else if((""+getastr().charAt(x)).equalsIgnoreCase(" "))
                                            f = f + " ";
                                        else 
                                            f = f + "*";
                                    }
                                settstr(f);
                                letters[getG()].setBackground(Color.WHITE);
                                letters[getG()].setEnabled(false);
                                mystery_str.setVisible(false);
                                setMystery_str(gettstr());
                                determine_equality(hLetters[getG()].charAt(0));
                                if(hLetters[getG()].equalsIgnoreCase((""+getEquivalent()))){
                                }else {
                                   count++;
                                   if(count==4){
                                        pen.drawLine(120, 310, 120, 400);
                                        pen.drawLine(170, 310, 170, 400);
                                        pen.setColor(Color.RED);
                                        pen.setFont(font_style_4_WoL);
                                        pen.drawString("YOU LOSE!!!", 20, 470);
                                        for(int chris = 0; chris < letters.length; chris++){
                                        letters[chris].setEnabled(false);   
                                        }
                                   }  
                                       if(count == 1){
                                            pen.drawLine(260, 130, 90, 130);
                                            pen.drawLine(145, 140, 145, 130);
                                            pen.drawOval(100, 140, 90, 90);
                                            pen.setColor(Color.BLACK);
                                       }
                                       if(count == 2){
                                           pen.drawRect(105, 229, 80, 80);
                                       }
                                       if(count == 3){
                                           pen.drawLine(105, 229, 80, 320);
                                           pen.drawLine(185, 229, 220, 320);
                                   }
                                }
                                win = 0; 
                                for(int v = 0; v < getastr().length(); v++){
                                    if(gettstr().charAt(v)!='*')
                                        win++;
                                }
                                if(win == astr.length()){
                                    for(int ayco = 0; ayco < letters.length; ayco++){
                                    letters[ayco].setEnabled(false);   
                                    }
                                    pen.setColor(Color.BLUE);
                                    pen.setFont(font_style_4_LIFE);
                                    pen.drawString("YOU WIN!!!", 20, 470);
                                }
                            }                         
                        }
                    }
                });
            }
            format[2].add(letters[g]);
        }
        clue_str.setToolTipText(getastr());
        clue_str.setFont(font_style_4_clues);
        clue_str.setForeground(Color.BLACK);
        format[4].setLayout(new GridLayout(3,1));
        format[1].setBackground(Color.WHITE);
      
        setMysteryPanel(format[1]);
        setMystery_str(gettstr());
        format[3].add(clue_str, BorderLayout.SOUTH);
        format[4].add(hLevel_container);
        format[3].add(format[4], BorderLayout.WEST); 
        format[0].add(format[1]);
        format[0].add(format[3]);
     
        add(format[0]);
    }
    public void list_of_mystery_strings(){
        addNew("Anteater Scientific Name#Tamandua Tetradactyla");
        addNew("OOP founder.#James Gosling");
        addNew("Famous Poet#William Shakespeare");
        addNew("Renaissance Florentine Artist#Leonardo da Vinci");
        addNew("He created java.#James Gosling");
        addNew("Father of Modern Computer#Charles Babbage");
        addNew("Harry Potter#Daniel Radcliff");
        addNew("Uchiha Sasuke's Brother#Itachi Uchiha");
        addNew("Famous Soul Reaper#Ichigo Kurosaki");
        addNew("ill-behaved?#Mischievous");
    }
    public void addNew(String s){
        list.add(s);
    }
    public void setArgs(String args){
        arg = args;
    }
    public String getArg(){
        return arg;
    }
    public void determine_equality(char d){
        String s = d+"";
        s.toLowerCase();
        for(int i = 0; i < getastr().length(); i++){
            if(s.charAt(0) ==getastr().toLowerCase().charAt(i)){
                ch =  getastr().charAt(i);
                break;
            }
        }
    }
    public char getEquivalent(){
        return ch;
    }
    public void setG(int g){
        this.g = g;
    }
    public int getG(){
        return g;
    }
    public JLabel getMystery_str(){
        return mystery_str;
    }
    public String gettstr(){
        return tstr;
    }
    public String getmstr(){
        return mstr;
    }
    public String getastr(){
        return astr;
    }
    public void setastr(String s){
        astr = s;
    }
    public void settstr(String s){
        tstr = s;
    }    public void setmstr(String s){
        mstr = s;
    }
    public void setMystery_str(String s){
        mystery_str.setFont(font_style_4_mstr);
        mystery_str.setForeground(Color.BLACK);
        mystery_str.setToolTipText(getastr());
        getMysteryPanel().add(mystery_str, BorderLayout.SOUTH);  
        mystery_str.setText(s);
        mystery_str.setVisible(true);
    }
    public JPanel getMysteryPanel(){
        return mystery_Panel;
    }
    public void setMysteryPanel(JPanel p){
        mystery_Panel = p;
    }
    public void actionPerformed(ActionEvent ie){
        
    }
    public static void main(String[] args){
        JSecretPhrase1 n = new JSecretPhrase1();  
        n.setVisible(true);
    }
}
