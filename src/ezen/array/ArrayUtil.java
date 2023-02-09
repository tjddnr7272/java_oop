package ezen.array;

/**
 * 배열과 관련된 공통 기능 정의
 * @author 김성욱
 * 2022. 12. 29.
 */
public class ArrayUtil {
	
	// 배열 복사
	public static int[] copyArray(int[] srcArray, int increament) {
		int[] copiedArray = new int[srcArray.length + increament ];
		for (int i = 0; i <srcArray.length; i++) {
			copiedArray[i] = srcArray[i];	
		
	}
		return copiedArray;
	
	}
	
	// 배열 정렬 
	public static void sort(int[] srcArray) {
		for (int i = 0; i < srcArray.length; i++) {
			for(int j=i+1; j<srcArray.length; j++) {
				if(srcArray[i] > srcArray[j]) { 
					int tmp = srcArray[i];
					srcArray[i] = srcArray[j];
					srcArray[j] = tmp;
				}
				
			}
		}
		
		
		
	}
   

}
