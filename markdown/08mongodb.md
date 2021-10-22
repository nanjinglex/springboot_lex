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
```
#查找mongo安装目录，找到bin目录
 1704  find / -name mongo
 1705  cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/mongo/bin
 1706  cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/mongo
 1707  cd/mnt
 1708  cd /mnt
 1709  ll
 1710  cd mongodb-linux-x86_64-ubuntu1804-3.6.20
 1711  ll
 1712  cd bin
 1713  ll
 1714  ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1715  history
 
 1521  2021-10-13:19-44-34:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1526  2021-10-13:19-44-42:backend: ./mongo
 1564  2021-10-14:10-08-18:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1568  2021-10-14:10-08-22:backend: ./mongo
 1581  2021-10-14:11-02-21:backend: pip install pymongo
 1582  2021-10-14:11-02-27:backend: sudo  pip install pymongo
 1583  2021-10-14:11-03-00:backend: sudo python3 -m pip3 install pymongo
 1587  2021-10-14:11-55-16:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1591  2021-10-14:11-57-16:backend: ./mongo 10.100.0.17:27017/meeting -u "snail" -p "tungee_dev#2021"
 1592  2021-10-14:11-58-21:backend: ./mongo 10.100.0.17:27017/snail_db -u "snail" -p "tungee_dev#2021"
 1593  2021-10-14:13-59-44:backend: /mongo 10.100.0.17:27017/snail_db -u "snail" -p "tungee_dev#2021"
 1597  2021-10-14:13-59-58:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1601  2021-10-14:14-00-07:backend: ./mongo 10.100.0.17:27017/snail_db -u "snail" -p "tungee_dev#2021"
 1602  2021-10-14:14-16-31:backend: ./mongo 10.100.0.17:27017/snail_db -u "user: 'local-read'" -p "tungee_dev#2021"
 1605  2021-10-14:14-18-19:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1606  2021-10-14:14-18-48:backend: ./mongo 10.100.0.17:27017/local -u "local-read" -p "Tungee#local2021"
 1607  2021-10-14:14-18-57:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1610  2021-10-14:14-21-08:backend: ./mongo 10.100.0.17:27017/snail_db -u "snail" -p "tungee_dev#2021"
 1611  2021-10-14:14-24-32:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1615  2021-10-14:15-16-11:backend: vi mongodbtest.py
 1617  2021-10-14:15-17-08:backend: vi mongodbtest.py
 1621  2021-10-14:15-17-42:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1625  2021-10-14:15-17-47:backend: ./mongo
 1630  2021-10-14:15-18-26:backend: vi mongodbtest.py
 1631  2021-10-14:15-18-49:backend: python mongodbtest.py
 1632  2021-10-14:15-19-05:backend: vi mongodbtest.py
 1634  2021-10-14:15-25-24:backend: cat mongodbtest.py
 1635  2021-10-14:15-25-32:backend: python mongodbtest.py
 1637  2021-10-14:15-25-56:backend: vi mongodbtest.py
 1638  2021-10-14:15-26-57:backend: python mongodbtest.py
 1640  2021-10-14:15-37-19:backend: vi mongodbtest.py
 1641  2021-10-14:15-37-43:backend: python mongodbtest.py
 1642  2021-10-14:15-38-30:backend: vi mongodbtest.py
 1643  2021-10-14:15-40-10:backend: python mongodbtest.py
 1644  2021-10-14:15-40-45:backend: vi mongodbtest.py
 1645  2021-10-14:15-41-15:backend: python mongodbtest.py
 1646  2021-10-14:15-41-22:backend: vi mongodbtest.py
 1647  2021-10-14:15-41-37:backend: python mongodbtest.py
 1648  2021-10-14:15-41-43:backend: vi mongodbtest.py
 1649  2021-10-14:15-42-33:backend: python mongodbtest.py
 1654  2021-10-14:15-47-09:backend: cat mongodbtest.py
 1655  2021-10-14:15-47-36:backend: vi mongodbtest.py
 1656  2021-10-14:15-50-03:backend: nohup python mongodbtest.py &
 1657  2021-10-14:15-50-08:backend: cat mongodbtest.py
 1664  2021-10-14:15-54-28:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1668  2021-10-14:15-54-35:backend: ./mongo 10.100.0.17:27017/snail_db -u "user: 'local-read'" -p "tungee_dev#2021"
 1670  2021-10-14:15-55-10:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1676  2021-10-14:17-05-24:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1686  2021-10-14:17-05-45:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1691  2021-10-14:17-05-55:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1694  2021-10-14:20-25-16:backend: nohup python mongodbtest.py &
 1713  2021-10-15:14-31-54:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1717  2021-10-15:14-31-59:backend: ./mongo
 1718  2021-10-15:14-34-42:backend: ps -ef|grep mongo
 1722  2021-10-15:14-35-11:backend: ps -ef|grep mongo
 1724  2021-10-15:14-36-18:backend: ./mongod -f /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/data/mongodb.conf --replSet rs --oplogSize 10240 --auth
 1727  2021-10-15:14-39-38:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1728  2021-10-15:14-43-35:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456" ll
 1792  2021-10-15:16-20-36:backend: cat mongodbtest.py
 1796  2021-10-15:17-02-24:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1801  2021-10-15:17-02-33:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1805  2021-10-15:17-02-46:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1807  2021-10-15:16-41-12:backend: vi mongodbtest.py
 1809  2021-10-15:16-47-21:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1813  2021-10-15:16-47-32:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1816  2021-10-15:16-47-37:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1819  2021-10-15:16-51-19:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1821  2021-10-15:17-06-03:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1825  2021-10-15:17-33-31:backend: cat mongodbtest.py
 1826  2021-10-15:17-33-39:backend: vi mongodbtest.py
 1827  2021-10-15:17-34-09:backend: python mongodbtest.py
 1828  2021-10-15:17-34-29:backend: vi mongodbtest.py
 1830  2021-10-15:17-35-09:backend: vi mongodbtest.py
 1831  2021-10-15:17-35-31:backend: python mongodbtest.py
 1837  2021-10-15:17-36-19:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1840  2021-10-15:17-36-24:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1841  2021-10-15:17-48-22:backend: cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/
 1842  2021-10-15:17-48-24:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1846  2021-10-15:17-49-14:backend: vi mongodbtest.py
 1850  2021-10-15:17-50-25:backend: vi mongodbtest.py
 1851  2021-10-15:17-51-32:backend: python mongodbtest.py
 1852  2021-10-15:17-51-44:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1853  2021-10-15:17-51-50:backend: cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/
 1854  2021-10-15:17-51-52:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1868  2021-10-18:09-50-22:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1872  2021-10-18:09-50-28:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1903  2021-10-18:12-03-17:backend: history|gerp mongo
 1904  2021-10-18:12-03-22:backend: history|grep mongo
 1908  2021-10-18:12-03-38:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1912  2021-10-18:12-03-43:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1914  2021-10-18:14-56-34:backend: history|mongo
 1915  2021-10-18:14-56-41:backend: history|grep mongo
 1919  2021-10-18:14-57-20:backend: cd mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/
 1921  2021-10-18:14-57-24:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1928  2021-10-18:15-19-55:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1929  2021-10-18:15-25-16:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1935  2021-10-18:15-34-53:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1941  2021-10-18:16-06-42:backend: cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/
 1946  2021-10-18:16-07-00:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1951  2021-10-18:16-18-44:backend: ./mongo 10.100.0.17:27017/snail_db -u "local-read" -p "Tungee#local2021"
 1956  2021-10-18:16-30-09:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1962  2021-10-18:16-32-32:backend: cat mongodbtest.py
 1963  2021-10-18:16-39-00:backend: vi mongodbtest.py
 1964  2021-10-18:16-39-35:backend: python mongodbtest.py
 1966  2021-10-18:16-39-45:backend: cd /mnt/mongodb-linux-x86_64-ubuntu1804-3.6.20/bin/
 1969  2021-10-18:16-39-57:backend: ./mongo 10.100.0.21:27017/testdb -u "testuser" -p "123456"
 1973  2021-10-18:16-42-40:backend: vi mongodbtest.py
 1975  2021-10-18:16-43-09:backend: cp mongodbtest.py  /mnt
 1978  2021-10-18:16-43-32:backend: nohup python mongodbtest.py &
 1998  2021-10-18:17-52-10:backend: ps -ef|grep mongo
 1999  2021-10-19:11-00-41:backend: history |grep mongo
 
 
 
 
 
```

