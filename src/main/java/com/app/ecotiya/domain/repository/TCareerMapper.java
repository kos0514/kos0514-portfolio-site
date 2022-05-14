package com.app.ecotiya.domain.repository;

import com.app.ecotiya.domain.entity.TCareer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TCareerMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  int deleteByPrimaryKey(Long careerId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  int insert(TCareer row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  int insertSelective(TCareer row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  TCareer selectByPrimaryKey(Long careerId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(TCareer row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_career
   *
   * @mbg.generated
   */
  int updateByPrimaryKey(TCareer row);
}
