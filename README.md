# Fungiblestory
A open-source talent hunt platform for the writers of all sorts

## DB:
- PostgreSQL
- Version: Latest

## Build:
- Maven
- Java version: 11

## Framework:
- Springboot
- Version: 2.7.3

## Setup:
1. git pull origin dev
2. import the src folder from _FungibleStory-API/src/_
3. perform : maven clean install
4. DB needs to be created in the postgresql - DB name: FungibleStory _(refer: application.properties)_
5. Tables will be created automatically. 
6. The DB queries are inside _FungibleStory-SQL/SQL-Scripts.sql_

### 18-03-2023

1. Added Pom.xml
2. Added support for swagger
3. Added three api's for users
4. Added logging configuration
5. Altered DB structure

