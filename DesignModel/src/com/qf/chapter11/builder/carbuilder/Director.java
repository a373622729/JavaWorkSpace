package com.qf.chapter11.builder.carbuilder;

import com.qf.chapter11.builder.carbuilder.builder.BMWBuilder;
import com.qf.chapter11.builder.carbuilder.builder.BenzBuilder;
import com.qf.chapter11.builder.carbuilder.model.BMWModel;
import com.qf.chapter11.builder.carbuilder.model.BenzModel;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public class Director {
    private ArrayList<String> _sequence = new ArrayList<String>();
    private BenzBuilder _benzBuilder = new BenzBuilder();
    private BMWBuilder _bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        //清理场景,, 注意
        /**
         * 如果把ArrayList和HashMap定义为类成员变量,那么在方法调用中一定要做一个clear的动作,防止数据混乱
         */
        _sequence.clear();
        _sequence.add("start");
        _sequence.add("stop");
        _benzBuilder.setSequence(_sequence);
        return (BenzModel)_benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        _sequence.clear();
        _sequence.add("engineBoom");
        _sequence.add("start");
        _sequence.add("stop");
        _benzBuilder.setSequence(_sequence);
        return (BenzModel)_benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel() {
        _sequence.clear();
        _sequence.add("alarm");
        _sequence.add("start");
        _sequence.add("stop");
        _bmwBuilder.setSequence(_sequence);
        return (BMWModel)_bmwBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        _sequence.clear();
        _sequence.add("start");
        _bmwBuilder.setSequence(_sequence);
        return (BMWModel)_bmwBuilder.getCarModel();
    }
}
