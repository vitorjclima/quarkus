package org.github.vitorjclima.model.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends PanacheEntity {

  private String name;
  private String document;
  private Date birthDate;
  private String reference;
  @CreationTimestamp private Date createDate;
  @UpdateTimestamp private Date updateDate;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Phone> phones;
}
