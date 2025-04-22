Feature: Validación de subida de archivo con formato válido y vista previa

  Scenario: Subir un archivo en formato PDF dentro del límite de 50 MB
    Given el usuario está en la página de subida de archivos
    When el usuario selecciona un archivo "documento.pdf" con un tamaño válido
    Then el archivo se carga correctamente
    And el nombre, tamaño y tipo del archivo se muestran en la vista previa