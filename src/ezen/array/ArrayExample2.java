package ezen.array;

/**
 * 배열 선언, 생성 , 사용하기
 * 
 * @author 김성욱
 *
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = {99, 78, 90 ,100 , 75};
		
		// 배열 복사
		int[] array2 = new int[10];
		
		for (int i = 0; i <array.length; i++) {
			array2[i] = array[i];			
		}
	
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
						
		}		
		System.out.println();
	
		
		// mission : 오름차순 정렬하기...
		// 구현하세요
	
		
		
		for (int i = 0; i < array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) { 
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
     		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			if(i+1 != array.length) {
				System.out.print(" " + "\t");
			}
		}
     		
     		
     		
		
     		
     		
     		
     	
	

		
		
		
		
		
		
		
		
		
		
		

	}

}
