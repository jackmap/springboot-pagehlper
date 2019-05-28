package com.example.sys.entity;

public class TErpSysSet {
    private Long setId;

    private String subject;

    private String logoAdd;

    private Long enterpriseId;

    public Long getSetId() {
        return setId;
    }

    public void setSetId(Long setId) {
        this.setId = setId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getLogoAdd() {
        return logoAdd;
    }

    public void setLogoAdd(String logoAdd) {
        this.logoAdd = logoAdd == null ? null : logoAdd.trim();
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}