package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipgradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipgradeExample() {
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

        public Criteria andVipgradeidIsNull() {
            addCriterion("vipGradeid is null");
            return (Criteria) this;
        }

        public Criteria andVipgradeidIsNotNull() {
            addCriterion("vipGradeid is not null");
            return (Criteria) this;
        }

        public Criteria andVipgradeidEqualTo(Integer value) {
            addCriterion("vipGradeid =", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidNotEqualTo(Integer value) {
            addCriterion("vipGradeid <>", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidGreaterThan(Integer value) {
            addCriterion("vipGradeid >", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipGradeid >=", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidLessThan(Integer value) {
            addCriterion("vipGradeid <", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidLessThanOrEqualTo(Integer value) {
            addCriterion("vipGradeid <=", value, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidIn(List<Integer> values) {
            addCriterion("vipGradeid in", values, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidNotIn(List<Integer> values) {
            addCriterion("vipGradeid not in", values, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidBetween(Integer value1, Integer value2) {
            addCriterion("vipGradeid between", value1, value2, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipgradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipGradeid not between", value1, value2, "vipgradeid");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNull() {
            addCriterion("vipname is null");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNotNull() {
            addCriterion("vipname is not null");
            return (Criteria) this;
        }

        public Criteria andVipnameEqualTo(String value) {
            addCriterion("vipname =", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotEqualTo(String value) {
            addCriterion("vipname <>", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThan(String value) {
            addCriterion("vipname >", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThanOrEqualTo(String value) {
            addCriterion("vipname >=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThan(String value) {
            addCriterion("vipname <", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThanOrEqualTo(String value) {
            addCriterion("vipname <=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLike(String value) {
            addCriterion("vipname like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotLike(String value) {
            addCriterion("vipname not like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameIn(List<String> values) {
            addCriterion("vipname in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotIn(List<String> values) {
            addCriterion("vipname not in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameBetween(String value1, String value2) {
            addCriterion("vipname between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotBetween(String value1, String value2) {
            addCriterion("vipname not between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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