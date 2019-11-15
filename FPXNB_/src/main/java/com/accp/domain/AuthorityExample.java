package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(Integer value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(Integer value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(Integer value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(Integer value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<Integer> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<Integer> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("positionId is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionId is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionId =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionId <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionId >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionId >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionId <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionId <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionId in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionId not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionId between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionId not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNull() {
            addCriterion("infoId is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoId is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(Integer value) {
            addCriterion("infoId =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(Integer value) {
            addCriterion("infoId <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(Integer value) {
            addCriterion("infoId >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoId >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(Integer value) {
            addCriterion("infoId <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("infoId <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<Integer> values) {
            addCriterion("infoId in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<Integer> values) {
            addCriterion("infoId not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(Integer value1, Integer value2) {
            addCriterion("infoId between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("infoId not between", value1, value2, "infoid");
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