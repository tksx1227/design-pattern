# design-pattern
デザインパターン勉強用リポジトリ（Java）

## Singleton
指定したクラスのインスタンスが１つしか存在しないことを保証するための概念。

設定用の値を保持するために使用したりする。

## Observer
あるオブジェクトの内部状態の変化を別のオブジェクトで監視する概念。

次の2つのオブジェクトにより構成される。

- 内部の状態が変化する Subject オブジェクト
- その変更を監視する Observer オブジェクト

その実態は Subject が内部に複数の Observer を保持しておき、状態の変更が生じた際に、それらすべてに変更を知らせるというものになっている。

## Builder
あるオブジェクトを生成する際に、その生成過程を複数のメソッドとして外部に切り離す概念。

次の３つのオブジェクトにより構成される。

- インスタンス生成処理の流れを制御する Director オブジェクト
- インスタンス生成のためのインターフェースを定めた Builder オブジェクト
- Builder に基づいて実際の処理を実装する ConcreteBuilder オブジェクト

Director は Builder で定義したインターフェースのみを使ってインスタンスの生成を行う。

このとき Director では、具体的な処理の流れを実装している ConcreteBuilder クラスに依存した処理は行わないように気を付ける。

## Template Method
抽象クラス内でテンプレートとなるメソッドを定義しておき、そのメソッドの内部で使用される抽象メソッドを子クラスで実装するという概念。

テンプレートメソッドは全てのクラスで共通だが、内部の細かい仕様は子クラスにより定義されるため、汎用的に使用することができる。

## Factory Method
インスタンスを生成する工場を Template Method パターンで構成したもの。

抽象クラスとして Factory と Product があり、Factory が Product をどのように生成するのかという情報だけを定義しておく。

具象クラスは、Factory を継承したクラスが Product を継承したクラスを生成するため、抽象クラス同士と具象クラス同士は並行の関係にある。

## Bridge
機能のクラス階層と実装のクラス階層を分けて扱うという概念。

- 機能のクラス階層：新規のメソッドを追加するために継承を行ってサブクラスを作成する、みたいなやつ
- 実装のクラス階層：抽象メソッドを実装するために継承を行ってサブクラスを作成する、みたいなやつ
