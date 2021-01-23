package org.github.vitorjclima.model;

import org.github.vitorjclima.model.dao.Phone;
import org.github.vitorjclima.model.dao.PhonePK;
import org.github.vitorjclima.model.vo.PhoneVO;

import java.util.ArrayList;
import java.util.List;

public class PhoneMapper {

    public static List<Phone> voToDao(List<PhoneVO> vos) {
        List<Phone> daos = new ArrayList<>();
        vos.forEach(vo -> daos.add(voToDao(vo)));
        return daos;
    }

    public static List<PhoneVO> daoToVo(List<Phone> daos) {
        List<PhoneVO> vos = new ArrayList<>();
        daos.forEach(dao -> vos.add(daoToVo(dao)));
        return vos;
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

    private static PhoneVO daoToVo(Phone dao) {
        return PhoneVO.builder()
                .country(dao.getPhone().getCountry())
                .area(dao.getPhone().getArea())
                .number(dao.getPhone().getNumber())
                .build();
    }
}
