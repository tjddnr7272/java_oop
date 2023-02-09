package ezen.interfacee;

public class Audio implements RemoteControl{

	private int volume;
	private int memoryVolume; //내부적으로 쓰기 떄문에 리턴 할필요 없음.
	
	
	public int getVolume() {
		return volume;
	}
	
	
	@Override
	public void turnOn() {
        System.out.println("Audio를 켭니다..");		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다..");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("Audio 현재 볼륨 : " + this.volume);
	}
	
	
	
	
	
	
	
	
	
	
	// 디폴트 메소드 오버라이딩  // 인터페이스와 달리 오버라이딩 시 public 꼭 넣어줘야 함
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = volume;
			System.out.println("무음 처리합니다...");
			setVolume(RemoteControl.MIN_VOLUME); 
		}else {
			System.out.println("무음 해제합니다...");
			this.volume = memoryVolume;
		}
		RemoteControl.super.setMute(mute);
	}

}
