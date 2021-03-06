package com.ziroom.tech.designpattern.strategy.deligation;

import com.ziroom.tech.designpattern.strategy.interfacepackage.StrategyInterface;

/**
 * Created by LD.
 *
 * @date 29/12/2016.
 */
public interface ControlSyetem extends StrategyInterface{

    Boolean isWorking();

    String systemStart();

    String systemStop();
}
