package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들에 대한 공통 속성과 기능 정의를 위한 부모클래스
 * @author 김성욱
 * @Date   2023. 1. 5.
 */
public class Item {
     private int Id;
     private String name;
     private int price;
     
     public Item() {}
     
     public Item(int id, String name, int price) {
    	 this.Id = id;
    	 this.name = name;
    	 this.price = price;
     }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
   
     
     
	@Override
		public String toString() {
			return Id + "\t"+name+"\t"+price;
		}
	
	
     
	
	
}
