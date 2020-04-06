# language: pt
# encofing: UTF-8
Funcionalidade: Inserir aluno via API

  @inserir_aluno
  Cenário: Inserir mais de dois alunos
    Dado que insiro a url para acessar api
    Quando capturo o json 'json_invalido' para realizar um POST
    Então retorna o request 200
    
    
  @inserir_aluno
  Cenário: Inserir um aluno
    Dado que insiro a url para acessar api
    Quando capturo o json 'json_valido' para realizar um POST
    Então retorna o request 200
