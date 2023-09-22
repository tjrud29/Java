package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TodoList {
	private ArrayList<String> tasks;
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >= 0 && index<tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("잘못된 인덱스 입니다.");
		}
	}
	
	public void displayTasks() {
		System.out.println("나의 투두리스트 {add");
		for(int i = 0; i<tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가 : add, 삭제 : remove, 할일 보기 : List, 종료 : exit 입력하세요" );
			
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				
				System.out.println("할 일을 입력하세요,");
				String task = sc.nextLine();
				todoList.addTask(task);
				
			}else if (choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) - 1;
					todoList.removetask(index);
				}catch (Exception e) { 
					System.out.println("유효하지 않은 입력입니다");
				}
				
			}else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}

	}

