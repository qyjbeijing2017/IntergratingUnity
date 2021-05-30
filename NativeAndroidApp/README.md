# NativeAndroidApp



​		具体的嵌入步骤直接参照[官方文档](https://docs.unity.cn/cn/2019.4/Manual/UnityasaLibrary-Android.html)，及官方提供的[例子](https://github.com/Unity-Technologies/uaal-example/blob/master/docs/android.md)。



其中有几个部分官方文档没有提及：

* 自从Unity2019.1之后，不再提供x86打包，请使用真机进行测试；
* 在原生代码调用UnityActive时，可能会出现异常，具体参考[这里](https://forum.unity.com/threads/android-app-crashes-using-unityplayer-in-existing-app-in-unity-2019-3.)，添加的位置在原生工程的`res/values/string.xml`。

