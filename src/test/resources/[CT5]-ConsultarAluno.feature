# language: pt
# encofing: UTF-8
Funcionalidade: Consulta aluno via API

  @consulta_aluno
  Cenário: Consulta um aluno
    Dado que insiro a url para acessar api
    Quando realizo uma consulta com o comando GET
    Então retorna o request 200

    
  @consulta_aluno
  Cenário: Validar o campo 'nome' com o valor 'Pedro' de um aluno
    Dado que insiro a url para acessar api
    Quando realizo uma consulta com o comando GET
    Então valido o json o campo "nome" com o valor "Pedro"