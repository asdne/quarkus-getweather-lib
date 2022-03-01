package ru.asd.service.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PhenomCondition {

  fog("туман"),
  mist("дымка"),
  smoke("смог"),
  dust("пыль"),
  @JsonProperty("dust-suspension")
  dustSuspension("пылевая взвесь"),
  duststorm("пыльная буря");
  //  thunderstorm-with-duststorm( "пыльная буря с грозой"),
//  drifting-snow — слабая метель.
//  blowing-snow — метель.
//      ice-pellets — ледяная крупа.
//  freezing-rain — ледяной дождь.
//  tornado — торнадо.
//      volcanic-ash — вулканический пепел.
  private String description;

  PhenomCondition(String description) {
    this.description = description;
  }
}
