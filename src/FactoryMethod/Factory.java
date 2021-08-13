package FactoryMethod;

// Factory の抽象クラス
// ゲーム会社全体を表す
abstract class GameFactory {
	public abstract Product factoryMethod();

	public final Product create() {
		Product product = factoryMethod();
		return product;
	}
}

// Factory の具象クラス
// ハードウェアを製造する会社を表す
class HardFactory extends GameFactory {
	public Product factoryMethod() {
		return new NintendoSwitch();
	}
}

// ソフトウェアを製造する会社を表す
class SoftFactory extends GameFactory {
	public Product factoryMethod() {
		return new MarioKart();
	}
}