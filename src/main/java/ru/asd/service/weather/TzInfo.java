package ru.asd.service.weather;

import lombok.Data;

@Data
public class TzInfo {
  int offset;
  String name;
  String abbr;
  boolean dst;
}
