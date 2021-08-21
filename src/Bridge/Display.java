package Bridge;

/* 機能のクラス階層 */

// 機能クラスの最上位にあるクラス
// このクラスをもとに機能を拡張する
class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl  impl) {
		this.impl = impl;
	}

	// 実装クラスのメソッドに置き換える
	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}

// Displayクラスを拡張したクラス
class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	// Displayに追加したメソッド
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}