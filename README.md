# POO_Project

A ideia do projeto é desenvolver um visualizador de LOGs (Dashboard), para que possa ser possível analisar as variáveis de um robô seguidor de linha para competições.
Justificativa:
Nas competições, os robôs seguidores de linha utilizam um microcontrolador que é  programado em C++, onde segue um algoritmo que faz a leitura dos sensores e realiza uma média da leitura e envia para uma função de controle PID. O controle PID faz o controle do robô para direita ou esquerda, ao mesmo tempo que controla o PWM dos motores (velocidade).
Como o robô utiliza um microcontrolador com Bluetooth e dois núcleos, o segundo núcleo envia os dados para um terminal através do Bluetooth. Depois, é passado os dados para um arquivo onde o programa deste projeto irá fazer a leitura.

[imagem do robo](https://github.com/MicaelSerpa/POO_Project/blob/main/Robo.png) [imagem do LOG](https://github.com/MicaelSerpa/POO_Project/blob/main/LOG_IMAGE.png)


É necessário criar uma pasta chamada "LOGS" dentro do diretório C://LOGS. Para que o programa funcione. Terá um exemplo chamado LOG.txt, no formato que o robô envia para o terminal. O programa lê o arquivo, faz um tratamento dos dados e preenche um gráfico. 
Os valores destes dados são essenciais para análise e calibração, como forma de melhorar o máximo possível o desempenho do robô. Tendo um gráfico como forma de visualização facilitará muito o trabalho durante as competições.

[grafico](https://github.com/MicaelSerpa/POO_Project/blob/main/Programa.png)