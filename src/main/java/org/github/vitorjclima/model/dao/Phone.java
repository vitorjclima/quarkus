package org.github.vitorjclima.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

import static lombok.AccessLevel.PROTECTED;

@Data
@Builder
@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
public class Phone implements Serializable {
    @EmbeddedId private PhonePK phone;
}
