import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOuput;
	private int theNumber;
	
	//Guessing digit and report to user 
	public void checkGuess() {
		String guessText = txtGuess.getText();
		message = "";
	int guess = Integer.parseInt(guessText);	
	if (guess < theNumber)
		message = guess + "is too low. Try again!";
	else if (guess > theNumber)
		message = guess + "is too high. Trey again!";
	else
		message = guess + "is correct. You win!";
	lblOuput.setText(message);
	}//end of metod checkGuess
	
	//start new Game
	public void newGame() {
		
		
	}//end of metod newGame
	
	
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Roman`s Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEnabled(false);
		editorPane.setBounds(0, 257, 450, 15);
		getContentPane().add(editorPane);
		
		JLabel lblRomansGuesiiongGame = new JLabel("   Roman`s Guessing Game");
		lblRomansGuesiiongGame.setFont(new Font("Ubuntu", Font.BOLD, 15));
		lblRomansGuesiiongGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblRomansGuesiiongGame.setBounds(0, 39, 450, 20);
		getContentPane().add(lblRomansGuesiiongGame);
		
		JLabel lblNewLabel = new JLabel("  Guess a number between 1 and 100:");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(86, 98, 279, 15);
		getContentPane().add(lblNewLabel);
		
		txtGuess = new JTextField();
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(357, 92, 47, 27);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.setFont(new Font("Dialog", Font.BOLD, 15));
		btnGuess.setBounds(167, 152, 117, 25);
		getContentPane().add(btnGuess);
		
		JLabel lblOutput = new JLabel(" Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(0, 216, 450, 15);
		getContentPane().add(lblOutput);
		
			}
		
	private static final long serialVersionUID = 1L;
	private String message;
	

	public static void main(String[] args) {
		// Auto-generated method stub

	}


	public JLabel getLblOuput() {
		return lblOuput;
	}


	public void setLblOuput(JLabel lblOuput) {
		this.lblOuput = lblOuput;
	}


	public int getTheNumber() {
		return theNumber;
	}


	public void setTheNumber(int theNumber) {
		this.theNumber = theNumber;
	}
}
