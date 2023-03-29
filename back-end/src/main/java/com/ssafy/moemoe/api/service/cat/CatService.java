package com.ssafy.moemoe.api.service.cat;

import com.ssafy.moemoe.api.request.cat.CatInfoReq;
import com.ssafy.moemoe.api.response.cat.CatDetailResp;
import com.ssafy.moemoe.api.response.cat.CatListResp;
import com.ssafy.moemoe.db.entity.cat.Cat;

import java.util.List;
import java.util.UUID;

public interface CatService {
    boolean insertCat(UUID memberId, CatInfoReq catInfoReq);

    List<CatListResp> getCats(UUID memberId, Long universityId);

    CatDetailResp getCat(UUID memberId, Long catId);


    default CatDetailResp toCatDetailResp(Cat cat, Float lat, Float lng) {
        return CatDetailResp.builder()
                .catId(cat.getCatId())
                .name(cat.getName())
                .age(cat.getAge())
                .gender(cat.getGender())
                .followerCnt(cat.getFollowerCnt())
                .image("S3를 통한 링크 추가 예정")
                .lat(lat)
                .lng(lng)
                .build();
    }
}