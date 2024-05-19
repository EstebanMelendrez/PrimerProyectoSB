El siguiente proyecto desarrolla una aplicación para gestión de tareas. 

La base de datos fue desarrollada en MySQL. Se utilizan tres tablas para la gestión de tareas las cuales son "User", "Task" y "Tag".

La tabla "User" almacena datos de usuario como Id (automático), nombre, email y password. 
La tabla "Task" almacena datos de una tarea como Id (automático), titulo, descripción, estado de la tarea, fecha de creación y fecha limite. 
La tabla "Tag" almacena datos de una etiqueta para las tareas como Id (automático) y nombre. 

Las relaciones de las tablas son: De User a Task es una relación Uno a Muchos. 
                                  De Task a Tag es una relación de Muchos a Muchos. 


Ejemplos de JSON para probar los servicios
Para la creación de usuarios por medio de post y con ruta /users
{
    "name": "Jaime",
    "email": "315183010@ejemplo.com",
    "password": "gatitos"
}

Para la creación de etiquetas por medio de post y con ruta /tags
{
    "name": "En proceso "
}

Para la creación de etiquetas por medio de post y con ruta /tasks
{
    "name": "En proceso "
}
{
    "title": "Presentacion Ciberseguridad",
    "description": "Descripción actualizada",
    "state": "En progreso",
    "creationDate": "2023-01-01 10:00:00",
    "limitDate": "2023-12-31 23:59:59",
    "tags": [
        {"name": "En progreso", "id": 4}
        ]
}

Se pueden eliminar y actualizar tareas utilizando su Id para identificarlas por medio de la URL
Ejemplo: Por medio del método DELETE de http /tasks/17

Ejemplo: Por medio del método PUT de http tasks/18
{
    "title": "Presentacion APIS",
    "description": "Descripción actualizada",
    "state": "En progreso",
    "creationDate": "2023-01-01 10:00:00",
    "limitDate": "2023-12-31 23:59:59",
    "tags": [
        {"name": "En progreso","id": 4}
        ]
}
