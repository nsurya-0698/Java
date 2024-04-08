package com.learn.java.recursion;

public class AddNum {
	public static int sum(int K) {
		if (K > 0) {
			return K + sum(K-1);
		} else {
			return 0;
		}
	}
}