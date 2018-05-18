package com.nngdjt.test.entity;

import java.util.ArrayList;
import java.util.List;

public class SysTradeRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTradeRecordsExample() {
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

        public Criteria andTotCntIsNull() {
            addCriterion("TOT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTotCntIsNotNull() {
            addCriterion("TOT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotCntEqualTo(String value) {
            addCriterion("TOT_CNT =", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntNotEqualTo(String value) {
            addCriterion("TOT_CNT <>", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntGreaterThan(String value) {
            addCriterion("TOT_CNT >", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntGreaterThanOrEqualTo(String value) {
            addCriterion("TOT_CNT >=", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntLessThan(String value) {
            addCriterion("TOT_CNT <", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntLessThanOrEqualTo(String value) {
            addCriterion("TOT_CNT <=", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntLike(String value) {
            addCriterion("TOT_CNT like", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntNotLike(String value) {
            addCriterion("TOT_CNT not like", value, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntIn(List<String> values) {
            addCriterion("TOT_CNT in", values, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntNotIn(List<String> values) {
            addCriterion("TOT_CNT not in", values, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntBetween(String value1, String value2) {
            addCriterion("TOT_CNT between", value1, value2, "totCnt");
            return (Criteria) this;
        }

        public Criteria andTotCntNotBetween(String value1, String value2) {
            addCriterion("TOT_CNT not between", value1, value2, "totCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntIsNull() {
            addCriterion("UN_ACCT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntIsNotNull() {
            addCriterion("UN_ACCT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntEqualTo(String value) {
            addCriterion("UN_ACCT_CNT =", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntNotEqualTo(String value) {
            addCriterion("UN_ACCT_CNT <>", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntGreaterThan(String value) {
            addCriterion("UN_ACCT_CNT >", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntGreaterThanOrEqualTo(String value) {
            addCriterion("UN_ACCT_CNT >=", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntLessThan(String value) {
            addCriterion("UN_ACCT_CNT <", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntLessThanOrEqualTo(String value) {
            addCriterion("UN_ACCT_CNT <=", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntLike(String value) {
            addCriterion("UN_ACCT_CNT like", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntNotLike(String value) {
            addCriterion("UN_ACCT_CNT not like", value, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntIn(List<String> values) {
            addCriterion("UN_ACCT_CNT in", values, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntNotIn(List<String> values) {
            addCriterion("UN_ACCT_CNT not in", values, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntBetween(String value1, String value2) {
            addCriterion("UN_ACCT_CNT between", value1, value2, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntNotBetween(String value1, String value2) {
            addCriterion("UN_ACCT_CNT not between", value1, value2, "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntIsNull() {
            addCriterion("ACCT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andAcctCntIsNotNull() {
            addCriterion("ACCT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andAcctCntEqualTo(String value) {
            addCriterion("ACCT_CNT =", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntNotEqualTo(String value) {
            addCriterion("ACCT_CNT <>", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntGreaterThan(String value) {
            addCriterion("ACCT_CNT >", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_CNT >=", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntLessThan(String value) {
            addCriterion("ACCT_CNT <", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntLessThanOrEqualTo(String value) {
            addCriterion("ACCT_CNT <=", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntLike(String value) {
            addCriterion("ACCT_CNT like", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntNotLike(String value) {
            addCriterion("ACCT_CNT not like", value, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntIn(List<String> values) {
            addCriterion("ACCT_CNT in", values, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntNotIn(List<String> values) {
            addCriterion("ACCT_CNT not in", values, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntBetween(String value1, String value2) {
            addCriterion("ACCT_CNT between", value1, value2, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntNotBetween(String value1, String value2) {
            addCriterion("ACCT_CNT not between", value1, value2, "acctCnt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtIsNull() {
            addCriterion("TRADE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmtIsNotNull() {
            addCriterion("TRADE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmtEqualTo(String value) {
            addCriterion("TRADE_AMT =", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtNotEqualTo(String value) {
            addCriterion("TRADE_AMT <>", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtGreaterThan(String value) {
            addCriterion("TRADE_AMT >", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_AMT >=", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtLessThan(String value) {
            addCriterion("TRADE_AMT <", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtLessThanOrEqualTo(String value) {
            addCriterion("TRADE_AMT <=", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtLike(String value) {
            addCriterion("TRADE_AMT like", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtNotLike(String value) {
            addCriterion("TRADE_AMT not like", value, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtIn(List<String> values) {
            addCriterion("TRADE_AMT in", values, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtNotIn(List<String> values) {
            addCriterion("TRADE_AMT not in", values, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtBetween(String value1, String value2) {
            addCriterion("TRADE_AMT between", value1, value2, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtNotBetween(String value1, String value2) {
            addCriterion("TRADE_AMT not between", value1, value2, "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtIsNull() {
            addCriterion("SUCC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSuccAmtIsNotNull() {
            addCriterion("SUCC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccAmtEqualTo(String value) {
            addCriterion("SUCC_AMT =", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtNotEqualTo(String value) {
            addCriterion("SUCC_AMT <>", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtGreaterThan(String value) {
            addCriterion("SUCC_AMT >", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtGreaterThanOrEqualTo(String value) {
            addCriterion("SUCC_AMT >=", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtLessThan(String value) {
            addCriterion("SUCC_AMT <", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtLessThanOrEqualTo(String value) {
            addCriterion("SUCC_AMT <=", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtLike(String value) {
            addCriterion("SUCC_AMT like", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtNotLike(String value) {
            addCriterion("SUCC_AMT not like", value, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtIn(List<String> values) {
            addCriterion("SUCC_AMT in", values, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtNotIn(List<String> values) {
            addCriterion("SUCC_AMT not in", values, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtBetween(String value1, String value2) {
            addCriterion("SUCC_AMT between", value1, value2, "succAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtNotBetween(String value1, String value2) {
            addCriterion("SUCC_AMT not between", value1, value2, "succAmt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntIsNull() {
            addCriterion("ELE_CHN_CNT is null");
            return (Criteria) this;
        }

        public Criteria andEleChnCntIsNotNull() {
            addCriterion("ELE_CHN_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andEleChnCntEqualTo(String value) {
            addCriterion("ELE_CHN_CNT =", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntNotEqualTo(String value) {
            addCriterion("ELE_CHN_CNT <>", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntGreaterThan(String value) {
            addCriterion("ELE_CHN_CNT >", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntGreaterThanOrEqualTo(String value) {
            addCriterion("ELE_CHN_CNT >=", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntLessThan(String value) {
            addCriterion("ELE_CHN_CNT <", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntLessThanOrEqualTo(String value) {
            addCriterion("ELE_CHN_CNT <=", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntLike(String value) {
            addCriterion("ELE_CHN_CNT like", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntNotLike(String value) {
            addCriterion("ELE_CHN_CNT not like", value, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntIn(List<String> values) {
            addCriterion("ELE_CHN_CNT in", values, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntNotIn(List<String> values) {
            addCriterion("ELE_CHN_CNT not in", values, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntBetween(String value1, String value2) {
            addCriterion("ELE_CHN_CNT between", value1, value2, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntNotBetween(String value1, String value2) {
            addCriterion("ELE_CHN_CNT not between", value1, value2, "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andCrtDteIsNull() {
            addCriterion("CRT_DTE is null");
            return (Criteria) this;
        }

        public Criteria andCrtDteIsNotNull() {
            addCriterion("CRT_DTE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDteEqualTo(String value) {
            addCriterion("CRT_DTE =", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteNotEqualTo(String value) {
            addCriterion("CRT_DTE <>", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteGreaterThan(String value) {
            addCriterion("CRT_DTE >", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_DTE >=", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteLessThan(String value) {
            addCriterion("CRT_DTE <", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteLessThanOrEqualTo(String value) {
            addCriterion("CRT_DTE <=", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteLike(String value) {
            addCriterion("CRT_DTE like", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteNotLike(String value) {
            addCriterion("CRT_DTE not like", value, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteIn(List<String> values) {
            addCriterion("CRT_DTE in", values, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteNotIn(List<String> values) {
            addCriterion("CRT_DTE not in", values, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteBetween(String value1, String value2) {
            addCriterion("CRT_DTE between", value1, value2, "crtDte");
            return (Criteria) this;
        }

        public Criteria andCrtDteNotBetween(String value1, String value2) {
            addCriterion("CRT_DTE not between", value1, value2, "crtDte");
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

        public Criteria andTotCntLikeInsensitive(String value) {
            addCriterion("upper(TOT_CNT) like", value.toUpperCase(), "totCnt");
            return (Criteria) this;
        }

        public Criteria andUnAcctCntLikeInsensitive(String value) {
            addCriterion("upper(UN_ACCT_CNT) like", value.toUpperCase(), "unAcctCnt");
            return (Criteria) this;
        }

        public Criteria andAcctCntLikeInsensitive(String value) {
            addCriterion("upper(ACCT_CNT) like", value.toUpperCase(), "acctCnt");
            return (Criteria) this;
        }

        public Criteria andTradeAmtLikeInsensitive(String value) {
            addCriterion("upper(TRADE_AMT) like", value.toUpperCase(), "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andSuccAmtLikeInsensitive(String value) {
            addCriterion("upper(SUCC_AMT) like", value.toUpperCase(), "succAmt");
            return (Criteria) this;
        }

        public Criteria andEleChnCntLikeInsensitive(String value) {
            addCriterion("upper(ELE_CHN_CNT) like", value.toUpperCase(), "eleChnCnt");
            return (Criteria) this;
        }

        public Criteria andCrtDteLikeInsensitive(String value) {
            addCriterion("upper(CRT_DTE) like", value.toUpperCase(), "crtDte");
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