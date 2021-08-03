## 1.linux常用命令

```shell
    1  sudo  gedit   
    2  ll
    3  vim test
    4  cat test
    5  ll
    6  cd ../
    7  ll
    8  cd home/
    9  cd /etc
   10  ll
   11  cat profile
   12  vim
   13  sudo apt install vim 
   14  vim profile
   15  cd /etc
   16  cat profile
   17  vim profile
   18  ll
   19  cd data
   20  ll
   21  tar zxvf apache-zookeeper-3.6.1-bin.tar.gz
   22  ll
   23  cd app
   24  l
   25  cd apache-zookeeper-3.6.1-bin/
   26  ll
   27  cd bin/
   28  l
   29  ll
   30  cat README.txt 
   31  pwd
   32  cd ../conf/
   33  ll
   34  cd ../
   35  ll
   36  cd lib
   37  ll
   38  cd ../
   39  ll
   40  cd ../
   41  ll
   42  cd ../
   43  ll
   44  history
   45  ll
   46  tar zxvf kafka-eagle-bin-2.0.3.tar.gz
   47  ll
   48  cd app
   49  ll
   50  cd kafka-eagle-bin-2.0.3/
   51  ll
   52  tar zxvf kafka-eagle-web-2.0.3-bin.tar.gz
   53  ll
   54  cd ../
   55  ll
   56  cd apache-zookeeper-3.6.1-bin/
   57  ll
   58  cd bin
   59  ll
   60  cd ../
   61  ll
   62  cd ..
   63  ll
   64  cd kafka-eagle-bin-2.0.3/
   65  ll
   66  cd kafka-eagle-web-2.0.3/
   67  ll
   68  cd bin
   69  ll
   70  cat ke.bat 
   71  ll
   72  cd /etc
   73  sudo vim profile
   74  cat profile
   75  java -version
   76  source /etc/profile
   77  java -version
   78  javac
   79  cd ../
   80  ll
   81  cd home/
   82  ll
   83  cd lex
   84  ll
   85  date
   86  date -R
   87  tzselect
   88  date -R
   89  service network restart
   90  sudo /etc/init.d/networking restart
   91  ip addr
   92  ip addr
   93  ll
   94  ip addr
   95  sudo /etc/init.d/networking restart
   96  ip addr
   97  sudo /etc/init.d/networking restart
   98  ip addr
   99  hostname
  100  cd /etc/hostname
  101  cd /etc
  102  ll
  103  cat hostname 
  104  vim hostname 
  105  cd /etc
  106  cat hostname 
  107  vim hostname 
  108  sudo vim /etc/hostname
  109  vim hostname 
  110  cat /etc/hostname
  111  reboot
  112  cat /etc/hostname
  113  ip addr
  114  ll
  115  cp zoo_sample.cfg zoo.cfg
  116  ll
  117  cd ../
  118  ll
  119  mkdir zkdata
  120  ll
  121  cd zkdata/
  122  pwd
  123  cd ../conf
  124  ll
  125  cat zoo.cfg 
  126  vim zoo.cfg 
  127  sudo vim zoo.cfg
  128  sudo vim zoo.cfg 
  129  ll
  130  zkServer.sh start
  131  zkServer.sh status
  132  zkCli.sh start
  133  jps
  134  zkServer.sh stop
  135  zkServer.sh start
  136  zkServer.sh status
  137  zkCli.sh start
  138  ip addr
  139  zkCli.sh start -server 192.168.24.140:2181
  140  source /etc/profile
  141  zkServer.sh stop
  142  zkServer.sh start
  143  zkCli.sh start -server 192.168.24.140:2181
  144  cd /etc
  145  cat profile
  146  sudo vim /etc/profile
  147  ll
  148  cddata/app
  149  cd data.app
  150  cd data
  151  cd app
  152  ll
  153  ca apache-zookeeper-3.6.1-bin/
  154  cd apache-zookeeper-3.6.1-bin/
  155  ll
  156  cd bin
  157  ll
  158  cd ../zkdata/
  159  ll
  160  wget http://mirrors.shuosc.org/apache/kafka/1.0.0/kafka_2.11-1.0.0.tgz
  161  ll
  162  clear
  163  cd data 
  164  cd app
  165  ll
  166  cd kafka-eagle-bin-2.0.3/
  167  ll
  168  cd kafka-eagle-web-2.0.3/
  169  ll
  170  cd conf/
  171  ll
  172  cat system-config.properties 
  173  ll
  174  tar -zxvf kafka_2.13-2.8.0.tgz 
  175  ll
  176  cd app
  177  ll
  178  cd kafka_2.13-2.8.0/
  179  ll
  180  cd config/
  181  ll
  182  cat server.properties 
  183  cd ../
  184  ll
  185  mkdir logs
  186  ls
  187  cd bin
  188  ll
  189  ./bin/kafka-server-start.sh -daemon config/server.properties
  190  ./kafka-server-start.sh -daemon config/server.properties
  191  cd ../logs
  192  ll
  193  cat server.log 
  194  cd ../
  195  ll
  196  ./bin/kafka-server-start.sh -daemon config/server.properties
  197  cd ../
  198  ll
  199  cd logs
  200  ll
  201  cat zookeeper-lex-server-ubuntu-vm-001.out 
  202  ./zkServer.sh start
  203  jps
  204  ps
  205  kafka-server-start.sh config/server.properties
  206  ll
  207  cat zookeeper_audit.log 
  208  cd ../
  209  ll
  210  cd logs
  211  ll
  212  tailf zookeeper-lex-server-ubuntu-vm-001.out 
  213  tail -f zookeeper-lex-server-ubuntu-vm-001.out 
  214  zkServer.sh start
  215  jps
  216  zkServer.sh start
  217  bin/kafka-server-start.sh config/server.properties
  218  bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.22.131:2181,192.168.22.132:2181,192.168.22.135:2181 --replication-factor 3 --partitions 2 
  219  ip addr 
  220  ll
  221  tar xzvf kafka_2.13-2.8.0.tgz 
  222  jps
  223  ll
  224  cd logs
  225  ll
  226  tail -f server.log
  227  ll
  228  ll
  229  zkServer.sh status
  230  zkServer.sh start
  231  p[2~jps
  232  jps
  233  kill -9 2568
  234  jps
  235  zkServer.sh start
  236  zkServer.sh status
  237  jps
  238  zkServer.sh status
  239  jps
  240  kill -9 6165
  241  jps
  242  ll
  243  zkServer.sh status
  244  zkServer.sh start
  245  zkServer.sh status
  246  jps
  247  zkServer.sh status
  248  netstat -an | grep 2181 
  249  zkServer.sh status
  250  jps
  251  zkServer.sh status
  252  zkServer.sh start
  253  zkServer.sh status
  254  jps
  255  zkServer.sh stop
  256  jps
  257  zkServer.sh start
  258  zkServer.sh status
  259  jps
  260  zkServer.sh status
  261  zkCli.sh -server localhost:2181
  262  jps
  263  ll
  264  cd /home/data
  265  cd /home
  266  ll
  267  cd lex/data
  268  ll
  269  cd app
  270  ll
  271  cd kafka_2.13-2.8.0/
  272  ll
  273  cd config/
  274  ll
  275  cat server.properties 
  276  cd ../bin/
  277  ll
  278  cd ../
  279  bin/kafka-server-start.sh config/server.properties
  280  ll
  281  jps
  282  bin/kafka-server-start.sh config/server.properties
  283  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic huxing2
  284  bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181 --replication-factor 3 --partitions 2
  285  bin/kafka-topics.sh --describe --topic huxing2 --zookeeper localhost:2181
  286  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic huxing2
  287  cd ../logs
  288  ll
  289  tail -f zookeeper-lex-server-ubuntu-vm-001.out 
  290  jps
  291  ll
  292  sudo chomd 777 ke.sh
  293  ke.sh start
  294  pwd
  295  cat /etc/profile
  296  java -version
  297  zk -version
  298  sudo vim /etc/profile
  299  source /etc/profile
  300  cat /etc/profile
  301  ll
  302  cd ./
  303  cd ../
  304  ll
  305  cd logs
  306  ll
  307  cat error.log
  308  ll
  309  cd /etc
  310  ll
  311  cat profile
  312  env
  313  cat profile
  314  sudo vim profile
  315  cat profile
  316  source profile
  317  cat profile
  318  source profile
  319  sudo vim profile
  320  source profile
  321  zkServer.sh status
  322  history


  193  cat server.log 
  194  cd ../
  195  ll
  196  ./bin/kafka-server-start.sh -daemon config/server.properties
  197  cd ../
  198  ll
  199  cd logs
  200  ll
  201  cat zookeeper-lex-server-ubuntu-vm-001.out 
  202  ./zkServer.sh start
  203  jps
  204  ps
  205  kafka-server-start.sh config/server.properties
  206  ll
  207  cat zookeeper_audit.log 
  208  cd ../
  209  ll
  210  cd logs
  211  ll
  212  tailf zookeeper-lex-server-ubuntu-vm-001.out 
  213  tail -f zookeeper-lex-server-ubuntu-vm-001.out 
  214  zkServer.sh start
  215  jps
  216  zkServer.sh start
  217  bin/kafka-server-start.sh config/server.properties
  218  bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.22.131:2181,192.168.22.132:2181,192.168.22.135:2181 --replication-factor 3 --partitions 2 
  219  ip addr 
  220  ll
  221  tar xzvf kafka_2.13-2.8.0.tgz 
  222  jps
  223  ll
  224  cd logs
  225  ll
  226  tail -f server.log
  227  ll
  228  ll
  229  zkServer.sh status
  230  zkServer.sh start
  231  p[2~jps
  232  jps
  233  kill -9 2568
  234  jps
  235  zkServer.sh start
  236  zkServer.sh status
  237  jps
  238  zkServer.sh status
  239  jps
  240  kill -9 6165
  241  jps
  242  ll
  243  zkServer.sh status
  244  zkServer.sh start
  245  zkServer.sh status
  246  jps
  247  zkServer.sh status
  248  netstat -an | grep 2181 
  249  zkServer.sh status
  250  jps
  251  zkServer.sh status
  252  zkServer.sh start
  253  zkServer.sh status
  254  jps
  255  zkServer.sh stop
  256  jps
  257  zkServer.sh start
  258  zkServer.sh status
  259  jps
  260  zkServer.sh status
  261  zkCli.sh -server localhost:2181
  262  jps
  263  ll
  264  cd /home/data
  265  cd /home
  266  ll
  267  cd lex/data
  268  ll
  269  cd app
  270  ll
  271  cd kafka_2.13-2.8.0/
  272  ll
  273  cd config/
  274  ll
  275  cat server.properties 
  276  cd ../bin/
  277  ll
  278  cd ../
  279  bin/kafka-server-start.sh config/server.properties
  280  ll
  281  jps
  282  bin/kafka-server-start.sh config/server.properties
  283  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic huxing2
  284  bin/kafka-topics.sh --create --topic huxing2 --zookeeper 192.168.24.140:2181,192.168.24.141:2181,192.168.24.142:2181 --replication-factor 3 --partitions 2
  285  bin/kafka-topics.sh --describe --topic huxing2 --zookeeper localhost:2181
  286  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic huxing2
  287  cd ../logs
  288  ll
  289  tail -f zookeeper-lex-server-ubuntu-vm-001.out 
  290  jps
  291  ll
  292  sudo chomd 777 ke.sh
  293  ke.sh start
  294  pwd
  295  cat /etc/profile
  296  java -version
  297  zk -version
  298  sudo vim /etc/profile
  299  source /etc/profile
  300  cat /etc/profile
  301  ll
  302  ke.sh start
  303  sudo vim /etc/profile
  304  source /etc/profile
  305  ke.sh start
  306  jps
  307  kill -9 13169
  308  jps
  309  ke.sh start
  310  jps
  311  kill -9 13983
  312  jps
  313  ke.sh start
  314  jps
  315  ke.sh start
  316  jps
  317  kill -9 14685
  318  jps
  319  ke.sh start
  320  jps
  321  kill -9 14994
  322  jps
  323  ke.sh start
  324  jps
  325  history
  
    435  cd app/
  436  ll
  437  jps
  438  cd apache-zookeeper-3.6.1-bin/
  439  ll
  440  cd bin/
  441  ll
  442  zkServer.sh start
  443  zkServer.sh status
  444  cd ../ll
  445  cd ../
  446  ll
  447  cd ../
  448  ll
  449  cd kafka_2.13-2.8.0/
  450  ll
  451  cd bin/
  452  JMX_PORT=9988 kafka-server-start.sh -daemon /home/lex/data/app/kafka_2.13-2.8.0/config/server.properties
  453  ll
  454  cd ../
  455  ll
  456  cd ../
  457  ll
  458  cd kafka-eagle-bin-2.0.3/
  459  ll
  460  cd kafka-eagle-web-2.0.3/
  461  ll
  462  cd bin/
  463  ll
  464  ke.sh start
  465  ke.sh status
  466  jps
  467  ll
  468  jps
  #ÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¨ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¤ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ°dmesgÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¨ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂÄÂÄšÄĂĹĄÄšĹžĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂ
  469  dmesg
  470  cd /var/
  471  ll
  472  cd log
  473  ll
  474  cat syslog
  475  ll
  476  ls
  477  history 
  
  
  
    542  cd ~
  543  ll
  544  pwd
  545  cd /
  546  pwd
  547  cd ~
  548  ls -a
  549  ls -l
  550  ls
  551  cd test
  552  ll
  553  ls
  554  cat test 
  555  mkdir -p lex/lex2/lex3
  556  ls
  557  cd lex
  558  ls
  559  cd lex2/
  560  ll
  561  cd lex3/
  562  ll
  563  cd ~/test
  564  ll
  565  rmdir -p lex/lex2/lex3/
  566  ls
  567  history




```

## 2.linux 文本查看

```
  520  jps
  521  start.sh
  522  cat ../logs/stdout.log 
  523  ip addr
  524  jps
  525  telnet 192.168.24.1 3306
  526  vim /etc/mysql/mysql.conf.d/mysqld.cnf
  527  sudo vim /etc/mysql/mysql.conf.d/mysqld.cnf
  528  mysql -u root -p
  529  tail -f stdout.log 
  530  telnet 192.168.24.1 3306
  531  telnet 192.168.24.1
  532  ll
  533  cd ../
  534  ll
  535  cd ..
  536  cd ../
  537  ll
  538  ls -a
  539  ls -l
  540  ll
  541  cat test 
  542  nl test 
  543  more test 
  544  less test 
  545  tac test 
  546  head -n 20
  547  head test -n 20
  548  tail test -n 20
  549  more test 
  550  less test 
  551  more test 
  552  less test 
  553  touch f1
  554  ll
  555  ln f1 f2
  556  ll
  557  ln -s f1 f3
  558  ll
  559  echo "i love u" >>f1
  560  ll
  561  cat f1
  562  cat f2
  563  cat f3
  564  rm -rf f1
  565  ll
  566  cat f2
  567  cat f3
  568  history
 

```

## 3.vim模式

```
  #
  vim ss.txt #
  i 
  esc
  :wq!
  
  :set nu #ÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂÄÂÄšÄĂĹĄÄšĹžĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ§ÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¤ĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ
```

## 4.root用户

```
#1.ĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂÄÂÄšÄÄÂĂÂÄÂÄšÄÄÂĂÂrootÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¨ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂĂÂĂĹĄĂÂ ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂ
lex@ubuntu-vm-002:~/data/app/kafka_2.13-2.8.0/bin$ sudo passwd root
[sudo] password for lex: 
#2.ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂÄÂÄšÄĂĹĄÄšĹžÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂĂĹĄĂÂÄÂÄšÄĂĹĄĂËĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂ ĂÂĂÂÄÂĂÂ
Enter new UNIX password: 
#3..ÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂ¤ĂÂĂÂĂĹĄĂÂÄÂÄšÄĂĹĄĂËĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂ ĂÂĂÂÄÂĂÂ
Retype new UNIX password: 
passwd: password updated successfully
#4.ĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¨ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ
lex@ubuntu-vm-002:~/data/app/kafka_2.13-2.8.0/bin$ su root
Password: 
root@ubuntu-vm-002:/home/lex/data/app/kafka_2.13-2.8.0/bin# su lex
#5.ĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂrootÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ¨ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂĂÂĂĹĄĂÂ ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂ
lex@ubuntu-vm-002:~/data/app/kafka_2.13-2.8.0/bin$ sudo su
root@ubuntu-vm-002:/home/lex/data/app/kafka_2.13-2.8.0/bin# su lex
lex@ubuntu-vm-002:~/data/app/kafka_2.13-2.8.0/bin$ 



    7  usermod -d /home/lex1 lex1
    8  jps
    9  useradd -m lex1

   12  cat /etc/passwd
   13  userdel -r lex1

   15  cat /etc/passwd
   16  userdel -r lex1
   17  useradd -m lex1
   18  ls
   19  cat /etc/passwd
   20  usermod -d /home/233 lex1
   21  ls
   22  cat /etc/passwd
   23  su lex1
   24  su lex
   25  su lex
   26  ll
   27  su lex
   28  cat /etc/passwd
   29  ll
   30  usermod -d /home/lex1 lex1
   31  ll
   32  cat /etc/passwd
   33  su lex1
   34  sudo passwd lex1
   35  exit
   36  ll
   37  cat /etc/passwd
   38  su lex1
   39  userdel -r lex1
   40  ll
   41  cat /etc/passwd
   42  useradd -m lex1
   43  ll
   44  su lex1
   45  ll
   46  userdel -r lex1




```





## 5用户主、组

```
   41  cat /etc/passwd
   42  useradd -m lex1
   43  ll
   44  su lex1
   45  ll
   46  userdel -r lex1
   47  history 
   48  cat /etc/group
   49  cat /etc/passwd
   50  cat /etc/shadow
   51  df
   52  df -h
   53  du 
   54  du -a
   55  du -sm /*
   56  cd ../
   57  du -sm /*
   58  history

```

## 6.进程

```
  709  jps
  710  sudo su
  711  java -version
  712  jps
  713  ps
  714  ps -aux
  715  ps -aux|grep java
  716  ps -ef|java
  717  ps -ef|grep java
  718  jps
  719  pstree -pu
  720  kill -9 123456
  
  #ubuntu 查看CPU核心数
  #这个命令的结果是: 机器的cpu核数
    nproc

```

## 7.防火墙

```
  727  firewall-cmd --list-ports
  729  firewall-cmd --zone=public --add-port=9000/tcp --permanent
  730  systemctl restart firewalld.service
  731  firewall-cmd --list-ports

```



## 8.安装软件

### jdkÄşĹ˝ÂÄĹÂÄĹşÂrpmÄşĹ˝ÂÄĹÂÄĹşÂ

1ÄÂÂrpmĂ¤Â¸ÂÄËËÄşÂÂ°ÄşÂÂhttp://www.oracle.com/technetwork/java/javase/downloads/index.html

2ÄÂÂÄşĹÂÄÂÂÄÂÂÄşĹ˝ÂÄĹÂopenjdk ÄşÂÂÄşÂÂ¸ÄËË

```
[root@kuangshen ~]# java -version
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)
# ÄĹÂÄÂÄ˝
[root@kuangshen ~]# rpm -qa|grep jdk
jdk1.8.0_121-1.8.0_121-fcs.x86_64
# ÄşÂÂ¸ÄËË -e --nodeps ÄşĹşĹÄşÂĹÄşÂÂ ĂŠÂÂ¤
[root@kuangshen ~]# rpm -e --nodeps jdk1.8.0_121-1.8.0_121-fcs.x86_64
[root@kuangshen ~]# java -version
-bash: /usr/bin/java: No such file or directory  # OK
```

3ÄÂÂÄşĹ˝ÂÄĹÂJDK

```
# ÄşĹ˝ÂÄĹÂjava rpm
[root@kuangshen kuangshen]# rpm -ivh jdk-8u221-linux-x64.rpm

# ÄşĹ˝ÂÄĹÂÄşĹ˝ÂÄÂÂÄşÂÂĂŠÂÂĂ§ËĹ˝Ă§ÂĹťÄşËÂÄşÂÂĂŠÂÂ ÄÂÂĂ¤ĹĽĹÄĹşÂ/etc/profile
JAVA_HOME=/usr/java/jdk1.8.0_221-amd64
CLASSPATH=%JAVA_HOME%/lib:%JAVA_HOME%/jre/lib
PATH=$PATH:$JAVA_HOME/bin:$JAVA_HOME/jre/bin
export PATH CLASSPATH JAVA_HOME
# Ă¤ĹźÂÄşÂ­ÂĂŠÂÂÄşÂĹ

# ÄĹ˝Ĺ ÄÂÂ°ÄşËÂĂ§ÂÂĂ§ÂĹťÄşËÂÄşÂÂĂŠÂÂĂ§ÂÂÄÂÂÄĹşÂ
source /etc/profile

# ÄÄžÂÄĹťÂ java -version
[root@kuangshen java]# java -version
java version "1.8.0_221"
Java(TM) SE Runtime Environment (build 1.8.0_221-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.221-b11, mixed mode)
```



### TomcatÄşĹ˝ÂÄĹÂÄĹşÂÄÂ§ĹÄşÂÂĂ§ĹşĹ ÄşĹ˝ÂÄĹÂÄĹşÂ

1ÄÂÂÄşĹ˝ÂÄĹÂÄşÄ˝ËĂ¤ĹÂJavaĂ§ÂĹťÄşËÂÄşÂÂÄÂÂĂ¤ĹĽĹšÄşÂĹťĂ¤ĹĽÄ˝ÄÄžÂÄĹťÂĂ¤Â¸ÂTomcatÄĹşÂÄşÂÂÄşÂ¤ÂÄşÄ˝ËTomcatĂ§ÂÂÄşĹ˝ÂÄĹÂÄşÂÂÄĹşÂ

2ÄÂÂÄşÂ°ÂÄÂÂĂ¤ĹĽĹĂ§Â§ĹĽÄşÂÂ¨ÄşÂÂ°/usr/tomcat/Ă¤Â¸ÂÄĹşÂÄşĹĄĹÄÂ§ĹÄşÂÂÄĹşÂ

```
[root@kuangshen kuangshen]# mv apache-tomcat-9.0.22.tar.gz /usr
[root@kuangshen kuangshen]# cd /usr
[root@kuangshen usr]# ls
apache-tomcat-9.0.22.tar.gz
[root@kuangshen usr]# tar -zxvf apache-tomcat-9.0.22.tar.gz   # ÄÂ§ĹÄşÂÂ
```

3ÄÂÂÄĹźÂÄÄÂTomcatÄĹşÂÄĹźÂÄşÂÄ˝binĂ§ÂĹ˝ÄşËÂÄĹşÂÄşÂÂÄÂÂĂ¤ĹĽĹšĂ¤ĹĽÄ˝ÄşÂÂÄşÂÂ¨WindowsĂ¤Â¸ÂĂ§ÂÂĂ§ÂÂĂŠÂËÄÂĹťĂ¤Â¸ÂÄÂ ËĂ§ÂÂ

```
# ÄÂÂ§ÄÄÂÄĹşÂstartup.sh -->ÄşÂĹťÄşÂÂ¨tomcat
# ÄÂÂ§ÄÄÂÄĹşÂshutdown.sh -->ÄşÂĹĂŠÂÂ­tomcat
./startup.sh
./shutdown.sh
```

4ÄÂÂĂ§ÄĹ˝Ă¤ĹźÂLinuxĂ§ÂÂĂŠÂËĂ§ÂĹ¤ÄşËÂĂ§Ĺ¤ĹťÄşÂĹÄÂĹťÄşĹşÂÄşÂĹťĂ§ÂÂÄĹşÂÄşĹÂÄÂÂÄÂĹťĂŠÂĹźĂŠÂÂĂ¤ĹÂÄĹşÂĂŠÂÂÄĹÂĂ¤ĹźÂÄĹťÂĂŠÂĹźĂŠÂÂĂ¤ĹÂĂ§ÂÂÄşĹ˝ÂÄşÂÂ¨Ă§ĹĽÂĂ§Â­ÂĂ§ÂÄ˝ÄÂĹťÄşĹşÂÄÂĹžĂ§ÂÂÄĹşÂ

```
# ÄÂÄ˝Ă§ÂÂfirewallÄÂÂÄşÂÄĂ§ÂĹÄÂÂ
systemctl status firewalld

# ÄşĹşÂÄşÂĹťÄÂÂĂŠÂÂÄşÂĹťÄÂÂÄşÂĹĂŠÂÂ­ÄÂÂfirewalld.serviceÄÂÂÄşÂÄ
# ÄşĹşÂÄşÂĹť
service firewalld start
# ĂŠÂÂÄşÂĹť
service firewalld restart
# ÄşÂĹĂŠÂÂ­
service firewalld stop

# ÄÂÄ˝Ă§ÂÂĂŠÂËĂ§ÂĹ¤ÄşËÂÄÂ§ÂÄşÂÂ
firewall-cmd --list-all    # ÄÂÄ˝Ă§ÂÂÄşÂÂ¨ĂŠÂÂ¨Ă¤ĹźÄÄÂĹť
firewall-cmd --list-ports  # ÄşÂĹĂ§ÂÂĂ§Ĺ¤ĹťÄşÂĹĂ¤ĹźÄÄÂĹť

# ÄşĹşÂÄşÂĹťĂ§Ĺ¤ĹťÄşÂĹ
ÄşĹşÂĂ§Ĺ¤ĹťÄşÂĹÄşÂËĂ¤ĹĽÂ¤ÄĹşÂfirewall-cmd --zone=public --add-port=80/tcp --permanent
ĂŠÂÂÄşÂĹťĂŠÂËĂ§ÂĹ¤ÄşËÂÄĹşÂsystemctl restart firewalld.service

ÄşÂËĂ¤ĹĽÂ¤ÄşÂĹ¤Ă¤ĹĄÂÄĹşÂ
--zone #Ă¤ËÂĂ§ÂÂ¨ÄşÂÂ
--add-port=80/tcp  #ÄËĹĽÄşÂÂ Ă§Ĺ¤ĹťÄşÂĹÄĹşÂÄÂ ĹşÄşĹşÂĂ¤Â¸ĹÄĹşÂĂ§Ĺ¤ĹťÄşÂĹ/ĂŠÂÂÄĹ˝ĹťÄşÂÂÄĹ˝Ĺ˝
--permanent   #ÄÂ°Â¸Ă¤ĹĄÂĂ§ÂÂÄÂÂÄĹşÂÄËÄÄÂÂÄÂ­Â¤ÄşÂÂÄÂÂ°ĂŠÂÂÄşÂĹťÄşÂÂÄşÂ¤ÄÄÂÂ
```



### ÄşĹ˝ÂÄĹÂDockerÄĹşÂyumÄşĹ˝ÂÄĹÂÄĹşÂ

> ÄşÂĹĂ¤ĹÂ CentOS 7 ÄşĹ˝ÂÄĹÂ

1. ÄşĹ˝ÂĂ§ËÂÄşĹ˝ÂÄĹÂÄşÂÂÄÂÂÄÂÂÄşÂÂÄĹşÂhttps://docs.docker.com/install/linux/docker-ce/centos/

2. Ă§ÄĹ˝ÄşĹ˝ÂĂ¤ËÂ ÄÂĹťCentOS7ÄşÂÂĂ¤ĹĽÄ˝Ă¤Â¸ÂĂ§ÂÂÄÂĹš

   ```
   [root@192 Desktop]# cat /etc/redhat-release
   CentOS Linux release 7.2.1511 (Core)
   ```

3. yumÄşĹ˝ÂÄĹÂgccĂ§ÂÂ¸ÄşÂĹÄĹşÂĂŠÂÂÄĹÂĂ§ÄĹ˝Ă¤ĹźÂ ÄÂÂÄÂÂÄÂĹÄşÂĹťĂ¤ĹĽÄ˝Ă¤Â¸ÂÄşÂ¤ÂĂ§ËÂ ÄĹşÂ

   ```
   yum -y install gcc
   yum -y install gcc-c++
   ```

4. ÄşÂÂ¸ÄËËÄÂÂ§Ă§ÂÂÄÂĹš

   ```
   yum -y remove docker docker-common docker-selinux docker-engine
   # ÄşĹ˝ÂĂ§ËÂĂ§ÂÂÄÂĹš
   yum remove docker \
             docker-client \
             docker-client-latest \
             docker-common \
             docker-latest \
             docker-latest-logrotate \
             docker-logrotate \
             docker-engine
   ```

5. ÄşĹ˝ÂÄĹÂĂŠÂÂÄĹÂĂ§ÂÂÄËĹťĂ¤ĹĽĹÄşÂÂ

   ```
   yum install -y yum-utils device-mapper-persistent-data lvm2
   ```

6. ÄĹ˝ĹžĂ§ËĹ˝stableĂŠÂÂÄşÂÂĂ¤ĹĽÂÄşĹÂ

   ```
   # ĂŠÂÂÄĹťĹť
   yum-config-manager --add-repohttps://download.docker.com/linux/centos/docker-ce.repo
   ## ÄÂÄ˝ĂŠÂÂ
   [Errno 14] curl#35 - TCP connection reset by peer
   [Errno 12] curl#35 - Timeout
   
   # ÄÂ­ĹĂ§ÄĹ˝ÄÂÂ¨ÄÂÂĂ¤ËĹźĂ§ÂÂ¨ÄşÂËÄşÂÂĂ§ÂÂ
   yum-config-manager --add-repo http://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo
   ```

7. ÄÂÂ´ÄÂÂ°yumÄËĹťĂ¤ĹĽĹÄşÂÂĂ§Â´ËÄşĹşÂ

   ```
   yum makecache fast
   ```

8. ÄşĹ˝ÂÄĹÂDocker CE

   ```
   yum -y install docker-ce docker-ce-cli containerd.io
   ```

9. ÄşÂĹťÄşÂÂ¨docker

   ```
   systemctl start docker
   ```

10. ÄÄžÂÄĹťÂ

    ```
    docker version
    
    docker run hello-world
    
    docker images
    ```

    

### ÄşĹ˝ÂÄşÄÂĂŠÂËÄÂĹźÄşĹ˝ÂÄĹÂ

https://www.bilibili.com/video/av91821322







## 9.Ubuntu 18.04安装docker

Docker Ă§ÂÂÄÂÂ§Ă§ÂÂÄÂĹšÄËĹ¤Ă§Â§Â°Ă¤Â¸Ĺ dockerÄĹşÂdocker.io ÄÂÂ docker-engine ÄÂÂÄşĹÂÄÂÂÄşËËÄşĹ˝ÂÄĹÂÄĹşÂÄĹťËÄşÂÂ¸ÄËËÄşĹ˝ÂĂ¤ĹĽĹšÄĹşÂ

```
$ sudo apt-get remove docker docker-engine docker.io containerd runc
```

ÄşËÂÄşÂÂĂ§Â§Â°Ă¤Â¸Ĺ Docker Engine-Community ÄËĹťĂ¤ĹĽĹÄşÂÂ docker-ce ÄÂÂ

ÄşĹ˝ÂÄĹÂ Docker Engine-CommunityÄĹşÂĂ¤ĹĽÄ˝Ă¤Â¸ÂĂ¤ĹĽÂĂ§ĹĽÂĂ¤Â¸Â¤Ă§Â§ÂÄÂĹĄÄşĹşÂÄÂÂ

### Ă¤ËĹźĂ§ÂÂ¨ Docker Ă¤ĹĽÂÄşĹÂÄĹźÂÄÄÂÄşĹ˝ÂÄĹÂ

ÄşÂÂ¨ÄÂÂ°Ă¤Â¸ĹĽÄÂĹĂ¤Â¸ÂĂŠĹÂÄĹšÄÄşĹ˝ÂÄĹÂ Docker Engine-Community Ă¤ĹĄÂÄşÂÂÄĹşÂĂŠÂÂÄĹÂÄĹ˝ĹžĂ§ËĹ˝ Docker Ă¤ĹĽÂÄşĹÂÄÂÂĂ¤ĹĄÂÄşÂÂÄĹşÂÄÂÂ¨ÄşÂĹťĂ¤ĹĽÄ˝Ă¤ĹĽÂĂ¤ĹĽÂÄşĹÂÄşĹ˝ÂÄĹÂÄşÂÂÄÂÂ´ÄÂÂ° Docker ÄÂÂ

### ÄĹ˝ĹžĂ§ËĹ˝Ă¤ĹĽÂÄşĹÂ

ÄÂÂ´ÄÂÂ° apt ÄşÂÂĂ§Â´ËÄşĹşÂÄÂÂ

```
$ sudo apt-get update
```

ÄşĹ˝ÂÄĹÂ apt Ă¤ĹžÂÄÄžÂÄşÂÂÄĹşÂĂ§ÂÂ¨Ă¤ĹÂĂŠÂÂÄĹźÂHTTPSÄÂÄ˝ÄÂËÄşÂÂĂ¤ĹĽÂÄşĹÂ:

$ **sudo** **apt-get install** \
  apt-transport-https \
  ca-certificates \
  curl \
  gnupg-agent \
  software-properties-common

ÄËĹĽÄşÂÂ  Docker Ă§ÂÂÄşĹ˝ÂÄÂĹĄ GPG ÄşĹťÂĂŠÂÄ˝ÄĹşÂ

```
$ curl -fsSL https://mirrors.ustc.edu.cn/docker-ce/linux/ubuntu/gpg | sudo apt-key add -
```

9DC8 5822 9FC7 DD38 854A E2D8 8D81 803C 0EBF CD88 ĂŠÂÂÄĹźÂÄÂÂĂ§Â´ËÄÂÂĂ§ĹĹĄĂ§ÂÂÄşÂÂ8Ă¤Â¸ĹÄşÂ­ÂĂ§ĹšĹÄĹşÂĂŠĹÂÄĹťÂÄÂÂ¨Ă§ÂÂ°ÄşÂÂ¨ÄÂĹťÄşÂĹÄÂÄ˝ÄÂÂÄşÂ¸ĹÄÂÂÄÂÂĂ§ĹĹĄĂ§ÂÂÄşĹťÂĂŠÂÄ˝ÄÂÂ

$ **sudo** **apt-key** fingerprint 0EBFCD88

pub  rsa4096 2017-02-22 **[**SCEA**]**
   9DC8 5822 9FC7 DD38 854A  E2D8 8D81 803C 0EBF CD88
uid      **[** unknown**]** Docker Release **(**CE deb**)** **<**docker**@**docker.com**>**
sub  rsa4096 2017-02-22 **[**S**]**

Ă¤ËĹźĂ§ÂÂ¨Ă¤ĹĽÄ˝Ă¤Â¸ÂÄÂÂĂ¤ĹĽÂ¤ÄĹ˝ĹžĂ§ËĹ˝Ă§Â¨ĹÄşĹ˝ÂĂ§ÂÂĂ¤ĹĽÂÄşĹÂ

$ **sudo** add-apt-repository \
  "deb [arch=amd64] https://mirrors.ustc.edu.cn/docker-ce/linux/ubuntu/ **\
** $(lsb_release -cs) **\
** stable"

### ÄşĹ˝ÂÄĹÂ Docker Engine-Community

ÄÂÂ´ÄÂÂ° apt ÄşÂÂĂ§Â´ËÄşĹşÂÄÂÂ

```
$ sudo apt-get update
```

ÄşĹ˝ÂÄĹÂÄÂÂÄÂÂ°Ă§ÂÂÄÂĹšĂ§ÂÂ Docker Engine-Community ÄşÂÂ containerd ÄĹşÂÄÂÂÄÂÂÄËĹšÄşÂÂ°Ă¤Â¸ÂĂ¤Â¸ÂÄÂ­Ä˝ÄşĹ˝ÂÄĹÂĂ§ÂĹĄÄşĹ˝ÂĂ§ÂÂÄÂĹšÄĹşÂ

```
$ sudo apt-get install docker-ce docker-ce-cli containerd.io
```

ÄĹÂÄşĹ˝ÂÄĹÂĂ§ÂĹĄÄşĹ˝ÂĂ§ÂÂÄÂĹšĂ§ÂÂ Docker Engine-CommunityÄĹşÂÄĹťËÄşÂÂ¨Ă¤ĹĽÂÄşĹÂĂ¤Â¸Â­ÄşÂÂÄşÂĹÄşÂĹťĂ§ÂÂ¨Ă§ÂÂÄÂĹšÄĹşÂĂ§ÂĹÄşÂÂĂŠÂÂÄÂĹ Ă¤Â¸ÂĂ§Â§ÂÄşĹ˝ÂÄĹÂÄÂÂÄşÂÂÄşÂĹÄÂÂ¨Ă§ÂÂĂ¤ĹĽÂÄşĹÂĂ¤Â¸Â­ÄşÂĹťĂ§ÂÂ¨Ă§ÂÂĂ§ÂÂÄÂĹšÄĹşÂ

$ **apt-cache** madison docker-ce

 docker-ce **|** 5:18.09.1~3-0~ubuntu-xenial **|** https:**//**mirrors.ustc.edu.cn**/**docker-ce**/**linux**/**ubuntu  xenial**/**stable amd64 Packages
 docker-ce **|** 5:18.09.0~3-0~ubuntu-xenial **|** https:**//**mirrors.ustc.edu.cn**/**docker-ce**/**linux**/**ubuntu  xenial**/**stable amd64 Packages
 docker-ce **|** 18.06.1~ce~3-0~ubuntu    **|** https:**//**mirrors.ustc.edu.cn**/**docker-ce**/**linux**/**ubuntu  xenial**/**stable amd64 Packages
 docker-ce **|** 18.06.0~ce~3-0~ubuntu    **|** https:**//**mirrors.ustc.edu.cn**/**docker-ce**/**linux**/**ubuntu  xenial**/**stable amd64 Packages
 ...

Ă¤ËĹźĂ§ÂÂ¨Ă§ĹšĹšĂ¤ĹÂÄşÂÂĂ¤Â¸Â­Ă§ÂÂĂ§ÂÂÄÂĹšÄşÂ­ÂĂ§ĹšĹĂ¤Â¸ËÄşĹ˝ÂÄĹÂĂ§ÂĹĄÄşĹ˝ÂĂ§ÂÂÄÂĹšÄĹşÂĂ¤ĹžÂÄşĹÂ 5:18.09.1~3-0~ubuntu-xenialÄÂÂ

```
$ sudo apt-get install docker-ce=<VERSION_STRING> docker-ce-cli=<VERSION_STRING> containerd.io
```

ÄÄžÂÄĹťÂ Docker ÄÂĹťÄşÂĹÄşĹ˝ÂÄĹÂÄÂÂÄşÂÂÄĹşÂÄĹžÂÄşÂÄ˝Ă¤ĹĽÄ˝Ă¤Â¸ÂÄÂÂĂ¤ĹĽÂ¤ÄĹşÂÄÂÂÄşÂÂ°ÄşÂĹĂ¤ĹĽÄ˝Ă¤Â¸ÂĂ¤ĹźÄÄÂĹťÄşÂÂÄşĹ˝ÂÄĹÂÄÂÂÄşÂÂ:

$ **sudo** docker run hello-world

Unable to **find** image 'hello-world:latest' locally
latest: Pulling from library**/**hello-world
1b930d010525: Pull **complete**                                                                  Digest: sha256:c3b4ada4687bbaa170745b3e4dd8ac3f194ca95b2d0518b417fb47e5879d9b5f
Status: Downloaded newer image **for** hello-world:latest


Hello from Docker**!**
This message shows that your installation appears to be working correctly.


To generate this message, Docker took the following steps:
 \1. The Docker client contacted the Docker daemon.
 \2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
  **(**amd64**)**
 \3. The Docker daemon created a new container from that image **which** runs the
  executable that produces the output you are currently reading.
 \4. The Docker daemon streamed that output to the Docker client, **which** sent it
  to your terminal.


To try something **more** ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu **bash**


Share images, automate workflows, and **more** with a **free** Docker ID:
 https:**//**hub.docker.com**/**

For **more** examples and ideas, visit:
 https:**//**docs.docker.com**/**get-started**/**







ÄşÂÂÄÂÂÄĹşÂÄÂÂĂŠÂ¸Â

https://www.runoob.com/docker/ubuntu-docker-install.html

ĂŠÂĹ˝ĂŠËÂÄĹşÂ



docker ĂÂĂÂĂĹĄĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄÄšĹžĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂËĂÂĂÂÄÂĂÂhello-worldĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ°ÄÂĂÂĂĹĄĂÂ ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂÄÂĂÂĂĹĄĂÂ ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂUnable to find image 'hello-world:latest' locallyĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂÂĂÂĂÂÄÂĂÂ

docker ÄşĹ˝ÂÄĹÂÄşĹ˝ÂÄÂÂÄşÂÂÄÄžÂÄĹťÂhello-worldÄşÂĹĂ§ÂÂ°ĂŠÂĹ˝ĂŠËÂÄĹşÂUnable to find image 'hello-world:latest' locallyÄĹşÂ

https://blog.csdn.net/wireless911/article/details/88989620



### ÄÂĹšÄşÂÂ°ÄÂÂĂ¤ËÂÄĹşÂ



```
  #ÄÂÄ˝Ă§ÂÂubuntuĂ§ÂÂÄÂĹšÄşÂË
  766  cat /etc/issue


  770  sudo apt-get remove docker docker-engine docker-ce docker.io
  771  docker -v
  772  sudo apt-get update
  773  sudo apt-get install     apt-transport-https     ca-certificates     curl     gnupg-agent     software-properties-common
  774  curl -fsSL https://mirrors.ustc.edu.cn/docker-ce/linux/ubuntu/gpg | sudo apt-key add -
  775  sudo apt-key fingerprint 0EBFCD88

  777  sudo add-apt-repository    "deb [arch=amd64] https://mirrors.ustc.edu.cn/docker-ce/linux/ubuntu/ \
  $(lsb_release -cs) \
  stable"
  778  sudo apt-get update
  779  sudo apt-get install docker-ce docker-ce-cli containerd.io
  780  sudo docker run hello-world
  781  docker -v
  782  sudo apt-get install docker-ce docker-ce-cli containerd.io
  783  sudo docker run hello-world

  785  systemctl status docker
  786  cd /etc/docker
  787  ll
  788  sudo touch daemon.json
  789  ll

  791  sudo chmod 777 daemon.json
  792  ll
  793  sudo vim daemon.json 
#vimĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ
{ 
"registry-mirrors": ["https://alzgoonw.mirror.aliyuncs.com"] 
}

  794  cat daemon.json 
  795  systemctl restart docker #ÄÂĂÂĂĹĄĂÂ ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂĂĹĄĂÂĂÂĂÂÄÂĂÂÄÂÄšÄĂĹĄĂË
  796  systemctl status docker #ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂÄÂĂÂÄÂĂÂ§ĂÂĂÂÄÂĂÂÄÂÄšÄÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂĂÂĂÂÄÂĂÂ
  797  docker run hello-world
  798  sudo docker run hello-world
  799  docker -v
  800  history

```
```
#查看机器运行时间
backend@tgbigdata_dev_3:~$ uptime
18:12:47 up 61 days,  6:47,  2 users,  load average: 0.04, 0.03, 0.05```

