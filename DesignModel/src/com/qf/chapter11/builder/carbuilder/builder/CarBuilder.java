package com.qf.chapter11.builder.carbuilder.builder;

import com.qf.chapter11.builder.carbuilder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public abstract class CarBuilder {
    //组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完顺序后,可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
