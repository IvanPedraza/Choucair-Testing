Feature: Navegación sección Empleos

  Background: Ingresar a la la pagina principal Choucair
    Given El usuario abre la pagina principal "https://www.choucairtesting.com/"
    Then El usuario deberia ver la imagen de bienvenida de la pagina principal
    And El usuario da click en la seccion Empleos

  Scenario: CP002.Ingresar a la opcion Que es Choucair
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la primera imagen
    Then El usuario deberia ver el texto Ser Choucair

  Scenario: CP003.Ingresar a la opcion Convocatorias
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la segunda imagen
    Then El usuario deberia ver el texto convocatorias

  Scenario: CP004.Ingresar a la opcion Prepararse para aplicar
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la tercera imagen
    Then El usuario deberia ver el texto cursos generales para Ingenieros

  Scenario: CP005.Ingresar a la opcion Empleos disponibles
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la segunda imagen
    Then El usuario se desplaza hacia abajo y deberia ver el texto empleos disponibles

  Scenario: CP006.Ingresar a la opcion Convocatorias y ver el video
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 2
    And El usuario oprima el video "pruebas de software"
    Then El usuario deberia reproducir el video

  Scenario: CP007.Buscar Empleos disponibles de Automatizador en la barra de busqueda
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la segunda imagen
    Then El usuario se desplaza hacia abajo y deberia ver el texto empleos disponibles
    And El usuario digita en cargo "Automatizador" y Location "Bogota"
    And El usuario oprima el boton SEARCH JOBS
    And El usuario deberia ver el empleo Automatizador en la lista

  Scenario: CP008.Buscar Empleos disponibles en la barra de busqueda
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 2 y se desplace hacia abajo
    Then El usuario deberia ver el texto empleos disponibles
    And El usuario diligencie el campo de texto keywords y Location
    And El usuario oprima el boton SEARCH JOBS
    Then El usuario deberia ver el empleo en la lista

  Scenario: CP009.Aplicar el empleo Automatizador
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la segunda imagen
    Then El usuario se desplaza hacia abajo y deberia ver el texto empleos disponibles
    And El usuario digita en cargo "Automatizador" y Location "Bogota"
    And El usuario oprima el boton SEARCH JOBS
    And El usuario deberia ver el empleo Automatizador en la lista
    Then El usuario deberia oprimir boton Automatizador
    And El usuario deberia ver los requisitos para el cargo
    And el usuario deberia oprimir el boton Apply for job
    And El usuario deberia llenar el formulario de aplicacion

  Scenario: CP010.Seleccionar el empleo Analista de pruebas Medellin y Bogotá
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 2 y se desplace hacia abajo
    Then El usuario deberia ver el texto empleos disponibles
    And El usuario diligencie el campo de texto keywords y Location
    And El usuario oprima el boton SEARCH JOBS
    And El usuario deberia ver el empleo Analista de pruebas Medellin y Bogotá en la lista
    Then El usuario deberia dar clic al boton Analista de pruebas Medellin y Bogotá
    And El usuario deberia ver los requisitos para el cargo

  Scenario: CP011.Seleccionar el empleo Analista de Pruebas Lima
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 2 y se desplace hacia abajo
    Then El usuario deberia ver el texto empleos disponibles
    And El usuario diligencie el campo de texto keywords y Location
    And El usuario oprima el boton SEARCH JOBS
    And El usuario deberia ver el empleo Analista de Pruebas Lima en la lista
    Then El usuario deberia dar clic al boton Analista de Pruebas Lima
    And El usuario deberia ver los requisitos para el cargo

  Scenario: CP012.Ingresar al curso Modelo de calidad
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 3
    Then El usuario deberia ver el texto cursos generales para Ingenieros
    And El usuario deberia seleccionar el curso Modelo de calidad de software
    And el usuario deberia ver el texto ISO/IEC 25010

  Scenario: CP013.Ingresar al curso Fundamentos ingeniería de software
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 3
    Then El usuario deberia ver el texto CURSOS QUE TE PODRIAN SERVIR PARA SER UN GRAN TESTER
    And El usuario deberia seleccionar el curso Fundamentos ingeniería de software
    And el usuario deberia ver una ventana nueva con el video en Youtube

  Scenario: CP014.Ingresar a la opcion Marcos de trabajo de pruebas
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 3
    Then El usuario deberia ver el texto Sobre las pruebas de software en el contexto del desarrollo de software
    And El usuario deberia seleccionar la opcion Marcos de trabajo de pruebas
    And el usuario deberia ver una ventana nueva con un archivo en formato PDF

  Scenario: CP015.Ingresar a la opcion Fundamentos de la gerencia de proyectos en desarrollo de software
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 3
    Then El usuario deberia ver el texto Sobre la Gerencia de Proyectos
    And El usuario deberia seleccionar la opcion Fundamentos de la gerencia de proyectos en desarrollo de software
    And el usuario deberia ver una ventana nueva con un archivo en formato PDF

  Scenario: CP016.Buscar Empleos disponibles en la barra de busqueda
    Given El usuario esta en la seccion de empleos
    When El usuario oprima la imagen 2 y se desplace hacia abajo
    Then El usuario deberia ver el texto empleos disponibles
    And El usuario diligencie el campo de texto keywords y Location
    And El usuario oprima el boton SEARCH JOBS

