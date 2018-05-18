package com.nngdjt.test.entity;

import java.io.Serializable;

public class Result implements Serializable {
    private String recId;

    private String sysCde;

    private String result;

    private String creDte;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getCreDte() {
        return creDte;
    }

    public void setCreDte(String creDte) {
        this.creDte = creDte == null ? null : creDte.trim();
    }
}