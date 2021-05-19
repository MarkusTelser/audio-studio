package gui;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Designer {
	private static Color foregroundColor = Color.BLACK;
	private static Color backgroundColor = Color.WHITE;
	private static Color selectedForegroundColor = Color.WHITE;
	private static Color selectedBackgroundColor = new Color(50, 50, 50);

	public static void initialize() {
		UIManager.put("MenuBar.foreground", foregroundColor);
		UIManager.put("MenuBar.background", backgroundColor);

		// menu settings
		UIManager.put("Menu.foreground", foregroundColor);
		UIManager.put("Menu.background", backgroundColor);
		UIManager.put("Menu.selectionForeground", selectedForegroundColor);
		UIManager.put("Menu.selectionBackground", selectedBackgroundColor);
		UIManager.put("Menu.opaque", true);

		// menu item settings
		UIManager.put("MenuItem.background", backgroundColor);
		UIManager.put("MenuItem.foreground", foregroundColor);
		UIManager.put("MenuItem.selectionForeground", selectedForegroundColor);
		UIManager.put("MenuItem.selectionBackground", selectedBackgroundColor);
		UIManager.put("MenuItem.acceleratorForeground", selectedForegroundColor);
		UIManager.put("MenuItem.acceleratorSelectionForeground", foregroundColor);
		UIManager.put("MenuItem.borderPainted", false);

		// pop up menu settings
		UIManager.put("PopupMenu.border", new LineBorder(Color.BLACK));
		UIManager.put("Separator.foreground", foregroundColor);
	}
}
