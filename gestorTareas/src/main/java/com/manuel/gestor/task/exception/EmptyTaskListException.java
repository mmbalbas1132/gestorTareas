package com.manuel.gestor.task.exception;

public class EmptyTaskListException extends RuntimeException {
    public EmptyTaskListException(String message) {
        super(message);
    }
}
