package gui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MenuBar {
	private static final Font f1 = new Font("sans-serif", Font.PLAIN, 18);
	private static final Font f2 = new Font("sans-serif", Font.PLAIN, 18);

	public static JMenuBar create() {
		JMenuBar menuBar;
		JMenu menu, subMenu;
		JMenuItem menuItem;
		JSeparator seperator;
		KeyStroke keyStroke;

		// Create the menu bar.
		menuBar = new JMenuBar();
	    
		// add file menu
		menu = new JMenu("File");
		menu.setFont(f1);
		menu.setMnemonic(KeyEvent.VK_F);
		menu.setDisplayedMnemonicIndex(-1);
		menuBar.add(menu);

		// add new menu item
		menuItem = new JMenuItem("New");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed new");
			}
		});
		menu.add(menuItem);

		// add open menu item
		menuItem = new JMenuItem("Open...");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed open");
			}
		});
		menu.add(menuItem);

		// add recent submenu
		subMenu = new JMenu("Recent Files");
		subMenu.setFont(f2);
		menu.add(subMenu);
		
		//add last opened
		menuItem = new JMenuItem("Clear");
		menuItem.setFont(f2);
		subMenu.add(menuItem);

		// add close menu item
		menuItem = new JMenuItem("Close");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed close");
			}
		});
		menu.add(menuItem);

		// add seperator
		seperator = new JSeparator();
		menu.add(seperator);

		// add import sub menu
		subMenu = new JMenu("Import");
		subMenu.setFont(f2);
		menu.add(subMenu);

		// add export sub menu
		subMenu = new JMenu("Export");
		subMenu.setFont(f2);
		menu.add(subMenu);

		// add seperator
		seperator = new JSeparator();
		menu.add(seperator);

		// add exit menu item
		menuItem = new JMenuItem("Exit");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed exit");
			}
		});
		menu.add(menuItem);

		// add edit menu
		menu = new JMenu("Edit");		
		menu.setFont(f1);
		menu.setMnemonic(KeyEvent.VK_E);
		menu.setDisplayedMnemonicIndex(-1);
		menuBar.add(menu);

		// add undo menu item
		menuItem = new JMenuItem("Undo");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed undo");
			}
		});
		menu.add(menuItem);

		// add redo menu item
		menuItem = new JMenuItem("Redo");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed redo");
			}
		});
		menu.add(menuItem);

		// add seperator
		seperator = new JSeparator();
		menu.add(seperator);

		// add cut menu item
		menuItem = new JMenuItem("Cut");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed cut");
			}
		});
		menu.add(menuItem);

		// add delete menu item
		menuItem = new JMenuItem("Delete");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed delete");
			}
		});
		menu.add(menuItem);

		// add copy menu item
		menuItem = new JMenuItem("Copy");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed copy");
			}
		});
		menu.add(menuItem);

		// add paste menu item
		menuItem = new JMenuItem("Paste");
		menuItem.setFont(f2);
		keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK);
		menuItem.setAccelerator(keyStroke);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed paste");
			}
		});
		menu.add(menuItem);

		return menuBar;
	}
}
