package com.learn.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
  private Integer id;
  private String brandName;
  private String companyName;
  private Integer ordered;
  private String description;
  private Integer status;
}
