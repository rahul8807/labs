package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ReflectionFieldHelper {

	private static final String LINE_BREAK = "\n";

	public static String getDeclaredFiledDescription(Class<?> ref){
		return getDeclaredFieldDescriptiondetails(ref).entrySet().stream().map((e)-> e.getKey()+"-"+e.getValue()).collect(Collectors.joining(LINE_BREAK));
	}

	public static String getFiledDescription(Class<?> ref){
		return getFieldDescriptionDetails(ref).entrySet().stream().map((e)-> e.getKey()+"-"+e.getValue()).collect(Collectors.joining(LINE_BREAK));
	}

	private static Map<String,String> getFieldDescriptionDetails(Class<?> ref){
		return Arrays.stream(ref.getFields())
				.collect(Collectors.toMap(Field::getName,
						(Field field) -> Modifier.toString(field.getModifiers() & Modifier.classModifiers())));
	}

	private static Map<String,String> getDeclaredFieldDescriptiondetails(Class<?> ref){
		return Arrays.stream(ref.getDeclaredFields())
				.collect(Collectors.toMap(Field::getName,
						(Field field) -> Modifier.toString(field.getModifiers() & Modifier.classModifiers())));
	}


	public static void main(String args[]){
		System.out.println(ReflectionFieldHelper.getFiledDescription(Person.class));
		System.out.println("--------------------");
		System.out.println(ReflectionFieldHelper.getDeclaredFiledDescription(Person.class));
	}

}
