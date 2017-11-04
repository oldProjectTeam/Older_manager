package com.older.junit.test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM");
		String date=simpleDateFormat.format(new Date());
		System.out.println(date);
		String s[]=date.split("-");
		String t="1月";
		t=t.substring(0,t.indexOf("月"));
		if (Integer.parseInt(t)<10) {
			t="0"+t;
		}
		System.out.println(t);
		date=s[0]+"-"+t;
		System.out.println(date);
		

	}

}
