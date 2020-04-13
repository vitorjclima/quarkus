package org.github.vitorjclima.model.dao;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Builder
@Entity
@NoArgsConstructor
public class Phone implements Serializable {
  @EmbeddedId private PhonePK phone;
}
