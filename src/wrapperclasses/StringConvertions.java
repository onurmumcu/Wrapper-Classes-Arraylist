package wrapperclasses;

public class StringConvertions {
	public static void main(String[] args) {
		String str = "-1234";
		Integer count = Integer.valueOf(str);
		int count2 = Integer.parseInt(str);

		if (count > 0) {
			System.out.println("it is moire then 0");

		} else {
			System.out.println("Not more than 0");
		}
	}

}
