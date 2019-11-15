package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StorelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorelistExample() {
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

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("storename is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("storename is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("storename =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("storename <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("storename >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("storename >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("storename <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("storename <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("storename like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("storename not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("storename in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("storename not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("storename between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("storename not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andStaffIsNull() {
            addCriterion("staff is null");
            return (Criteria) this;
        }

        public Criteria andStaffIsNotNull() {
            addCriterion("staff is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEqualTo(Integer value) {
            addCriterion("staff =", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotEqualTo(Integer value) {
            addCriterion("staff <>", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThan(Integer value) {
            addCriterion("staff >", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff >=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThan(Integer value) {
            addCriterion("staff <", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThanOrEqualTo(Integer value) {
            addCriterion("staff <=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffIn(List<Integer> values) {
            addCriterion("staff in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotIn(List<Integer> values) {
            addCriterion("staff not in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffBetween(Integer value1, Integer value2) {
            addCriterion("staff between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("staff not between", value1, value2, "staff");
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

        public Criteria andLinkmanphoneIsNull() {
            addCriterion("linkmanPhone is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneIsNotNull() {
            addCriterion("linkmanPhone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneEqualTo(Integer value) {
            addCriterion("linkmanPhone =", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneNotEqualTo(Integer value) {
            addCriterion("linkmanPhone <>", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneGreaterThan(Integer value) {
            addCriterion("linkmanPhone >", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkmanPhone >=", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneLessThan(Integer value) {
            addCriterion("linkmanPhone <", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneLessThanOrEqualTo(Integer value) {
            addCriterion("linkmanPhone <=", value, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneIn(List<Integer> values) {
            addCriterion("linkmanPhone in", values, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneNotIn(List<Integer> values) {
            addCriterion("linkmanPhone not in", values, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneBetween(Integer value1, Integer value2) {
            addCriterion("linkmanPhone between", value1, value2, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andLinkmanphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("linkmanPhone not between", value1, value2, "linkmanphone");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNull() {
            addCriterion("storeAddress is null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNotNull() {
            addCriterion("storeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressEqualTo(String value) {
            addCriterion("storeAddress =", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotEqualTo(String value) {
            addCriterion("storeAddress <>", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThan(String value) {
            addCriterion("storeAddress >", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThanOrEqualTo(String value) {
            addCriterion("storeAddress >=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThan(String value) {
            addCriterion("storeAddress <", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThanOrEqualTo(String value) {
            addCriterion("storeAddress <=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLike(String value) {
            addCriterion("storeAddress like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotLike(String value) {
            addCriterion("storeAddress not like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIn(List<String> values) {
            addCriterion("storeAddress in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotIn(List<String> values) {
            addCriterion("storeAddress not in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressBetween(String value1, String value2) {
            addCriterion("storeAddress between", value1, value2, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotBetween(String value1, String value2) {
            addCriterion("storeAddress not between", value1, value2, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneIsNull() {
            addCriterion("storeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneIsNotNull() {
            addCriterion("storeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneEqualTo(String value) {
            addCriterion("storeTelephone =", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneNotEqualTo(String value) {
            addCriterion("storeTelephone <>", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneGreaterThan(String value) {
            addCriterion("storeTelephone >", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("storeTelephone >=", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneLessThan(String value) {
            addCriterion("storeTelephone <", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneLessThanOrEqualTo(String value) {
            addCriterion("storeTelephone <=", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneLike(String value) {
            addCriterion("storeTelephone like", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneNotLike(String value) {
            addCriterion("storeTelephone not like", value, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneIn(List<String> values) {
            addCriterion("storeTelephone in", values, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneNotIn(List<String> values) {
            addCriterion("storeTelephone not in", values, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneBetween(String value1, String value2) {
            addCriterion("storeTelephone between", value1, value2, "storetelephone");
            return (Criteria) this;
        }

        public Criteria andStoretelephoneNotBetween(String value1, String value2) {
            addCriterion("storeTelephone not between", value1, value2, "storetelephone");
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