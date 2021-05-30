# NativeAndroidApp



​		Unity2019.4 嵌入原生 Android。



## 快速开始



​		具体的嵌入步骤直接参照官方提供的[例子](https://github.com/Unity-Technologies/uaal-example/blob/master/docs/android.md)。



## 注意

1. 自从Unity2019.1之后，不再提供x86打包，请使用真机进行测试；
2. Unity2019.1 之后的打包方法，与之前的的打包方式大相径庭，网上资料非常少，之前的打包方式无法使用。

2. 在原生代码调用 UnityActive 时，可能会出现异常` android.content.res.Resources$NotFoundException: String resource ID #0x0`，具体参考[这里](https://stackoverflow.com/questions/62170568/trying-to-open-an-unity-activity-inside-android-studio-yields-android-content-re)，添加`<string name="game_view_content_description" translatable="false">Game view</string>`到原生工程的`res/values/string.xml`。

