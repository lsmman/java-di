package circular;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 순환 의존성을 의도적으로 발생시키기 위한 설정 클래스
 */
@Configuration
public class CircularDependencyConfig {

  @Bean
  public ACircularObject aCircularObject() {
    return new ACircularObject();
  }

  @Bean
  public BCircularObject bCircularObject() {
    return new BCircularObject();
  }
}
