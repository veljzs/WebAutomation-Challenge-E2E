@Test_compra
Feature: Compra en la página de demoblaze

  @Step
  Scenario Outline: Proceso completo de compra

    Given que el Cliente se encuentra en la página de inicio de demoblaze
    When el Cliente agrega "<producto1>" al carrito
    And el Cliente agrega "<producto2>" al carrito
    And el Cliente navega al carrito
    Then el carrito tiene los productos añadidos: "<producto1>" y "<producto2>"
    When el Cliente elige hacer una orden
    And el Cliente completa el formulario de compra con los siguientes datos:
      | name   | country | city   | card       | month | year |
      | <name> | <country> | <city> | <card> | <month> | <year> |
    Then se muestra un popup confirmando la compra exitosa

    Examples:
      | producto1        | producto2     | name | country | city  | card       | month | year |
      | Samsung galaxy s7 | Sony vaio i5 | Ana  | Ecuador | Quito | 4242424242 | 07    | 34   |


