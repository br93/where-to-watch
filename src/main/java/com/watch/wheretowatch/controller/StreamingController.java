package com.watch.wheretowatch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watch.wheretowatch.model.StreamingModel;
import com.watch.wheretowatch.service.StreamingService;
import com.watch.wheretowatch.shared.movie.MovieResponseModel;
import com.watch.wheretowatch.shared.tv.TVResponseModel;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class StreamingController {
    
   private final StreamingService streamingService;

    @GetMapping("/movies/{name}")
    public ResponseEntity<MovieResponseModel> getMovieByName(@PathVariable String name){
        return ResponseEntity.ok(streamingService.getMovieByName(name));
    }

    @GetMapping("/tv/{name}")
    public ResponseEntity<TVResponseModel> getTVSeriesByName(@PathVariable String name){
        return ResponseEntity.ok(streamingService.getTVSeriesByName(name));
    }

    @GetMapping("/streaming/movies/{movie_id}")
    public ResponseEntity<StreamingModel> getWhereToWatchMovie(@PathVariable(name = "movie_id") Integer movieId){
        return ResponseEntity.ok(streamingService.getWhereToWatchMovie(movieId));
    }

    @GetMapping("/streaming/tv/{tv_id}")
    public ResponseEntity<StreamingModel> getWhereToWatchTVSeries(@PathVariable(name = "tv_id") Integer tvId){
        return ResponseEntity.ok(streamingService.getWhereToWatchTVSeries(tvId));
    }

}
