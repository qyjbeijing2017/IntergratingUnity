# flutterapp



​		Unity2019.4 嵌入 Fultter2.2， 使用插件 flutter-unity-widget 。  flutter-unity-widget 可以快速导出 Unity 对应平台的包，并且配置到现有的Flutter工程，可以帮助我们快速嵌入到 Flutter 。



## 快速启动



​		基本步骤参考，[flutter-unity-widget官方包](https://pub.dev/packages/flutter_unity_widget)。



## 注意



1. 在 Unity 导出 Android 工程时，使用 Unity2019.4 会报错。根据网上资料，任何相对较新的版本都会存在这个问题，具体的修复参考 [@russelljahn](https://github.com/juicycleff/flutter-unity-view-widget/issues/234) 给出的解决方案；
2.  flutter-unity-widget 导出的 Gradle 包最低sdk为19，Android Studio 创建的 Flutter 工程最低sdk一般为16。注意将`android/app/build.gradle`中的 `minSdkVersion` 修改为19；
3. Flutter2.2 以上的 Dart 中 null safety 特性将是默认开启的，flutter-unity-widget 虽然提供空安全包，但是在flutter检查中仍然存在问题。所以，注意将空安全特性绕过。在Android Studio 中，进入`Run->Edit Configurations->Flutter->main.dart->Additional run args` 添加启动参数`--no-sound-null-safety`。
4. flutter-unity-widget 中，Unity 似乎运行在主 Active 中，所以在退出 Unity 时，会导致程序崩溃。问题暂时还未得到解决。

