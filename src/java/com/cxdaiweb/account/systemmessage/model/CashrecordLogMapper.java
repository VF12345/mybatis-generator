package com.cxdaiweb.account.systemmessage.model;

import com.cxdaiweb.account.systemmessage.model.CashrecordLog;
import com.cxdaiweb.account.systemmessage.model.CashrecordLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashrecordLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int countByExample(CashrecordLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int deleteByExample(CashrecordLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int insert(CashrecordLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int insertSelective(CashrecordLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    List<CashrecordLog> selectByExample(CashrecordLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    CashrecordLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") CashrecordLog record, @Param("example") CashrecordLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int updateByExample(@Param("record") CashrecordLog record, @Param("example") CashrecordLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int updateByPrimaryKeySelective(CashrecordLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cashrecord_log
     *
     * @mbggenerated Mon Feb 29 10:04:59 CST 2016
     */
    int updateByPrimaryKey(CashrecordLog record);
}