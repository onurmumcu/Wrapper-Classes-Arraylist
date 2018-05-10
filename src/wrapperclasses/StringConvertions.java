package wrapperclasses;

public class StringConvertions {
	public static void main(String[] args) {
		String str = "-1234";
		Integer count = Integer.valueOf(str);
		int count2 = Integer.parseInt(str);
		
		System.out.println(str);
		System.out.println(count);
		System.out.println(count2);

//		if (count > 0) {
//			System.out.println("it is moire then 0");
//
//		} else {
//			System.out.println("Not more than 0");
//		}
		
		
		String searchCount = "1234566";
		Integer searchInt = Integer.valueOf(searchCount);
		
		int searchInt2 =Integer.valueOf(searchCount);
		
		int searchIntpr = Integer.valueOf(searchCount);
		
		Integer searchIntpr2  = Integer.parseInt(searchCount);
		
		
	}

}
