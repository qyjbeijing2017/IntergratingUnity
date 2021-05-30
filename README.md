# Intergrating Unity



​		工程中整理了向手机端嵌入工程的方式，包含原生android，flutter。IOS端由于缺乏设备，并未整理到这个工程中。



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



1. Unity自2019.1之后再不提供对x86的打包支持。所以使用高于2019.1版本的Unity时，由于ARM虚拟机的性能问题，对android打包必须进行真机调试，包括嵌入其他工程。
2. 新版Unity在打包android时为了对更多机型进行适配（主要是ARM64），必须使用IL2CPP，flutter嵌入插件（flutter-unity-widget）官方文档中提及也需要IL2CPP。使用IL2CPP时ILRuntime需要进行一些处理。



