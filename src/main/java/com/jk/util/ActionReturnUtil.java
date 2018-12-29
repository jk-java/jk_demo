package com.jk.util;

import java.util.HashMap;

public class ActionReturnUtil extends HashMap<String, Object> {

    public static ActionReturnUtil returnSuccess(){
        ActionReturnUtil returnMap = new ActionReturnUtil();
        returnMap.put("success",true);
        return returnMap;
    }

    public static ActionReturnUtil returnSuccessWithData(Object data){
        ActionReturnUtil returnMap = new ActionReturnUtil();
        returnMap.put("data", data);
        returnMap.put("success",true);
        return returnMap;
    }


    public static ActionReturnUtil returnSuccessWithMap(String key,String value){
        ActionReturnUtil returnMap = new ActionReturnUtil();
        returnMap.put(key, value);
        returnMap.put("success",true);
        return returnMap;
    }

    public static ActionReturnUtil returnError(){
        ActionReturnUtil returnMap = new ActionReturnUtil();
        returnMap.put("success",false);
        return returnMap;
    }

    public static ActionReturnUtil returnSuccessWithMsg(String msg){
        ActionReturnUtil returnMap = new ActionReturnUtil();
        returnMap.put("msg", msg);
        returnMap.put("success",true);
        return returnMap;
    }


}
