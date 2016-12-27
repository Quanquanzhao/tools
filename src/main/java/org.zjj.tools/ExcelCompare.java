package org.zjj.tools;

import org.zjj.tools.file.FileUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hzzhaojuanjuan on 2016/12/24.
 */
public class ExcelCompare {

    public static void main(String[] args) {
        List<String> list = FileUtil.readFile("E:\\order_tmp.csv");
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>();
        for (String line : list) {
            String[] arr = line.split(",", -1);
            if (!arr[0].isEmpty()) {
                firstSet.add(arr[0]);
            }
            if (!arr[1].isEmpty()) {
                secondSet.add(arr[1]);
            }
        }
        System.out.println("firstSet size :"  + firstSet.size());
        System.out.println("secondSet size :"  + secondSet.size());
        int i = 0;
        System.out.println("第二列存在，但是第一列不存在的：");
        for (String second : secondSet) {
            if (!firstSet.contains(second)) {
                i ++;
                System.out.println(second);
            }
        }
        System.out.println("total: " + i);
        System.out.println("===============================");
        i = 0;
        System.out.println("第一列存在，但是第二列不存在的：");
        for (String first : firstSet) {
            if (!secondSet.contains(first)) {
                i ++;
                System.out.println(first);
            }
        }
        System.out.println("total: " + i);
        System.out.println("===============================");
        for (String second : secondSet) {
            System.out.println(second);
        }
    }
}
