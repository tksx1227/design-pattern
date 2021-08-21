package Builder;

// Builderで定義したインターフェースを使ってインスタンスを生成する
// ConcreteBuilderに依存したプログラミングは行わない
// ConcreteBuilderが何であろうとうまく機能するように設計する
class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[] {
			"おはようございます。",
			"こんにちは。",
		});
		builder.makeString("夜に");
		builder.makeItems(new String[]{
			"こんばんは。",
			"おやすみなさい。",
			"さようなら。",
		});
		builder.close();
	}
}