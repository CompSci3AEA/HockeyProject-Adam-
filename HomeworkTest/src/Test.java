import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.*;
public class Test {

	public static void main(String[] args) throws IOException {
		String[] KPlayers = {"Dustin Brown","Anze Kopitar","Milan Lucic","Jonatan Quick",};
		Team kings = new Team(1, KPlayers, "Kings");
		int play = JOptionPane.showConfirmDialog(null,"HOCKEY TIME");
		if (play == 0){
			teamSelect(kings);
		}
		else{
			JOptionPane.showConfirmDialog(null, "you have to play!!!");
		}
	}
public static void teamSelect(Team kings) throws IOException{
			Integer CID = 1;
	JFrame frame = new JFrame("Hockey Shootout");
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());
	        JButton leftTeamOne = new JButton();
	        leftTeamOne.setText("<<<");
	        panel.add(leftTeamOne);
	        JLabel team1= new JLabel();
	        team1 .setText(CID.toString());
	        panel.add(team1);
	        JButton rightTeamOne = new JButton();
	        rightTeamOne.setText(">>>");
	        panel.add(rightTeamOne);
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
	Team(int i, String[] players, String TN){
		this.teamID = (byte) i;
		this.Players = players;
		this.teamName = TN;
	}
}