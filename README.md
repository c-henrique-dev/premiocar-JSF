<p align="center">
<img src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="spring and spring boot logos" height="170px" width="260px">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/java-1.8-brightgreen.svg" alt="Java">
  <img src="https://img.shields.io/badge/JSF-2.2.20-green.svg" alt="JSF">
  <img src="https://img.shields.io/badge/PrimeFaces-11.0.0-blue.svg" alt="Primefaces">
</p>

# PREMIOCAR-JSF

Este projeto é uma implementação simples de uma locadora de veículos usando as tecnologias Java, WildFly, JSF (JavaServer Faces) e PrimeFaces. Ele foi desenvolvido como parte de um trabalho acadêmico e tem como objetivo demonstrar a integração entre essas tecnologias para criar uma aplicação web funcional.

## Requisitos

Para construir e executar o aplicativo, você precisa:

- [JDK 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- [Maven](https://maven.apache.org)
- [MySQL](https://www.mysql.com/downloads/)


## Configuração do Banco de Dados
Antes de executar o projeto, siga os passos abaixo para configurar o banco de dados:

1. Abra o arquivo persistence.xml, localizado no diretorio `src/main/resources/META-INF/persistence.xml.`

3. Modifique as configurações de conexão, como o nome do banco de dados, nome de usuário e senha, de acordo com o seu ambiente local ou servidor de banco de dados.

4. Certifique-se de que você possui um servidor de banco de dados MySQL instalado e em execução.

5. Crie um banco de dados com o nome `bd_premiocar` em seu servidor.


## Executando o Projeto
Após configurar o banco de dados, você pode prosseguir com os seguintes passos para executar o projeto utilizando o servidor WildFly em conjunto com o NetBeans:

1. Acesse o link: https://www.wildfly.org/ e faça o download do servidor WildFly.
   
2. Extraia o arquivo ZIP baixado para uma localização de sua escolha no seu computador.
   
3. Abra o NetBeans IDE e clique em `Ferramentas` no menu superior.
   
4. Selecione "Servidores" no menu suspenso e, em seguida, clique em `Adicionar Servidor`.
  
5. Escolha WildFly na lista de servidores disponíveis e siga as instruções para apontar para o diretório onde você extraiu o WildFly.
   
6. No NetBeans, clique em `Arquivo` no menu superior e, em seguida, escolha `Abrir Projeto`.
   
7. Navegue até o diretório onde você clonou o repositório da locadora de veículos e selecione o projeto.
   
8. Clique em `Abrir` para importar o projeto.

9. Agora, clique com o botão direito do mouse no projeto "locadora-veiculos" na janela "Projetos" e selecione `Limpar e Construir` para garantir que o projeto foi compilado com sucesso.
    
10. Em seguida, clique com o botão direito do mouse no projeto novamente e selecione `Implantar`. Isso implantará o projeto no servidor WildFly.
    
11. Aguarde até que a implantação seja concluída e, em seguida, clique com o botão direito do mouse novamente no projeto e selecione `Iniciar`.
    
12. Após o servidor iniciar o aplicativo, abra um navegador web moderno e acesse a URL a seguir:
   
    http://localhost:8080/Premiocar-JSF/index.xhtml

![Captura de tela de 2023-07-20 13-34-25](https://github.com/c-henrique-dev/premiocar-JSF/assets/70810148/bc094596-25dd-4c9c-aee3-78868102dd81)

![Captura de tela de 2023-07-20 13-42-44](https://github.com/c-henrique-dev/premiocar-JSF/assets/70810148/11a7888d-fc23-45a4-af2e-b33430836b4a)



