import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class swing extends JFrame {

  public swing() {

    Toolkit tk = Toolkit.getDefaultToolkit();

    Dimension dim = tk.getScreenSize();

    this.setSize(300, 300);

    //int xPos = (dim.width / 2 - this.getWidth() / 2); //- (this.getWidth() / 2);
    //int yPos = (dim.height / 2 - this.getHeight() / 2); //- (this.getHeight() / 2);

    //same thing
    this.setLocation(xPos, yPos);
    this.setLocationRelativeTo(null);
    this.setResizable(true);
    this.setTitle("My first frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //add a label to the panel
    JPanel thePanel = new JPanel();
    //add a label
    JLabel label1 = new JLabel("what the fuck");

    label1.setText("new text");
    label1.setToolTipText("this is a new text");label1.setToolTipText("this is a new text");

    JButton button1 = new JButton("Send");
    //button1.setBorderPainted(false);
    button1.setText("new button");
    button1.setToolTipText("it's a button");

    JTextField textField = new JTextField("type here", 15);
    textField.setColumns(10);
    textField.setText("Type again");

    JTextArea textArea = new JTextArea(15, 20);
    textArea.setWrapStyleWord(true);

    textArea.setText(
        "the lord of murder shall perish but in his footsteps he shall spawn a score of mortal progeny\n");
    textArea.setLineWrap(true);
    JScrollPane scrollbar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    int numOfLines = textArea.getLineCount();
    textArea.append("number of lines: " + numOfLines);

    thePanel.add(textArea);
    thePanel.add(scrollbar);
    thePanel.add(button1);
    thePanel.add(label1);
    thePanel.add(textField);

    //add jpanel to the frame
    this.add(thePanel);

    //setvisible needs to be at the end
    this.setVisible(true);
  }

  public static void main(String[] args) {
    //new swing();

    double b = Math.PI;
    System.out.println(b);
  }
}
