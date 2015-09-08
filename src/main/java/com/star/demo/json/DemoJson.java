package com.star.demo.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhangdi on 2015-09-08.
 */
public class DemoJson {
    public static void main(String args[]) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 100);
        jsonObject.put("name", "zhangdi");

        JSONArray jsonArray = new JSONArray();
        JSONObject jObject = new JSONObject();
        jObject.put("cellname", "iphone");
        jObject.put("version", 6);
        jsonArray.add(jObject);

        jObject = new JSONObject();
        jObject.put("cellname", "mi");
        jObject.put("version", 5);
        jsonArray.add(jObject);

        jsonObject.put("cells", jsonArray);

        jsonObject.put("age", 26);

        String s = jsonObject.toJSONString();
        System.out.println(s);

        int a = 10;
        a++;
    }
}
