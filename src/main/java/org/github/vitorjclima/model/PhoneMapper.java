package org.github.vitorjclima.model;

import org.github.vitorjclima.model.dao.Phone;
import org.github.vitorjclima.model.dao.PhonePK;
import org.github.vitorjclima.model.vo.PhoneVO;

import java.util.ArrayList;
import java.util.List;

public class PhoneMapper {

  public static List<Phone> vosToDaos(List<PhoneVO> vos) {
    List<Phone> daos = new ArrayList<>();
    vos.forEach(
        vo -> {
          daos.add(voToDao(vo));
        });

    return daos;
  }

  private static Phone voToDao(PhoneVO vo) {
    return Phone.builder()
        .phone(
            PhonePK.builder()
                .country(vo.getCountry())
                .area(vo.getArea())
                .number(vo.getNumber())
                .build())
        .build();
  }
}
