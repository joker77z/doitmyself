
public class AccountApp1 {

	public static void main(String[] args) {
		String inputId = args[0];
		String inputPs = args[1];

		String[][] users = { { "tj", "1111" }, { "se", "2222" }, { "wo", "3333" } };

		boolean tof = false;
		for (int i = 0; i < users.length; i++) {
			// users[0]�� �ִ� �� ���� ���� inputID, inputPS�� ������
			String[] current = users[i];
			if (current[0].equals(inputId) && current[1].equals(inputPs)) {
				tof = true;
				break;
			}
			if (tof) {
				System.out.println("hi master");
			} else {
				System.out.println("who are you?");
			}
		}
	}
}
