package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartExample() {
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

        public Criteria andShoppingcartidIsNull() {
            addCriterion("shoppingCartId is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidIsNotNull() {
            addCriterion("shoppingCartId is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidEqualTo(Integer value) {
            addCriterion("shoppingCartId =", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidNotEqualTo(Integer value) {
            addCriterion("shoppingCartId <>", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidGreaterThan(Integer value) {
            addCriterion("shoppingCartId >", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingCartId >=", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidLessThan(Integer value) {
            addCriterion("shoppingCartId <", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingCartId <=", value, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidIn(List<Integer> values) {
            addCriterion("shoppingCartId in", values, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidNotIn(List<Integer> values) {
            addCriterion("shoppingCartId not in", values, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidBetween(Integer value1, Integer value2) {
            addCriterion("shoppingCartId between", value1, value2, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingCartId not between", value1, value2, "shoppingcartid");
            return (Criteria) this;
        }

        public Criteria andGoodstotalIsNull() {
            addCriterion("goodsTotal is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalIsNotNull() {
            addCriterion("goodsTotal is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalEqualTo(Integer value) {
            addCriterion("goodsTotal =", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalNotEqualTo(Integer value) {
            addCriterion("goodsTotal <>", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalGreaterThan(Integer value) {
            addCriterion("goodsTotal >", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsTotal >=", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalLessThan(Integer value) {
            addCriterion("goodsTotal <", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalLessThanOrEqualTo(Integer value) {
            addCriterion("goodsTotal <=", value, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalIn(List<Integer> values) {
            addCriterion("goodsTotal in", values, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalNotIn(List<Integer> values) {
            addCriterion("goodsTotal not in", values, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalBetween(Integer value1, Integer value2) {
            addCriterion("goodsTotal between", value1, value2, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsTotal not between", value1, value2, "goodstotal");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyIsNull() {
            addCriterion("goodsTotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyIsNotNull() {
            addCriterion("goodsTotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyEqualTo(Double value) {
            addCriterion("goodsTotalMoney =", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyNotEqualTo(Double value) {
            addCriterion("goodsTotalMoney <>", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyGreaterThan(Double value) {
            addCriterion("goodsTotalMoney >", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsTotalMoney >=", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyLessThan(Double value) {
            addCriterion("goodsTotalMoney <", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("goodsTotalMoney <=", value, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyIn(List<Double> values) {
            addCriterion("goodsTotalMoney in", values, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyNotIn(List<Double> values) {
            addCriterion("goodsTotalMoney not in", values, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyBetween(Double value1, Double value2) {
            addCriterion("goodsTotalMoney between", value1, value2, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andGoodstotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("goodsTotalMoney not between", value1, value2, "goodstotalmoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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