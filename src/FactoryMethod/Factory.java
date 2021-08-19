package FactoryMethod;

import java.util.Vector;

// 抽象クラス
abstract class Factory {
	// このクラスでは、createメソッドでproductを生成して、
	// 登録まで行う、という処理の流れが規定されている
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	// 抽象メソッド
	// 実際にどのようにインスタンスを生成するのかはサブクラスで実装する
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}

// 具象クラス
class IDCardFactory extends Factory {
	private Vector owners = new Vector();

	// スーパークラスで定義していた実装クラスを実装する
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public Vector getOwners() {
		return owners;
	}
}