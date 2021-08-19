package TemplateMethod;

class CharDisplay extends AbstractDisplay {
	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	// スーパークラスの抽象メソッドを実装する
	public void open() {
		System.out.print("<<");
	}

	public void print() {
		System.out.print(ch);
	}

	public void close() {
		System.out.println(">>");
	}
}
