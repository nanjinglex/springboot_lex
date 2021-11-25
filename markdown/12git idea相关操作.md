# git idea相关操作

## 1.dev分支提交cherry-pick到master分支

1.checkout到dev分支，提交修改代码，提交到dev分支

Git commit 选择要提交的文件 ，然后选择commit and push

![image-20211106111556697](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106111556697.png)



点击push，默认push到远程dev分支



push成功后，

，github上面看到提交记录

![image-20211106112357907](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106112357907.png)

![image-20211106112446963](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106112446963.png)



在git log面板里面可以看到push的记录

![image-20211106111843749](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106111843749.png)





2.切换到master分支

![image-20211106112542119](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106112542119.png)



git log面板中 cherry-pick dev分支刚刚push记录（右击dev合并main测试3，点击cherr-Pick 或者 选中dev合并main测试3，点击上面的樱桃）

![image-20211106112805197](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106112805197.png)

![image-20211106113026210](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113026210.png)



此时，dev分支的提交就被commit到master分支了，

可以看到记录

![image-20211106113435562](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113435562.png)

接下来进行push操作

点击下图的push选项

![image-20211106113224496](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113224496.png)

或者

![image-20211106113457527](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113457527.png)



会进入push操作

![image-20211106113521464](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113521464.png)



push成功后

![image-20211106113721289](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113721289.png)

 看到github

![image-20211106113847910](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113847910.png)

![image-20211106113907571](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106113907571.png)

![RUNOOB 图标](http://static.runoob.com/images/runoob-logo.png)

```

```



## 2.idea git add操作以及误操作git add不需要提交的文件撤销

### 2.1 git add

未添加到git的文件显示为红色如图，新增到git中的会变成绿色，文件修改会变为蓝色

![image-20211106140442639](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106140442639.png)

接下来进行 git commit到本地，然后push到源端



### 2.2误操作git add了不需要提交的文件

![image-20211106140705080](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106140705080.png)

![image-20211106140753163](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106140753163.png)



进行撤回

![image-20211106140853514](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106140853514.png)

![image-20211106140905511](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106140905511.png)





撤销后：

![image-20211106141223545](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106141223545.png)



## 3.git stash & git unstash（目的暂存本地的代码）

当我们修改添加了很多代码，git add，然而这些代码没有实际测试，不需要提交到远程，此时又有新的代码需要提交（比如紧急上线新功能、帮同事提交代码等），此时我们之前写的代码不急着提交，但是日后还会用到，此时可以将代码暂存起来

### 3.1 git stash

比如我们开发了很多代码

![image-20211106161704326](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161704326.png)

右击项目选择Git --stash changes

![image-20211106161227728](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161227728.png)

![image-20211106161345179](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161345179.png)

创建完，stash后，此时我们之前写的都会呗暂存起来，此时的项目为干净的项目，可立马进行新的开发

如图

![image-20211106161817186](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161817186.png)



3.2 git unstash

当我们想要恢复的时候

右击项目 git --

![image-20211106161918457](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161918457.png)



![image-20211106161951958](C:\Users\admin、\AppData\Roaming\Typora\typora-user-images\image-20211106161951958.png)

选择我们想要恢复的change，apply stash即可恢复。恢复前可以先View 看看变化，不需要的暂存也可以Drop。