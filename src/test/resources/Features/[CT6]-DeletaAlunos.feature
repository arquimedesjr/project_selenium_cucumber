# language: pt
# encofing: UTF-8
Funcionalidade: Deletar Aluno via API

  @deletar_aluno
   Delineação do Cenário: Deleta aluno
    Dado que insiro a "<url>" para acessar api
    Quando realizo um DELETE através da url
    Então valido o retorno da request 202

    Exemplos: 
      | url                |
      | api_url_delete_one |

  @deletar_aluno
  Delineação do Cenário: Deleta aluno
    Dado que insiro a "<url>" para acessar api
    Quando realizo um DELETE através da url
    Então valido o retorno da request 202

    Exemplos: 
      | url                |
      | api_url_delete_two |
