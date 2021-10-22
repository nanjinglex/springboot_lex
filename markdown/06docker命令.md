# docker常用命令

```
#查看镜像
docker images

#获取镜像
docker pull

#使用以下命令创建一个以进程方式运行的容器
docker run -d ubuntu:15.10 /bin/sh -c "while true; do echo hello world; sleep 1; done"

#查看容器
docker ps -a
docker ps

#启动容器
$ docker start b750bbbcfd88 #容器id或者容器名

$ docker stop <容器 ID>

$ docker restart <容器 ID>

#进入容器
docker exec -it 243c32535da7 /bin/bash

#删除容器
$ docker rm -f 1e560fca3906

#查看日志
docker logs -f 32f #容器id或者容器名称
docker logs 32f

docker logs -f -t --tail=200 c5e #最近200行开始





通过docker logs命令可以查看容器的日志。

命令格式：

$ docker logs [OPTIONS] CONTAINER
  Options:
        --details        显示更多的信息
    -f, --follow         跟踪实时日志
        --since string   显示自某个timestamp之后的日志，或相对时间，如42m（即42分钟）
        --tail string    从日志末尾显示多少行日志， 默认是all
    -t, --timestamps     显示时间戳
        --until string   显示自某个timestamp之前的日志，或相对时间，如42m（即42分钟）
例子：

查看指定时间后的日志，只显示最后100行：

$ docker logs -f -t --since="2018-02-08" --tail=100 CONTAINER_ID



查看最近30分钟的日志:

$ docker logs --since 30m CONTAINER_ID



查看某时间之后的日志：

$ docker logs -t --since="2018-02-08T13:23:37" CONTAINER_ID


查看某时间段日志：


$ docker logs -t --since="2018-02-08T13:23:37" --until "2018-02-09T12:23:37" CONTAINER_ID







```

