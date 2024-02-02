package com.myblog.myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDetails {

    private String message;
    private Date date;
    private String uri;

//    public ErrorDetails(String message, Date date, String uri) {
//        this.message = message;
//        this.date=date;
//        this.uri= uri;
//    }



}
