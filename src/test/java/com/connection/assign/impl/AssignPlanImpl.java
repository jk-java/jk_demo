package com.connection.assign.impl;

import com.connection.assign.AssignPlan;
import com.connection.container.BigContainer;
import com.connection.container.BlueContainer;
import com.connection.container.RedContainer;
import com.connection.container.SmallContainer;

import java.util.concurrent.Future;

public class AssignPlanImpl implements AssignPlan{

    @Override
    public Future<Boolean> initBig(BigContainer bigContainer) {
        bigContainer.

        return null;
    }

    @Override
    public Future<Boolean> bigToSmall(BigContainer bigContainer , SmallContainer smallContainer) {
        return null;
    }

    @Override
    public Future<Boolean> smallToRed(SmallContainer smallContainer , RedContainer redContainer) {
        return null;
    }

    @Override
    public Future<Boolean> smallToBlue(SmallContainer smallContainer , BlueContainer blueContainer) {
        return null;
    }
}
