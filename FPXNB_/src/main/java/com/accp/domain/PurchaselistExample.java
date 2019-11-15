package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaselistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaselistExample() {
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

        public Criteria andPurchaselistidIsNull() {
            addCriterion("purchaselistid is null");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidIsNotNull() {
            addCriterion("purchaselistid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidEqualTo(Integer value) {
            addCriterion("purchaselistid =", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidNotEqualTo(Integer value) {
            addCriterion("purchaselistid <>", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidGreaterThan(Integer value) {
            addCriterion("purchaselistid >", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaselistid >=", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidLessThan(Integer value) {
            addCriterion("purchaselistid <", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaselistid <=", value, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidIn(List<Integer> values) {
            addCriterion("purchaselistid in", values, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidNotIn(List<Integer> values) {
            addCriterion("purchaselistid not in", values, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidBetween(Integer value1, Integer value2) {
            addCriterion("purchaselistid between", value1, value2, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andPurchaselistidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaselistid not between", value1, value2, "purchaselistid");
            return (Criteria) this;
        }

        public Criteria andDingleIsNull() {
            addCriterion("dingle is null");
            return (Criteria) this;
        }

        public Criteria andDingleIsNotNull() {
            addCriterion("dingle is not null");
            return (Criteria) this;
        }

        public Criteria andDingleEqualTo(String value) {
            addCriterion("dingle =", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleNotEqualTo(String value) {
            addCriterion("dingle <>", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleGreaterThan(String value) {
            addCriterion("dingle >", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleGreaterThanOrEqualTo(String value) {
            addCriterion("dingle >=", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleLessThan(String value) {
            addCriterion("dingle <", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleLessThanOrEqualTo(String value) {
            addCriterion("dingle <=", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleLike(String value) {
            addCriterion("dingle like", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleNotLike(String value) {
            addCriterion("dingle not like", value, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleIn(List<String> values) {
            addCriterion("dingle in", values, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleNotIn(List<String> values) {
            addCriterion("dingle not in", values, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleBetween(String value1, String value2) {
            addCriterion("dingle between", value1, value2, "dingle");
            return (Criteria) this;
        }

        public Criteria andDingleNotBetween(String value1, String value2) {
            addCriterion("dingle not between", value1, value2, "dingle");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliverydate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliverydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterionForJDBCDate("deliverydate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("deliverydate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterionForJDBCDate("deliverydate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliverydate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterionForJDBCDate("deliverydate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliverydate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterionForJDBCDate("deliverydate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("deliverydate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliverydate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliverydate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIsNull() {
            addCriterion("suppliersId is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIsNotNull() {
            addCriterion("suppliersId is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersidEqualTo(Integer value) {
            addCriterion("suppliersId =", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotEqualTo(Integer value) {
            addCriterion("suppliersId <>", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidGreaterThan(Integer value) {
            addCriterion("suppliersId >", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("suppliersId >=", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidLessThan(Integer value) {
            addCriterion("suppliersId <", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidLessThanOrEqualTo(Integer value) {
            addCriterion("suppliersId <=", value, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidIn(List<Integer> values) {
            addCriterion("suppliersId in", values, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotIn(List<Integer> values) {
            addCriterion("suppliersId not in", values, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidBetween(Integer value1, Integer value2) {
            addCriterion("suppliersId between", value1, value2, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andSuppliersidNotBetween(Integer value1, Integer value2) {
            addCriterion("suppliersId not between", value1, value2, "suppliersid");
            return (Criteria) this;
        }

        public Criteria andMonograghIsNull() {
            addCriterion("monogragh is null");
            return (Criteria) this;
        }

        public Criteria andMonograghIsNotNull() {
            addCriterion("monogragh is not null");
            return (Criteria) this;
        }

        public Criteria andMonograghEqualTo(String value) {
            addCriterion("monogragh =", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghNotEqualTo(String value) {
            addCriterion("monogragh <>", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghGreaterThan(String value) {
            addCriterion("monogragh >", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghGreaterThanOrEqualTo(String value) {
            addCriterion("monogragh >=", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghLessThan(String value) {
            addCriterion("monogragh <", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghLessThanOrEqualTo(String value) {
            addCriterion("monogragh <=", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghLike(String value) {
            addCriterion("monogragh like", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghNotLike(String value) {
            addCriterion("monogragh not like", value, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghIn(List<String> values) {
            addCriterion("monogragh in", values, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghNotIn(List<String> values) {
            addCriterion("monogragh not in", values, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghBetween(String value1, String value2) {
            addCriterion("monogragh between", value1, value2, "monogragh");
            return (Criteria) this;
        }

        public Criteria andMonograghNotBetween(String value1, String value2) {
            addCriterion("monogragh not between", value1, value2, "monogragh");
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

        public Criteria andSumIsNull() {
            addCriterion("SUM is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("SUM not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
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