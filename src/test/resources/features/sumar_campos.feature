#language: es

Característica: Categoria Input Forms

  Como usuario
  Quiero sumar dos numeros
  Para verificar su buen funcionamiento.

  Escenario: Suma con dos campos de texto
    Dado que Felipe ingresa a la practica de Simple Form Demo
    Cuando el ingresa los numeros:
      | Numero 1 | Numero 2 |
      | 50       | 80       |
    Entonces el resultado debe ser 130

    Escenario: Suma con dos campos de texto [Variable de sesion]
      Dado que Felipe ingresa a la practica de Simple Form Demo
      Cuando el ingresa los numeros:
        | Numero 1 | Numero 2 |
        | 50       | 80       |
      Entonces el resultado mostrado es correcto
