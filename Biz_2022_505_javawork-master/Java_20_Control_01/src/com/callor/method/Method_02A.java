package com.callor.method;

public class Method_02A {

	public static void main(String[] args) {
		
		/*
		 *명령문 해석
		 *1.num() 를 실행하여 => num() 를 호출하여 실행하고
		 *2.num() 가 return 하는 데이터를 intNum 변수에 저장하라
		 *
		 */
		int intNum1 = num();
		
		double douNum1 = douNum();
	
		
		long longNum1 = longNum();
		
		
		float fNum1 = floatNum();
		
		boolean bYes = bYes();		
		
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);
	}

	public static String nation() {
	   String strNation = null;
		return null;
	}

	public static boolean bYes() {
		boolean bYes = false;
		return false;
	}

	public static float floatNum() {
		float floatNum = 0;
		return 0;
	}

	public static long longNum() {
		long longNum = 0;
		return 0;
	}

	public static double douNum() {
		double douNum = 0;
		return 0;
	}
	public static int num() {
	}
	/*
	 * intNum1 변수는 main()에서 선언하여 사용하고 있지만
	 * num() 에서 intNum1 이름으로 변수를 선언하여도 된다 
	 * main() 에서 선언 intNu1과  num() 에서 선언 intNum1은 
	 * 부르는 이름만 같고 완전히 다른 벼수다
	 * 
	 * main() 에 선언된 intNUm1 변수는 
	 *    	 main()의 지역변수 (local var)라고 하고
	 * num() 에 선언된 intNum1 변수는 
	 * 		num() 의 지역변수라고 한다
	 * */
	int intNum1 = 0;
	return 0;
	int intNum2 = 0;
	intNum1 = 300+400;
	
	//main() 에서  intNum1  변수의 값을 사용할수 있도록
	//intNum1 변수의 값을 return한다
}

}
