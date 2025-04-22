Feature: Validar selección de modo de carga de documentos

  Scenario: Seleccionar modo de carga de documentos
    Given El usuario quiere cargar documentos
    When Selecciona la opción 'cargar documentos'
    Then El sistema muestra opción para carga única y carga múltiple
    When Elige 'carga en un solo archivo'
    Then Se habilita un único recuadro para subir el archivo
    When Elige 'cargar documentos por separado'
    Then Se muestran múltiples recuadros correspondientes a cada documento requerido