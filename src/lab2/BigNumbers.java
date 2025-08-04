package lab2;

import java.math.*;

public class BigNumbers {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("10000.100000");
		BigDecimal b = new BigDecimal("20000.12345");
		
		BigDecimal sum = a.add(b);
		
		System.out.println(sum);
	}

}
