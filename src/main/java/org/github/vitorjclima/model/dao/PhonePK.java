package org.github.vitorjclima.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@Embeddable
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class PhonePK implements Serializable {
  private Integer country;
  private Integer area;
  private Integer number;
}
