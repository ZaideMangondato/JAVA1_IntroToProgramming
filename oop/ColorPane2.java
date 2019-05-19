package oop;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;

public class ColorPane2 extends JFrame implements ActionListener{
	public ColorPane2(){
		super("My Color Pane");
		initializeFrame();
		initializeListeners();
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		new ColorPane2();
	}
	
	JButton draw;
	JLabel lblColor[] = new JLabel[3];
	JTextField txtColor[] = new JTextField[3];
	JRadioButton shapes[] = new JRadioButton[2];
	
	private void initializeFrame(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
		draw = new JButton("Draw");
		lblColor[0] = new JLabel("Red");
		lblColor[1] = new JLabel("Green");
		lblColor[2] = new JLabel("Blue");
		for(int i = 0; i<3; i++) txtColor[i] = new JTextField("0",3);
		shapes[0] = new JRadioButton("Circle");
		shapes[1] = new JRadioButton("Square");
		ButtonGroup sGroup = new ButtonGroup();
		for(int i = 0; i<2; i++) sGroup.add(shapes[i]);
		for(int i = 0; i<3; i++){
			add(lblColor[i]);
			add(txtColor[i]);
		}
		for(int i = 0; i<2; i++) add(shapes[i]);
		add(draw);
	}
	
	private void initializeListeners(){
		draw.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
	}
	
	public void paint(Graphics gr){
		super.paint(gr);
		Color color = new Color(
			Integer.parseInt(txtColor[0].getText()),
			Integer.parseInt(txtColor[1].getText()),
			Integer.parseInt(txtColor[2].getText()));
		Shape shape;
		if(shapes[0].isSelected())
			shape = new Ellipse2D.Float(200f, 300f, 100f, 100f);
		else if(shapes[1].isSelected())
			shape = new Rectangle2D.Float(200f, 300f, 100f, 100f);
		else
			shape = new Line2D.Float(200f, 300f, 400f, 300f);
		
		Graphics2D g = (Graphics2D)gr;
		g.setColor(Color.yellow);
		g.fill(new Rectangle2D.Float(0f,0f,500f,400f));
		g.setColor(color);
		g.fill(shape);
		g.setColor(Color.black);
		g.draw(shape);
		repaintComp();
	}
	
	public void repaintComp(){
		draw.repaint();
		for(int i=0; i<3; i++){
			lblColor[i].repaint();
			txtColor[i].repaint();
			if(i < 2) shapes[i].repaint();
		}
	}
}