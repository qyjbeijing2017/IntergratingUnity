# Intergrating Unity



​		工程中整理了向手机端嵌入工程的方式，包含原生 Android，Flutter。IOS 端由于缺乏设备，并未整理到这个工程中。



## 环境

由于所有环境都是新搭建的，用到的版本都是相对较新的稳定版本：

| 工程    | 版本          | 语言 |
| ------- | ------------- | ---- |
| Unity   | 2019.4.27f1c1 | C#   |
| Android | 11            | Java |
| Flutter | 2.2.1         | Dart |



## IDE

* Android Studio 4.2.1



## 内容

* [原生Android](./NativeAndroidApp)；
* [Flutter](./flutterapp)。



## 一些提示



1. Unity 自 2019.1 之后再不提供对 x86 的打包支持。所以使用高于 2019.1 版本的 Unity 时，由于 ARM 虚拟机的性能问题，对 Android 打包必须进行真机调试，包括嵌入其他工程。
2. 新版 Unity 在打包 Android 时为了对更多机型进行适配（主要是 ARM64 ），必须使用 IL2CPP ，Flutter 嵌入插件（flutter-unity-widget）官方文档中提及也需要 IL2CPP。使用 IL2CPP 时 ILRuntime 需要进行一些处理。



