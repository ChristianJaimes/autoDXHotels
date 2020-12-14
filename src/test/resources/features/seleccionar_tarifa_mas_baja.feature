#language:es
Característica:
  YO como analista de automatizacion
  Deseo ver el hotel con la tarifa mas baja por ciudad
  Para verificar la informacion de los planes antes de publicarlos a nivel nacional

  Esquema del escenario:
    Dado que Carolina  quiere buscar el mejor precio para sus clientes
    Cuando Carolina inicia la busqueda e la web  deveexpres para "Los Angeles"
      | ciudad   | checkIn   | checkOut   |
      | <ciudad> | <checkIn> | <checkOut> |
    Entonces Carolina debera ver el hotel que   ofresca el menor precio.
    Ejemplos:
      | ciudad        | checkIn    | checkOut   |
      | Los Angeles   | 12/20/2020 | 12/21/2020 |
      | San Francisco | 12/20/2020 | 12/21/2020 |
      | Honolulu      | 12/20/2020 | 12/21/2020 |
      | New York      | 12/20/2020 | 12/21/2020 |
      | Nassau        | 12/20/2020 | 12/21/2020 |
      | Paris         | 12/20/2020 | 12/21/2020 |
      | London        | 12/20/2020 | 12/21/2020 |
      | Rome          | 12/20/2020 | 12/21/2020 |
      | Hamburg       | 12/20/2020 | 12/21/2020 |

