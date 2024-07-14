@Test_compra
Feature: Compra en la página de demoblaze
  @Step
  Scenario: Proceso completo de compra

    Given que el Cliente se encuentra en la página de inicio de demoblaze
    When el Cliente agrega "Samsung galaxy s7" al carrito
    And el Cliente agrega "Sony vaio i5" al carrito
    And el Cliente navega al carrito
    Then el carrito tiene los productos añadidos: "Samsung galaxy s7" y "Sony vaio i5"
    When el Cliente elige hacer una orden
    And el Cliente completa el formulario de compra con los siguientes datos:
      | name   | country | city   | card       | month | year |
      | Ana    | Ecuador | Quito  | 4242424242   | 07  | 34  |
    Then se muestra un popup confirmando la compra exitosa


