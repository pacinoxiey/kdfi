package io.file;

import java.io.File;
import java.io.IOException;

/**
 * @author xiey
 * @version 2020/4/17
 * @description:
 */
public class FileUse {

    public static void main(String[] args) throws IOException {

        File file = new File(".");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        String[] list = file.list(new FileRegex());

        for (String s : list) {
            System.err.println(s);
        }


    }

    public void filter(File file) {
        String[] list = file.list(new FileRegex());
        System.err.println(list.toString());
    }
}
