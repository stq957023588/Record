package com.lopez.record.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflex extends ReflexParent{
	public String str;
	protected int i;
	Reflex r;
	private String s;
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz=Class.forName("com.lopez.record.reflex.Reflex");
		//base on class to create an object,then translate to Reflex class
		Reflex r=(Reflex)clazz.newInstance();
		
		//get all field in class no matter it is public or private,but can't get field in parent class
		for(Field f:clazz.getDeclaredFields()){
			System.out.println("Field Name:"+f.getName()+"\tField Modifier:"+Modifier.toString(f.getModifiers())+"\t\tField Type:"+f.getType());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//only can get public field which is in class or parent class
		for(Field f:clazz.getFields()){
			System.out.println("Field Name:"+f.getName()+"\tField Modifier:"+Modifier.toString(f.getModifiers())+"\t\tField Type:"+f.getType());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//the same rule as field
		for(Method m:clazz.getDeclaredMethods()){
			System.out.println("Method Name:"+m.getName()+"\tMethod Modifier:"+Modifier.toString(m.getModifiers()));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//the same rule as field
		for(Method m:clazz.getMethods()){
			System.out.println("Method Name:"+m.getName()+"\tMethod Modifier:"+Modifier.toString(m.getModifiers()));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//get field by field name,if field is private use getDeclaredField ,or use getField
		Field f=clazz.getDeclaredField("s");
		//set accessible can let you visit private field
		f.setAccessible(true);
		f.set(r, "ddd");
		System.out.println(r.s);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//the same rule as field
		Method m=clazz.getDeclaredMethod("method4", null);
		m.setAccessible(true);
		m.invoke(r, null);
	}
	
	
	public void method1(){
		System.out.println("public void method");
	}
	public void method2(String str){
		System.out.println("Input:"+str);
	}
	public String method3(int i){
		return i+"\t"+str;
	}
	private void method4(){
		System.out.println("private method");
	}
}
