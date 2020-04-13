package org.github.vitorjclima.model.vo.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import org.github.vitorjclima.model.vo.CustomerVO;
import org.github.vitorjclima.model.vo.PhoneVO;

import static org.github.vitorjclima.model.vo.template.PhoneVOTemplate.VALID_PHONE_VO;

public class CustomerVOTemplate implements TemplateLoader {

  public static final String VALID_CUSTOMER_VO = "valid_customer";

  @Override
  public void load() {
    Fixture.of(CustomerVO.class)
        .addTemplate(
            VALID_CUSTOMER_VO,
            new Rule() {
              {
                add("name", name());
                add("document", cnpj());
                add("birthDate", random("1980-01-01", "1990-01-01", "2000-01-01"));
                add("reference", "Customer's reference");
                add("phones", has(3).of(PhoneVO.class, VALID_PHONE_VO));
              }
            });
  }
}
