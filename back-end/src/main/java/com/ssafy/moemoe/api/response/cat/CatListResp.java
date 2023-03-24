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
public class CatListResp {

    private long cat_id;
    private String name;
    private int age;
    private String gender;
    private int follower_cnt;
    private String image;

    @Builder
    public CatListResp(long cat_id, String name, int age, String gender, int follower_cnt, String image) {
        this.cat_id = cat_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.follower_cnt = follower_cnt;
        this.image = image;
    }
}