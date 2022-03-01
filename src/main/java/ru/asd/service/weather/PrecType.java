package ru.asd.service.weather;

import lombok.Getter;

public enum PrecType {
  CLEAR("Без осадков"),
  RAIN("дождь"),
  RAIN_AND_SNOW("дождь со снегом"),
  SNOW("снег"),
  HAIL("град");

  @Getter
  private String description;

  PrecType(String desc) {
    this.description = desc;
  }


}
