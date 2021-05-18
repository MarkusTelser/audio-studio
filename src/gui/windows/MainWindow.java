package gui.windows;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

import gui.Designer;
import gui.components.MenuBar;

public class MainWindow extends JFrame{
	private final int WIDTH = 1100;
	private final int HEIGHT = 800;
	
	public MainWindow() {
		Dimension dimension =  Toolkit.getDefaultToolkit().getScreenSize();
		int center_x = (dimension.width / 2) - (WIDTH / 2); 
		int center_y = (dimension.height / 2) - (HEIGHT / 2);
		
		Image img = Toolkit.getDefaultToolkit().getImage("resources/icon.png");
		this.setIconImage(img);
		
		Designer.initialize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("AudioStudio");
		this.setBounds(center_x, center_y, WIDTH, HEIGHT);
		this.setLayout(null);
		
		//create menubar
		JMenuBar menuBar = MenuBar.create();
		this.setJMenuBar(menuBar);
		
		//create toolbar
		
		//create view panels
		
		this.setVisible(true);
	}
}
