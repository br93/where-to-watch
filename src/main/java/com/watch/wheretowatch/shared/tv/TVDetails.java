package com.watch.wheretowatch.shared.tv;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TVDetails {
    
    private Integer id;

    @JsonProperty("original_name")
    private String originalName;
    private String name;

    @JsonProperty("first_air_date")
    private String firstAirDate;
}
