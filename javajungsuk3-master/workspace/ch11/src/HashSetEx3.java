//import java.util.*;
//
//class HashSetEx3 {
//	public static void main(String[] args) {
//		HashSet<Object> set = new HashSet<Object>();
//
//		set.add("abc"); 	// 보관
//		set.add("abc");	// 보관하지 않는다. 이미 같은 문자열 객체가 존재
//		set.add(new Person("David",10));
//		set.add(new Person("David",10));
//
//		System.out.println(set);
//	}
//}
//
//class Person {
//	String name;
//	int age;
//
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public String toString() {
//		return "{"+name +":"+ age+"}";
//	}
//}
