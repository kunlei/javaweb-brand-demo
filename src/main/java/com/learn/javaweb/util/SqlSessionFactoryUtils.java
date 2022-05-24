package com.learn.javaweb.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
  private static SqlSessionFactory sqlSessionFactory;
  static {
    String resource = "mybatis-config.xml";
    InputStream inputStream;
    try {
      inputStream = Resources.getResourceAsStream(resource);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }
  public static SqlSessionFactory getSqlSessionFactory() {
    return sqlSessionFactory;
  }
}
