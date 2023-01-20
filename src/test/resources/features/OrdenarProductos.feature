Feature: Ordenar Productos

  @OrdenarProductos
  Scenario: Ordenar productos aleatoreamente
    Given Ingresar a Exito.com
    And Seleccionar Categoria
    When Seleccionar Productos Aleatoreos
    And Seleccionar carrito de compras
    Then Validar datos carrito
