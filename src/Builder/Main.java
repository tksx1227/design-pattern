package Builder;

public class Main {
	public static void main(String[] args) {
		String type = "plain";
//		String type = "html";

		if (type == "plain") {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (type == "html") {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String result = htmlBuilder.getResult();
			System.out.println(result);
		}
	}
}
