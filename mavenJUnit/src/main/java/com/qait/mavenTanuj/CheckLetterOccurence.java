package com.qait.mavenTanuj;
import java.util.ArrayList;


public class CheckLetterOccurence {
	
		
		public boolean CheckOccurence(String str) {
			boolean flag=false;
			str=str.toLowerCase();
			for(int count=0;count<str.length()-1; count++) {
				if(str.charAt(count)==str.charAt(count+1)) {
					flag= true;
					break;
				}
				else {
					flag= false;
				}
			}
			return flag;
		}
		
		
		public ArrayList<String> Appearence(ArrayList<String> name) {
			ArrayList<String> list= new ArrayList<String>();
			for (int iterate=0; iterate<name.size(); iterate++) {
				
				if(CheckOccurence(name.get(iterate))) {
					list.add(name.get(iterate));
				}
				else {
					continue;
				}
			}
			System.out.println("Execution finish");
			return list;
		}


	}

