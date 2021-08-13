package Builder;

// 以下は2種類の建物を構築するという例
public class Main {
	public static void main(String[] args) {
		// 特定の Builder を作成する Director をインスタンス化する
		Director d1 = new Director(new JapaneseHouseBuilder());
		Director d2 = new Director(new KamakuraBuilder());

		// Director 経由で Building をインスタンス化する
		Building b1 = d1.construct();
		Building b2 = d2.construct();

		System.out.println(b1);
		System.out.println(b2);
	}
}
