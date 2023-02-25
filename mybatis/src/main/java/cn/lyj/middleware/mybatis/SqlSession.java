package cn.lyj.middleware.mybatis;

import java.util.List;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-25 00:08
 **/
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement,Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
