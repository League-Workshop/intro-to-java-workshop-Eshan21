package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		Random random = new Random();
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 500;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage;

		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) {

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			boolean pATK = false;
			int slashUses=10;
			int uppercutUses=5;
			while (pATK == false) {

				String player_ATK = JOptionPane.showInputDialog(null,
						"WHICH MOVE WILL YOU USE? \n OP1: SLASH    OP2: UPPERCUT  \n  OP3:POTIONS   OP4: RUN  \n  OP5: INFO", "P1 ATK", JOptionPane.PLAIN_MESSAGE);
				if (player_ATK.equalsIgnoreCase("slash")) {
					if(slashUses>0) {
					slashUses-=1;
					dragonDamage=random.nextInt(11);
					dragonHealth= dragonHealth - dragonDamage;
					if (dragonDamage >= 6 && dragonDamage < 10) {
						JOptionPane.showMessageDialog(null, "ATK <SLASH> WAS CRITICAL! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage > 0 && dragonDamage < 6) {
						JOptionPane.showMessageDialog(null, "ATK <SLASH> WAS SUCCESSFUL! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage == 0) {
						JOptionPane.showMessageDialog(null, "ATK <SLASH> HAS FAILED! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage == 10) {
						JOptionPane.showMessageDialog(null, "ATK <SLASH> WAS SUPER CRITICAL! \n DAMAGE: " + dragonDamage);
					}
					}else {
						JOptionPane.showMessageDialog(null, "ATK <SLASH> HAS RUN OUT OF USES!");
					}
				} else if (player_ATK.equalsIgnoreCase("uppercut")) {
					if(uppercutUses>0) {
					uppercutUses-=1;
					dragonDamage=random.nextInt(26);
					dragonHealth= dragonHealth - dragonDamage;
					if (dragonDamage >= 15 && dragonDamage < 24) {
						JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> WAS CRITICAL! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage > 0 && dragonDamage < 15) {
						JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> WAS SUCCESSFUL! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage == 0) {
						JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> HAS FAILED! \n DAMAGE: " + dragonDamage);
					}else if(dragonDamage == 25) {
						JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> WAS SUPER CRITICAL! \n DAMAGE: " + dragonDamage);
					}
					}else {
					JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> HAS RUN OUT OF USES!");
					}
				}else if (player_ATK.equalsIgnoreCase("info")) {
					JOptionPane.showMessageDialog(null, "ATK <SLASH> STATS: \n USES: " + slashUses + "/10 \n The <SLASH> ATK, a skill recieved \n at the start of the game dealing \n 0-10 DMG, +5 per level.", "ATK <SLASH> STATS", JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null, "ATK <UPPERCUT> STATS: \n USES: " + uppercutUses + "/5 \n The <UPPERCUT> ATK, a skill recieved \n at the start of the game dealing \n 0-25 DMG, +5 per level.", "ATK <UPPERCUT> STATS", JOptionPane.PLAIN_MESSAGE);
				}
			}

			// 11. Find a random number between 0 and 35 and store it in playerDamage

			// 12. Subtract this number from the player's health

			// 13. If the user's health is less than or equal to 0

			// -- Tell the user that they lost

			// 14. Else if the dragon's health is less than or equal to 0

			// -- Tell the user that the dragon is dead and they took a ton of gold!

			// 15. Else

			// -- Pop up a message that tells the their current health and the dragon's
			// currently health (Bonus: Also display the amount of health that was lost for
			// each player this round)

		}
	}
}
