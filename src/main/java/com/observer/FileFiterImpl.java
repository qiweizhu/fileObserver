package com.observer;

import java.io.File;
import java.io.FileFilter;

public class FileFiterImpl implements FileFilter{
    public boolean accept(File pathname) {
//        System.out.println("file_filter: "+pathname);
        return false;
    }
}
