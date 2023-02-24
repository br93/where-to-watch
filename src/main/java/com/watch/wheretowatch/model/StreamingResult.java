package com.watch.wheretowatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StreamingResult {

    @JsonProperty("brazil")
    @JsonAlias("BR")
    private StreamingBrazil brazil;
    
}
