# language: pt
# encofing: UTF-8
Funcionalidade: Validar a Funcionalidade Scroll JS

  @ValidarScroll
  Cenário: Validar Scroll JS
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joe Russo'
    E clico no botao 'Pesquisa Google'
    Então valido a funcionalidade scroll js
