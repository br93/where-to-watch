package com.watch.wheretowatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Provider {

    @JsonAlias("provider_name")
    @JsonProperty("provider")
    private String providerName;
    
}
