#  VMwareUbuntu搭建kafka集群

## 1.VMware下载安装

## 2.创建新的虚拟机

### 2.1下载光盘映像文件

![1621212461(1)](C:\Users\admin、\Desktop\1621212461(1).png)

| 镜像站         | 地址                                 |
| :------------- | :----------------------------------- |
| 华为开源镜像站 | https://mirrors.huaweicloud.com/     |
| 阿里开源镜像站 | https://developer.aliyun.com/mirror/ |
| npm淘宝镜像    | https://npm.taobao.org/mirrors/      |
| 腾讯软件源     | https://mirrors.tencent.com/         |
| 搜狐镜像       | http://mirrors.sohu.com/             |



![image-20210512210820568](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20210512210820568.png)



![image-20210512210909346](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20210512210909346.png)

https://repo.huaweicloud.com/ubuntu-releases/18.04/



![image-20210512210408884](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512210408884.png)



### 2.2创建

![](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512210100558.png)

![image-20210512210209393](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512210209393.png)



![image-20210512211436284](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512211436284.png)



![image-20210512211613124](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512211613124.png)

![image-20210512211635421](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512211635421.png)

![image-20210512211722337](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512211722337.png)





## 3.windows共享文件到vmware Ubuntu

### 3.1windows建立共享文件夹

### 3.2访问

#### 3.2.1windows访问 

1.win+R

2.输入\ \\ip

#### 3.2.2 Ubuntu访问

1.文件夹下ctrl+L

2.输入 smb://ip

访问需要输入windows的用户名/密码  





## 4.jdk1.8安装

### 4.1安装jdk

#### 4.1.1解压tar包

#### 4.1.2配置环境变量



1. cd  /etc

2. sudo vim profile   --临时赋予root权限

3. i  --写入模式

```xml
export JAVA_HOME=/home/lex/Java/jdk1.8.0_91
export JRE_HOME=$JAVA_HOME/jre
export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
export PATH=.:$JAVA_HOME/bin:$JRE_HOME/bin:$PATH
```



4. Esc Shift+：wq!   --保存退出



5. source /etc/profile  --使变量配置生效



#### 4.1.3测试

java -version    --测试

![image-20210513114804233](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513114804233.png)

#### 



![image-20210513102406025](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513102406025.png)

## 5.Ubuntu配置静态ip

### 5.1修改地址

![image-20210513150251379](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513150251379.png)



![image-20210513150920317](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513150920317.png)

![image-20210513150431147](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513150431147.png)





### 5.2重启网络服务

```sh
 sudo /etc/init.d/networking restart
```



### 5.3验证

![image-20210513152810454](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513152810454.png)

## 6.Ubuntu修改主机名

### 6.1查看

```
hostname
```

### 6.2修改

```
vim /etc/hostname #用vim打开/etc/hostname文件
```



## 7.Ubuntu修改系统时间

https://blog.csdn.net/tank_ft/article/details/108866450



## 8.zookeeper集群安装

### 8.1解压

```shell
tar zxvf apache-zookeeper-3.6.1-bin.tar.gz
```

### 8.2修改配置

conf目录下提供了配置的样例zoo_sample.cfg，要将zk运行起来，需要将其名称修改为zoo.cfg，一般备份。 
打开zoo.cfg，可以看到默认的一些配置。

tickTime 
时长单位为毫秒，为zk使用的基本时间度量单位。例如，1 * tickTime是客户端与zk服务端的心跳时间，2 * tickTime是客户端会话的超时时间。 
tickTime的默认值为2000毫秒，更低的tickTime值可以更快地发现超时问题，但也会导致更高的网络流量（心跳消息）和更高的CPU使用率（会话的跟踪处理）。
clientPort 
zk服务进程监听的TCP端口，默认情况下，服务端会监听2181端口。
dataDir 
无默认配置，必须配置，用于配置存储快照文件的目录。如果没有配置dataLogDir，那么事务日志也会存储在此目录。



在集群模式下，所有的zk进程可以使用相同的配置文件（是指各个zk进程部署在不同的机器上面），例如如下配置：

```
tickTime=2000
#事先在apache-zookeeper-3.6.1-bin/目录下新建 zkdata
dataDir=/home/lex/data/app/apache-zookeeper-3.6.1-bin/zkdata
initLimit=5
syncLimit=2
clientPort=2181
server.1=192.168.24.140:2888:3888
server.2=192.168.24.141:2888:3888
server.3=192.168.24.142:2888:3888
```

### 8.3启动测试

bin目录下

```shell

  130  zkServer.sh start
  131  zkServer.sh status
  132  zkCli.sh start
  133  jps
  134  zkServer.sh stop
  135  zkServer.sh start
```





![image-20210514160715373](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514160715373.png)



![image-20210514160843656](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514160843656.png)



![image-20210514161507700](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514161507700.png)

日志查看



![image-20210514161314186](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514161314186.png)



客户端测试



可以使用以下命令来连接一个zk集群：

```
zkCli.sh -server 192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181
```

- 1

成功连接后，可以看到如下输出：

```
Welcome to ZooKeeper!
JLine support is enabled
2021-05-14 01:20:22,501 [myid:192.168.24.141:2181] - INFO  [main-SendThread(192.168.24.141:2181):ClientCnxn$SendThread@1154] - Opening socket connection to server 192.168.24.141/192.168.24.141:2181.
2021-05-14 01:20:22,504 [myid:192.168.24.141:2181] - INFO  [main-SendThread(192.168.24.141:2181):ClientCnxn$SendThread@1156] - SASL config status: Will not attempt to authenticate using SASL (unknown error)
2021-05-14 01:20:22,535 [myid:192.168.24.141:2181] - INFO  [main-SendThread(192.168.24.141:2181):ClientCnxn$SendThread@986] - Socket connection established, initiating session, client: /192.168.24.140:50736, server: 192.168.24.141/192.168.24.141:2181
2021-05-14 01:20:22,544 [myid:192.168.24.141:2181] - INFO  [main-SendThread(192.168.24.141:2181):ClientCnxn$SendThread@1420] - Session establishment complete on server 192.168.24.141/192.168.24.141:2181, session id = 0x2000428a1080000, negotiated timeout = 30000

WATCHER::

WatchedEvent state:SyncConnected type:None path:null
[zk: 192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181(CONNECTED) 0] 

```

客户端连接zk集群的输出日志

从日志输出可以看到，客户端连接的是192.168.24.141:2181进程（连接上哪台机器的zk进程是随机的），客户端已成功连接上zk集群。



## 9.kafka集群安装

### 9.1解压缩

```shell
  174  tar -zxvf kafka_2.13-2.8.0.tgz 
```

### 9.2修改配置

```
# The id of the broker. This must be set to a unique integer for each broker.
broker.id=0


#端口号
#port=9092
#服务器IP地址，修改为自己的服务器IP
#host.name=192.168.24.140

#集群间通信，内外网采用此配置，不用port和host.name(重要) 
#解决报错：could not be established. Broker may not be available
advertised.listeners=PLAINTEXT://192.168.24.140:9092

zookeeper.connect=192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181
delete.topic.enable=true
```



### 9.3启动测试

1.#启动

```
bin/kafka-server-start.sh config/server.properties
```

2.#创建topic:

```
bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181 --replication-factor 3 --partitions 2
```



3.列出可使用的topic：

```
bin/kafka-topics.sh --list --zookeeper localhost:2181
```

4.查询某个topic的信息：

```
bin/kafka-topics.sh --describe --topic huxing2 --zookeeper localhost:2181
```





5.简单测试（详细）

```
kafka安装和简单测试

# 安装zookeeper（apache-zookeeper-3.5.6-bin）
https://archive.apache.org/dist/zookeeper/zookeeper-3.5.6/apache-zookeeper-3.5.6-bin.tar.gz

# 安装kafka（kafka_2.11-2.3.1）
http://mirrors.tuna.tsinghua.edu.cn/apache/kafka/2.3.1/kafka_2.11-2.3.1.tgz

# 启动zookeeper
[root@localhost apache-zookeeper-3.5.6-bin]# bin/zkServer.sh start
/usr/bin/java
ZooKeeper JMX enabled by default
Using config: /svelldata/apache-zookeeper-3.5.6-bin/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED

# 启动kafka server
[root@localhost kafka_2.11-2.3.1]# bin/kafka-server-start.sh config/server.properties

# 创建一个话题，test话题2个分区
[root@localhost kafka_2.11-2.3.1]# bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic mytopic
或
[root@localhost kafka_2.11-2.3.1]# bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mytopic

# 显示所有话题
[root@localhost kafka_2.11-2.3.1]# bin/kafka-topics.sh --list --zookeeper localhost:2181

# 显示话题信息
[root@localhost kafka_2.11-2.3.1]# bin/kafka-topics.sh --describe --zookeeper localhost:2181 --topic mytopic

# 启动一个生产者（输入消息）
[root@localhost kafka_2.11-2.3.1]# bin/kafka-console-producer.sh --broker-list localhost:9092 --topic mytopic

# 启动一个消费者（等待消息）
# 注意这里的--from-beginning，每次都会从头开始读取，你可以尝试去掉和不去掉看下效果
[root@localhost kafka_2.11-2.3.1]# bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mytopic --from-beginning
或
[root@localhost kafka_2.11-2.3.1]# bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mytopic
```





## 10.zk&kafka总结

### 10.1启动zookeeper服务器（三台）

```
 bin/zkServer.sh start
```

### 10.2启动kafka服务器（三台）

个人配置 bin目录下启动

```
JMX_PORT=9988 kafka-server-start.sh -daemon /home/lex/data/app/kafka_2.13-2.8.0/config/server.properties
```

常规启动

```
bin/kafka-server-start.sh config/server.properties
```

停止

```
kafka-server-stop.sh 
```



###  10.3创建topic:

```
root@Ubuntu-1:/usr/local/kafka# bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.22.131:2181,192.168.22.132:2181,192.168.22.135:2181 --replication-factor 3 --partitions 2 
Created topic "huxing2".
```

### 10.4列出可使用的topic：

```
root@Ubuntu-1:/usr/local/kafka# bin/kafka-topics.sh --list --zookeeper localhost:2181
huxing2
```

### 10.5查询某个topic的信息：

```
root@Ubuntu-1:/usr/local/kafka#  bin/kafka-topics.sh --describe --topic huxing2 --zookeeper localhost:2181
Topic:huxing2    PartitionCount:2    ReplicationFactor:3    Configs:
    Topic: huxing2    Partition: 0    Leader: 0    Replicas: 0,1,2    Isr: 0,1,2
    Topic: huxing2    Partition: 1    Leader: 1    Replicas: 1,2,0    Isr: 1,2,0
```

## 11.克隆

![image-20210512205821780](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512205821780.png)

![image-20210512205721612](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512205721612.png)

![image-20210512205644167](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512205644167.png)

![image-20210512205603555](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512205603555.png)

![image-20210512205525077](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210512205525077.png)





克隆之后，新生成的要更新mac地址

![image-20210513201545649](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210513201545649.png)







## 12.问题记录(闭坑)

### 12.1  zk集群启动报错 Invalid config, exiting abnormally

1.zookeeper集群配置，myid文件  启动zk报错

如下：

```sh
tail: zookeeper-lex-server-ubuntu-vm-001.out: file truncated
2021-05-13 06:27:28,611 [myid:] - INFO  [main:QuorumPeerConfig@173] - Reading configuration from: /home/lex/data/app/apache-zookeeper-3.6.1-bin/bin/../conf/zoo.cfg
2021-05-13 06:27:28,619 [myid:] - INFO  [main:QuorumPeerConfig@459] - clientPortAddress is 0.0.0.0:2181
2021-05-13 06:27:28,619 [myid:] - INFO  [main:QuorumPeerConfig@463] - secureClientPort is not set
2021-05-13 06:27:28,619 [myid:] - INFO  [main:QuorumPeerConfig@479] - observerMasterPort is not set
2021-05-13 06:27:28,619 [myid:] - INFO  [main:QuorumPeerConfig@496] - metricsProvider.className is org.apache.zookeeper.metrics.impl.DefaultMetricsProvider
2021-05-13 06:27:28,623 [myid:] - ERROR [main:QuorumPeerMain@98] - Invalid config, exiting abnormally
org.apache.zookeeper.server.quorum.QuorumPeerConfig$ConfigException: Address unresolved: 192.168.24.140:3888  
	at org.apache.zookeeper.server.quorum.QuorumPeer$QuorumServer.<init>(QuorumPeer.java:319)
	at org.apache.zookeeper.server.quorum.flexible.QuorumMaj.<init>(QuorumMaj.java:92)
	at org.apache.zookeeper.server.quorum.QuorumPeerConfig.createQuorumVerifier(QuorumPeerConfig.java:672)
	at org.apache.zookeeper.server.quorum.QuorumPeerConfig.parseDynamicConfig(QuorumPeerConfig.java:703)
	at org.apache.zookeeper.server.quorum.QuorumPeerConfig.setupQuorumPeerConfig(QuorumPeerConfig.java:677)
	at org.apache.zookeeper.server.quorum.QuorumPeerConfig.parseProperties(QuorumPeerConfig.java:506)
	at org.apache.zookeeper.server.quorum.QuorumPeerConfig.parse(QuorumPeerConfig.java:193)
	at org.apache.zookeeper.server.quorum.QuorumPeerMain.initializeAndRun(QuorumPeerMain.java:124)
	at org.apache.zookeeper.server.quorum.QuorumPeerMain.main(QuorumPeerMain.java:90)
Invalid config, exiting abnormally
2021-05-13 06:27:28,627 [myid:] - INFO  [main:ZKAuditProvider@42] - ZooKeeper audit is disabled.
2021-05-13 06:27:28,677 [myid:] - ERROR [main:ServiceUtils@42] - Exiting JVM with code 2

```



原因：**zookeeper启动错误：Invalid config, exiting abnormally**

原因是在conf下面的zoo.cfg写配置时候，server.x=x.x.x.x:x:x 后面多了空格。

解决方案：删除多余空格即可。



### 12.2  zk启动，Error contacting service. It is probably not running.(个人配置问题，mark)

```shell
Using config: /home/lex/data/app/apache-zookeeper-3.6.1-bin/bin/../conf/zoo.cfg
Client port found: 2181. Client address: localhost.
Error contacting service. It is probably not running.

```

原因：myid文件的值跟zk的zoo.cfg文件中配置的错乱了

### 12.2 zk集群启动报错 Cannot open channel to 3 at election address /192.168.24.142:3888

```shell
2021-05-13 17:55:22,305 [myid:2] - WARN  [QuorumConnectionThread-[myid=2]-3:QuorumCnxManager@400] - Cannot open channel to 3 at election address /192.168.24.142:3888
java.net.ConnectException: Connection refused
	at java.net.PlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.zookeeper.server.quorum.QuorumCnxManager.initiateConnection(QuorumCnxManager.java:383)
	at org.apache.zookeeper.server.quorum.QuorumCnxManager$QuorumConnectionReqThread.run(QuorumCnxManager.java:457)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
2021-05-13 17:55:22,513 [myid:2] - INFO  [QuorumPeer[myid=2](plain=[0:0:0:0:0:0:0:0]:2181)(secure=disabled):FastLeaderElection@979] - Notification time out: 400
2021-05-13 17:55:22,515 [myid:2] - INFO  [WorkerReceiver[myid=2]:FastLeaderElection$Messenger$WorkerReceiver@389] - Notification: my state:LOOKING; n.sid:2, n.state:LOOKING, n.leader:2, n.round:0xa, n.peerEpoch:0x0, n.zxid:0x93, message format version:0x2, n.config version:0x0
2021-05-13 17:55:22,517 [myid:2] - WARN  [QuorumConnectionThread-[myid=2]-3:QuorumCnxManager@400] - Cannot open channel to 3 at election address /192.168.24.142:3888

```

 解决：

原因：使用虚拟机的原因

解决办法：

在配置文件中加上： quorumListenOnAllIPs=true

![img](https://img-blog.csdnimg.cn/20200107102913867.png)



https://blog.csdn.net/JHC_binge/article/details/103869832







### 12.3  Timed out waiting for connection while in state: CONNECTING

```shell
[2021-05-13 06:46:39,372] ERROR Fatal error during KafkaServer startup. Prepare to shutdown (kafka.server.KafkaServer)
kafka.zookeeper.ZooKeeperClientTimeoutException: Timed out waiting for connection while in state: CONNECTING
	at kafka.zookeeper.ZooKeeperClient.waitUntilConnected(ZooKeeperClient.scala:271)
	at kafka.zookeeper.ZooKeeperClient.<init>(ZooKeeperClient.scala:125)
	at kafka.zk.KafkaZkClient$.apply(KafkaZkClient.scala:1948)
	at kafka.server.KafkaServer.createZkClient$1(KafkaServer.scala:431)
	at kafka.server.KafkaServer.initZkClient(KafkaServer.scala:456)
	at kafka.server.KafkaServer.startup(KafkaServer.scala:191)
	at kafka.Kafka$.main(Kafka.scala:109)
	at kafka.Kafka.main(Kafka.scala)
[2021-05-13 06:46:39,377] INFO shutting down (kafka.server.KafkaServer)
[2021-05-13 06:46:39,394] INFO App info kafka.server for 0 unregistered (org.apache.kafka.common.utils.AppInfoParser)
[2021-05-13 06:46:39,396] INFO shut down completed (kafka.server.KafkaServer)
[2021-05-13 06:46:39,396] ERROR Exiting Kafka. (kafka.Kafka$)
[2021-05-13 06:46:39,399] INFO shutting down (kafka.server.KafkaServer)
lex@ubuntu-vm-002:~/data/app/kafka_2.13-2.8.0$ 
```

### 12.3Kafka Eagle界面kafka、zk信息不全问题

问题描述

```
Note: Kafka version is "-" or JMX Port is "-1" maybe kafka broker jmxport disable.
```

![image-20210514175742363](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514175742363.png)





解决：

1.Kafka Cluster Info信息不全

kafka启动时添加参数 ：JMX_PORT=9988

```
JMX_PORT=9988 kafka-server-start.sh -daemon /home/lex/data/app/kafka_2.13-2.8.0/config/server.properties
```

参考：  https://blog.csdn.net/zhengzaifeidelushang/article/details/109990727





 2.Kafka Zookeeper Info

zoo.cfg配置文件添加：

```
4lw.commands.whitelist=*
```

参考：   https://github.com/smartloli/kafka-eagle/issues/440



改后

![image-20210514181214930](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210514181214930.png)

### 12.4经验小结

1.配置文件内容后面不要多余空格



## 13.Kafka Eagle安装及使用

### 13.1.Kafka Eagle安装及使用简介（详细教程）

https://blog.csdn.net/qq_19524879/article/details/82848797



启动成功

![image-20210520105421365](https://raw.githubusercontent.com/nanjinglex/markdownPic/main/markdownpic/image-20210520105421365.png)

### 13.2.官网

https://www.kafka-eagle.org/



## 14.java测试kafka API





## 15.spring boot集成Kafka



### 15.1本地报错

```
[Consumer clientId=consumer-topic.group1-2, groupId=topic.group1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
```













