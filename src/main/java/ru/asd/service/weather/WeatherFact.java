package ru.asd.service.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherFact {
  float temp;
  @JsonProperty("feels_like")
  float feelsLike;
  @JsonProperty("temp_water")
  float tempWater;
  String condition;
  @JsonProperty("wind_speed")
  float windSpeed;
  @JsonProperty("wind_dir")
  String windDirection;
  @JsonProperty("pressure_mm")
  float pressureMm;
  @JsonProperty("pressure_pa")
  float pressurePa;
  float humidity;
  String daytime;
  boolean polar;
  String season;
  @JsonProperty("is_thunder")
  boolean isThunder;
  @JsonProperty("prec_type")
  PrecType precType;
  @JsonProperty("prec_strength")
  float precStrength;
  @JsonProperty("phenom_condition")
  PhenomCondition phenomCondition;
  @JsonProperty("uv_index")
  float uvIndex;
}
