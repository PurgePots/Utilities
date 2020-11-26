package net.purgepots.shared.utils;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public class PurgeStringUtils {

    public static boolean startsWithLowercase(String string, String startsWith) { return string.toLowerCase().startsWith(startsWith.toLowerCase()); }
    public static boolean containsLowercase(String string, String contains) { return string.toLowerCase().contains(contains.toLowerCase()); }
}
