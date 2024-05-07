<div style="text-align: center" align="center">
    <a href="https://gpb.fut.ru/itfactory/backend"><img src="./.media/logo.png" alt="GPB IT FACTORY logo" ></a>
    <h1>Telegram Чат-бот "МиниБанк"</h1>
    <p>Проект, разработан в рамках академической программы <a href="https://gpb.fut.ru/itfactory/backend">GPB IT FACTORY 2024</a>,
представляет собой практическое приложение на Java,
демонстрирующее систему "МиниБанк". Он состоит из трех основных компонентов:
фронтенд в виде Telegram-бота, миддлваре-сервис на Java и бэкенд-сервис на Java.
Проект создан с учетом современных мировых стандартов и включает в себя Java 21,
Spring Boot, PostgreSQL, Docker и Kubernetes.</p>
</div>
<br>

## 📲 Диаграмма 

````plantuml
@startuml
participant Клиент
participant "Frontend\nTelegram-bot на Java/Kotlin" as Frontend
participant "Middle-слой\nJava/Kotlin-сервис" as Middleware
participant "Backend\nJava/Kotlin-сервис" as Backend

Клиент -> Frontend : Запрос
Frontend -> Middleware : Передача запроса
Middleware -> Backend : Передача запроса
Backend -> Middleware : Ответ
Middleware -> Frontend : Ответ
Frontend -> Клиент : Ответ
@enduml
````

## 📝 Содержание

- [Начало работы](#-начало-работы)
- [Предварительные требования](#-предварительные-требования)
- [Установка](#-установка)
- [Использование](#-использование)
- [Тестирование](#-тестирование)
- [Документация](#-документация)
- [Контакты](#-контакты)

## 🚀 Начало работы

⚠️ _Раздел в разработке._

Этот раздел будет содержать инструкции по началу работы с проектом.

## 📢 Предварительные требования

⚠️ _Раздел в разработке._

Для запуска проекта Вам необходимо установить следующий компоненты:

1. [Java 21](https://www.oracle.com/java/technologies/downloads/)
2. [Docker](https://docs.docker.com/engine/install/)
3. [PostgreSQL](https://hub.docker.com/_/postgres)

### 🔧 Установка

⚠️ _Раздел в разработке._

Шаги по установке проекта:

````bash
git clone https://yourrepository.git
cd your-project-folder
docker-compose up --build
````

## 🎯 Использование

⚠️ _Раздел в разработке._

Примеры того, как использовать проект. Например, как взаимодействовать с ботом через Telegram.

## 🔍 Тестирование

⚠️ _Раздел в разработке._

Описание процесса тестирования проекта.

````cd backend
./gradlew test
````

## 📚 Документация

⚠️ _Раздел в разработке._

Ссылки на дополнительные ресурсы и документацию, если они есть.

## ☎️ Контакты

Если у вас есть вопросы или предложения, вы можете связаться со мной следующим образом:

- **Email:** <a href="mailto:vnsemkin@gmail.com">vnsemkin@gmail.com</a>
- **Telegram:** [@vnsemkin](https://t.me/vnsemkin)