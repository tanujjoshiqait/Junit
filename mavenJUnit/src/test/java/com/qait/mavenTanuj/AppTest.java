package com.qait.mavenTanuj;

import java.util.ArrayList;

import org.junit.Assert;

//import junit.framework.Assert;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.*;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
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
	       
	       Assert.assertEquals( expected, checkOccur.Appearence(list));
	   }
}
