package org.github.vitorjclima.service;

import org.github.vitorjclima.model.vo.CustomerVO;

import java.util.List;

public interface CustomerService {

  /**
   * Retrieves the customers.
   *
   * @return The customers.
   */
  List<CustomerVO> getAll();
}
