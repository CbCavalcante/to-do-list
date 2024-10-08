package br.com.cauabernardo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cauabernardo.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
