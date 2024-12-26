# Простой сервер с использованием сокетов

Этот проект реализует сервер и клиент с использованием сокетов на Java, который обрабатывает данные о покупках пользователей на локальной сети. Сервер получает данные о покупках, агрегирует их по категориям и отправляет клиенту информацию о категории с наибольшей суммой покупок.

### Структура проекта

**Сервер:**

1. Принимает запросы от клиента.
1. Обрабатывает данные о покупках (категории и суммы).
1. Возвращает клиенту категорию с максимальной суммой покупок.

**Клиент:**

1. Отправляет данные о покупках на сервер.
1. Получает и выводит результат с категорией с наибольшей суммой.

### Пример запроса

Клиент отправляет данные в формате JSON:

```json
{
  "product": "булка",
  "date": "2022.02.08",
  "value": "200"
}
```

Сервер обработает данные и вернёт результат:

```json
{
  "maxCategory": {
    "category": "еда",
    "sum": 200
  }
}
```

### Структура файлов

   1. *Server.java:* Серверная часть, которая слушает входящие соединения на порту 8989, обрабатывает данные и отправляет результат.
   1. *Client.java*: Клиентская часть, которая отправляет данные на сервер и выводит ответ.
   1. *UserBuys.java:* Класс, который хранит и обрабатывает информацию о покупках, суммируя значения по категориям.
   1. *Categories.java:* Класс для чтения и хранения категорий товаров из файла categories.tsv.
   1. *Entity.java:* Класс для представления данных о покупках (продукт, дата и сумма).
   1. *ProccesingWithData.java:* Класс для обработки данных и получения категории с наибольшей суммой.

### Установка

Клонируйте репозиторий:
```git
git clone https://github.com/ваш-репозиторий.git
cd ваш-репозиторий
```
Убедитесь, что у вас установлены:

1. Maven 3.9.8+

1. Java 17+
