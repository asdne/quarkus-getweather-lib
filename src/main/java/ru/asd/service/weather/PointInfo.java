package ru.asd.service.weather;

import java.io.Serializable;
import lombok.Data;

@Data
public class PointInfo implements Serializable {
  double lat;// 	Широта (в градусах). 	Число
  double lon;
  TzInfo  tzinfo;// 	Информация о часовом поясе. Содержит поля offset, name, abbr и dst. 	Объект
  double offset;// 	Часовой пояс в секундах от UTC. 	Число.Число
  String name;// 	Название часового пояса. 	Строка
  String abbr;// 	Сокращенное название часового пояса. 	Строка
  boolean dst;// 	Признак летнего времени. 	Логический
  double def_pressure_mm;// 	Норма давления для данной координаты (в мм рт. ст.). 	Число
  Long def_pressure_pa;// 	Норма давления для данной координаты (в гектопаскалях). 	Число
  String url;// 	Страница населенного пункта на сайте Яндекс.Погода. 	Строка

//Долгота(в градусах)
}
