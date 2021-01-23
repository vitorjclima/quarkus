package org.github.vitorjclima.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

import static lombok.AccessLevel.PROTECTED;

@Data
@Builder
@Embeddable
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
public class PhonePK implements Serializable {
    private Integer country;
    private Integer area;
    private Integer number;
}
