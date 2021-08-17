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






```

