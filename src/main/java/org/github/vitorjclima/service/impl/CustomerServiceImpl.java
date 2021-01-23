package org.github.vitorjclima.service.impl;

import org.github.vitorjclima.model.CustomerMapper;
import org.github.vitorjclima.model.dao.Customer;
import org.github.vitorjclima.model.vo.CustomerVO;
import org.github.vitorjclima.service.CustomerService;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<CustomerVO> getAll() {
        return CustomerMapper.daoToVo(Customer.listAll());
    }

    @Override
    public void create(CustomerVO vo) {
        CustomerMapper.voToDao(vo).persistAndFlush();
    }
}
