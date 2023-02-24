package com.watch.wheretowatch.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.watch.wheretowatch.model.StreamingModel;
import com.watch.wheretowatch.shared.TheMovieDBClient;
import com.watch.wheretowatch.shared.movie.MovieResponseModel;
import com.watch.wheretowatch.shared.tv.TVResponseModel;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StreamingService {
    
    private final TheMovieDBClient theMovieDBClient;
    private final Environment environment;
    private static final String API_KEY = "api.key";

    public MovieResponseModel getMovieByName(String name){
        return theMovieDBClient.getMovieByName(name, environment.getProperty(API_KEY));
    }

    public TVResponseModel getTVSeriesByName(String name){
        return theMovieDBClient.getTVSeriesByName(name, environment.getProperty(API_KEY));
    }

    public StreamingModel getWhereToWatchMovie(Integer movieId){
        var title = this.getMovieTitleByMovieId(movieId);
        StreamingModel streaming = theMovieDBClient.getProviderByMovieId(movieId, environment.getProperty(API_KEY));
        streaming.setTitle(title);

        return streaming;
    }

    public StreamingModel getWhereToWatchTVSeries(Integer tvId){
        var name = this.getTVSeriesNameByTVId(tvId);
        StreamingModel streaming = theMovieDBClient.getProviderByTvId(tvId, environment.getProperty(API_KEY));
        streaming.setTitle(name);

        return streaming;

    }

    private String getMovieTitleByMovieId(Integer movieId){
        var movie = theMovieDBClient.getMovieById(movieId, environment.getProperty(API_KEY));

        return movie.getTitle();
    }

    private String getTVSeriesNameByTVId(Integer tvId){
        var tvSeries = theMovieDBClient.getTvSeriesById(tvId, environment.getProperty(API_KEY));

        return tvSeries.getName();
    }
}
