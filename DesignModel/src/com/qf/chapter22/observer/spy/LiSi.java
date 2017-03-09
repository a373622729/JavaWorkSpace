package com.qf.chapter22.observer.spy;

/**
 * Created by ios on 16/11/11.
 */
public class LiSi implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动,开始向老板汇报...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯:汇报完毕.");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯:报告,秦老板!韩非子有活动了--->" + reportContext);
    }
}
