package com.Number_project;
public class Test {

	public static void main(String[] args) {
		
		int tmp=0;
		for(int i=1;i<=100;i++) {
			tmp++;
			if(tmp<=10) {
				if(i%2==0) {
					System.out.println(i+"-Even\t");
				}
			}else if(tmp>10 && tmp>20) {
				if(i%2==1) {
					System.out.println(i+"-Odd\t");
				}
			}else if(tmp>20) {
				tmp=0;
			}
			
			
		}
		
	}
	
}
