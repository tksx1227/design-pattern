package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Subject の基底クラス
abstract class Subject {
	// Observer の List を保持
	private List<Observer> observers = new ArrayList<>();

	// Observer を追加
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// Observer を削除
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	// Observer へ通知
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(this);
		}
	}

	abstract public int getNumber();
	abstract public void execute();
}

// Subject の具象クラス
class RandomNumGenerator extends Subject {
	// 乱数生成機
	private Random random = new Random();

	// 現在の数
	private int number;

	// 数を取得する
	@Override
	public int getNumber() {
		return number;
	}

	// 数を生成する（状態の更新）
	@Override
	public void execute() {
		// 合計5回、状態を更新する
		for (int i = 0; i < 5; i++) {
			// 0 ~ 100 の範囲で乱数生成
			number = random.nextInt(101);
			System.out.println("Loop Count: " + (i + 1));

			// 状態の更新を Observer に通知
			notifyObservers();
			System.out.println("---------------------------");
		}
	}
}
