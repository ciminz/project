package com.nngdjt.test.entity;

import java.io.Serializable;

public class SystemTbl implements Serializable {
    private String sysCde;

    private String sysNme;

    private static final long serialVersionUID = 1L;

    public String getSysCde() {
        return sysCde;
    }

    public void setSysCde(String sysCde) {
        this.sysCde = sysCde == null ? null : sysCde.trim();
    }

    public String getSysNme() {
        return sysNme;
    }

    public void setSysNme(String sysNme) {
        this.sysNme = sysNme == null ? null : sysNme.trim();
    }
}