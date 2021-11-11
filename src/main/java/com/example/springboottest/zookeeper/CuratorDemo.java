package com.example.springboottest.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.data.Stat;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName CuratorDemo.java
 * @Description TODO
 * @createTime 2021年11月11日 09:56:00
 */
public class CuratorDemo {
    public static void main(String[] args) {
        CuratorFramework curatorFramework= CuratorFrameworkFactory.
                builder().connectString("192.168.72.36:2181").
                sessionTimeoutMs(4000).retryPolicy(new
                ExponentialBackoffRetry(1000,3)).
                namespace("").build();
        curatorFramework.start();
        Stat stat=new Stat();
        //查询节点数据
        byte[] bytes = new byte[0];
        try {
            bytes = curatorFramework.getData().storingStatIn(stat).forPath("/runoob");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new String(bytes));
        curatorFramework.close();
    }
}
