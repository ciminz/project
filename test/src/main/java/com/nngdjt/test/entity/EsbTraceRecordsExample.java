package com.nngdjt.test.entity;

import java.util.ArrayList;
import java.util.List;

public class EsbTraceRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EsbTraceRecordsExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(String value) {
            addCriterion("MSG_ID =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(String value) {
            addCriterion("MSG_ID <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(String value) {
            addCriterion("MSG_ID >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_ID >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(String value) {
            addCriterion("MSG_ID <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(String value) {
            addCriterion("MSG_ID <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLike(String value) {
            addCriterion("MSG_ID like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotLike(String value) {
            addCriterion("MSG_ID not like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<String> values) {
            addCriterion("MSG_ID in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<String> values) {
            addCriterion("MSG_ID not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(String value1, String value2) {
            addCriterion("MSG_ID between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(String value1, String value2) {
            addCriterion("MSG_ID not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIsNull() {
            addCriterion("TRADE_SRC is null");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIsNotNull() {
            addCriterion("TRADE_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSrcEqualTo(String value) {
            addCriterion("TRADE_SRC =", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotEqualTo(String value) {
            addCriterion("TRADE_SRC <>", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcGreaterThan(String value) {
            addCriterion("TRADE_SRC >", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_SRC >=", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLessThan(String value) {
            addCriterion("TRADE_SRC <", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLessThanOrEqualTo(String value) {
            addCriterion("TRADE_SRC <=", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLike(String value) {
            addCriterion("TRADE_SRC like", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotLike(String value) {
            addCriterion("TRADE_SRC not like", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIn(List<String> values) {
            addCriterion("TRADE_SRC in", values, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotIn(List<String> values) {
            addCriterion("TRADE_SRC not in", values, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcBetween(String value1, String value2) {
            addCriterion("TRADE_SRC between", value1, value2, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotBetween(String value1, String value2) {
            addCriterion("TRADE_SRC not between", value1, value2, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIsNull() {
            addCriterion("TRADE_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIsNotNull() {
            addCriterion("TRADE_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTargetEqualTo(String value) {
            addCriterion("TRADE_TARGET =", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotEqualTo(String value) {
            addCriterion("TRADE_TARGET <>", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetGreaterThan(String value) {
            addCriterion("TRADE_TARGET >", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TARGET >=", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLessThan(String value) {
            addCriterion("TRADE_TARGET <", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TARGET <=", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLike(String value) {
            addCriterion("TRADE_TARGET like", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotLike(String value) {
            addCriterion("TRADE_TARGET not like", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIn(List<String> values) {
            addCriterion("TRADE_TARGET in", values, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotIn(List<String> values) {
            addCriterion("TRADE_TARGET not in", values, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetBetween(String value1, String value2) {
            addCriterion("TRADE_TARGET between", value1, value2, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotBetween(String value1, String value2) {
            addCriterion("TRADE_TARGET not between", value1, value2, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andChnIsNull() {
            addCriterion("CHN is null");
            return (Criteria) this;
        }

        public Criteria andChnIsNotNull() {
            addCriterion("CHN is not null");
            return (Criteria) this;
        }

        public Criteria andChnEqualTo(String value) {
            addCriterion("CHN =", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnNotEqualTo(String value) {
            addCriterion("CHN <>", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnGreaterThan(String value) {
            addCriterion("CHN >", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnGreaterThanOrEqualTo(String value) {
            addCriterion("CHN >=", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnLessThan(String value) {
            addCriterion("CHN <", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnLessThanOrEqualTo(String value) {
            addCriterion("CHN <=", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnLike(String value) {
            addCriterion("CHN like", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnNotLike(String value) {
            addCriterion("CHN not like", value, "chn");
            return (Criteria) this;
        }

        public Criteria andChnIn(List<String> values) {
            addCriterion("CHN in", values, "chn");
            return (Criteria) this;
        }

        public Criteria andChnNotIn(List<String> values) {
            addCriterion("CHN not in", values, "chn");
            return (Criteria) this;
        }

        public Criteria andChnBetween(String value1, String value2) {
            addCriterion("CHN between", value1, value2, "chn");
            return (Criteria) this;
        }

        public Criteria andChnNotBetween(String value1, String value2) {
            addCriterion("CHN not between", value1, value2, "chn");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("SERVICE =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("SERVICE <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("SERVICE >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("SERVICE <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("SERVICE <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("SERVICE like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("SERVICE not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("SERVICE in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("SERVICE not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("SERVICE between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("SERVICE not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("OPERATE is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("OPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(String value) {
            addCriterion("OPERATE =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(String value) {
            addCriterion("OPERATE <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(String value) {
            addCriterion("OPERATE >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(String value) {
            addCriterion("OPERATE <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(String value) {
            addCriterion("OPERATE <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLike(String value) {
            addCriterion("OPERATE like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotLike(String value) {
            addCriterion("OPERATE not like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<String> values) {
            addCriterion("OPERATE in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<String> values) {
            addCriterion("OPERATE not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(String value1, String value2) {
            addCriterion("OPERATE between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(String value1, String value2) {
            addCriterion("OPERATE not between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andJrnNoIsNull() {
            addCriterion("JRN_NO is null");
            return (Criteria) this;
        }

        public Criteria andJrnNoIsNotNull() {
            addCriterion("JRN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andJrnNoEqualTo(String value) {
            addCriterion("JRN_NO =", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoNotEqualTo(String value) {
            addCriterion("JRN_NO <>", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoGreaterThan(String value) {
            addCriterion("JRN_NO >", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoGreaterThanOrEqualTo(String value) {
            addCriterion("JRN_NO >=", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoLessThan(String value) {
            addCriterion("JRN_NO <", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoLessThanOrEqualTo(String value) {
            addCriterion("JRN_NO <=", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoLike(String value) {
            addCriterion("JRN_NO like", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoNotLike(String value) {
            addCriterion("JRN_NO not like", value, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoIn(List<String> values) {
            addCriterion("JRN_NO in", values, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoNotIn(List<String> values) {
            addCriterion("JRN_NO not in", values, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoBetween(String value1, String value2) {
            addCriterion("JRN_NO between", value1, value2, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andJrnNoNotBetween(String value1, String value2) {
            addCriterion("JRN_NO not between", value1, value2, "jrnNo");
            return (Criteria) this;
        }

        public Criteria andReqStatusIsNull() {
            addCriterion("REQ_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReqStatusIsNotNull() {
            addCriterion("REQ_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReqStatusEqualTo(String value) {
            addCriterion("REQ_STATUS =", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotEqualTo(String value) {
            addCriterion("REQ_STATUS <>", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusGreaterThan(String value) {
            addCriterion("REQ_STATUS >", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS >=", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLessThan(String value) {
            addCriterion("REQ_STATUS <", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLessThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS <=", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLike(String value) {
            addCriterion("REQ_STATUS like", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotLike(String value) {
            addCriterion("REQ_STATUS not like", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusIn(List<String> values) {
            addCriterion("REQ_STATUS in", values, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotIn(List<String> values) {
            addCriterion("REQ_STATUS not in", values, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusBetween(String value1, String value2) {
            addCriterion("REQ_STATUS between", value1, value2, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotBetween(String value1, String value2) {
            addCriterion("REQ_STATUS not between", value1, value2, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkIsNull() {
            addCriterion("REQ_STATUS_RMK is null");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkIsNotNull() {
            addCriterion("REQ_STATUS_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkEqualTo(String value) {
            addCriterion("REQ_STATUS_RMK =", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkNotEqualTo(String value) {
            addCriterion("REQ_STATUS_RMK <>", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkGreaterThan(String value) {
            addCriterion("REQ_STATUS_RMK >", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS_RMK >=", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkLessThan(String value) {
            addCriterion("REQ_STATUS_RMK <", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkLessThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS_RMK <=", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkLike(String value) {
            addCriterion("REQ_STATUS_RMK like", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkNotLike(String value) {
            addCriterion("REQ_STATUS_RMK not like", value, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkIn(List<String> values) {
            addCriterion("REQ_STATUS_RMK in", values, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkNotIn(List<String> values) {
            addCriterion("REQ_STATUS_RMK not in", values, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkBetween(String value1, String value2) {
            addCriterion("REQ_STATUS_RMK between", value1, value2, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkNotBetween(String value1, String value2) {
            addCriterion("REQ_STATUS_RMK not between", value1, value2, "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResCdeIsNull() {
            addCriterion("RES_CDE is null");
            return (Criteria) this;
        }

        public Criteria andResCdeIsNotNull() {
            addCriterion("RES_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andResCdeEqualTo(String value) {
            addCriterion("RES_CDE =", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeNotEqualTo(String value) {
            addCriterion("RES_CDE <>", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeGreaterThan(String value) {
            addCriterion("RES_CDE >", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_CDE >=", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeLessThan(String value) {
            addCriterion("RES_CDE <", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeLessThanOrEqualTo(String value) {
            addCriterion("RES_CDE <=", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeLike(String value) {
            addCriterion("RES_CDE like", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeNotLike(String value) {
            addCriterion("RES_CDE not like", value, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeIn(List<String> values) {
            addCriterion("RES_CDE in", values, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeNotIn(List<String> values) {
            addCriterion("RES_CDE not in", values, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeBetween(String value1, String value2) {
            addCriterion("RES_CDE between", value1, value2, "resCde");
            return (Criteria) this;
        }

        public Criteria andResCdeNotBetween(String value1, String value2) {
            addCriterion("RES_CDE not between", value1, value2, "resCde");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNull() {
            addCriterion("RES_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNotNull() {
            addCriterion("RES_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andResStatusEqualTo(String value) {
            addCriterion("RES_STATUS =", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotEqualTo(String value) {
            addCriterion("RES_STATUS <>", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThan(String value) {
            addCriterion("RES_STATUS >", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RES_STATUS >=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThan(String value) {
            addCriterion("RES_STATUS <", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThanOrEqualTo(String value) {
            addCriterion("RES_STATUS <=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLike(String value) {
            addCriterion("RES_STATUS like", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotLike(String value) {
            addCriterion("RES_STATUS not like", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusIn(List<String> values) {
            addCriterion("RES_STATUS in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotIn(List<String> values) {
            addCriterion("RES_STATUS not in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusBetween(String value1, String value2) {
            addCriterion("RES_STATUS between", value1, value2, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotBetween(String value1, String value2) {
            addCriterion("RES_STATUS not between", value1, value2, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkIsNull() {
            addCriterion("RES_STATUS_RMK is null");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkIsNotNull() {
            addCriterion("RES_STATUS_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkEqualTo(String value) {
            addCriterion("RES_STATUS_RMK =", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkNotEqualTo(String value) {
            addCriterion("RES_STATUS_RMK <>", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkGreaterThan(String value) {
            addCriterion("RES_STATUS_RMK >", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkGreaterThanOrEqualTo(String value) {
            addCriterion("RES_STATUS_RMK >=", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkLessThan(String value) {
            addCriterion("RES_STATUS_RMK <", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkLessThanOrEqualTo(String value) {
            addCriterion("RES_STATUS_RMK <=", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkLike(String value) {
            addCriterion("RES_STATUS_RMK like", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkNotLike(String value) {
            addCriterion("RES_STATUS_RMK not like", value, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkIn(List<String> values) {
            addCriterion("RES_STATUS_RMK in", values, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkNotIn(List<String> values) {
            addCriterion("RES_STATUS_RMK not in", values, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkBetween(String value1, String value2) {
            addCriterion("RES_STATUS_RMK between", value1, value2, "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkNotBetween(String value1, String value2) {
            addCriterion("RES_STATUS_RMK not between", value1, value2, "resStatusRmk");
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

        public Criteria andReqTimeIsNull() {
            addCriterion("REQ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("REQ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(String value) {
            addCriterion("REQ_TIME =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(String value) {
            addCriterion("REQ_TIME <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(String value) {
            addCriterion("REQ_TIME >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_TIME >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(String value) {
            addCriterion("REQ_TIME <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(String value) {
            addCriterion("REQ_TIME <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLike(String value) {
            addCriterion("REQ_TIME like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotLike(String value) {
            addCriterion("REQ_TIME not like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<String> values) {
            addCriterion("REQ_TIME in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<String> values) {
            addCriterion("REQ_TIME not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(String value1, String value2) {
            addCriterion("REQ_TIME between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(String value1, String value2) {
            addCriterion("REQ_TIME not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andResTimeIsNull() {
            addCriterion("RES_TIME is null");
            return (Criteria) this;
        }

        public Criteria andResTimeIsNotNull() {
            addCriterion("RES_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andResTimeEqualTo(String value) {
            addCriterion("RES_TIME =", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotEqualTo(String value) {
            addCriterion("RES_TIME <>", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThan(String value) {
            addCriterion("RES_TIME >", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_TIME >=", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLessThan(String value) {
            addCriterion("RES_TIME <", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLessThanOrEqualTo(String value) {
            addCriterion("RES_TIME <=", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLike(String value) {
            addCriterion("RES_TIME like", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotLike(String value) {
            addCriterion("RES_TIME not like", value, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeIn(List<String> values) {
            addCriterion("RES_TIME in", values, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotIn(List<String> values) {
            addCriterion("RES_TIME not in", values, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeBetween(String value1, String value2) {
            addCriterion("RES_TIME between", value1, value2, "resTime");
            return (Criteria) this;
        }

        public Criteria andResTimeNotBetween(String value1, String value2) {
            addCriterion("RES_TIME not between", value1, value2, "resTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("PROCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("PROCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(String value) {
            addCriterion("PROCESS_TIME =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(String value) {
            addCriterion("PROCESS_TIME <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(String value) {
            addCriterion("PROCESS_TIME >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TIME >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(String value) {
            addCriterion("PROCESS_TIME <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TIME <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLike(String value) {
            addCriterion("PROCESS_TIME like", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotLike(String value) {
            addCriterion("PROCESS_TIME not like", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<String> values) {
            addCriterion("PROCESS_TIME in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<String> values) {
            addCriterion("PROCESS_TIME not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(String value1, String value2) {
            addCriterion("PROCESS_TIME between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TIME not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andMsgIdLikeInsensitive(String value) {
            addCriterion("upper(MSG_ID) like", value.toUpperCase(), "msgId");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLikeInsensitive(String value) {
            addCriterion("upper(TRADE_SRC) like", value.toUpperCase(), "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLikeInsensitive(String value) {
            addCriterion("upper(TRADE_TARGET) like", value.toUpperCase(), "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andChnLikeInsensitive(String value) {
            addCriterion("upper(CHN) like", value.toUpperCase(), "chn");
            return (Criteria) this;
        }

        public Criteria andServiceLikeInsensitive(String value) {
            addCriterion("upper(SERVICE) like", value.toUpperCase(), "service");
            return (Criteria) this;
        }

        public Criteria andOperateLikeInsensitive(String value) {
            addCriterion("upper(OPERATE) like", value.toUpperCase(), "operate");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLikeInsensitive(String value) {
            addCriterion("upper(TRADE_TYPE) like", value.toUpperCase(), "tradeType");
            return (Criteria) this;
        }

        public Criteria andJrnNoLikeInsensitive(String value) {
            addCriterion("upper(JRN_NO) like", value.toUpperCase(), "jrnNo");
            return (Criteria) this;
        }

        public Criteria andReqStatusLikeInsensitive(String value) {
            addCriterion("upper(REQ_STATUS) like", value.toUpperCase(), "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusRmkLikeInsensitive(String value) {
            addCriterion("upper(REQ_STATUS_RMK) like", value.toUpperCase(), "reqStatusRmk");
            return (Criteria) this;
        }

        public Criteria andResCdeLikeInsensitive(String value) {
            addCriterion("upper(RES_CDE) like", value.toUpperCase(), "resCde");
            return (Criteria) this;
        }

        public Criteria andResStatusLikeInsensitive(String value) {
            addCriterion("upper(RES_STATUS) like", value.toUpperCase(), "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusRmkLikeInsensitive(String value) {
            addCriterion("upper(RES_STATUS_RMK) like", value.toUpperCase(), "resStatusRmk");
            return (Criteria) this;
        }

        public Criteria andTradeAmtLikeInsensitive(String value) {
            addCriterion("upper(TRADE_AMT) like", value.toUpperCase(), "tradeAmt");
            return (Criteria) this;
        }

        public Criteria andReqTimeLikeInsensitive(String value) {
            addCriterion("upper(REQ_TIME) like", value.toUpperCase(), "reqTime");
            return (Criteria) this;
        }

        public Criteria andResTimeLikeInsensitive(String value) {
            addCriterion("upper(RES_TIME) like", value.toUpperCase(), "resTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLikeInsensitive(String value) {
            addCriterion("upper(PROCESS_TIME) like", value.toUpperCase(), "processTime");
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