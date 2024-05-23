package com.akmal.todo.utils;

/**
 * Class untuk menamgkap response dari API
 * @param <T> merepresentatisk class dari content yang dikirim
 *           dapat berupa Class dalam domain, atau List of class domain
 * @Created by Budiman
 * @Created Date : 08/09/2018
 * @Updated Date
 */
public class ResponseAPI <T>{
    private boolean status;
    private String message;
    private T content;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}