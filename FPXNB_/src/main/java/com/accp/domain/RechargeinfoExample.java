package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RechargeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRechargeinfoidIsNull() {
            addCriterion("rechargeInfoId is null");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidIsNotNull() {
            addCriterion("rechargeInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidEqualTo(Integer value) {
            addCriterion("rechargeInfoId =", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidNotEqualTo(Integer value) {
            addCriterion("rechargeInfoId <>", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidGreaterThan(Integer value) {
            addCriterion("rechargeInfoId >", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rechargeInfoId >=", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidLessThan(Integer value) {
            addCriterion("rechargeInfoId <", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("rechargeInfoId <=", value, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidIn(List<Integer> values) {
            addCriterion("rechargeInfoId in", values, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidNotIn(List<Integer> values) {
            addCriterion("rechargeInfoId not in", values, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidBetween(Integer value1, Integer value2) {
            addCriterion("rechargeInfoId between", value1, value2, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andRechargeinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("rechargeInfoId not between", value1, value2, "rechargeinfoid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weiXin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weiXin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weiXin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weiXin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weiXin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weiXin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weiXin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weiXin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weiXin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weiXin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weiXin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weiXin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weiXin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weiXin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Integer value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Integer value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Integer value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Integer value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Integer> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Integer> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Integer value1, Integer value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("recharge is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("recharge is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(Double value) {
            addCriterion("recharge =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(Double value) {
            addCriterion("recharge <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(Double value) {
            addCriterion("recharge >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(Double value) {
            addCriterion("recharge <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(Double value) {
            addCriterion("recharge <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<Double> values) {
            addCriterion("recharge in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<Double> values) {
            addCriterion("recharge not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(Double value1, Double value2) {
            addCriterion("recharge between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(Double value1, Double value2) {
            addCriterion("recharge not between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andPresentedIsNull() {
            addCriterion("presented is null");
            return (Criteria) this;
        }

        public Criteria andPresentedIsNotNull() {
            addCriterion("presented is not null");
            return (Criteria) this;
        }

        public Criteria andPresentedEqualTo(Double value) {
            addCriterion("presented =", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedNotEqualTo(Double value) {
            addCriterion("presented <>", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedGreaterThan(Double value) {
            addCriterion("presented >", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedGreaterThanOrEqualTo(Double value) {
            addCriterion("presented >=", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedLessThan(Double value) {
            addCriterion("presented <", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedLessThanOrEqualTo(Double value) {
            addCriterion("presented <=", value, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedIn(List<Double> values) {
            addCriterion("presented in", values, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedNotIn(List<Double> values) {
            addCriterion("presented not in", values, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedBetween(Double value1, Double value2) {
            addCriterion("presented between", value1, value2, "presented");
            return (Criteria) this;
        }

        public Criteria andPresentedNotBetween(Double value1, Double value2) {
            addCriterion("presented not between", value1, value2, "presented");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(Double value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(Double value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(Double value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(Double value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(Double value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(Double value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<Double> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<Double> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(Double value1, Double value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(Double value1, Double value2) {
            addCriterion("consume not between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}