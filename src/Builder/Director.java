package Builder;

// Director のクラス
class Director {
	// Builder のコンストラクタを内部で持つ
	private Builder builder;

	Director(Builder builder) {
		this.builder = builder;
	}

	// 外部からはこの construct メソッドを使用することで
	// インスタンスの初期化を行い、初期化した Building を
	// 返り値として返す
	Building construct() {
		this.builder.buildBase();
		this.builder.buildFrame();
		this.builder.buildWall();
		return this.builder.getResult();
	}
}