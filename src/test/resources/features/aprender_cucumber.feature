# language: pt
@aprenderCucumber
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar o Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Então a especificação deve finalizar com sucesso

  @tipo1
  Cenário: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 3
    Então o valor do contador será 18

  @tipo2
  Cenário: Deve incrementar contador
    Dado que o valor do contador é 123
    Quando eu incrementar em 35
    Então o valor do contador será 158