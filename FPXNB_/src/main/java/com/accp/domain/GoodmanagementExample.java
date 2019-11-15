package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodmanagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodmanagementExample() {
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

        public Criteria andGoodtypeidIsNull() {
            addCriterion("goodTypeId is null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidIsNotNull() {
            addCriterion("goodTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidEqualTo(Integer value) {
            addCriterion("goodTypeId =", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotEqualTo(Integer value) {
            addCriterion("goodTypeId <>", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidGreaterThan(Integer value) {
            addCriterion("goodTypeId >", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodTypeId >=", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidLessThan(Integer value) {
            addCriterion("goodTypeId <", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("goodTypeId <=", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidIn(List<Integer> values) {
            addCriterion("goodTypeId in", values, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotIn(List<Integer> values) {
            addCriterion("goodTypeId not in", values, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidBetween(Integer value1, Integer value2) {
            addCriterion("goodTypeId between", value1, value2, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodTypeId not between", value1, value2, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodimgIsNull() {
            addCriterion("goodImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodimgIsNotNull() {
            addCriterion("goodImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodimgEqualTo(String value) {
            addCriterion("goodImg =", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotEqualTo(String value) {
            addCriterion("goodImg <>", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgGreaterThan(String value) {
            addCriterion("goodImg >", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodImg >=", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLessThan(String value) {
            addCriterion("goodImg <", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLessThanOrEqualTo(String value) {
            addCriterion("goodImg <=", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgLike(String value) {
            addCriterion("goodImg like", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotLike(String value) {
            addCriterion("goodImg not like", value, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgIn(List<String> values) {
            addCriterion("goodImg in", values, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotIn(List<String> values) {
            addCriterion("goodImg not in", values, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgBetween(String value1, String value2) {
            addCriterion("goodImg between", value1, value2, "goodimg");
            return (Criteria) this;
        }

        public Criteria andGoodimgNotBetween(String value1, String value2) {
            addCriterion("goodImg not between", value1, value2, "goodimg");
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

        public Criteria andGoodbarcodeIsNull() {
            addCriterion("goodBarcode is null");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeIsNotNull() {
            addCriterion("goodBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeEqualTo(String value) {
            addCriterion("goodBarcode =", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeNotEqualTo(String value) {
            addCriterion("goodBarcode <>", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeGreaterThan(String value) {
            addCriterion("goodBarcode >", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("goodBarcode >=", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeLessThan(String value) {
            addCriterion("goodBarcode <", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeLessThanOrEqualTo(String value) {
            addCriterion("goodBarcode <=", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeLike(String value) {
            addCriterion("goodBarcode like", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeNotLike(String value) {
            addCriterion("goodBarcode not like", value, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeIn(List<String> values) {
            addCriterion("goodBarcode in", values, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeNotIn(List<String> values) {
            addCriterion("goodBarcode not in", values, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeBetween(String value1, String value2) {
            addCriterion("goodBarcode between", value1, value2, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodbarcodeNotBetween(String value1, String value2) {
            addCriterion("goodBarcode not between", value1, value2, "goodbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodspecIsNull() {
            addCriterion("goodSpec is null");
            return (Criteria) this;
        }

        public Criteria andGoodspecIsNotNull() {
            addCriterion("goodSpec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspecEqualTo(String value) {
            addCriterion("goodSpec =", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecNotEqualTo(String value) {
            addCriterion("goodSpec <>", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecGreaterThan(String value) {
            addCriterion("goodSpec >", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecGreaterThanOrEqualTo(String value) {
            addCriterion("goodSpec >=", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecLessThan(String value) {
            addCriterion("goodSpec <", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecLessThanOrEqualTo(String value) {
            addCriterion("goodSpec <=", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecLike(String value) {
            addCriterion("goodSpec like", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecNotLike(String value) {
            addCriterion("goodSpec not like", value, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecIn(List<String> values) {
            addCriterion("goodSpec in", values, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecNotIn(List<String> values) {
            addCriterion("goodSpec not in", values, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecBetween(String value1, String value2) {
            addCriterion("goodSpec between", value1, value2, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodspecNotBetween(String value1, String value2) {
            addCriterion("goodSpec not between", value1, value2, "goodspec");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryIsNull() {
            addCriterion("goodInventory is null");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryIsNotNull() {
            addCriterion("goodInventory is not null");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryEqualTo(Integer value) {
            addCriterion("goodInventory =", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryNotEqualTo(Integer value) {
            addCriterion("goodInventory <>", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryGreaterThan(Integer value) {
            addCriterion("goodInventory >", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodInventory >=", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryLessThan(Integer value) {
            addCriterion("goodInventory <", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryLessThanOrEqualTo(Integer value) {
            addCriterion("goodInventory <=", value, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryIn(List<Integer> values) {
            addCriterion("goodInventory in", values, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryNotIn(List<Integer> values) {
            addCriterion("goodInventory not in", values, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryBetween(Integer value1, Integer value2) {
            addCriterion("goodInventory between", value1, value2, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodinventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("goodInventory not between", value1, value2, "goodinventory");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceIsNull() {
            addCriterion("goodSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceIsNotNull() {
            addCriterion("goodSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceEqualTo(Double value) {
            addCriterion("goodSalePrice =", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceNotEqualTo(Double value) {
            addCriterion("goodSalePrice <>", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceGreaterThan(Double value) {
            addCriterion("goodSalePrice >", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodSalePrice >=", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceLessThan(Double value) {
            addCriterion("goodSalePrice <", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceLessThanOrEqualTo(Double value) {
            addCriterion("goodSalePrice <=", value, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceIn(List<Double> values) {
            addCriterion("goodSalePrice in", values, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceNotIn(List<Double> values) {
            addCriterion("goodSalePrice not in", values, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceBetween(Double value1, Double value2) {
            addCriterion("goodSalePrice between", value1, value2, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodsalepriceNotBetween(Double value1, Double value2) {
            addCriterion("goodSalePrice not between", value1, value2, "goodsaleprice");
            return (Criteria) this;
        }

        public Criteria andGoodcostIsNull() {
            addCriterion("goodCost is null");
            return (Criteria) this;
        }

        public Criteria andGoodcostIsNotNull() {
            addCriterion("goodCost is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcostEqualTo(Double value) {
            addCriterion("goodCost =", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostNotEqualTo(Double value) {
            addCriterion("goodCost <>", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostGreaterThan(Double value) {
            addCriterion("goodCost >", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostGreaterThanOrEqualTo(Double value) {
            addCriterion("goodCost >=", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostLessThan(Double value) {
            addCriterion("goodCost <", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostLessThanOrEqualTo(Double value) {
            addCriterion("goodCost <=", value, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostIn(List<Double> values) {
            addCriterion("goodCost in", values, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostNotIn(List<Double> values) {
            addCriterion("goodCost not in", values, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostBetween(Double value1, Double value2) {
            addCriterion("goodCost between", value1, value2, "goodcost");
            return (Criteria) this;
        }

        public Criteria andGoodcostNotBetween(Double value1, Double value2) {
            addCriterion("goodCost not between", value1, value2, "goodcost");
            return (Criteria) this;
        }

        public Criteria andSynchronizationIsNull() {
            addCriterion("synchronization is null");
            return (Criteria) this;
        }

        public Criteria andSynchronizationIsNotNull() {
            addCriterion("synchronization is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronizationEqualTo(Integer value) {
            addCriterion("synchronization =", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationNotEqualTo(Integer value) {
            addCriterion("synchronization <>", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationGreaterThan(Integer value) {
            addCriterion("synchronization >", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("synchronization >=", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationLessThan(Integer value) {
            addCriterion("synchronization <", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationLessThanOrEqualTo(Integer value) {
            addCriterion("synchronization <=", value, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationIn(List<Integer> values) {
            addCriterion("synchronization in", values, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationNotIn(List<Integer> values) {
            addCriterion("synchronization not in", values, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationBetween(Integer value1, Integer value2) {
            addCriterion("synchronization between", value1, value2, "synchronization");
            return (Criteria) this;
        }

        public Criteria andSynchronizationNotBetween(Integer value1, Integer value2) {
            addCriterion("synchronization not between", value1, value2, "synchronization");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIsNull() {
            addCriterion("goodDescribe is null");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIsNotNull() {
            addCriterion("goodDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andGooddescribeEqualTo(String value) {
            addCriterion("goodDescribe =", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotEqualTo(String value) {
            addCriterion("goodDescribe <>", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeGreaterThan(String value) {
            addCriterion("goodDescribe >", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeGreaterThanOrEqualTo(String value) {
            addCriterion("goodDescribe >=", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeLessThan(String value) {
            addCriterion("goodDescribe <", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeLessThanOrEqualTo(String value) {
            addCriterion("goodDescribe <=", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeLike(String value) {
            addCriterion("goodDescribe like", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotLike(String value) {
            addCriterion("goodDescribe not like", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIn(List<String> values) {
            addCriterion("goodDescribe in", values, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotIn(List<String> values) {
            addCriterion("goodDescribe not in", values, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeBetween(String value1, String value2) {
            addCriterion("goodDescribe between", value1, value2, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotBetween(String value1, String value2) {
            addCriterion("goodDescribe not between", value1, value2, "gooddescribe");
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