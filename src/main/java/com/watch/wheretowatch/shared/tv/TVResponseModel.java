package com.watch.wheretowatch.shared.tv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TVResponseModel {

    private TVDetails[] results;
    
}
