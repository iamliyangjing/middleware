package cn.lyj.middleware.mybatis;

import java.sql.Connection;
import java.util.Map;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-25 00:06
 **/
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
