/*
Star.java
@Liam Connaughton
05 November 2018
More lines of text
*/
import javax.swing.JOptionPane;
public class Star{
	public static void main(String args[]){

	String word;
	int len;



	word = JOptionPane.showInputDialog(null, "What word do you want to pick? ");

	len= word.length();

	for(int i=0;i<len; i=i+1){

	System.out.print("*");
	}


	}






}