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
あるオブジェクトを作成する際に、コンストラクタの処理をメソッドとして外部に切り離す概念。

次の３つのオブジェクトにより構成される。

- コンストラクタの初期化処理の流れを制御する Director オブジェクト
- 実際の初期化処理を持った Builder オブジェクト
- 実際に生成する Product オブジェクト

実際のコンストラクタの処理内容（Builder 内で定義）と、それを実行する関数（Director 内で定義）が切り分けられているため、コードの変更に強いという特徴を持つ。
