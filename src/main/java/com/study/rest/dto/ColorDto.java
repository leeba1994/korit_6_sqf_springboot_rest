package com.study.rest.dto;

import com.study.rest.entity.Color;
import lombok.Builder;
import lombok.Data;

public class ColorDto {

    @Data
    @Builder
    public static class Register {
        private String colorName;

        public Color toEntity() {
            return Color.builder()
                 .colorName(colorName)
                 .build();
        }
    }
}
