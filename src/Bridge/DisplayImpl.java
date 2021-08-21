package Bridge;

/* 実装クラスの階層 */

// 抽象クラス
abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}

// 具象クラス
class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;

	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	public void rawOpen() {
		printLine();
	}

	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}