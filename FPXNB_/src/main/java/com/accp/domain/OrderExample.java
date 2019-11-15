package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymentType =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymentType <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymentType >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymentType >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymentType <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymentType <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymentType like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymentType not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymentType in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymentType not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymentType between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymentType not between", value1, value2, "paymenttype");
            return (Criteria) this;
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

        public Criteria andReceipttypeIsNull() {
            addCriterion("receiptType is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeIsNotNull() {
            addCriterion("receiptType is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeEqualTo(Integer value) {
            addCriterion("receiptType =", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotEqualTo(Integer value) {
            addCriterion("receiptType <>", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeGreaterThan(Integer value) {
            addCriterion("receiptType >", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptType >=", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeLessThan(Integer value) {
            addCriterion("receiptType <", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeLessThanOrEqualTo(Integer value) {
            addCriterion("receiptType <=", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeIn(List<Integer> values) {
            addCriterion("receiptType in", values, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotIn(List<Integer> values) {
            addCriterion("receiptType not in", values, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeBetween(Integer value1, Integer value2) {
            addCriterion("receiptType between", value1, value2, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptType not between", value1, value2, "receipttype");
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