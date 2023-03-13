package com.blockwit.learn.comaric.list;

public class UnitTests {

	public static void main(String[] args) throws Exception {
		test_add();
		test_get();
		test_addAndGetSequence();
		test_insert();
	}

	public static void test_add() {
		ArrayList list = new ArrayList();
		list.add("Hello");
	}

	public static void test_get() throws Exception {
		ArrayList list = new ArrayList();
		String checkString = "hello";
		list.add(checkString);
		if (!list.get(0).equals(checkString)) {
			throw new Exception("Something went wrong");
		}
	}

	public static void test_addAndGetSequence() throws Exception {
		ArrayList list = new ArrayList();
		String checkString1 = "hello1";
		String checkString2 = "hello2";
		list.add(checkString1);
		list.add(checkString2);
		if (!list.get(0).equals(checkString1)) {
			throw new Exception("Something went wrong");
		}
		if (!list.get(1).equals(checkString2)) {
			throw new Exception("Something went wrong");
		}
	}
	public static void test_insert() throws Exception {
		ArrayList abc = new ArrayList();
		String checkString = "Privet";
		String checkString2= "Poka";
		abc.add(checkString);
		abc.insert(0, checkString2);
		if (!abc.get(0).equals(checkString2)){
			throw new Exception("Something went wrong");
		}
	}

}

