package com.watch.wheretowatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StreamingModel {
    
    private String title;
    private StreamingResult results;
}

