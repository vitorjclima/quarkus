package org.github.vitorjclima.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
@NoArgsConstructor
public class PhonePK implements Serializable {
  private Integer country;
  private Integer area;
  private Integer number;
}
