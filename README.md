# Desafio Mule fiap

Esse desafio consiste em criar dois serviços da Web, usando SOAP e REST.
Ambos devem ser criados no mesmo projeto usando o Anypoint Studio, o IDE para o Mule ESB  3.7 - IDE anypoint studio
Você pode baixá-lo em https://fiapcom-my.sharepoint.com/:u:/g/personal/pf0861_fiap_com_br/Ef07SrCfPnlFiYlT3-YY5u8B9CqWgDM7ttdPqI_TngrTEw?e=2ZKvbY. 
Certifique-se de usar a versão 3.7+ do Mule ESB.

Acreditamos que, sem qualquer experiência anterior com o Mule, você ainda poderá usá-lo devido ao seu IDE intuitivo. 
Se você tiver alguma dificuldade, verifique sua documentação (https://docs.mulesoft.com/mule-runtime/3.7/developing) e outros recursos como vídeos do YouTube.

Esta fonte contém o modelo básico para sua implementação.
O Mule 3.7+ e o Anypoint Studio são compatíveis apenas com o JDK 1.7+.

## REST Web Service

### 3 - Crie fluxo expondo um serviço REST, onde o consumidor será capaz de:

* Inserir um empregado no banco
  * Recebe um funcionário e retorna uma mensagem de sucesso
* Listar todos os funcionários
  * payload vazio e retorna uma lista de funcionários

Complete o restFlow já fornecido.

Seu serviço deve usar JSON como seu formato de representação para objetos.

Usar banco mysql criado via docker-compose.

Você deve definir os nomes dos recursos e os verbos HTTP usados de acordo com ODATA.


## SOAP Web Service

### 1 - Crie um WSDL contendo as seguintes operações:


* Obter o salário médio dos empregados
  * Pedido vazio e retorna um decimal
* Calcular um bônus de funcionário
  * Recebe o ID do empregado e retorna o bônus como um decimal
  * Use a classe já criada com.fiap.desafio.EmployeeBonusTransformer
  * Coloque um processador "Java Transformer" no fluxo associado à classe EmployeeBonusTransformer
  * O bônus deve ser uma porcentagem aleatória do salário do funcionário, mas não superior a 50%

Use qualquer ferramenta de sua escolha para criar o WSDL.


### 2 - Crie um fluxo usando o Anypoint Studio para implementar a lógica para o WSDL criado no item 1:

Você deve concluir o projeto fornecido neste repositório com os processadores e a configuração ausentes para conseguir essa implementação.

Dentro do projeto existem dois fluxos incompletos. Use o soapFlow para este item.

Copie o WSDL create no item 1 para uma pasta do seu projeto, configure o processador CXF e conclua o fluxo com os processadores necessários.

Usar banco do docker-compose.

Para implementar a lógica de bônus do funcionário:

* Use a classe já criada com.fiap.desafio.EmployeeBonusTransformer
* Coloque um processador "Java Transformer" no fluxo associado à classe EmployeeBonusTransformer
* O bônus deve ser uma porcentagem aleatória do salário do funcionário, mas não superior a 50%

