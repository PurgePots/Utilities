package net.purgepots.shared.system;

import lombok.Getter;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public enum SystemType {
    BUNGEECORD("BungeeCord"), BUKKIT("Bukkit"), UNKNOWN("Custom Application");

    @Getter String formattedName;
    SystemType(String formattedName) {
        this.formattedName = formattedName;
    }
}
