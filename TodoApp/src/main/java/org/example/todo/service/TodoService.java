package org.example.todo.service;

import java.awt.*;

public class TodoApp extends App {
    TodoService service = new TodoService();

    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);
        
//        메소드 참조를 통해 service 객체의 메소드 사용
        menu.add(new MenuItem("목록", service::printTodoList));
        menu.add(new MenuItem("상세", service::deleteTodo));
        menu.add(new MenuItem("추가", service::addTodo));
        menu.add(new MenuItem("수정", service::updateTodo));
        menu.add(new MenuItem("삭제", service::deleteTodo));
    }
    public static void main(String[] args) {
        App app = new TodoApp();
        app.run();
    }
}
