package Observer;

public class Main {
	public static void main(String[] args) {
		// Observer と Subject をインスタンス化する
		SlackObserver observer1 = new SlackObserver();
		TwitterObserver observer2 = new TwitterObserver();
		RandomNumGenerator subject = new RandomNumGenerator();

		// Subject に Observer を追加する
		subject.addObserver(observer1);
		subject.addObserver(observer2);

		// Subject の状態を更新する
		subject.execute();

		// Subject に追加した Observer を1つ減らす
		subject.removeObserver(observer1);

		// 再度 Subject の状態を更新する
		subject.execute();
	}
}
