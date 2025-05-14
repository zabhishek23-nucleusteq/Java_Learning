package com.example.ProductApplication.Exception;

public class InvalidProductException extends RuntimeException{
    public InvalidProductException(String message)
    {
        super(message);
    }
}
