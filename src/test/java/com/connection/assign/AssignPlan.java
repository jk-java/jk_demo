package com.connection.assign;

import com.connection.container.BigContainer;
import com.connection.container.BlueContainer;
import com.connection.container.RedContainer;
import com.connection.container.SmallContainer;

import java.util.concurrent.Future;

public interface AssignPlan {

    public Future<Boolean> initBig(BigContainer bigContainer);

    public Future<Boolean> bigToSmall(BigContainer bigContainer , SmallContainer smallContainer);

    public Future<Boolean> smallToRed(SmallContainer smallContainer , RedContainer redContainer);

    public Future<Boolean> smallToBlue(SmallContainer smallContainer , BlueContainer blueContainer);
}
