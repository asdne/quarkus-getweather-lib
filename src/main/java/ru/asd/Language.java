package ru.asd;

import lombok.Getter;

public enum Language {
  RUS("ru_RU"),
  ENG("en_US");

  @Getter
  private final String value;

  Language(String value) {
    this.value = value;
  }
}
