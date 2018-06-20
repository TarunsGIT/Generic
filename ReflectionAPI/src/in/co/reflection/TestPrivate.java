package in.co.reflection;

import in.co.test.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestPrivate {

	public static void main(String[] args) {
		Test T1 = null;

		try {
			Class C = Class.forName("in.co.test.Test");
			Constructor cons[] = C.getDeclaredConstructors();
			cons[0].setAccessible(true);
			T1 = (Test) cons[0].newInstance();
		} catch (ClassNotFoundException | IllegalAccessException
				| InstantiationException | InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println(T1);

	}

}
