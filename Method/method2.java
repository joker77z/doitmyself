import java.io.FileWriter;
import java.io.IOException;

public class method2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(print1("test", "-"));
		fw.close();
//		�Ʒ��� ���� �ڵ����� �̷������� ����� �����ϴ�
//		Email.send("joker77z@naver.com", "title", print1("�ȳ��ϼ���", "-");
	}

	public static String print1(String text, String delimiter) {
		String out = "";
		out = out + text + "\n";
		out = out + delimiter + "\n";
		return out;
		 
	}
}