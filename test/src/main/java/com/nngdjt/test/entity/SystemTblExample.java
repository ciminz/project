package com.nngdjt.test.entity;

import java.util.ArrayList;
import java.util.List;

public class SystemTblExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemTblExample() {
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

        public Criteria andSysNmeIsNull() {
            addCriterion("SYS_NME is null");
            return (Criteria) this;
        }

        public Criteria andSysNmeIsNotNull() {
            addCriterion("SYS_NME is not null");
            return (Criteria) this;
        }

        public Criteria andSysNmeEqualTo(String value) {
            addCriterion("SYS_NME =", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeNotEqualTo(String value) {
            addCriterion("SYS_NME <>", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeGreaterThan(String value) {
            addCriterion("SYS_NME >", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NME >=", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeLessThan(String value) {
            addCriterion("SYS_NME <", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeLessThanOrEqualTo(String value) {
            addCriterion("SYS_NME <=", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeLike(String value) {
            addCriterion("SYS_NME like", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeNotLike(String value) {
            addCriterion("SYS_NME not like", value, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeIn(List<String> values) {
            addCriterion("SYS_NME in", values, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeNotIn(List<String> values) {
            addCriterion("SYS_NME not in", values, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeBetween(String value1, String value2) {
            addCriterion("SYS_NME between", value1, value2, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysNmeNotBetween(String value1, String value2) {
            addCriterion("SYS_NME not between", value1, value2, "sysNme");
            return (Criteria) this;
        }

        public Criteria andSysCdeLikeInsensitive(String value) {
            addCriterion("upper(SYS_CDE) like", value.toUpperCase(), "sysCde");
            return (Criteria) this;
        }

        public Criteria andSysNmeLikeInsensitive(String value) {
            addCriterion("upper(SYS_NME) like", value.toUpperCase(), "sysNme");
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