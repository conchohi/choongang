package collectionexam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDishMain {
	public static void main(String[] args) {
		System.out.println("**** Stack ****");
		//Dish 객체를 담을 Stack 컬렉션 생성
		Stack<Dish> dishes = new Stack<>();
		
		//접시 쌓기 - push()
		dishes.push(new Dish(1));
		dishes.push(new Dish(2));
		dishes.push(new Dish(3));
		dishes.push(new Dish(4));
		dishes.push(new Dish(5));

		//접시 꺼내기 - pop(), 가장 마지막에 저장한 것을 먼저 꺼냄, LIFO
		while(!dishes.isEmpty()) {//empty() : List, isEmpty() : Stack
			//확인 - peek()
			System.out.println("현재 가장 위에 있는 접시 살펴보기 : " + dishes.peek().getValue());
			System.out.println();
			Dish dish = dishes.pop();
			System.out.println("현재 가장 위에 있는 접시 꺼내오기 : " + dish.getValue());
			System.out.println();
//			System.out.println(dishes.pop().getValue());
		}
		
		System.out.println();
		System.out.println("**** Queue ****");
		
		Queue<Dish> dishesQueue = new LinkedList<>(); //Queue 는 인터페이스
		
		//접시 쌓기 - offer()
		dishesQueue.offer(new Dish(1));
		dishesQueue.offer(new Dish(2));
		dishesQueue.offer(new Dish(3));
		dishesQueue.offer(new Dish(4));
		dishesQueue.offer(new Dish(5));
		
		//접시 꺼내기 - poll(), 가장 먼저 저장한 것을 먼저 꺼냄, FIFO
		while(!dishesQueue.isEmpty()) {
			//확인 - peek()
			System.out.println("현재 가장 앞에 있는 접시 살펴보기 : " + dishesQueue.peek().getValue());
			System.out.println();
			Dish dish = dishesQueue.poll();
			System.out.println("현재 가장 앞에 있는 접시 꺼내오기 : " + dish.getValue());
			System.out.println();
//			System.out.println(dishes.poll().getValue());
		}
	}

}
