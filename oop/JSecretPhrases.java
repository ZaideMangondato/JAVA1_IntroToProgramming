

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

public class JSecretPhrases extends JFrame implements ActionListener{
    private String hLetters[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                                 "n","o","p","q","r","s","t","u","v","w","x","y","z",
                                 ".L.",".I.",".F.",".E."};
    LinkedList<String> list = new LinkedList<String>();
    private int random_Q, clue = 0, answer = 1, count = 0;
    protected String str, mstr, astr="", tstr="",arg = "";
    protected JLabel mystery_str = new JLabel("");
    private JLabel cm = new JLabel("The phrases your guessing are music genres");
    private char ch;
    private Font font_style_4_mstr = new Font("MONOSPACED",Font.BOLD,20),
                 font_style_4_letters = new Font("MONOSPACED",Font.TYPE1_FONT,20),
                 font_style_4_LIFE = new Font("MONOSPACED",Font.BOLD,16);
    private final JButton[] letters = new JButton[30];
    private JPanel mystery_Panel = new JPanel();
    private JPanel hLevel_container = new JPanel(new GridLayout(2,5,1,1));
    private int  g;
    JMenuBar hMenubar = new JMenuBar();
    JMenu hFile = new JMenu("File");
    JMenuItem newGame = new JMenuItem("New Game");
    public JSecretPhrases(){
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
        hMenubar.add(hFile);
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
    }
    public void display_Interface(){
        JPanel format[] = new JPanel[5];
        for(int i = 0; i < format.length; i++){
            if(i == 0)
                format[0] = new JPanel(new GridLayout(1,2,0,0));
            else if(i == 2 || i == 4 || i == 3){
                format[i] = new JPanel();
                format[i].setBackground(Color.CYAN);
            }
            else
                format[i] = new JPanel();
        }
        format[2].setLayout(new GridLayout(8,9,5,5));
        format[3].setLayout(new BorderLayout());
        format[3].add(format[2], BorderLayout.EAST);
        String[] CA = {};
        list_of_mystery_strings();
        random_Q = (int)(list.size()*Math.random());
        for(int i = 0; i < list.size(); i++){
            CA = list.get(random_Q).split("#");
            str = CA[clue]+"#"+CA[answer];
            setastr(CA[answer]);
        }
        String a;
        for(int i = 0; i < astr.length(); i++){
            a = ""+astr.charAt(i);
            if(a.equalsIgnoreCase(" "))
                tstr = tstr+" ";
            else
                tstr = tstr+"*";
        }
        settstr(tstr);
       JLabel clue_str = new JLabel(mstr);
        for(int g = 0; g < letters.length; g++){
            letters[g] = new JButton(hLetters[g].toUpperCase());
            letters[g].setEnabled(true);
            if(g>25){
                letters[g].setFont(font_style_4_LIFE);
                letters[g].setBackground(Color.PINK);
                letters[g].setVisible(false);
            }
            else{
                letters[g] = new JButton(hLetters[g].toUpperCase());
                letters[g] = new JButton(hLetters[g].toUpperCase());
                letters[g].setFont(font_style_4_letters);
                letters[g].setBackground(Color.GREEN);
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
                                        else if((""+getastr().charAt(x)).equalsIgnoreCase(" "))
                                            f = f + " ";
                                        else 
                                            f = f + "*";
                                    }
                                settstr(f);
                                System.out.println(gettstr()+" "+getG()+" "+hLetters[getG()]+" "+getEquivalent());
                                letters[getG()].setBackground(Color.WHITE);
                                letters[getG()].setEnabled(false);
                                mystery_str.setVisible(true);
                                setMystery_str(gettstr());
                                determine_equality(hLetters[getG()].charAt(0));
                                if(hLetters[getG()].equalsIgnoreCase((""+getEquivalent()))){
                                }else {
                                   count++;
                                   if(count==4){
                                        pen.drawLine(120, 310, 120, 440);
                                        pen.drawLine(170, 310, 170, 440);
                                        pen.setColor(Color.BLACK);
                                        pen.setFont(font_style_4_LIFE);
                                        pen.drawString("YOU LOSE!!!",100, 460);
                                        for(int c = 0; c < letters.length; c++){
                                        letters[c].setEnabled(false);   
                                        }
                                   }  
                                       if(count == 1){
                                            pen.drawLine(260, 90, 90, 90);
                                            pen.drawLine(145, 140, 145, 90);
                                            pen.drawLine(260, 440, 260, 90);
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
                                    for(int a = 0; a < letters.length; a++){
                                    letters[a].setEnabled(false);   
                                    }
                                    pen.setFont(font_style_4_LIFE);
                                    pen.drawString("YOU WIN!!!", 100, 460);
                                }
                            }                         
                        }
                    }
                });
            }
            format[2].add(letters[g]);
        }
        clue_str.setForeground(Color.RED);
        format[4].setLayout(new GridLayout(3,1));
        format[1].setBackground(Color.WHITE);
        
        setMysteryPanel(format[1]);
        setMystery_str(gettstr());
        format[4].add(clue_str);
        format[4].add(hLevel_container);
        format[3].add(format[4], BorderLayout.WEST); 
        format[0].add(format[1]);
        format[0].add(format[3]);
        add(format[0]);
    }
    public void list_of_mystery_strings(){
        addNew("#Metal");
        addNew("#Hardcore");
        addNew("#Pop");
        addNew("#RnB");
        addNew("#Jazz");
        addNew("#Country");
        addNew("#Alternative");
        addNew("#Hiphop");
        addNew("#Classic");
        addNew("#Grunge");
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
    }
    public void setMystery_str(String s){
        mystery_str.setFont(font_style_4_mstr);
        mystery_str.setForeground(Color.RED);  
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
        JSecretPhrases n = new JSecretPhrases();  
        n.setVisible(true);
    }
}