# 🛵 MotoTrack - Sistema de Monitoramento de Motocicletas para Mottu

**MotoTrack** é uma solução tecnológica desenvolvida para otimizar o gerenciamento da frota de motocicletas da **Mottu**, empresa referência em aluguel de motos.  
O sistema automatiza processos de controle, rastreamento e manutenção, utilizando IoT, QR Code e uma interface web integrada via API.

---

## 👨‍💻 Equipe de Desenvolvimento
- **Vinicius Ribeiro Nery Costa** – RM: 559165  
- **Felipe Ulson Sora** – RM: 555462  
- **Augusto Lopes Lyra** – RM: 558209  

🔗 **Azure DevOps:** [https://dev.azure.com/RM559165/MotoTrack](https://dev.azure.com/RM559165/MotoTrack)
Código com teste unitarios na Branch Develop

---

## 📌 Sobre o Projeto
O **MotoTrack** foi criado para substituir processos manuais e imprecisos de controle de frota, oferecendo rastreamento em tempo real, controle de permanência em setores e maior eficiência operacional.

### 🚨 Problemas Identificados
- Registros manuais e suscetíveis a erro;  
- Dificuldade de rastreamento em tempo real;  
- Falta de controle sobre o tempo de permanência das motos;  
- Retrabalho e baixa eficiência.

### ✅ Objetivos
- Automatizar identificação e rastreamento das motos;  
- Criar dashboard web com dados em tempo real;  
- Reduzir falhas humanas;  
- Facilitar a escalabilidade da solução para outras filiais.

---

## ⚙️ Arquitetura do Sistema
1. **Leitura e Identificação:**  
   Dispositivos (ESP32 ou smartphones) realizam leitura de QR Codes fixados nas motos.  
   Dados coletados: *ID, placa e modelo.*

2. **Comunicação com API:**  
   Eventos como entrada, saída e manutenção são enviados via requisições HTTP.

3. **Painel Web:**  
   Exibe histórico de movimentações, status por setor e alertas automáticos.

---

## 🧪 MVP - Produto Mínimo Viável
O MVP inclui:
- Simulação de leitura de QR Code;  
- Integração com API de movimentações;  
- Dashboard com filtros por placa, modelo e status;  
- Visualização em tempo real e linha do tempo de eventos.

---

## 📈 Benefícios Esperados
- Redução de falhas e retrabalhos;  
- Controle e organização aprimorados;  
- Decisões baseadas em dados;  
- Padronização de processos nos pátios.

---

## 🧩 Estrutura do Projeto
- **src/main/java** → Código-fonte das classes de serviço (`MotoService`, `EstoqueService`, etc.)  
- **src/test/java** → Testes unitários JUnit (`MotoServiceTest`, `EstoqueServiceTest`, etc.)  
- **pom.xml** → Gerenciamento de dependências e build via Maven  
- **README.md** → Documentação principal do projeto

---

## 🧰 Requisitos do Ambiente
- **Java JDK 17+**  
- **Apache Maven 3.6+**  
- **Git** (para versionamento e clonagem)

Verifique as versões instaladas:
```bash
java -version
mvn -v
🧭 Como Rodar o Projeto
Abaixo está o passo a passo completo para rodar o MotoTrack localmente e validar os testes unitários.

🔹 1. Clonar o Repositório
bash
Copiar código
git clone https://github.com/seu-usuario/mototrack.git
cd mototrack
🔹 2. Criar ou Alternar para a Branch “develop”
bash
Copiar código
git fetch origin
git checkout -b develop origin/develop || git checkout -b develop
🔹 3. Compilar o Projeto
bash
Copiar código
mvn clean compile
Esse comando compila todas as classes da aplicação e valida o pom.xml.

🔹 4. Executar Todos os Testes
bash
Copiar código
mvn test
O Maven executará automaticamente todos os testes JUnit localizados em src/test/java.

🔹 5. Executar Testes Específicos
Rodar apenas uma classe de teste:

bash
Copiar código
mvn -Dtest=MotoServiceTest test
Rodar apenas um método de teste:

bash
Copiar código
mvn -Dtest=MotoServiceTest#deveCadastrarMotoComSucesso test
📊 Relatórios de Testes
Após rodar mvn test, os relatórios são gerados automaticamente em:

bash
Copiar código
target/surefire-reports/
Esses arquivos (.txt, .xml) contêm o resumo de cada teste executado.
