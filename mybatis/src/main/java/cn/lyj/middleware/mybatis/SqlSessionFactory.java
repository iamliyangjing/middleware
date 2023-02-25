package cn.lyj.middleware.mybatis;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-25 00:08
 **/
public interface SqlSessionFactory {

    SqlSession openSession();

}