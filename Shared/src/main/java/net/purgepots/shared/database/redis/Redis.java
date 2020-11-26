package net.purgepots.shared.database.redis;

import lombok.Getter;
import lombok.Setter;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */

@Getter @Setter
public class Redis {

    private String host;
    private int port;

    public Redis(String host, int port) {
        this.host = host;
        this.port = port;
    }
}
