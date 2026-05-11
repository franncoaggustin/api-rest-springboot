# API REST con Spring Boot

API REST desarrollada con Spring Boot, JPA/Hibernate y MySQL.

## Tecnologías
- Java 17
- Spring Boot 3.5.14
- Spring Data JPA / Hibernate
- MySQL 8
- Lombok
- ModelMapper
- Hibernate Envers (auditoría)

## Entidades
- Persona (con domicilio y libros)
- Domicilio (con localidad)
- Localidad
- Libro (con autores)
- Autor

## Configuración
1. Clonar el repositorio
2. Crear la base de datos en MySQL: `CREATE DATABASE db_persona;`
3. Copiar `src/main/resources/application.properties.example` a `src/main/resources/application.properties`
4. Completar las credenciales de la base de datos
5. Ejecutar la aplicación

## Endpoints principales
- `GET /api/v1/personas`
- `GET /api/v1/personas/search?filtro=nombre`
- `GET /api/v1/autores`
- `GET /api/v1/libros`
- `GET /api/v1/domicilios`
- `GET /api/v1/localidades`
