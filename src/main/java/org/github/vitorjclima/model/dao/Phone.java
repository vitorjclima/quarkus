package org.github.vitorjclima.model.dao;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable {
  @EmbeddedId private PhonePK phone;
}
