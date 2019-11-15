package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartinfoExample() {
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

        public Criteria andGoodnameIsNull() {
            addCriterion("goodName is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodName =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodName <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodName >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodName >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodName <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodName <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodName like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodName not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodName in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodName not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodName between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodName not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyIsNull() {
            addCriterion("goodQuantuty is null");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyIsNotNull() {
            addCriterion("goodQuantuty is not null");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyEqualTo(Integer value) {
            addCriterion("goodQuantuty =", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyNotEqualTo(Integer value) {
            addCriterion("goodQuantuty <>", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyGreaterThan(Integer value) {
            addCriterion("goodQuantuty >", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodQuantuty >=", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyLessThan(Integer value) {
            addCriterion("goodQuantuty <", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyLessThanOrEqualTo(Integer value) {
            addCriterion("goodQuantuty <=", value, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyIn(List<Integer> values) {
            addCriterion("goodQuantuty in", values, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyNotIn(List<Integer> values) {
            addCriterion("goodQuantuty not in", values, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyBetween(Integer value1, Integer value2) {
            addCriterion("goodQuantuty between", value1, value2, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andGoodquantutyNotBetween(Integer value1, Integer value2) {
            addCriterion("goodQuantuty not between", value1, value2, "goodquantuty");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Double value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Double value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Double value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Double value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Double> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Double> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Double value1, Double value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodId is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodId =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodId <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodId >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodId >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodId <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodId <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodId in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodId not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodId between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodId not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(Double value) {
            addCriterion("goodPrice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(Double value) {
            addCriterion("goodPrice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(Double value) {
            addCriterion("goodPrice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodPrice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(Double value) {
            addCriterion("goodPrice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("goodPrice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<Double> values) {
            addCriterion("goodPrice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<Double> values) {
            addCriterion("goodPrice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(Double value1, Double value2) {
            addCriterion("goodPrice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("goodPrice not between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGooddiscountIsNull() {
            addCriterion("goodDiscount is null");
            return (Criteria) this;
        }

        public Criteria andGooddiscountIsNotNull() {
            addCriterion("goodDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andGooddiscountEqualTo(Double value) {
            addCriterion("goodDiscount =", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountNotEqualTo(Double value) {
            addCriterion("goodDiscount <>", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountGreaterThan(Double value) {
            addCriterion("goodDiscount >", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("goodDiscount >=", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountLessThan(Double value) {
            addCriterion("goodDiscount <", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountLessThanOrEqualTo(Double value) {
            addCriterion("goodDiscount <=", value, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountIn(List<Double> values) {
            addCriterion("goodDiscount in", values, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountNotIn(List<Double> values) {
            addCriterion("goodDiscount not in", values, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountBetween(Double value1, Double value2) {
            addCriterion("goodDiscount between", value1, value2, "gooddiscount");
            return (Criteria) this;
        }

        public Criteria andGooddiscountNotBetween(Double value1, Double value2) {
            addCriterion("goodDiscount not between", value1, value2, "gooddiscount");
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