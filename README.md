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

* faça um request:
    curl -X POST \
    http://localhost:8080/users \
    -H 'Content-Type: application/json' \
    -H 'Host: localhost:8080' \
    -d '{
        "id": 1,
        "username": "robson.grillo",
        "password": "*****"
    }'
