package com.observer;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class Test {
    public static void main(String[] args){
        try {
            //构建观察者类
            FileAlterationObserver observer=new FileAlterationObserver(new File("F://jewel-ray"), FileFilterUtils.suffixFileFilter("txt"));
            //构建监听
            FileListenerAdaptor listener = new FileListenerAdaptor();
            //为观察者添加收听对象
            observer.addListener(listener);
            FileAlterationMonitor fileMonitor = new FileAlterationMonitor(5000,new FileAlterationObserver[]{observer});
            //启动开始监听
            fileMonitor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
