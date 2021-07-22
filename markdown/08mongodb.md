# mongodb



## 1.连接

```
mongo

```

## 2.导入数据（json）

```
mongoimport --db lex --collection test2 --file /home/backend/test_tuoke.json
```

## 3.执行脚本（js） 导入数据

```
# mongo 127.0.0.1:27017/db /home/backend/test_tuoke.js  参数库名 文件名
mongo 127.0.0.1:27017/lex /home/backend/test_tuoke.js
```

