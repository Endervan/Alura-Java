package com.enderximenes.workshopmongo.resource.exceptions;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.io.Serializable;

public class StantardError implements Serializable {
    private static final long seriaversionlUID = 1L;

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;


    public StantardError() {
    }

    public StantardError(Long timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
