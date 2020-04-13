package org.github.vitorjclima.model;

import org.github.vitorjclima.model.dao.Customer;
import org.github.vitorjclima.model.vo.CustomerVO;

import java.time.ZoneOffset;

import static org.github.vitorjclima.util.DateUtil.fromLocalDate;

public class CustomerMapper {

  public static Customer voToDao(CustomerVO vo) {
    return Customer.builder()
        .name(vo.getName())
        .document(vo.getDocument())
        .birthDate(fromLocalDate(vo.getBirthDate(), ZoneOffset.UTC))
        .reference(vo.getReference())
        .phones(PhoneMapper.vosToDaos(vo.getPhones()))
        .build();
  }
}
