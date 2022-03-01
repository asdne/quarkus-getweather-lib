package ru.asd.service.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherResponse {
  Long now;// 	Время сервера в формате Unixtime. 	Число
  @JsonProperty("now_dt")
  String nowDt;// 	Время сервера в UTC. 	Строка
  PointInfo info; // 	Объект информации о населенном пункте. 	Объект
  @JsonProperty("geo_object")
      GeoObject geoObject;
  Yesterday yesterday;
  WeatherFact fact;// 	Объект фактической информации о погоде. 	Объект
//  forecasts 	Объект прогнозной информации о погоде. 	Объект
}
