import java.util.Scanner;

import javax.swing.JFrame;

public class Tester extends JFrame{
	/*public static void main(String[] args){
		StackLL stck = new StackLL( );
		System.out.println( stck.size( ) ); //0 
		stck.push(157.3);
		stck.push(22);
		stck.push(-18);
		double j = stck.pop( ); 
		System.out.println(j); // -18.0 
		System.out.println( stck.peek( ) ); //22.0 
		System.out.println( stck.pop( ) ); //22.0 
		System.out.println( stck.size( ) ); //1 
		stck.clear( );
		System.out.println( stck.size( ) ); //0
	}*/
	/*public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		StackLL stack = new StackLL();
		double a=0,b=0;
		while (!s.equals("q")){
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
				System.out.println("yes");
			}
			else{
				try{
					stack.push(Double.parseDouble(s));
				}
				catch(Exception e){
					e.printStackTrace();
				}	
			}
			s=in.nextLine();
		}
		in.close();
		System.out.println(stack.peek());
	}*/
	private Window win;
	public Tester(){
		win=new Window();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		add(win);
		setVisible(true);
	}
	public static void main(String[] args){
		new Tester();
	}
}
