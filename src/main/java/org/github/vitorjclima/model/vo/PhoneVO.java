package org.github.vitorjclima.model.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PhoneVO {
    private Integer country;
    private Integer area;
    private Integer number;
}
