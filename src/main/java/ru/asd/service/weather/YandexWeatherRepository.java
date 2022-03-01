package ru.asd.service.weather;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://api.weather.yandex.ru/v2")
@ClientHeaderParam(name = "X-Yandex-API-Key", value = "${yandex.weather.api-key}")
public interface YandexWeatherRepository {

  @GET
  @Path("/forecast")
  @Consumes("application/json")
//  @Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
  WeatherResponse getWeather(@QueryParam("lat") String latitude, @QueryParam("lon") String longtitude);
//  ,
//                     @QueryParam("lang") String language, @QueryParam("limit") int limit,
//                     @QueryParam("hours") boolean isHours, @QueryParam("extra") boolean isExtra);
}
