/*
Reverse.java
@Liam Connaughton
05 November 2018
*/
import javax.swing.JOptionPane;
public class Reverse{
	public static void main(String args[]){

	String word;
	int len;



	word = JOptionPane.showInputDialog(null, "What word do you want to pick? ");

	len= word.length();

	for(int i=len-1;i>=0; i=i-1){

	JOptionPane.showMessageDialog(null, word.charAt(i));
	}
	JOptionPane.showMessageDialog(null, "So the word is  " +word);

	}






}