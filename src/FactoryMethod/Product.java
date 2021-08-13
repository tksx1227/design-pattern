package FactoryMethod;

// Product の抽象クラス
abstract class Product {
	public abstract void method1();
	public abstract void method2();
}

// Product の具象クラス
// ハードウェア部門
// 任天堂スイッチを表す
class NintendoSwitch extends Product {
	NintendoSwitch() {
		System.out.println("任天堂スイッチを製造します。");
	}

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}
}

// ソフトウェア部門
// マリオカートを表す
class MarioKart extends Product {
	MarioKart() {
		System.out.println("マリオカートを製造します。");
	}

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}
}