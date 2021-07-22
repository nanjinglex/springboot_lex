# Nginx常用命令

## doskey

```

#启动 或者直接双击nginx.exe
start nginx

#停止
nginx -s stop

taskkill /f /t /im nginx.exe

nginx -s quit

#修改配置文件重启
nginx -s reload

#查看进程
tasklist /fi "imagename eq nginx.exe"



#查看ip
ipconfig

#查看历史
doskey  /history 
```



参考：

https://www.cnblogs.com/jiangwangxiang/p/8481661.html