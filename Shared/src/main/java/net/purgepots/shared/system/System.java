package net.purgepots.shared.system;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public class System {

    public System() {

    }

    public SystemType getSystemType() {
        try {
            Class.forName("net.md_5.bungee.BungeeCord");
            return SystemType.BUNGEECORD;
        } catch (ClassNotFoundException ignored) {}
        try {
            Class.forName("org.bukkit.Bukkit");
            return SystemType.BUKKIT;
        } catch (ClassNotFoundException ignored) {}
        return SystemType.UNKNOWN;
    }

}
