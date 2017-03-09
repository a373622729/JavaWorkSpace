package com.qf.chapter11.builder.carbuilder.builder;

import com.qf.chapter11.builder.carbuilder.model.BMWModel;
import com.qf.chapter11.builder.carbuilder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bwm = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bwm.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwm;
    }
}
