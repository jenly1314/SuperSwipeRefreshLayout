# SuperSwipeRefreshLayout
[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/SuperSwipeRefreshLayout/master/app/app-release.apk)
[![](https://jitpack.io/v/jenly1314/SuperSwipeRefreshLayout.svg)](https://jitpack.io/#jenly1314/SuperSwipeRefreshLayout)
[![Issue Count](https://codeclimate.com/github/jenly1314/SuperSwipeRefreshLayout/badges/issue_count.svg)](https://codeclimate.com/github/jenly1314/SuperSwipeRefreshLayout)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](http://blog.csdn.net/jenly121)

SuperSwipeRefreshLayout是在SwipeRefreshLayout的基础之上扩展修改，让其支持上拉刷新，基本用法与SwipeRefreshLayout一致。

![Image](https://github.com/jenly1314/SuperSwipeRefreshLayout/blob/master/gif.gif)


## 引入

### Maven：
```maven
<dependency>
  <groupId>com.king.view</groupId>
  <artifactId>superswiperefreshlayout</artifactId>
  <version>1.1.0</version>
  <type>pom</type>
</dependency>
```
### Gradle:
```gradle
compile 'com.king.view:superswiperefreshlayout:1.1.0'
```
### Lvy:
```lvy
<dependency org='com.king.view' name='superswiperefreshlayout' rev='1.1.0'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

###### 如果Gradle出现compile失败的情况，可以在Project的build.gradle里面添加如下：（也可以使用上面的GitPack来complie）
```gradle
allprojects {
    repositories {
        maven { url 'https://dl.bintray.com/jenly/maven' }
    }
}
```

使用布局示例：
```Xml
    <com.king.view.superswiperefreshlayout.SuperSwipeRefreshLayout
        android:id="@+id/superSwipeRefreshLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:direction="both">

        <android.support.v7.view.RecyclerView
            android:id="@+id/recyclerView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

    </com.king.view.superswiperefreshlayout.SuperSwipeRefreshLayout>
```


代码设置支持滑动刷新方向：
```Java
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.TOP);
 
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.BOTTOM);
  
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.BOTH);
```

更多使用详情请查看demo示例。

## 关于我
   Name: Jenly

   Email: jenly1314@gmail.com / jenly1314@vip.qq.com

   CSDN: http://blog.csdn.net/jenly121

   Github: https://github.com/jenly1314

   微信公众号:

   ![公众号](http://olambmg9j.bkt.clouddn.com/jenly666.jpg)
   
   加入QQ群: [20867961](http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1411582c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad)
   
## License

    Copyright © 2015, 2016 Jenly Yu 

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

