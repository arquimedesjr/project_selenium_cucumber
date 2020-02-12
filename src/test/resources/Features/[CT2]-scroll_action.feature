# language: pt
# encofing: UTF-8
Funcionalidade: Validar a Funcionalidade Scroll Action

  @ValidarScroll
  Cenário: Validar Scroll Action
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joe Russo'
    E clico no botao 'Pesquisa Google'
    Então valido a funcionalidade scroll action
