package org.github.vitorjclima.model.vo.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import org.github.vitorjclima.model.vo.PhoneVO;

public class PhoneVOTemplate implements TemplateLoader {

  public static final String VALID_PHONE_VO = "valid_phone";

  @Override
  public void load() {

    Fixture.of(PhoneVO.class)
        .addTemplate(
            VALID_PHONE_VO,
            new Rule() {
              {
                add("country", uniqueRandom(1, 250));
                add("area", uniqueRandom(10, 99));
                add("number", uniqueRandom(10000000, 999999999));
              }
            });
  }
}
