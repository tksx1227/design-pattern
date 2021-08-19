package FactoryMethod;

public class Main {
	public static void main(String[] args) {
		// factoryの具象クラスをインスタンス化する
		Factory factory = new IDCardFactory();

		// factoryの抽象メソッドによりインスタンス化
		Product card1 = factory.create("神保");
		Product card2 = factory.create("村田");
		Product card3 = factory.create("小野寺");

		// 共通メソッドを実行
		card1.use();
		card2.use();
		card3.use();
	}
}
