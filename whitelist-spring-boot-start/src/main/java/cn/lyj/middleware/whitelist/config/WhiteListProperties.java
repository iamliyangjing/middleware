package cn.lyj.middleware.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-22 21:48
 **/
@ConfigurationProperties("lyj.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
