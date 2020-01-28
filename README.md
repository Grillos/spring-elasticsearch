# README #

# Execute in server
  - sysctl -w vm.max_map_count=262144

Elasticsearch + Spring data
### O que contem na Aplicação? ###

* Aplicação utiliza Spring data e Elasticsearch
* 1.0

### Como rodar as aplicações? ###

* clone o repositorio
* abra um terminal e execute o comando docker-compose up


### Como usar as aplicações? ###

* Criar index no elasticsearch:
    curl --location --request PUT 'http://127.0.0.1:9200/users'

* Criar registro de usuario
curl --location --request PUT 'localhost:9200/users/user/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 1,
    "username": "robson.grillo",
    "password": "*****"
}'


