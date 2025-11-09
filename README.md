# MotoTrack - Sistema de Monitoramento de Motocicletas para Mottu

**MotoTrack** é uma solução tecnológica desenvolvida para otimizar o gerenciamento da frota de motocicletas da **Mottu**, empresa referência em aluguel de motos.  
O sistema automatiza processos de controle, rastreamento e manutenção, utilizando IoT, QR Code e uma interface web integrada via API.

---

## Equipe de Desenvolvimento
- **Vinicius Ribeiro Nery Costa** – RM: 559165  
- **Felipe Ulson Sora** – RM: 555462  
- **Augusto Lopes Lyra** – RM: 558209  

 **Azure DevOps:** [https://dev.azure.com/RM559165/MotoTrack](https://dev.azure.com/RM559165/MotoTrack)
**Links Video de Testes Automatizados:**[https://youtu.be/roAIqkIDoOY](https://youtu.be/roAIqkIDoOY)

---

## Sobre o Projeto
O **MotoTrack** foi criado para substituir processos manuais e imprecisos de controle de frota, oferecendo rastreamento em tempo real, controle de permanência em setores e maior eficiência operacional.

### Problemas Identificados
- Registros manuais e suscetíveis a erro;  
- Dificuldade de rastreamento em tempo real;  
- Falta de controle sobre o tempo de permanência das motos;  
- Retrabalho e baixa eficiência.

### Objetivos
- Automatizar identificação e rastreamento das motos;  
- Criar dashboard web com dados em tempo real;  
- Reduzir falhas humanas;  
- Facilitar a escalabilidade da solução para outras filiais.

---

## Arquitetura do Sistema
1. **Leitura e Identificação:**  
   Dispositivos (ESP32 ou smartphones) realizam leitura de QR Codes fixados nas motos.  
   Dados coletados: *ID, placa e modelo.*

2. **Comunicação com API:**  
   Eventos como entrada, saída e manutenção são enviados via requisições HTTP.

3. **Painel Web:**  
   Exibe histórico de movimentações, status por setor e alertas automáticos.

---

## MVP - Produto Mínimo Viável
O MVP inclui:
- Simulação de leitura de QR Code;  
- Integração com API de movimentações;  
- Dashboard com filtros por placa, modelo e status;  
- Visualização em tempo real e linha do tempo de eventos.

---

## Benefícios Esperados
- Redução de falhas e retrabalhos;  
- Controle e organização aprimorados;  
- Decisões baseadas em dados;  
- Padronização de processos nos pátios.

---

##  Estrutura do Projeto
- **src/main/java** → Código-fonte das classes de serviço (`MotoService`, `EstoqueService`, etc.)  
- **src/test/java** → Testes unitários JUnit (`MotoServiceTest`, `EstoqueServiceTest`, etc.)  
- **pom.xml** → Gerenciamento de dependências e build via Maven  
- **README.md** → Documentação principal do projeto

---

## Requisitos do Ambiente
- **Java JDK 17+**  
- **Apache Maven 3.6+**  
- **Git** (para versionamento e clonagem)

Verifique as versões instaladas:
```bash
java -version
mvn -v

Como Rodar o Projeto

Abaixo está o passo a passo completo para rodar o MotoTrack localmente e executar os testes unitários com Maven.

1. Clonar o Repositório
git clone https://github.com/seu-usuario/mototrack.git


Esse comando faz o download do código-fonte do projeto para sua máquina.

2. Acessar a Pasta do Projeto

Após a clonagem, acesse a pasta onde o projeto foi salvo e entre no diretório que contém o arquivo pom.xml (no caso, MotoTrack_Testes_Unitarios):

cd mototrack
cd MotoTrack_Testes_Unitarios


É importante estar dentro dessa pasta, pois é onde o Maven identifica o arquivo pom.xml do projeto.

3. Compilar o Projeto

Antes de executar os testes, compile o projeto com o comando:

mvn clean compile


Esse comando:

Limpa arquivos de compilação antigos;

Compila todas as classes da aplicação;

Verifica se o pom.xml está configurado corretamente.

4. Executar os Testes Unitários

Após a compilação bem-sucedida, rode os testes com:

mvn test

O Maven executará automaticamente todos os testes JUnit localizados em src/test/java.

Testes executados;

Resultados (sucesso/falha);

Se quiser rodar apenas uma classe de teste específica, use:

mvn -Dtest=MotoServiceTest test
