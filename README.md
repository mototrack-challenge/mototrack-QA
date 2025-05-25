🛵 MotoTrack - Sistema de Monitoramento de Motocicletas para a Mottu

📌 Sobre o Projeto
O MotoTrack é uma solução tecnológica desenvolvida para otimizar o gerenciamento de frotas de motocicletas da empresa Mottu, referência no aluguel de motos. O projeto propõe um sistema inteligente de rastreamento e controle que visa substituir processos manuais por automação com o uso de IoT, QR Code e interfaces web integradas via API.

🚨 Problema
Atualmente, a Mottu enfrenta:

Registros imprecisos e manuais;

Dificuldade no rastreamento em tempo real das motocicletas;

Falta de controle sobre o tempo de permanência nos setores (ex: manutenção, avaliação, etc.);

Redução da eficiência e aumento de retrabalho.

✅ Objetivos do MotoTrack
Automatizar a identificação e rastreamento das motos nos pátios;

Desenvolver um dashboard web com dados em tempo real;

Reduzir falhas humanas e aumentar a eficiência operacional;

Permitir fácil adaptação e escalabilidade da solução para outras filiais.

⚙️ Como Funciona
A arquitetura do MotoTrack é dividida em três camadas:

Leitura e Identificação

Dispositivos com câmera (ex: ESP32 ou smartphones) realizam leitura de QR Codes fixados nas motos.

Dados do QR Code: ID, placa, modelo.

Comunicação com API

Eventos como entrada, saída e movimentação são enviados via requisições HTTP.

Dashboard Web

Exibe o histórico das movimentações;

Localização por setor (entrada, manutenção, pronta, saída, etc.);

Alertas para motos paradas por muito tempo.

🧪 MVP - Produto Mínimo Viável
O MVP entrega:

Simulação de leitura de QR Code;

Integração com API para registrar movimentações;

Dashboard com filtros por placa/modelo/status;

Visualização em tempo real e linha do tempo dos eventos.

🚀 Tecnologias Utilizadas
Frontend: HTML, CSS, JavaScript (React opcional)

Backend/API: Node.js, Express ou similar

Hardware: ESP32 (ou smartphone com câmera)

Outros: QR Code, HTTP requests, banco de dados

📈 Benefícios Esperados
Redução de falhas e retrabalhos;

Maior controle e organização das frotas;

Decisões baseadas em dados;

Padronização dos processos nos pátios.

🔗 Link do Repositório
https://github.com/mototrack-challenge/mototrack-QA

🧩 Diagrama de Arquitetura
(Inserir aqui imagem ou link do diagrama Archimate, caso aplicável)

👨‍💻 Equipe
Vinicius Ribeiro Nery Costa – RM: 559165

Felipe Ulson Sora – RM: 555462

Augusto Lopes Lyra – RM: 558209

🏁 Conclusão
O MotoTrack moderniza o processo de controle de motos da Mottu, trazendo eficiência, confiabilidade e escalabilidade. É uma solução prática, de fácil implementação, que reduz o tempo de treinamento das equipes e melhora a gestão operacional com base em dados concretos.
