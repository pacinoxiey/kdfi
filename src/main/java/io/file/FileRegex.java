package io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author xiey
 * @version 2020/4/17
 * @description:
 */
public class FileRegex implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".iml")) {
            return true;
        }
        return false;
    }
}
