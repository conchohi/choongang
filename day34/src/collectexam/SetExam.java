package collectexam;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java"); 
		set.add("jdbc");
		set.add("jsp/servlet");
		set.add("java"); //equals, hashCode 재정의
		set.add("jdbc");
		
		System.out.println("set의 크기 : " + set.size()); //3개
		
		Set<Integer> setInt = new HashSet<>();
		setInt.add(30);
		setInt.add(40);
		setInt.add(30);
		
		System.out.println("setINt의 크기 : " + setInt.size()); //2개
		
		Set<Car> car = new HashSet<>();
		car.add(new Car("노랑")); //equals, hashCode 재정의 X
		car.add(new Car("파랑"));
		car.add(new Car("노랑"));
		car.add(new Car("파랑"));
		
		System.out.println("car의 크기 : " + car.size()); 
		//4개, 재정의 시 2개
 	}

}

class Car{
	String color;
	
	Car(String color){
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color);
	}
	
	
}