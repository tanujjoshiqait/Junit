package com.qait.mavenTestNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	   public void testLetterMatch(){
	       CheckLetterOccurence checkOccur=new CheckLetterOccurence();
	       ArrayList<String> list= new ArrayList<String>();
	       list.add("tanuj");
	       list.add("apple");
	       list.add("hello");
	       ArrayList<String> expected= new ArrayList<String>();
	       expected.add("apple");
	       expected.add("hello");
	       
	       AssertJUnit.assertEquals( expected, checkOccur.Appearence(list));
	   }
	
	@Test
	   public void testLetterCaseMatch(){
	       CheckLetterOccurence checkOccur=new CheckLetterOccurence();
	       ArrayList<String> list= new ArrayList<String>();
	       list.add("Tanuj");
	       list.add("aPple");
	       list.add("heLlo");
	       ArrayList<String> expected= new ArrayList<String>();
	       expected.add("apple");
	       expected.add("hello");
	       
	       AssertJUnit.assertEquals( expected, checkOccur.Appearence(list));
	   }
	
	@Test
	   public void testLetterCaseMatch1(){
	       CheckLetterOccurence checkOccur=new CheckLetterOccurence();
	       ArrayList<String> list= new ArrayList<String>();
	       list.add("TANUJ");
	       list.add("APPLE");
	       list.add("HELLO");
	       ArrayList<String> expected= new ArrayList<String>();
	       expected.add("apple");
	       expected.add("hello");
	       
	       AssertJUnit.assertEquals( expected, checkOccur.Appearence(list));
	   }
	
}

