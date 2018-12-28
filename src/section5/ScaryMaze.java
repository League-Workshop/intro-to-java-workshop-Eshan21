package section5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	private static final long serialVersionUID = 762005447276044589L;
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;
	Robot robo = new Robot();
	AudioClip backgroundMusic = JApplet.newAudioClip(getClass().getResource("route255.wav"));
	

	ScaryMaze() throws Exception {
		//1. Use this online tool to make a maze image and drop it into your section5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("Maze.jpg"));
		
		//2. Change the line of code above so that it matches your maze's file name
		
		//3. Set the mouse pointer to the start of your maze using:
		robo.mouseMove(45, 45);
		backgroundMusic.play();
		
		//4. Add a mouse motion listener using:
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//5. Print the mouseColor variable 
		System.out.println(mouseX + "   " + mouseY + "   " + mouseColor);
		if (mouseX < 10 || mouseX > 780 || mouseY < 10 || mouseY > 580) robo.mouseMove(45, 45);
		
		
		int backgroundColor = -1;
		if (mouseColor == backgroundColor) scare();
		if (mouseColor == -65310) JOptionPane.showMessageDialog(null, "You WON!!! \n \n \n NOW GET LOST!");
		if (mouseColor == -16711689) robo.mouseMove(35, 580);
		if (mouseColor == -16646399) robo.mouseMove(20, 75);
		if (mouseColor == -25600) robo.mouseMove(785, 240);
		
		

		
	}

	private void scare() {
		System.out.println("BOO!");
		//9. Find a scary sound and put it in the section5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		
		//10. Use the code below to load your sound.  Change the file name to match the name of your sound file.  
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("standardScarySound.wav"));
		backgroundMusic.stop();
		//11. Play the scary sound. Hint: type "sound" and then a period.		
		sound.loop();
		//12. Drop an image into your section5 package, and use the showScaryImage method to scare your victim!
		showScaryImage("standardScaryPicture.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



