package Singleton;

public class Main {
	public static void main(String[] args) {
		// Singleton のインスタンスを取得
		Singleton singleton = Singleton.getInstance();

		// Singleton が持つ値を参照する
		System.out.println(singleton.getValue());
	}
}


