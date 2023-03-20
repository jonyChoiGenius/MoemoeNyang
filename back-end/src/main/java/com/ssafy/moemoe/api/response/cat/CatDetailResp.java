package com.ssafy.moemoe.api.response.cat;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CatDetailResp {

    private long cat_id;
    private String name;
    private int age;
    private String gender;
    private int follower_cnt;
    private String url;
    private double lat;
    private double lng;


    @Builder
    public CatDetailResp(long cat_id, String name, int age, String gender, int follower_cnt, String url, double lat, double lng) {
        this.cat_id = cat_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.follower_cnt = follower_cnt;
        this.url = url;
        this.lat = lat;
        this.lng = lng;
    }

}
