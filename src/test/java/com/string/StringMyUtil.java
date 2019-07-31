package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMyUtil {

    private static String compareData(String before, String latest) {
// 如果两个字符串相同，那么就不需要进行对比了
        if (before.equals(latest)) {
            return "";
        }
// 执行分割
        String[] s1 = before.split("@");
        String[] s2 = latest.split("@");
// 定义返回比对信息
        StringBuilder contrastData = new StringBuilder();
// 将信息保存到哈希表中
        Map<String, String> pack_before = new HashMap<String, String>();
        Map<String, String> pack_latest = new HashMap<String, String>();
// 保存上一次信息过程
        for (String temp : s1) {
            if (temp.length() == 0) {
                continue;
            }
            pack_before.put(temp.split("#")[0], temp.split("#")[1]);
        }
// 保存当前信息过程
        for (String temp : s2) {
            if (temp.length() == 0) {
                continue;
            }
            pack_latest.put(temp.split("#")[0], temp.split("#")[1]);
        }
// 遍历前一次信息，与当前信息做以对比
        for (Map.Entry e : pack_before.entrySet()) {
// 如果存在信息，进行下一步操作，否则，前一次信息中在当前执行的情况下，存在被删除的情况
            if (pack_latest.containsKey(e.getKey())) {
// 对比前一次与当前的结果值是否相同，不同的话进一步对比
                if (!pack_latest.get(e.getKey()).equals(e.getValue())) {
// 将包信息保存到整体信息中
                    contrastData.append("P:" + e.getKey() + "\n");
// 将类信息保存到链表中
                    List<String> beforeList = new ArrayList<>();
                    List<String> latestList = new ArrayList<>();
// 获取类信息的数组
                    String[] before_str = e.getValue().toString().split("\\|");
                    String[] latest_str = pack_latest.get(e.getKey()).toString().split("\\|");
// 遍历保存
                    for (String temp : before_str) {
                        beforeList.add(temp);
                    }
                    for (String temp : latest_str) {
                        latestList.add(temp);
                    }
                    // 将后一次中存在前一次的所有元素删除
                    latestList.removeAll(beforeList);

                    for (String latestTemp : latestList) {
                        String getClass = latestTemp.split("=")[0];
// 决定是否存在对比的信息
                        boolean flag = true;
                        for (String beforeTemp : beforeList) {
                            if (beforeTemp.split("=")[0].equals(getClass)) {
                                flag = false;
                            }
                            if (contrastData.toString().contains(latestTemp)) {
                                continue;
                            }
                            if (flag) {
// 新增加的信息
                                contrastData.append("NC:" + latestTemp + "\n");
                            } else {
// 可以对比的信息，B代表前一次的，L代表最新一次
                                contrastData.append("B:" + beforeTemp + "-L:" + latestTemp + "\n");
                                flag = true;
                            }
                        }
                    }
                }
            } else {
                System.out.println("already deleted!!" + e.getKey());
            }
        }
        return contrastData.toString();
    }

    public static void main(String[] args){
        String result = compareData("nihao","nihaoa");

    }

}
