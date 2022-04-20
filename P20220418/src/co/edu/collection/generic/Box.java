package co.edu.collection.generic;

public class Box<T> { 
	T field; //모든 값들을 다 받을 수 있음, Object -> 모든 클래스의 부모 클래스
	
	public void setField(T field) {
		this.field=field;
		
	}
	
	public T getField() {
		return field;
	}
	

}
