package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVipidIsNull() {
            addCriterion("vipid is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("vipid is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(Integer value) {
            addCriterion("vipid =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(Integer value) {
            addCriterion("vipid <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(Integer value) {
            addCriterion("vipid >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipid >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(Integer value) {
            addCriterion("vipid <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(Integer value) {
            addCriterion("vipid <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<Integer> values) {
            addCriterion("vipid in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<Integer> values) {
            addCriterion("vipid not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(Integer value1, Integer value2) {
            addCriterion("vipid between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipid not between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNull() {
            addCriterion("vipPhone is null");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNotNull() {
            addCriterion("vipPhone is not null");
            return (Criteria) this;
        }

        public Criteria andVipphoneEqualTo(Integer value) {
            addCriterion("vipPhone =", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotEqualTo(Integer value) {
            addCriterion("vipPhone <>", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThan(Integer value) {
            addCriterion("vipPhone >", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipPhone >=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThan(Integer value) {
            addCriterion("vipPhone <", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThanOrEqualTo(Integer value) {
            addCriterion("vipPhone <=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneIn(List<Integer> values) {
            addCriterion("vipPhone in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotIn(List<Integer> values) {
            addCriterion("vipPhone not in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneBetween(Integer value1, Integer value2) {
            addCriterion("vipPhone between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("vipPhone not between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNull() {
            addCriterion("vipName is null");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNotNull() {
            addCriterion("vipName is not null");
            return (Criteria) this;
        }

        public Criteria andVipnameEqualTo(String value) {
            addCriterion("vipName =", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotEqualTo(String value) {
            addCriterion("vipName <>", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThan(String value) {
            addCriterion("vipName >", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThanOrEqualTo(String value) {
            addCriterion("vipName >=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThan(String value) {
            addCriterion("vipName <", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThanOrEqualTo(String value) {
            addCriterion("vipName <=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLike(String value) {
            addCriterion("vipName like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotLike(String value) {
            addCriterion("vipName not like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameIn(List<String> values) {
            addCriterion("vipName in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotIn(List<String> values) {
            addCriterion("vipName not in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameBetween(String value1, String value2) {
            addCriterion("vipName between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotBetween(String value1, String value2) {
            addCriterion("vipName not between", value1, value2, "vipname");
            return (Criteria) this;
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

        public Criteria andVippwdIsNull() {
            addCriterion("vipPwd is null");
            return (Criteria) this;
        }

        public Criteria andVippwdIsNotNull() {
            addCriterion("vipPwd is not null");
            return (Criteria) this;
        }

        public Criteria andVippwdEqualTo(String value) {
            addCriterion("vipPwd =", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotEqualTo(String value) {
            addCriterion("vipPwd <>", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdGreaterThan(String value) {
            addCriterion("vipPwd >", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdGreaterThanOrEqualTo(String value) {
            addCriterion("vipPwd >=", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLessThan(String value) {
            addCriterion("vipPwd <", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLessThanOrEqualTo(String value) {
            addCriterion("vipPwd <=", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLike(String value) {
            addCriterion("vipPwd like", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotLike(String value) {
            addCriterion("vipPwd not like", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdIn(List<String> values) {
            addCriterion("vipPwd in", values, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotIn(List<String> values) {
            addCriterion("vipPwd not in", values, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdBetween(String value1, String value2) {
            addCriterion("vipPwd between", value1, value2, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotBetween(String value1, String value2) {
            addCriterion("vipPwd not between", value1, value2, "vippwd");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("provinceid >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("provinceid <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("provinceid in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("provinceid not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNull() {
            addCriterion("regionid is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("regionid is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(Integer value) {
            addCriterion("regionid =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(Integer value) {
            addCriterion("regionid <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(Integer value) {
            addCriterion("regionid >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("regionid >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(Integer value) {
            addCriterion("regionid <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(Integer value) {
            addCriterion("regionid <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<Integer> values) {
            addCriterion("regionid in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<Integer> values) {
            addCriterion("regionid not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(Integer value1, Integer value2) {
            addCriterion("regionid between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(Integer value1, Integer value2) {
            addCriterion("regionid not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andStreetsIsNull() {
            addCriterion("streets is null");
            return (Criteria) this;
        }

        public Criteria andStreetsIsNotNull() {
            addCriterion("streets is not null");
            return (Criteria) this;
        }

        public Criteria andStreetsEqualTo(String value) {
            addCriterion("streets =", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsNotEqualTo(String value) {
            addCriterion("streets <>", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsGreaterThan(String value) {
            addCriterion("streets >", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsGreaterThanOrEqualTo(String value) {
            addCriterion("streets >=", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsLessThan(String value) {
            addCriterion("streets <", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsLessThanOrEqualTo(String value) {
            addCriterion("streets <=", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsLike(String value) {
            addCriterion("streets like", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsNotLike(String value) {
            addCriterion("streets not like", value, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsIn(List<String> values) {
            addCriterion("streets in", values, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsNotIn(List<String> values) {
            addCriterion("streets not in", values, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsBetween(String value1, String value2) {
            addCriterion("streets between", value1, value2, "streets");
            return (Criteria) this;
        }

        public Criteria andStreetsNotBetween(String value1, String value2) {
            addCriterion("streets not between", value1, value2, "streets");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNull() {
            addCriterion("vipBalance is null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNotNull() {
            addCriterion("vipBalance is not null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceEqualTo(Double value) {
            addCriterion("vipBalance =", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotEqualTo(Double value) {
            addCriterion("vipBalance <>", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThan(Double value) {
            addCriterion("vipBalance >", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("vipBalance >=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThan(Double value) {
            addCriterion("vipBalance <", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThanOrEqualTo(Double value) {
            addCriterion("vipBalance <=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIn(List<Double> values) {
            addCriterion("vipBalance in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotIn(List<Double> values) {
            addCriterion("vipBalance not in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceBetween(Double value1, Double value2) {
            addCriterion("vipBalance between", value1, value2, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotBetween(Double value1, Double value2) {
            addCriterion("vipBalance not between", value1, value2, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipintegralIsNull() {
            addCriterion("vipIntegral is null");
            return (Criteria) this;
        }

        public Criteria andVipintegralIsNotNull() {
            addCriterion("vipIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andVipintegralEqualTo(Integer value) {
            addCriterion("vipIntegral =", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralNotEqualTo(Integer value) {
            addCriterion("vipIntegral <>", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralGreaterThan(Integer value) {
            addCriterion("vipIntegral >", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipIntegral >=", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralLessThan(Integer value) {
            addCriterion("vipIntegral <", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralLessThanOrEqualTo(Integer value) {
            addCriterion("vipIntegral <=", value, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralIn(List<Integer> values) {
            addCriterion("vipIntegral in", values, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralNotIn(List<Integer> values) {
            addCriterion("vipIntegral not in", values, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralBetween(Integer value1, Integer value2) {
            addCriterion("vipIntegral between", value1, value2, "vipintegral");
            return (Criteria) this;
        }

        public Criteria andVipintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("vipIntegral not between", value1, value2, "vipintegral");
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