package com.learn.javaweb.service;

import com.learn.javaweb.mapper.BrandMapper;
import com.learn.javaweb.pojo.Brand;
import com.learn.javaweb.util.SqlSessionFactoryUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BrandService {
  SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

  public List<Brand> selectAll() {
    // acquire sql session
    SqlSession sqlSession = sqlSessionFactory.openSession();

    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    List<Brand> brands = brandMapper.selectAll();

    sqlSession.close();

    return brands;
  }

  public Brand selectById(int id) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    Brand brand = brandMapper.selectById(id);

    sqlSession.close();

    return brand;
  }

  public void add(Brand brand) {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    brandMapper.add(brand);

    sqlSession.commit();

    sqlSession.close();
  }

  public void update(Brand brand) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

    mapper.update(brand);
    sqlSession.commit();

    sqlSession.close();
  }
}
