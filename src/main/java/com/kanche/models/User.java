package com.kanche.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xialei on 16/3/28.
 */
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;
    private Date createAt;
    private Date updateAt;
    private Long createBy;
    private Long updateBy;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
