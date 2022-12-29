# moditect-sample

[ModiTect Maven Plugin で非モジュールなライブラリをオレオレモジュールにしてみる](https://qiita.com/yokra9/items/65ac718fdac150a8555c) のサンプルレポジトリです。

* [yokra9-commons-codec](./commons-codec/)
  * [commons-codec](https://mvnrepository.com/artifact/commons-codec/commons-codec) に `module-info.class` を追加して再パッケージングしたもの。
* [moditect-sample](./moditect-sample)
  * `yokra9-commons-codec` を利用するサンプルプロジェクト。
