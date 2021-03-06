package com.qrcodemall.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserBill implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.user_bill_id
     *
     * @mbg.generated
     */
    private Integer userBillId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.user_bill_money
     *
     * @mbg.generated
     */
    private BigDecimal userBillMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.user_bill_direction
     *
     * @mbg.generated
     */
    private Integer userBillDirection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.user_bill_remark
     *
     * @mbg.generated
     */
    private String userBillRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.gmt_created
     *
     * @mbg.generated
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_bill.is_deleted
     *
     * @mbg.generated
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_bill
     *
     * @mbg.generated
     */
    private static final Long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.user_bill_id
     *
     * @return the value of user_bill.user_bill_id
     *
     * @mbg.generated
     */
    public Integer getUserBillId() {
        return userBillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.user_bill_id
     *
     * @param userBillId the value for user_bill.user_bill_id
     *
     * @mbg.generated
     */
    public void setUserBillId(Integer userBillId) {
        this.userBillId = userBillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.user_id
     *
     * @return the value of user_bill.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.user_id
     *
     * @param userId the value for user_bill.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.user_bill_money
     *
     * @return the value of user_bill.user_bill_money
     *
     * @mbg.generated
     */
    public BigDecimal getUserBillMoney() {
        return userBillMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.user_bill_money
     *
     * @param userBillMoney the value for user_bill.user_bill_money
     *
     * @mbg.generated
     */
    public void setUserBillMoney(BigDecimal userBillMoney) {
        this.userBillMoney = userBillMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.user_bill_direction
     *
     * @return the value of user_bill.user_bill_direction
     *
     * @mbg.generated
     */
    public Integer getUserBillDirection() {
        return userBillDirection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.user_bill_direction
     *
     * @param userBillDirection the value for user_bill.user_bill_direction
     *
     * @mbg.generated
     */
    public void setUserBillDirection(Integer userBillDirection) {
        this.userBillDirection = userBillDirection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.user_bill_remark
     *
     * @return the value of user_bill.user_bill_remark
     *
     * @mbg.generated
     */
    public String getUserBillRemark() {
        return userBillRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.user_bill_remark
     *
     * @param userBillRemark the value for user_bill.user_bill_remark
     *
     * @mbg.generated
     */
    public void setUserBillRemark(String userBillRemark) {
        this.userBillRemark = userBillRemark == null ? null : userBillRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.gmt_created
     *
     * @return the value of user_bill.gmt_created
     *
     * @mbg.generated
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.gmt_created
     *
     * @param gmtCreated the value for user_bill.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.gmt_modified
     *
     * @return the value of user_bill.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.gmt_modified
     *
     * @param gmtModified the value for user_bill.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_bill.is_deleted
     *
     * @return the value of user_bill.is_deleted
     *
     * @mbg.generated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_bill.is_deleted
     *
     * @param isDeleted the value for user_bill.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bill
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userBillId=").append(userBillId);
        sb.append(", userId=").append(userId);
        sb.append(", userBillMoney=").append(userBillMoney);
        sb.append(", userBillDirection=").append(userBillDirection);
        sb.append(", userBillRemark=").append(userBillRemark);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}