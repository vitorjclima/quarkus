package org.github.vitorjclima.model;

import org.github.vitorjclima.model.dao.Customer;
import org.github.vitorjclima.model.vo.CustomerVO;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import static org.github.vitorjclima.util.DateUtil.fromLocalDate;

public class CustomerMapper {

  public static Customer voToDao(CustomerVO vo) {
    return Customer.builder()
        .name(vo.getName())
        .document(vo.getDocument())
        .birthDate(fromLocalDate(vo.getBirthDate(), ZoneOffset.UTC))
        .reference(vo.getReference())
        .phones(PhoneMapper.voToDao(vo.getPhones()))
        .build();
  }

  public static CustomerVO daoToVo(Customer dao) {
    return CustomerVO.builder()
        .name(dao.getName())
        .document(dao.getDocument())
        .birthDate(dao.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
        .reference(dao.getReference())
        .phones(PhoneMapper.daoToVo(dao.getPhones()))
        .build();
  }

  public static List<CustomerVO> daoToVo(List<Customer> daos) {
    List<CustomerVO> vos = new ArrayList<>();
    daos.forEach(dao -> vos.add(daoToVo(dao)));
    return vos;
  }
}
