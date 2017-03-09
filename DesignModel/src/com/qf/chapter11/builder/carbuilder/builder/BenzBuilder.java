package com.qf.chapter11.builder.carbuilder.builder;

import com.qf.chapter11.builder.carbuilder.model.BenzModel;
import com.qf.chapter11.builder.carbuilder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
