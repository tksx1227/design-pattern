package TemplateMethod;

// 抽象クラス
abstract class AbstractDisplay {
	// テンプレートメソッド
	// このクラスで実装しているメソッド
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}

	// 抽象メソッド（テンプレートメソッドで使用するメソッド）
	// サブクラスに実装をまかせる
	public abstract void open();
	public abstract void print();
	public abstract void close();
}
