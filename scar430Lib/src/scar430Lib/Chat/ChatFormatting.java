package scar430Lib.Chat;

import org.bukkit.ChatColor;

public class ChatFormatting {
	
	public static String format(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	public static String greentext(String message, String colorcode) {
		
		char[] toFormat = message.toCharArray();
		
		for (int i = 0; i < toFormat.length; i++) {
			if(toFormat[i] == '@') {
				//toFormat.
			}
			else {
				
			}
		}
		return null;
	}
}
