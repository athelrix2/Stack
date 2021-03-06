import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JPanel implements ActionListener{
	
	private JTextField text;
	private JButton push;
	private FlowLayout flow;
	private Scanner in;
	private StackLL stack;
	private JLabel lab;
	
	public Window(){
		//All your GUI components
		
		lab=new JLabel("answer");
		
		stack=new StackLL();
		
		flow=new FlowLayout();
		
		text=new JTextField();
		text.setPreferredSize(new Dimension(300,50));
		
		push=new JButton("enter");
		push.setPreferredSize(new Dimension(100,50));
		push.addActionListener(this);
		
		add(text,flow);
		add(push,flow);
		add(lab,flow);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		in=new Scanner(text.getText());
		in.useDelimiter(",");
		String s;
		Double a,b;
		
		//Logic for rpn math using a stack
		while(in.hasNext()){
			
			//get the next number or symbol
			s=in.next();
			
			//Process the number || symbol
			if(s.equals("/")){
				b=stack.pop();
				a=stack.pop();
				stack.push(a/b);
			}
			else if(s.equals("*")){
				b=stack.pop();
				a=stack.pop();
				stack.push(a*b);
			}
			else if(s.equals("-")){
				b=stack.pop();
				a=stack.pop();
				stack.push(a-b);
			}
			else if(s.equals("+")){
				b=stack.pop();
				a=stack.pop();
				stack.push(a+b);
			}
			else{
				try{
					stack.push(Double.parseDouble(s));
				}
				catch(Exception f){
					f.printStackTrace();
				}	
			}
		}
		//close the scanner to keep the program for sucking up system resources
		in.close();
		//print answer
		lab.setText("Answer: "+Double.toString(stack.pop()));
	}
}
