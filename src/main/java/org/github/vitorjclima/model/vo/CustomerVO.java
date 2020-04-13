package org.github.vitorjclima.model.vo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class CustomerVO {

    private String name;
    private String document;
    private LocalDate birthDate;
    private String reference;
    private List<PhoneVO> phones;
}
