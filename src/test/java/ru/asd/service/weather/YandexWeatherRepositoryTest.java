package ru.asd.service.weather;


import io.quarkus.test.junit.QuarkusTest;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@QuarkusTest
@Slf4j
class YandexWeatherRepositoryTest {

  @RestClient
  YandexWeatherRepository repository;

  @Test
  @DisplayName("Получим погоду сегодня")
  void test1() {
    var res = repository.getWeather("55.746631", "37.618384");//, Language.RUS.getValue(), 3, false, true);
    log.info(res.toString());
  }
}