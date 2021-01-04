# quarkus-activemq-multicast
Exemplo de aplicação que envia para um topic multicast e consome de duas filas diferentes

## Passos
1. Executar docker-compose up
2. Acessar http://localhost:8161/console
3. Clicar em Artemis -> Addresses -> Create
4. Preencher nome, numeros-gerados, Routing type: Multicast
5. Entrar no projeto activemq-multicast
6. Executar: mvn quarkus:dev
7. Verificar que será impresso na console a cada 10s o consumo pelos dois Consumidores