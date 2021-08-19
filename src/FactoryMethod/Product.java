package FactoryMethod;

// 抽象クラス
abstract class Product {
	public abstract void use();
}

// 具象クラス
class IDCard extends Product {
	private String owner;

	IDCard(String owner) {
		this.owner = owner;
	}

	public void use() {
		System.out.println(owner + "のカードを使います。");
	}

	public String getOwner() {
		return owner;
	}
}