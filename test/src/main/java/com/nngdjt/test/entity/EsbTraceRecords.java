package com.nngdjt.test.entity;

import java.io.Serializable;

public class EsbTraceRecords implements Serializable {
    private String msgId;

    private String tradeSrc;

    private String tradeTarget;

    private String chn;

    private String service;

    private String operate;

    private String tradeType;

    private String jrnNo;

    private String reqStatus;

    private String reqStatusRmk;

    private String resCde;

    private String resStatus;

    private String resStatusRmk;

    private String tradeAmt;

    private String reqTime;

    private String resTime;

    private String processTime;

    private static final long serialVersionUID = 1L;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getTradeSrc() {
        return tradeSrc;
    }

    public void setTradeSrc(String tradeSrc) {
        this.tradeSrc = tradeSrc == null ? null : tradeSrc.trim();
    }

    public String getTradeTarget() {
        return tradeTarget;
    }

    public void setTradeTarget(String tradeTarget) {
        this.tradeTarget = tradeTarget == null ? null : tradeTarget.trim();
    }

    public String getChn() {
        return chn;
    }

    public void setChn(String chn) {
        this.chn = chn == null ? null : chn.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getJrnNo() {
        return jrnNo;
    }

    public void setJrnNo(String jrnNo) {
        this.jrnNo = jrnNo == null ? null : jrnNo.trim();
    }

    public String getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus == null ? null : reqStatus.trim();
    }

    public String getReqStatusRmk() {
        return reqStatusRmk;
    }

    public void setReqStatusRmk(String reqStatusRmk) {
        this.reqStatusRmk = reqStatusRmk == null ? null : reqStatusRmk.trim();
    }

    public String getResCde() {
        return resCde;
    }

    public void setResCde(String resCde) {
        this.resCde = resCde == null ? null : resCde.trim();
    }

    public String getResStatus() {
        return resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus == null ? null : resStatus.trim();
    }

    public String getResStatusRmk() {
        return resStatusRmk;
    }

    public void setResStatusRmk(String resStatusRmk) {
        this.resStatusRmk = resStatusRmk == null ? null : resStatusRmk.trim();
    }

    public String getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(String tradeAmt) {
        this.tradeAmt = tradeAmt == null ? null : tradeAmt.trim();
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    public String getResTime() {
        return resTime;
    }

    public void setResTime(String resTime) {
        this.resTime = resTime == null ? null : resTime.trim();
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime == null ? null : processTime.trim();
    }
}