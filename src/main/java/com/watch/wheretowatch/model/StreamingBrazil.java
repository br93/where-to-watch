package com.watch.wheretowatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StreamingBrazil {

    @JsonProperty("where_to_watch")
    @JsonAlias("flatrate")
    private Provider[] whereToWatch;
    
}
