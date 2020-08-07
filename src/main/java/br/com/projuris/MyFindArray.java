package br.com.projuris;

import org.springframework.stereotype.Component;

@Component
public class MyFindArray implements FindArray{

	@Override
	public int findArray(int[] array, int[] subArray) {
		int result = -1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == subArray[0]) {
				result = i;
			}
		}
		
		return result;
		
	}

}
