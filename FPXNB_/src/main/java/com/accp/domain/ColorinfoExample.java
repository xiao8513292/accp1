package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ColorinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorinfoExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("colorid is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorid is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("colorid =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("colorid <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("colorid >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("colorid >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("colorid <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("colorid <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("colorid in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("colorid not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("colorid between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("colorid not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColortypeIsNull() {
            addCriterion("colorType is null");
            return (Criteria) this;
        }

        public Criteria andColortypeIsNotNull() {
            addCriterion("colorType is not null");
            return (Criteria) this;
        }

        public Criteria andColortypeEqualTo(String value) {
            addCriterion("colorType =", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeNotEqualTo(String value) {
            addCriterion("colorType <>", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeGreaterThan(String value) {
            addCriterion("colorType >", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeGreaterThanOrEqualTo(String value) {
            addCriterion("colorType >=", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeLessThan(String value) {
            addCriterion("colorType <", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeLessThanOrEqualTo(String value) {
            addCriterion("colorType <=", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeLike(String value) {
            addCriterion("colorType like", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeNotLike(String value) {
            addCriterion("colorType not like", value, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeIn(List<String> values) {
            addCriterion("colorType in", values, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeNotIn(List<String> values) {
            addCriterion("colorType not in", values, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeBetween(String value1, String value2) {
            addCriterion("colorType between", value1, value2, "colortype");
            return (Criteria) this;
        }

        public Criteria andColortypeNotBetween(String value1, String value2) {
            addCriterion("colorType not between", value1, value2, "colortype");
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