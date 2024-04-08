package com.learn.java.innerClass;

class OuterClass {
	int x = 0;
	
//	Access inner class
	class InnerClass {
		int y = 1;
	}
	
//	Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
//	private class privateInnerClass {
//		int z = 2;
//	}
	
//	An inner class can also be static, which means that you can access it without creating an object of the outer class:
	static class StaticClass{
		int a = 3;
	}
	
//	Access OUter Class from inner Class
	class AccessOuterClassVar {
		public int myinnerMethod() {
			return x;
		}
	}
}
class Main{
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
		OuterClass.AccessOuterClassVar accessOuterClassVar = outerClass.new AccessOuterClassVar();

		System.out.println(outerClass.x);
		System.out.println(innerClass.y);
		System.out.println(staticClass.a);
		System.out.println(accessOuterClassVar.myinnerMethod());
	}
}