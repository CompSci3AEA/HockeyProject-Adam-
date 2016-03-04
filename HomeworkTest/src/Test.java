import java.util.*;
import javax.swing.*;
public class Test {

	public static void main(String[] args) {
		
		int play = JOptionPane.showConfirmDialog(null,"HOCKEY TIME");
		if (play == 0){
			String teamnum1 = ("select team one");
			String teamnum2 = ("select team two");
			System.out.println("ya");
			teamSelect(teamnum1);
			teamSelect(teamnum2);
		}
		else{
			JOptionPane.showConfirmDialog(null, "you have to play!!!");
		}
	}
	public static void teamSelect(String teamnum){
		JList list = new JList(new String[] {"LA Kings", "Anahiem ducks", "Dallas Stars"});
		JOptionPane.showMessageDialog(
		  null, list, teamnum, JOptionPane.PLAIN_MESSAGE);
		System.out.println(Arrays.toString(list.getSelectedIndices()));
}
	public void JRadioButton(Icon icon,
            boolean selected) {
	}
}