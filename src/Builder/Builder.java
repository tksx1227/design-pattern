package Builder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 抽象クラス
// インスタンスを生成するためのインターフェースを定める
abstract class Builder {
	// 生成するインスタンスの各部分を作るための抽象メソッド
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}

// 具象クラス１（ConcreteBuilder）
// Builderクラスに基づき、具体的なメソッドが実装される
class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();

	public void makeTitle(String title) {
		buffer.append("===============================\n");
		buffer.append("『" + title + "』\n");
		buffer.append("\n");
	}

	public void makeString(String str) {
		buffer.append("■" + str + "\n");
		buffer.append("\n");
	}

	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("　・" + items[i] + "\n");
		}
		buffer.append("\n");
	}

	public void close() {
		buffer.append("===============================\n");
	}

	public String getResult() {
		return buffer.toString();
	}
}

// 具象クラス２
// Builderクラスに基づき、具体的なメソッドが実装される
class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;

	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}

	public void close() {
		writer.println("</body></html>");
		writer.close();
	}

	public String getResult() {
		return filename;
	}
}