参考：

https://blog.csdn.net/qq_35673617/article/details/107252286







提示：以下操作均在root用户下进行，如在普通用户，请自行加上sudo！

# 查看有没有安装MySQL：

dpkg -l | grep mysql

# 安装MySQL：

apt install mysql-server

如出现报错E: Unable to locate package mysql-server，解决的办法：使用命令 sudo apt-get update 更新软件源

如：

 再执行apt install mysql-server就可以安装了



安装完成之后可以使用如下命令来检查是否安装成功：

```
netstat -tap | grep mysql
```



通过上述命令检查之后，如果看到有 mysql 的socket处于 LISTEN 状态则表示安装成功。



登录mysql数据库可以通过如下命令：

``` 
mysql -u root -p
```



-u 表示选择登陆的用户名， -p 表示登陆的用户密码，现在是mysql数据库是没有密码的，Enter password:处直接回车，就能够进入mysql数据库。

然后通过 show databases; 就可以查看当前的所有数据库。



接下来，为了确保数据库的安全性和正常运转，对数据库进行初始化操作。这个初始化操作涉及下面5个步骤。

（1）安装验证密码插件。

（2）设置root管理员在数据库中的专有密码。

（3）随后删除匿名账户，并使用root管理员从远程登录数据库，以确保数据库上运行的业务的安全性。

（4）删除默认的测试数据库，取消测试数据库的一系列访问权限。

（5）刷新授权列表，让初始化的设定立即生效。

对于上述数据库初始化的操作步骤，在下面的输出信息旁边我做了简单注释。

root@ubuntu-virtual-machine:~# mysql_secure_installation

Securing the MySQL server deployment.

Connecting to MySQL using a blank password.

VALIDATE PASSWORD PLUGIN can be used to test passwords
and improve security. It checks the strength of password
and allows the users to set only those passwords which are
secure enough. Would you like to setup VALIDATE PASSWORD plugin?    # 要安装验证密码插件吗?

Press y|Y for Yes, any other key for No: N    # 这里我选择N
Please set the password for root here.

New password:   # 输入要为root管理员设置的数据库密码

Re-enter new password:   # 再次输入密码


By default, a MySQL installation has an anonymous user,
allowing anyone to log into MySQL without having to have
a user account created for them. This is intended only for
testing, and to make the installation go a bit smoother.
You should remove them before moving into a production
environment.

Remove anonymous users? (Press y|Y for Yes, any other key for No) : y     # 删除匿名账户
Success.


Normally, root should only be allowed to connect from
'localhost'. This ensures that someone cannot guess at
the root password from the network.

Disallow root login remotely? (Press y|Y for Yes, any other key for No) : N    # 禁止root管理员从远程登录，这里我没有禁止

... skipping.
By default, MySQL comes with a database named 'test' that
anyone can access. This is also intended only for testing,
and should be removed before moving into a production
environment.


Remove test database and access to it? (Press y|Y for Yes, any other key for No) : y   # 删除test数据库并取消对它的访问权限
- Dropping test database...
Success.

- Removing privileges on test database...
Success.

Reloading the privilege tables will ensure that all changes
made so far will take effect immediately.

Reload privilege tables now? (Press y|Y for Yes, any other key for No) : y   # 刷新授权表，让初始化后的设定立即生效
Success.

All done!



检查mysql服务状态：

systemctl status mysql

显示如下结果说明mysql服务运行是正常的：



再次用mysql -u root -p命令，Enter password:处输入刚设置的密码，回车，就能够进入mysql数据库。

使用 use mysql; 命令打开mysql命名的数据库，显示当前数据库的表：show tables; 查询user表里的数据：select * from user;（user表里是mysql数据库的所有账户信息）



现在配置mysql允许远程访问，首先编辑 /etc/mysql/mysql.conf.d/mysqld.cnf 配置文件：

vim /etc/mysql/mysql.conf.d/mysqld.cnf

注释掉bind-address          = 127.0.0.1



保存退出，然后进入mysql数据库，执行授权命令：

mysql -u root -p

mysql> grant all on *.* to root@'%' identified by '你的密码' with grant option;

mysql> flush privileges;    # 刷新权限

mysql> exit

然后执行exit命令退出mysql服务，再执行如下命令重启mysql：

systemctl restart mysql

现在Windows下可以使用Navicat图形化工具远程连接Ubuntu下的MySQL数据库，输入刚授权远程权限的密码。



OK，到这里Ubuntu18.04下安装MySQL已经完成了。

参考地址：https://www.cnblogs.com/opsprobe/p/9126864.html
————————————————
版权声明：本文为CSDN博主「qq_35673617」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_35673617/article/details/107252286