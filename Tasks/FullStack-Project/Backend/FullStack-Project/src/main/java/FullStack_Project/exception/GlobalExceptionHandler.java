package FullStack_Project.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 404 - Task not found
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleTaskNotFound(
            TaskNotFoundException ex) {

        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getMessage());

        return new ResponseEntity<>(
                error,
                HttpStatus.NOT_FOUND
        );
    }

    // 400 - Form / Validation errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(
            MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult()
                .getFieldErrors()
                .forEach(fieldError ->
                        errors.put(
                                fieldError.getField(),
                                fieldError.getDefaultMessage()
                        )
                );

        return new ResponseEntity<>(
                errors,
                HttpStatus.BAD_REQUEST
        );
    }

    // 400 - Invalid JSON / wrong date format
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, String>> handleInvalidJson(
            HttpMessageNotReadableException ex) {

        Map<String, String> error = new HashMap<>();

        error.put(
                "error",
                "Invalid request data. Please check the JSON values and date format."
        );

        return new ResponseEntity<>(
                error,
                HttpStatus.BAD_REQUEST
        );
    }

    // 500 - Unexpected server error
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGeneralException(
            Exception ex) {

        Map<String, String> error = new HashMap<>();

        error.put(
                "error",
                "Internal server error"
        );

        return new ResponseEntity<>(
                error,
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}