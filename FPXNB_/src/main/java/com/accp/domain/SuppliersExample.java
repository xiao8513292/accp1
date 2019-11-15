package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SuppliersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuppliersExample() {
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

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
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

        public Criteria andEamilIsNull() {
            addCriterion("eamil is null");
            return (Criteria) this;
        }

        public Criteria andEamilIsNotNull() {
            addCriterion("eamil is not null");
            return (Criteria) this;
        }

        public Criteria andEamilEqualTo(String value) {
            addCriterion("eamil =", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotEqualTo(String value) {
            addCriterion("eamil <>", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilGreaterThan(String value) {
            addCriterion("eamil >", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilGreaterThanOrEqualTo(String value) {
            addCriterion("eamil >=", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLessThan(String value) {
            addCriterion("eamil <", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLessThanOrEqualTo(String value) {
            addCriterion("eamil <=", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLike(String value) {
            addCriterion("eamil like", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotLike(String value) {
            addCriterion("eamil not like", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilIn(List<String> values) {
            addCriterion("eamil in", values, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotIn(List<String> values) {
            addCriterion("eamil not in", values, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilBetween(String value1, String value2) {
            addCriterion("eamil between", value1, value2, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotBetween(String value1, String value2) {
            addCriterion("eamil not between", value1, value2, "eamil");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andProcinceidIsNull() {
            addCriterion("procinceid is null");
            return (Criteria) this;
        }

        public Criteria andProcinceidIsNotNull() {
            addCriterion("procinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProcinceidEqualTo(Integer value) {
            addCriterion("procinceid =", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidNotEqualTo(Integer value) {
            addCriterion("procinceid <>", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidGreaterThan(Integer value) {
            addCriterion("procinceid >", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("procinceid >=", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidLessThan(Integer value) {
            addCriterion("procinceid <", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidLessThanOrEqualTo(Integer value) {
            addCriterion("procinceid <=", value, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidIn(List<Integer> values) {
            addCriterion("procinceid in", values, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidNotIn(List<Integer> values) {
            addCriterion("procinceid not in", values, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidBetween(Integer value1, Integer value2) {
            addCriterion("procinceid between", value1, value2, "procinceid");
            return (Criteria) this;
        }

        public Criteria andProcinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("procinceid not between", value1, value2, "procinceid");
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