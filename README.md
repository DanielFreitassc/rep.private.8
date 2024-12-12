#atualizando as lista do apt
sudo apt update

sudo apt install mysql-server

sudo systemctl start mysql

sudo mysql

```
/* Criando o Banco de Dados Zabbix Server */
CREATE DATABASE zabbix CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

/* Criando o Usuário Zabbix com a Senha Zabbix do Banco de Dados Zabbix */
CREATE USER 'zabbix'@'localhost' IDENTIFIED WITH mysql_native_password BY 'zabbix';
GRANT USAGE ON *.* TO 'zabbix'@'localhost';
GRANT ALL PRIVILEGES ON zabbix.* TO 'zabbix'@'localhost';
FLUSH PRIVILEGES;

/* Habilitando a opção de Criação de Função log_bin_trust_function_creators no MySQL Server */
SET GLOBAL log_bin_trust_function_creators = 1;

/* Listando os Bancos de Dados do MySQL */
SHOW DATABASES;

/* Verificando o Usuário Zabbix criado no Banco de Dados MySQL Server */
SELECT user,host FROM mysql.user WHERE user='zabbix';

/* Saindo do Banco de Dados */
exit
```
EXIT

#atualizando as lista do apt
sudo apt update

#instalando as dependências do Zabbix
#opção do comando apt: --install-recommends (Consider suggested packages as a dependency for installing)
#opção da contra barra (\): criar uma quebra de linha no terminal
sudo apt install --install-recommends traceroute nmap snmp snmpd snmp-mibs-downloader apt-transport-https \
software-properties-common git vim fping

# Seguir o procedimento para a distro escolhida 
https://www.zabbix.com/download

#atualizando as lista do Apt com o novo repositório do Zabbix Server
sudo apt update

#instalando o Zabbix Server e Agent2
#opção do comando apt: --install-recommends (Consider suggested packages as a dependency for installing)
#opção da contra barra (\): criar uma quebra de linha no terminal
sudo apt install --install-recommends zabbix-server-mysql zabbix-frontend-php zabbix-apache-conf \
zabbix-sql-scripts zabbix-agent2 zabbix-agent2-plugin-*

#opções do comando mysql: -u (user), -p (password)
sudo mysql -u root -p

#opções do comando mysql: -u (user), -p (password)
sudo mysql -u zabbix -p

/* Listando os Bancos de Dados do MySQL */
SHOW DATABASES;

/* Acessando o Banco de Dados Zabbix */
USE zabbix;

/* Saindo do Banco de Dados */
exit

#OBSERVAÇÃO IMPORTANTE: O PROCEDIMENTO DE CRIAÇÃO E POPULAÇÃO DAS TABELAS DO ZABBIX
#SERVER, DEPENDENDO DO SEU HARDWARE DEMORA BASTANTE, SÓ AGUARDAR O TÉRMINO.

#importando o esquema e os dados iniciais do banco de dados do Zabbix Server
#opção do redirecionador | (pipe): Conecta a saída padrão com a entrada padrão de outro comando
#opções do comando mysql: -u (user), -p (password), zabbix (database)
sudo zcat /usr/share/zabbix/sql-scripts/mysql/server.sql.gz | sudo mysql --default-character-set=utf8mb4 \
-uzabbix -pzabbix zabbix

#opções do comando mysql: -u (user), -p (password)
sudo mysql -u zabbix -p

```
/* Listando os Bancos de Dados do MySQL */
SHOW DATABASES;

/* Acessando o Banco de Dados Zabbix */
USE zabbix;

/* Verificando as Tabelas criadas pelo Script */
SHOW TABLES;

/* Verificando os Usuários criados pelo Script */
SELECT username,passwd FROM users;

/* Saindo do Banco de Dados */
exit
```

```
#Desabilitando a opção de Criação de Função no MySQL Server

#opções do comando mysql: -u (user), -p (password)
sudo mysql -u root -p

/* Desabilitando a opção de Criação de Função log_bin_trust_function_creators no MySQL Server */
SET GLOBAL log_bin_trust_function_creators = 0;

/* Saindo do Banco de Dados */
exit
```
#07_ Editando os arquivos de Configuração do Zabbix Server e Agent

```
#editando o arquivo de configuração do Zabbix Server
sudo vim /etc/zabbix/zabbix_server.conf

#entrando no modo de edição do editor de texto VIM
INSERT

  #descomentar e alterar o valor da variável DBHost= na linha: 91
  DBHost=localhost

  #deixar o padrão da variável DBName= na linha: 100
  DBName=zabbix

  #deixar o padrão da variável DBUser= na linha: 116
  DBUser=zabbix

  #descomentar e alterar o valor da variável DBPassword= na linha: 124
  DBPassword=zabbix

#salvar e sair do arquivo
ESC SHIFT : x <Enter>

#editando o arquivo de configuração do Zabbix Agent2
sudo vim /etc/zabbix/zabbix_agent2.conf

#entrando no modo de edição do editor de texto VIM
INSERT

  #alterar o valor da variável Server= na linha: 80
  Server=172.16.1.20

  #alterar o valor da variável ServerActive= na linha: 133
  ServerActive=172.16.1.20

  #alterar o valor da variável Hostname= na linha: 144
  Hostname=wsvaamonde

  #descomentar o valor da variável RefreshActiveChecks= na linha 204
  RefreshActiveChecks=5s

#salvar e sair do arquivo
ESC SHIFT : x <Enter>
```

#08_ Habilitando o Serviço do Zabbix Server e Agent2
```
#habilitando o serviço do Zabbix Server e Agent2
sudo systemctl daemon-reload
sudo systemctl enable zabbix-server
sudo systemctl restart zabbix-server zabbix-agent2 apache2
```
#09_ Verificando o Serviço e Versão do Zabbix Server e Agent2
```
#verificando o serviço do Zabbix Server e Agent2
sudo systemctl status zabbix-server zabbix-agent2
sudo systemctl restart zabbix-server zabbix-agent2
sudo systemctl stop zabbix-server zabbix-agent2
sudo systemctl start zabbix-server zabbix-agent2

#analisando os Log's e mensagens de erro do Servidor do Zabbix (NÃO COMENTADO NO VÍDEO)
#opção do comando journalctl: -t (identifier), -x (catalog), -e (pager-end), -u (unit)
sudo journalctl -xeu zabbix-server
sudo journalctl -t zabbix_agent2
sudo journalctl -xeu zabbix-agent2

#verificando a versão do Zabbix Server e Agent2
#opção do comando zabbix_server: -V (version)
#opção do comando zabbix_agentd: -V (version)
sudo zabbix_server -V
sudo zabbix_agent2 -V
``` 
