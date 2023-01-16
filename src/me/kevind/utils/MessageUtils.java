package me.kevind.utils;

import org.bukkit.command.CommandSender;

public class MessageUtils {
    public static void message(CommandSender sender, String message) {
        sender.sendMessage(ColorUtils.color(message));
    }
    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(ColorUtils.color(message));
    }
}
