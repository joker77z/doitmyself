import java.io.FileWriter;
import java.io.IOException;

public class method2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(print1("test", "-"));
		fw.close();
//		아래는 없는 코드지만 이런식으로 사용이 가능하다
//		Email.send("joker77z@naver.com", "title", print1("안녕하세요", "-");
	}

	public static String print1(String text, String delimiter) {
		String out = "";
		out = out + text + "\n";
		out = out + delimiter + "\n";
		return out;
		 
	}
}