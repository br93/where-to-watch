package com.watch.wheretowatch.shared.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieResponseModel {
    
    private MovieDetails[] results;
}

