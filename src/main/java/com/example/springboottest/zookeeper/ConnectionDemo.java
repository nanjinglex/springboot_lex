package com.example.springboottest.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ConnectionDemo.java
 * @Description TODO
 * @createTime 2021年11月11日 09:43:00
 */
public class ConnectionDemo {
    public static void main(String[] args) {
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ZooKeeper zooKeeper =
                    null;
//
//            zooKeeper = new ZooKeeper("192.168.72.36:2181",
//                    4000, new Watcher() {
//                @Override
//                public void process(WatchedEvent event) {
//                    if (Event.KeeperState.SyncConnected == event.getState()) {
//                        //如果收到了服务端的响应事件，连接成功
//                        countDownLatch.countDown();
//                    }
//                }
//            });

            //lambda写法
            zooKeeper = new ZooKeeper("192.168.72.36:2181",
                    4000, event -> {
                if (Watcher.Event.KeeperState.SyncConnected == event.getState()) {
//                        //如果收到了服务端的响应事件，连接成功
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
            //CONNECTED
            System.out.println(zooKeeper.getState());

            //简单示例添加节点 API:
            zooKeeper.create("/runoob","0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        } catch (IOException | InterruptedException | KeeperException e) {
            e.printStackTrace();
        }
    }
}
