package com.kh.practice.array.ArrayPractice1;

public class fsdf {

	public static void main(String[] args) {
  
        int[] num_list = {1,2,3,4,5};
        int num1 = 0;
        int num2 = 0;
         int[] answer = new int[2];
         	answer[0] = num1;
         	answer[1] = num2;
        for(int i = 0; i < num_list.length;i ++) {
            if(num_list[i] % 2 == 0) {
                num1++;
                System.out.println("num1 " + num1);
            }else if(num_list[i]%2 == 1) {
                num2++;
            }
		
	}
System.out.println(answer[0]);
System.out.println(answer[1] );
	}
}
