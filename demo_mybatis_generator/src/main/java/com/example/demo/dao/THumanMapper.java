package com.example.demo.dao;

import com.example.demo.entity.THuman;
import java.util.List;

public interface THumanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_human
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_human
     *
     * @mbg.generated
     */
    int insert(THuman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_human
     *
     * @mbg.generated
     */
    THuman selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_human
     *
     * @mbg.generated
     */
    List<THuman> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_human
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(THuman record);
}