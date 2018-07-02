#language: pt
Funcionalidade: Realizar Pesquisa no Google
  Como um visitante da página
  Eu quero pesquisar um assunto no Google

  Cenário: Realizar Pesquisa
    Dado que estou na página inicial
    Quando eu pesquisar por "Cucumber"
    Então devo ver resultados de pesquisa sobre "Cucumber"
