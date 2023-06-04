
# Java Core (семинары)
## Урок 1. Компиляция и интерпретация кода
Создать проект из трёх+ классов (основной с точкой входа и два класса в другом пакете),
которые вместе должны составлять одну программу (простое приложение на Ваш выбор), которое просто демонстрирует работу некоторого механизма).
Пример моего приложения - в материалах урока.
Необходимо установить Docker Desktop.
(*) Создать Dockerfile, позволяющий откопировать исходный код вашего приложения в образ для демонстрации работы вашего приложения при создании соответствующего контейнера.

# temperatureConvector
Конвертация температуры из градусов Цельсия в градусы Фаренгейта и наоборот

Создан код:<br>
Main https://github.com/ShumAhd/temperatureConvector/blob/main/Main.java
<br>Коневектор https://github.com/ShumAhd/temperatureConvector/tree/main/converter
<br>Dockerfile https://github.com/ShumAhd/temperatureConvector/blob/main/Dockerfile

Собрал Docker с помощью команды 
```
docker build -t myapp .
```
Запустил контейнер
```
docker run -it myapp.
```