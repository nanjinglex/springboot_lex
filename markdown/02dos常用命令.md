

# dos常用命令

## 1.查看端口占用

```
netstat -ano
```

```
C:\Users\admin、>netstat -ano

活动连接

  协议  本地地址          外部地址        状态           PID
  TCP    0.0.0.0:135            0.0.0.0:0              LISTENING       1072
  TCP    0.0.0.0:443            0.0.0.0:0              LISTENING       5184
  TCP    0.0.0.0:445            0.0.0.0:0              LISTENING       4
  TCP    0.0.0.0:808            0.0.0.0:0              LISTENING       3704
  TCP    0.0.0.0:902            0.0.0.0:0              LISTENING       4336
  TCP    0.0.0.0:912            0.0.0.0:0              LISTENING       4336
  TCP    0.0.0.0:1688           0.0.0.0:0              LISTENING       3672
```





```
netstat -ano|findstr 36677
```

```
C:\Users\admin、>netstat -ano|findstr 36677
  TCP    127.0.0.1:36677        0.0.0.0:0              LISTENING       18844
```





## 2.根据进程号pid查看进程

```
tasklist
```

```
C:\Users\admin、>tasklist

映像名称                       PID 会话名              会话#       内存使用
========================= ======== ================ =========== ============
System Idle Process              0 Services                   0          8 K
System                           4 Services                   0      1,816 K
Registry                       148 Services                   0     55,776 K
smss.exe                       540 Services                   0      1,008 K
csrss.exe                      700 Services                   0      6,236 K
wininit.exe                    788 Services                   0      7,444 K
services.exe                   860 Services                   0     13,012 K
lsass.exe                      904 Services                   0     13,544 K
svchost.exe                    616 Services                   0     19,512 K
fontdrvhost.exe                780 Services                   0        556 K
svchost.exe                   1072 Services                   0     14,912 K
svchost.exe                   1124 Services                   0      3,788 K
```





```
tasklist |findstr 18844
```

```
C:\Users\admin、>tasklist |findstr 18844
PicGo.exe                    18844 Console                    3     91,212 K
```

## 3.cmd杀掉进程

```bash
taskkill /f /t /im nginx.exe


\#根据服务名
taskkill /im nginx.exe /f

　　/im 立即
　　/f   强制结束进程

\#根据pid
taskkill /pid {pid}
```





## 4.telnet 测试ip端口连接

```
telnet 127.0.0.1 80
```

## 5.常用命令

```bash

#查看ip
ipconfig

#查看历史或者快捷鍵F7
doskey  /history 

#切换盘符（需要输入两条命令）
C:\Users\admin、>cd d:\environment
C:\Users\admin、>d:
d:\environment>doskey  /history
#或者
C:\Windows\system32>d:
D:\>cd d:\environment
d:\environment>

```

