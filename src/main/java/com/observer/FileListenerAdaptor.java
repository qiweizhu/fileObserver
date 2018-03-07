package com.observer;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;

import java.io.File;

public class FileListenerAdaptor extends FileAlterationListenerAdaptor {
    @Override
    public void onDirectoryCreate(File fold) {
        System.out.println("fold: "+fold.getAbsolutePath()+" is created.");
        super.onDirectoryCreate(fold);
    }

    @Override
    public void onDirectoryChange(File fold) {
        System.out.println("fold: "+fold.getAbsolutePath()+" is changed.");
        super.onDirectoryChange(fold);
    }

    @Override
    public void onDirectoryDelete(File fold) {
        System.out.println("fold: "+fold.getAbsolutePath()+" is deleted.");
        super.onDirectoryDelete(fold);
    }

    @Override
    public void onFileCreate(File file) {
        String fullname=file.getAbsolutePath();
        System.out.println("文件创建了:"+fullname);
        super.onFileCreate(file);
    }

    @Override
    public void onFileChange(File file) {
        String fullname=file.getAbsolutePath();
        System.out.println("文件内容改变了: "+fullname);
        super.onFileChange(file);
    }

    @Override
    public void onFileDelete(File file) {
        String fullname=file.getAbsolutePath();
        System.out.println("文件删除了:"+fullname);
        super.onFileDelete(file);
    }
}
