package com.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionClassHelper {

	private static final String LINE_BREAK = "\n";
	public static String getClassDescription(Class<?> ref){

		StringBuilder classDescription = new StringBuilder();
		classDescription.append("The simple name is "+ref.getSimpleName()).append(LINE_BREAK)
			.append("The Canonical name is "+ref.getCanonicalName()).append(LINE_BREAK)
			.append("This class is loaded by classLoader "+ref.getClassLoader()).append(LINE_BREAK)
			.append("The class is of type "+classType(ref)).append(LINE_BREAK)
			.append("The Class implements "+getAllInterfaces(ref)).append(LINE_BREAK)
			.append("The Class implements "+ref.getSuperclass().getName()).append(LINE_BREAK)
			.append("The Class modifiers are "+Modifier.toString(ref.getModifiers() & Modifier.classModifiers())).append(LINE_BREAK)
			;

		return classDescription.toString();
	}

	private static String getAllInterfaces(Class<?> ref){

		Class<?>[] classInterfaces = ref.getInterfaces();

		String[] interfaces =  Arrays.stream(classInterfaces)
				.map(Class::getName)
				.toArray(String[]::new);

		return String.join(",", interfaces);

	}

	private static String classType(Class<?> ref){
		String keyword = "";

		if( ref.isPrimitive()){
			keyword = "Primitive";
		}else if(ref.isInterface()){
			keyword = "Interface";
		}else if(ref.isArray()){
			keyword = "Array";
		}else{
			keyword = "Class";
		}
		return keyword;
	}

	public static void main(String args[]){
		System.out.println(ReflectionClassHelper.getClassDescription(Person.class));
	}
}
