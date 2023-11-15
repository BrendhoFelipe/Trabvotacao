Sistema de Votos com Enquetes
Este é um sistema simples de votos que permite criar, gerenciar enquetes e registrar votos associados a opções específicas.

Classes Principais
1. Enquete
A classe Enquete representa uma enquete específica. Ela possui:

id: Identificador único da enquete (gerado automaticamente).
pergunta: A pergunta ou tema da enquete.
opcoes: Uma lista de opções associadas a essa enquete.
2. Opcao
A classe Opcao representa uma opção de resposta associada a uma enquete específica. Ela contém:

id: Identificador único da opção (gerado automaticamente).
descricao: Descrição ou texto associado à opção.
enquete: Relacionamento muitos-para-um com a classe Enquete. Cada opção pertence a uma enquete específica.
3. Voto
A classe Voto representa um voto associado a uma opção específica em uma enquete. Possui:

id: Identificador único do voto (gerado automaticamente).
opcao: Relacionamento muitos-para-um com a classe Opcao. Cada voto está associado a uma opção específica.
Funcionalidades
O sistema oferece as seguintes funcionalidades:

Criar Enquete:

Endpoint: POST /enquetes
Cria uma nova enquete com base nos dados fornecidos.
Listar Enquetes:

Endpoint: GET /enquetes
Retorna uma lista de todas as enquetes existentes.
Buscar Enquete por ID:

Endpoint: GET /enquetes/{enqueteId}
Retorna detalhes de uma enquete específica com base no ID.
Votar em uma Opção:

Endpoint: A ser implementado (depende dos requisitos específicos).
Tecnologias Utilizadas
Spring Boot
Spring Data JPA
RESTful API
Banco de Dados (utilizando JPA e Hibernate)
Como Executar a Aplicação
Clone o Repositório:

bash
Copy code
git clone https://github.com/seu-usuario/sua-aplicacao.git
Navegue até o Diretório do Projeto:

bash
Copy code
cd sua-aplicacao
Execute a Aplicação:

bash
Copy code
./mvnw spring-boot:run
Acesse a Aplicação:

Acesse http://localhost:8080 no navegador.
Contribuição
Sinta-se à vontade para contribuir, reportar problemas ou sugerir melhorias. Se você tiver dúvidas ou precisar de suporte, abra uma issue.

Esse README fornece uma visão geral do sistema. Para mais detalhes sobre as funcionalidades e endpoints, consulte o código-fonte e a documentação do projeto.# Trabvotacao
