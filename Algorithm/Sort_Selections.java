package algorithm;

import java.util.*;

public class Sort_Selection {

	public static void main(String args[]) {

		int [] ary = {23, 96, 35, 42, 81, 19, 8, 77, 50, 64};
		int i,j,tmp,index;
		
		for(i=0; i<ary.length-1; i++) {
			index = i;
			for(j=i+1; j<ary.length; j++) {
				if(ary[index] > ary[j]) index = j;
			}
			
			tmp = ary[index];
			ary[index] = ary[i];
			ary[i] = tmp;
		}
		
		for(int k=0; k<ary.length; k++) {
			System.out.print(ary[k]+" ");
		}
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		return 0;	
	}

	

}
