package com.learn.javaweb.mapper;

import com.learn.javaweb.pojo.Brand;
import java.util.List;

public interface BrandMapper {
  List<Brand> selectAll();

  Brand selectById(int id);

  void add(Brand brand);

  void update(Brand brand);
}
