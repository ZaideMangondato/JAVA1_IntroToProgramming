import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.File;
import javax.swing.UIManager;
public class Helloframe extends JFrame implements IterationListener
{
JPanel contentPane;
JLabel statusBar = new JLabel();
BorderLayout borderLayout1 = new
BorderLayout();
JPanel jPanel1 = new JPanel();
GridBagLayout gridBagLayout1 = new
GridBagLayout();
JLabel jLabel1 = new JLabel();
JButton jButtonRun = new JButton();
JLabel jLabelCurrentValue = new JLabel();
JProgressBar jProgressBar = new
JProgressBar(0,100);
JLabel jLabelProgress = new JLabel();
JLabel jLabel2 = new JLabel();
public Helloframe() {
contentPane = (JPanel) this.getContentPane();
contentPane.setLayout(borderLayout1);
this.setSize(new Dimension(400, 300));
this.setTitle("Hello GUI");
statusBar.setOpaque(true);
statusBar.setText("Ready");
jPanel1.setLayout(gridBagLayout1);
jLabel1.setText("Click here to start the process:");
jLabelCurrentValue.setText("Not Running");
jButtonRun.setText("Run");
jProgressBar.setValue(0);
jLabelProgress.setText((String)
(new Integer(jProgressBar.getValue())).toString()+"%");
jLabel2.setText("Current Value:");
contentPane.add(statusBar, BorderLayout.SOUTH);
contentPane.add(jPanel1, BorderLayout.CENTER);
jPanel1.add(jLabel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
jPanel1.add(jButtonRun, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
jPanel1.add(jProgressBar, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
jPanel1.add(jLabelProgress, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
jPanel1.add(jLabel2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
jPanel1.add(jLabelCurrentValue, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0
,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
}
}