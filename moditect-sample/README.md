# moditect-sample

[yokra9-commons-codec](../commons-codec/) を利用するサンプルプロジェクト。

* `com.github.yokra9.moditectSample.Binary`
  * `org.apache.commons.codec.binary.Base64` をインポートするクラス。`yokra9-commons-codec` でもコンパイルが通る。
* `com.github.yokra9.moditectSample.Net`
  * `org.apache.commons.codec.EncoderException` と `org.apache.commons.codec.net.URLCodec` をインポートするクラス。`yokra9-commons-codec` だとコンパイルが通らない。

```powershell
# コンパイルとインストール
mvn clean install

# 実行（事前に yokra9-commons-codec をコンパイル・パッケージングしておく）
java --module-path ".\target\moditect-sample-0.0.1-SNAPSHOT.jar;..\commons-codec\target\yokra9-commons-codec-0.0.1-SNAPSHOT.jar" 
 --module com.github.yokra9.moditectSample
```
