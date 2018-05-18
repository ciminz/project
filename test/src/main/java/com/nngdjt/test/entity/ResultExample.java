package com.nngdjt.test.entity;

import java.util.ArrayList;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(String value) {
            addCriterion("REC_ID =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(String value) {
            addCriterion("REC_ID <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(String value) {
            addCriterion("REC_ID >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(String value) {
            addCriterion("REC_ID >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(String value) {
            addCriterion("REC_ID <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(String value) {
            addCriterion("REC_ID <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLike(String value) {
            addCriterion("REC_ID like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotLike(String value) {
            addCriterion("REC_ID not like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<String> values) {
            addCriterion("REC_ID in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<String> values) {
            addCriterion("REC_ID not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(String value1, String value2) {
            addCriterion("REC_ID between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(String value1, String value2) {
            addCriterion("REC_ID not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andSysCdeIsNull() {
            addCriterion("SYS_CDE is null");
            return (Criteria) this;
        }

        public Criteria andSysCdeIsNotNull() {
            addCriterion("SYS_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andSysCdeEqualTo(String value) {
            addCriterion("SYS_CDE =", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeNotEqualTo(String value) {
            addCriterion("SYS_CDE <>", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeGreaterThan(String value) {
            addCriterion("SYS_CDE >", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CDE >=", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeLessThan(String value) {
            addCriterion("SYS_CDE <", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeLessThanOrEqualTo(String value) {
            addCriterion("SYS_CDE <=", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeLike(String value) {
            addCriterion("SYS_CDE like", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeNotLike(String value) {
            addCriterion("SYS_CDE not like", value, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeIn(List<String> values) {
            addCriterion("SYS_CDE in", values, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeNotIn(List<String> values) {
            addCriterion("SYS_CDE not in", values, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeBetween(String value1, String value2) {
            addCriterion("SYS_CDE between", value1, value2, "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysCdeNotBetween(String value1, String value2) {
            addCriterion("SYS_CDE not between", value1, value2, "sysCde");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andCreDteIsNull() {
            addCriterion("CRE_DTE is null");
            return (Criteria) this;
        }

        public Criteria andCreDteIsNotNull() {
            addCriterion("CRE_DTE is not null");
            return (Criteria) this;
        }

        public Criteria andCreDteEqualTo(String value) {
            addCriterion("CRE_DTE =", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotEqualTo(String value) {
            addCriterion("CRE_DTE <>", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThan(String value) {
            addCriterion("CRE_DTE >", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThanOrEqualTo(String value) {
            addCriterion("CRE_DTE >=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThan(String value) {
            addCriterion("CRE_DTE <", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThanOrEqualTo(String value) {
            addCriterion("CRE_DTE <=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLike(String value) {
            addCriterion("CRE_DTE like", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotLike(String value) {
            addCriterion("CRE_DTE not like", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteIn(List<String> values) {
            addCriterion("CRE_DTE in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotIn(List<String> values) {
            addCriterion("CRE_DTE not in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteBetween(String value1, String value2) {
            addCriterion("CRE_DTE between", value1, value2, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotBetween(String value1, String value2) {
            addCriterion("CRE_DTE not between", value1, value2, "creDte");
            return (Criteria) this;
        }

        public Criteria andRecIdLikeInsensitive(String value) {
            addCriterion("upper(REC_ID) like", value.toUpperCase(), "recId");
            return (Criteria) this;
        }

        public Criteria andSysCdeLikeInsensitive(String value) {
            addCriterion("upper(SYS_CDE) like", value.toUpperCase(), "sysCde");
            return (Criteria) this;
        }

        public Criteria andResultLikeInsensitive(String value) {
            addCriterion("upper(RESULT) like", value.toUpperCase(), "result");
            return (Criteria) this;
        }

        public Criteria andCreDteLikeInsensitive(String value) {
            addCriterion("upper(CRE_DTE) like", value.toUpperCase(), "creDte");
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