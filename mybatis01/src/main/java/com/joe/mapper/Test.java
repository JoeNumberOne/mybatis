package com.joe.mapper;

import com.joe.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Joe
 * @create create on 2018-11-21 20:17
 * @desc
 **/
public class Test {
    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        List<Flower> flowers = session.selectList("a.b.selAll");
        for (Flower flower : flowers) {
            System.out.println(flower);
        }

        session.close();
    }
}
