# SuperSwipeRefreshLayout

[![JitPack](https://img.shields.io/jitpack/v/github/jenly1314/SuperSwipeRefreshLayout?logo=jitpack)](https://jitpack.io/#jenly1314/SuperSwipeRefreshLayout)
[![Download](https://img.shields.io/badge/download-APK-brightgreen?logo=github)](https://raw.githubusercontent.com/jenly1314/SuperSwipeRefreshLayout/master/app/app-release.apk)
[![API](https://img.shields.io/badge/API-9%2B-brightgreen?logo=android)](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)
[![License](https://img.shields.io/github/license/jenly1314/SuperSwipeRefreshLayout?logo=open-source-initiative)](https://opensource.org/licenses/apache-2-0)

SuperSwipeRefreshLayout是在SwipeRefreshLayout的基础之上扩展修改，让其支持上拉刷新，基本用法与SwipeRefreshLayout一致。

## 效果展示
![Image](https://github.com/jenly1314/SuperSwipeRefreshLayout/blob/master/gif.gif)

> 你也可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/SuperSwipeRefreshLayout/master/app/app-release.apk) 体验效果

## 引入

### Gradle:

1. 在Project的 **build.gradle** 或 **setting.gradle** 中添加远程仓库

    ```gradle
    repositories {
        //...
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
    ```

2. 在Module的 **build.gradle** 中添加依赖项

    ```gradle
    implementation 'com.github.jenly1314:SuperSwipeRefreshLayout:1.1.0'
    ```

## 使用

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
更多使用详情，请查看[app](app)中的源码使用示例或直接查看[API帮助文档](https://jitpack.io/com/github/jenly1314/SuperSwipeRefreshLayout/latest/javadoc/)

## 相关推荐
- [SuperSlidingPaneLayout](https://github.com/jenly1314/SuperSlidingPaneLayout) 是在SlidingPaneLayout的基础之上扩展修改，新增几种不同的侧滑效果，基本用法与SlidingPaneLayout一致。
---

![footer](https://jenly1314.github.io/page/footer.svg)
