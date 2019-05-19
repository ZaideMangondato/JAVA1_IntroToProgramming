package oop;

     import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    public class HedgeYourBet1 extends JFrame implements ActionListener
    {
    //Class Main
    JLabel wcL, dirL;
    JButton playB, exit1B;
    //Class Quiz
    JPanel mainP, q1P, q2P, q3P, q4P, q5P, buttonP;
    JLabel q1L, q2L, q3L, q4L, q5L;
    JCheckBox q11, q12, q13, q21, q22, q23, q31, q32, q33, q41, q42, q43, q51, q52, q53;
    private int qnum1 = 0;
    JButton submitB, exit2B;
    QButton qb = new QButton();
    public HedgeYourBet1()
    {
    super("Quiz Game");
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
    public static void main(String[]args)
    {
    HedgeYourBetmy test = new HedgeYourBetmy();
    }
    class Quiz extends JFrame implements ItemListener
    {
    public Quiz()
    {
    super("Quiz Game");
    setVisible(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,800);
    setLocation(500,280);
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
    q1L = new JLabel("What is the first name of the founder of \"www.FACEBOOK.com\"?");
    q2L = new JLabel("What is the first name of the founder of \"APPLE Inc.\"?");
    q3L = new JLabel("What is the latest i-series processor of INTEL?");
    q4L = new JLabel("What beverage does the cup in the logo of JAVA contains?");
    q5L = new JLabel("What is Adrian's nickname?");
    //JCHECKBOXES
    //question 1
    q11 = new JCheckBox("Marc",false);
    q12 = new JCheckBox("Mark",false);
    q13 = new JCheckBox("Marco",false);
    //
    q21 = new JCheckBox("Steve",false);
    q22 = new JCheckBox("Steven",false);
    q23 = new JCheckBox("Steff",false);
    //
    q31 = new JCheckBox("i3",false);
    q32 = new JCheckBox("i9",false);
    q33 = new JCheckBox("i7",false);
    //
    q41 = new JCheckBox("Buko Juice",false);
    q42 = new JCheckBox("Kopiko",false);
    q43 = new JCheckBox("Palamig",false);
    //
    q51 = new JCheckBox("Aids",false);
    q52 = new JCheckBox("Eds",false);
    q53 = new JCheckBox("Aidz",false);
    //JBUTTON
    submitB = new JButton("SUBMIT");
    exit2B = new JButton("EXIT");
    //***********************
    //**ADDING ON THE FRAME**
    //***********************
    add(mainP);
    mainP.add(q1P);
    q1P.add(q1L);
    q1P.add(q11);
    q1P.add(q12);
    q1P.add(q13);
    mainP.add(q2P);
    q2P.add(q2L);
    q2P.add(q21);
    q2P.add(q22);
    q2P.add(q23);
    mainP.add(q3P);
    q3P.add(q3L);
    q3P.add(q31);
    q3P.add(q32);
    q3P.add(q33);
    mainP.add(q4P);
    q4P.add(q4L);
    q4P.add(q41);
    q4P.add(q42);
    q4P.add(q43);
    mainP.add(q5P);
    q5P.add(q5L);
    q5P.add(q51);
    q5P.add(q52);
    q5P.add(q53);
    mainP.add(buttonP);
    buttonP.add(submitB);
    buttonP.add(exit2B);
    //Adding Listener
    //for JCheckboxes
    q11.addItemListener(this);
    //for JButtons
    submitB.addActionListener(qb);
    exit2B.addActionListener(qb);
    }
    public void itemStateChanged(ItemEvent ie)
    {
    Object o = ie.getSource();
    if(o == q11)
    {
    int select = ie.getStateChange();
    if(select == ie.SELECTED)
    {
    qnum1 += 1;
    }
    else
    {
    qnum1 = qnum1;
    }
    }
    }
    }
    class QButton implements ActionListener
    {
    public void actionPerformed(ActionEvent ae)
    {
    Object o = ae.getSource();
    if(o == submitB)
    {
    JOptionPane.showMessageDialog(null,""+qnum1);
    }
    if(o == exit2B)
    System.exit(0);
    }
    }
    }