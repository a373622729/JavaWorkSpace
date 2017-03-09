package com.qf.chapter19.adapter.outer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ios on 16/11/7.
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<String, String >();
        baseInfoMap.put("userName","这个员工叫混世魔王");
        baseInfoMap.put("mobileNumber","这个员工的电话是");
        return  baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfoMap = new HashMap<String, String >();
        officeInfoMap.put("jobPosition","这个人的职位是BOSS");
        officeInfoMap.put("officeTelNumber","这个人的办公电话是...");
        return officeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfoMap = new HashMap<String, String>();
        homeInfoMap.put("homeTelNumber","员工的家庭电话是...");
        homeInfoMap.put("homeAddress","员工的家庭住址是...");
        return homeInfoMap;
    }
}
