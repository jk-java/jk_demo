package com.connection.container;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

@Component
public class BigContainer {

    List<String> bigDou;

    public void init(){
        bigDou = Collections.synchronizedList(new ArrayList<String>());
    }

    public Future auto

}
