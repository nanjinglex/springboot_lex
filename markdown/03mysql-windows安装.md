# 1.mysql安装

## 1.1参考链接

https://blog.csdn.net/ychgyyn/article/details/84404217



## 1.2解压包

D:\software\mysql-5.7.32-winx64.zip



## 1.3注意细节

![image-20210520194647688](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20210520194647688.png)

&?xwT1qVWUEC



```
alter user 'root'@'localhost' identified by '123456';
```
解压主目录下D:\software\mysql-5.7.32-winx64可添加my.ini进行配置，配置完重启mysql服务：
管理员打开cmd：
cmd下执行

net stop mysql

net start mysql











# 2.redis本地安装

## 2.1参考链接

https://blog.csdn.net/leisure_life/article/details/82078233



## 2.2安装文件

D:\software\Redis-x64-3.2.100.msi\



## 2.3修改密码注意点

修改密码，查看执行配置文件，修改配置文件

![image-20210520202107040](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20210520202107040.png)





修改配置文件：

D:\software\Redis\redis.windows-service.conf

```
requirepass 123456
```

