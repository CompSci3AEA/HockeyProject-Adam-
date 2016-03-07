import java.awt.FlowLayout;
import java.util.*;
import javax.swing.*;
public class Test {

	public static void main(String[] args) {
		
		int play = JOptionPane.showConfirmDialog(null,"HOCKEY TIME");
		if (play == 0){
			teamSelect();
		}
		else{
			JOptionPane.showConfirmDialog(null, "you have to play!!!");
		}
	}
public static void teamSelect(){
	JFrame frame = new JFrame("JFrame Example");
	 
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());
	        frame.add(new JLabel(new ImageIcon("LAkingsLOGO.png")));
	        JButton rightTeamOne = new JButton();
	        rightTeamOne.setText("<<<");
	        panel.add(rightTeamOne);
	        JButton leftTeamOne= new JButton();
	        leftTeamOne.setText(">>>");
	        panel.add(leftTeamOne);
	        frame.add(panel);
	        frame.setSize(700, 500);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

}
	
}
class Team{
	byte teamID;
	String[] Players;
	String teamName;
	Team(byte TID, String[] players, String TN){
		
	}
}