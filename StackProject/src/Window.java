import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JPanel implements ActionListener{
	
	private JTextField text;
	private JButton push;
	private FlowLayout flow;
	private Scanner in;
	
	public Window(){
		
		flow=new FlowLayout();
		
		text=new JTextField();
		text.setPreferredSize(new Dimension(300,50));
		
		push=new JButton();
		push.setPreferredSize(new Dimension(100,50));
		push.addActionListener(this);
		
		add(text,flow);
		add(push,flow);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		in=new Scanner(text.getText());
		in.useDelimiter(",*");
	}
	
}
