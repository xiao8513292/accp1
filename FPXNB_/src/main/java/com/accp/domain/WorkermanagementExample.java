package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkermanagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkermanagementExample() {
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

        public Criteria andWorkeridIsNull() {
            addCriterion("workerId is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("workerId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(Integer value) {
            addCriterion("workerId =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(Integer value) {
            addCriterion("workerId <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(Integer value) {
            addCriterion("workerId >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerId >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(Integer value) {
            addCriterion("workerId <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(Integer value) {
            addCriterion("workerId <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<Integer> values) {
            addCriterion("workerId in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<Integer> values) {
            addCriterion("workerId not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(Integer value1, Integer value2) {
            addCriterion("workerId between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(Integer value1, Integer value2) {
            addCriterion("workerId not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeId =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeId <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeId >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeId >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeId <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeId <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeId in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeId not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeId between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeId not between", value1, value2, "storeid");
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

        public Criteria andWorkernumberIsNull() {
            addCriterion("workerNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkernumberIsNotNull() {
            addCriterion("workerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernumberEqualTo(Integer value) {
            addCriterion("workerNumber =", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberNotEqualTo(Integer value) {
            addCriterion("workerNumber <>", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberGreaterThan(Integer value) {
            addCriterion("workerNumber >", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerNumber >=", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberLessThan(Integer value) {
            addCriterion("workerNumber <", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberLessThanOrEqualTo(Integer value) {
            addCriterion("workerNumber <=", value, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberIn(List<Integer> values) {
            addCriterion("workerNumber in", values, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberNotIn(List<Integer> values) {
            addCriterion("workerNumber not in", values, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberBetween(Integer value1, Integer value2) {
            addCriterion("workerNumber between", value1, value2, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workerNumber not between", value1, value2, "workernumber");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("workerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("workerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("workerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("workerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("workerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("workerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("workerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("workerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("workerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("workerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("workerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("workerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("workerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("workerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIsNull() {
            addCriterion("workerPwd is null");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIsNotNull() {
            addCriterion("workerPwd is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdEqualTo(String value) {
            addCriterion("workerPwd =", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotEqualTo(String value) {
            addCriterion("workerPwd <>", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdGreaterThan(String value) {
            addCriterion("workerPwd >", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("workerPwd >=", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLessThan(String value) {
            addCriterion("workerPwd <", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLessThanOrEqualTo(String value) {
            addCriterion("workerPwd <=", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLike(String value) {
            addCriterion("workerPwd like", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotLike(String value) {
            addCriterion("workerPwd not like", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIn(List<String> values) {
            addCriterion("workerPwd in", values, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotIn(List<String> values) {
            addCriterion("workerPwd not in", values, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdBetween(String value1, String value2) {
            addCriterion("workerPwd between", value1, value2, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotBetween(String value1, String value2) {
            addCriterion("workerPwd not between", value1, value2, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIsNull() {
            addCriterion("workerPhone is null");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIsNotNull() {
            addCriterion("workerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneEqualTo(Integer value) {
            addCriterion("workerPhone =", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotEqualTo(Integer value) {
            addCriterion("workerPhone <>", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneGreaterThan(Integer value) {
            addCriterion("workerPhone >", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerPhone >=", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneLessThan(Integer value) {
            addCriterion("workerPhone <", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneLessThanOrEqualTo(Integer value) {
            addCriterion("workerPhone <=", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIn(List<Integer> values) {
            addCriterion("workerPhone in", values, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotIn(List<Integer> values) {
            addCriterion("workerPhone not in", values, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneBetween(Integer value1, Integer value2) {
            addCriterion("workerPhone between", value1, value2, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("workerPhone not between", value1, value2, "workerphone");
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