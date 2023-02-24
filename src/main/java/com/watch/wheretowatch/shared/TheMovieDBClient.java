package com.watch.wheretowatch.shared;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.watch.wheretowatch.model.StreamingModel;
import com.watch.wheretowatch.shared.movie.MovieDetails;
import com.watch.wheretowatch.shared.movie.MovieResponseModel;
import com.watch.wheretowatch.shared.tv.TVDetails;
import com.watch.wheretowatch.shared.tv.TVResponseModel;

@FeignClient(name = "themoviedb", url = "${api.themoviedb}")
public interface TheMovieDBClient {

    @GetMapping("/search/movie")
    public MovieResponseModel getMovieByName(@RequestParam(name = "query") String name,
            @RequestParam(name = "api_key") String apiKey);

    @GetMapping("/movie/{movie_id}")
    public MovieDetails getMovieById(@PathVariable(name = "movie_id") Integer movieId,
            @RequestParam(name = "api_key") String apiKey);

    @GetMapping("/search/tv")
    public TVResponseModel getTVSeriesByName(@RequestParam(name = "query") String name,
            @RequestParam(name = "api_key") String apiKey);

    @GetMapping("/tv/{tv_id}")
    public TVDetails getTvSeriesById(@RequestParam(name = "tv_id") Integer tvId,
            @RequestParam(name = "api_key") String apiKey);

    @GetMapping("/movie/{movie_id}/watch/providers")
    public StreamingModel getProviderByMovieId(@PathVariable(name = "movie_id") Integer movieId,
            @RequestParam(name = "api_key") String apiKey);

    @GetMapping("/tv/{tv_id}/watch/providers")
    public StreamingModel getProviderByTvId(@PathVariable(name = "tv_id") Integer tvId,
            @RequestParam(name = "api_key") String apiKey);
}
