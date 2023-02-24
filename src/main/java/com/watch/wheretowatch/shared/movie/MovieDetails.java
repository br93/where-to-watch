package com.watch.wheretowatch.shared.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDetails {
    
    private Integer id;

    @JsonProperty("original_title")
    private String originalTitle;
    
    private String title;
    
    @JsonProperty("release_date")
    private String releaseDate;
}
