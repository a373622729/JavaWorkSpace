package com.qf.chapter25.visitor.use;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ios on 16/11/16.
 */
public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());
        }

    }

    //模拟出公司的人员情况,可以想象这个数据从持久层传递过来的
    public static List<Employee> mockEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        //产生员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        employees.add(zhangSan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("页面美工");
        lisi.setName("李四");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMALE);
        employees.add(lisi);

        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值,但是会拍马屁");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        employees.add(wangWu);

        return  employees;
    }
}
