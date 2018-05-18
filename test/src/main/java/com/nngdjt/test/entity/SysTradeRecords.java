package com.nngdjt.test.entity;

import java.io.Serializable;

public class SysTradeRecords implements Serializable {
    private String recId;

    private String sysCde;

    private String totCnt;

    private String unAcctCnt;

    private String acctCnt;

    private String tradeAmt;

    private String succAmt;

    private String eleChnCnt;

    private String crtDte;

    private static final long serialVersionUID = 1L;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId == null ? null : recId.trim();
    }

    public String getSysCde() {
        return sysCde;
    }

    public void setSysCde(String sysCde) {
        this.sysCde = sysCde == null ? null : sysCde.trim();
    }

    public String getTotCnt() {
        return totCnt;
    }

    public void setTotCnt(String totCnt) {
        this.totCnt = totCnt == null ? null : totCnt.trim();
    }

    public String getUnAcctCnt() {
        return unAcctCnt;
    }

    public void setUnAcctCnt(String unAcctCnt) {
        this.unAcctCnt = unAcctCnt == null ? null : unAcctCnt.trim();
    }

    public String getAcctCnt() {
        return acctCnt;
    }

    public void setAcctCnt(String acctCnt) {
        this.acctCnt = acctCnt == null ? null : acctCnt.trim();
    }

    public String getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(String tradeAmt) {
        this.tradeAmt = tradeAmt == null ? null : tradeAmt.trim();
    }

    public String getSuccAmt() {
        return succAmt;
    }

    public void setSuccAmt(String succAmt) {
        this.succAmt = succAmt == null ? null : succAmt.trim();
    }

    public String getEleChnCnt() {
        return eleChnCnt;
    }

    public void setEleChnCnt(String eleChnCnt) {
        this.eleChnCnt = eleChnCnt == null ? null : eleChnCnt.trim();
    }

    public String getCrtDte() {
        return crtDte;
    }

    public void setCrtDte(String crtDte) {
        this.crtDte = crtDte == null ? null : crtDte.trim();
    }
}