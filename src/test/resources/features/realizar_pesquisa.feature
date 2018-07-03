#language: pt
@pesquisaGoogle
Funcionalidade: Realizar Pesquisa no Google
  Como um visitante da página
  Eu quero pesquisar um assunto no Google

  Contexto: 
    Dado que estou na página inicial

  Esquema do Cenário: Realizar Pesquisa
    Quando eu pesquisar por <valor>
    Então devo ver resultados de pesquisa sobre <valor>

    Exemplos: 
      | valor           |
      | Cucumber        |
      | Java Enterprise |
