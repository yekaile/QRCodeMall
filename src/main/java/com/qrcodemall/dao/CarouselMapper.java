package com.qrcodemall.dao;

import com.qrcodemall.entity.Carousel;
import com.qrcodemall.entity.CarouselExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouselMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    long countByExample(CarouselExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int deleteByExample(CarouselExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer carouselId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int insert(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int insertSelective(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    List<Carousel> selectByExample(CarouselExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    Carousel selectByPrimaryKey(Integer carouselId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Carousel record, @Param("example") CarouselExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Carousel record);
}