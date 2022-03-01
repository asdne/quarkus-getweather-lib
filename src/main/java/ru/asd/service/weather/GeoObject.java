package ru.asd.service.weather;

import lombok.Data;

@Data
public class GeoObject {
District district;
Locality locality;
Province province;
Country country;

@Data
class District{
  int id;
  String name;
}
@Data
class Locality{
  int id;
  String name;
}
@Data
class Province{
  int id;
  String name;
}
@Data
class Country{
  int id;
  String name;
}

}
