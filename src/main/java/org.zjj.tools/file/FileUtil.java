package org.zjj.tools.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzzhaojuanjuan on 2016/12/24.
 */
public class FileUtil {

    public static List<String> readFile(String file) {
        BufferedReader reader = null;
        List<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line = reader.readLine();
            while (null != line) {
                list.add(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null != reader) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
