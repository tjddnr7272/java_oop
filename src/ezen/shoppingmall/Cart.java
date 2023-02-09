package ezen.shoppingmall;

import java.util.Iterator;

/**
 * 쇼핑몰에서 취급하는 모든 상품들을 담고, 제거하고 , 검색하고 등의 기능 제공
 * @author 김성욱
 * @Date   2023. 1. 5.
 */
public class Cart {
	// 필드의 다형성
	private Item[] items;
	private int count; 
	private int capacity; 
	 
	
	
	
	public Cart(int capacity) {
		items = new Item[capacity];
		capacity = this.capacity;
	}

	
	
	
	// 카트에 담긴 전체 상품 반환
	public Item[] getItems() {
		return items;
	}


	public int getCount() {
		return count;
	}

	// 카트에 상품 담기
	// 매개변수의 다형성
	public void addItem(Item item) {                //Item= album,movie
    	  items[count++] = item;
	}
	
	
	
	
	// 상품이름으로 상품 검색
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
			Item item = items[i];
			boolean exit = item.getName().equals(name);         //앞에 스트링 객체의 equals
			if(exit) {
				return item;
			}
		}
		return null;    
		
	}
	
	
	// 카트에서 상품 제거
		public boolean removeItem(String name) {
			for (int i = 0; i < count; i++) {
				String itemName = items[i].getName();
				if(itemName.equals(name)) {
					for (int j = i; j < count-1; j++) {
						items[j] = items[j+1];
					}
					count--;
					return true;
				}
			}
			return false;
		}
		
		// 카트에서  모든 상품 제거
			public void removeAll() {
				items = new Item[capacity];
				count = 0;
			}
		
	
	
	
	
	
	
	
}
