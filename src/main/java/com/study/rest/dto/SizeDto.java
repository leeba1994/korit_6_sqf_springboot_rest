package com.study.rest.dto;

import com.study.rest.entity.Size;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SizeDto {

    // 단건 조회
    @Builder
    @Data
    public static class Info {
        private int sizeId;
        private String sizeName;
    }

    public static List<Info> toList(List<Size> sizeList) {
        List<Info> infos = new ArrayList<>();
        for(Size size : sizeList) {
            infos.add(size.toDto());
        }
        return infos;
//        return sizeList.stream().map(Size::toDto).collect(Collectors.toList());
    }

//    // 다건 조회
//    @Builder
//    @Data
//    public static class ListResponse {
//        List<Info> sizeList;
//    }
}
