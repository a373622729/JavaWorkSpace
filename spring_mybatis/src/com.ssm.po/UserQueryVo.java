package com.ssm.po;

import java.util.List;

/**
 * Created by ios on 17/4/7.
 * Vo视图层面的对象
 */
public class UserQueryVo {
    //在这里包装所需要的查询条件
    private UserCustom    userCustom;
    //传入多个id
    private List<Integer> ids;

    //包装其他的查询条件


    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
}
