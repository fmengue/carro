Instruções para instalação e testes da solução:

. Download do arquivo .tar com código gerado em uma máquina com docker
. Como administrador, execute o comando docker load < carro.tar
. Como administrador, execute o comando docker run --rm  -p 8080:8080 carro-spring-boot-docker
. O contexto da API é http://localhost:8080/api/carros

ENTRADA. Feita via POST, deve-se usar os seguintes parâmetros no BODY, em formato JSON:

id
cor
placa
ano
Modelo

SAÍDA: Feita via GET, usando o mesmo contexto.
