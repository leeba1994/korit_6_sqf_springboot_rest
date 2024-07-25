package com.study.rest.dto;

import com.study.rest.entity.Computer;
import lombok.Builder;
import lombok.Data;

public class ComputerDto {

    @Builder
    @Data
    public static class Register {
        private String company;
        private String cpu;
        private int ram;
        private int ssd;

        public Computer toEntity() {
            return Computer.builder()
                    .company(company)
                    .cpu(cpu)
                    .ram(ram)
                    .ssd(ssd)
                    .build();
        }

    }

    @Data
    public static class GetListDto {
        private String company;
        private String cpu;



    }
}
