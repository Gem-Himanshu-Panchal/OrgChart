package com.qa.orgchart.stepDefinitions;

import java.util.HashMap;
import java.util.List;

public class getEmployeeIndex {
    public static void main(String[] args) {
        List<HashMap<String, String>> hashMapList = jsonToHash.getHashList();
        String name = "Yashita Khurana";
        String code = "GSI GI 655";
        int index = 0;
        for(int i=0;i<hashMapList.size();i++){
            if(hashMapList.get(i).get("EmployeeName").equalsIgnoreCase(name) && hashMapList.get(i).get("EmployeeCode").equalsIgnoreCase(code)){
                index = i;break;
            }
        }

        System.out.println(index);
    }
}
