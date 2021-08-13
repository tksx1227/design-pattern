
public class Singleton {
	// static に設定することで、一度のみインスタンスが生成される
	// getInstance でのみ参照できるように private に設定しておく
	private static Singleton singleton = new Singleton();

	// コンストラクタを private に設定して
	// 外部からインスタンスを生成できないようにする
	private Singleton() {
		System.out.println("Initialized Singleton...");
	}

	// 外部のクラスで使用する際には、このメソッドを通して
	// Singleton のインスタンスを取得する
	public static Singleton getInstance() {
		return singleton;
	}
}
