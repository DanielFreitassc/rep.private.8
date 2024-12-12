#atualizando as lista do apt
sudo apt update

sudo apt install mysql-server

sudo systemctl start mysql

sudo mysql

```
CREATE DATABASE zabbix CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

CREATE USER 'zabbix'@'localhost' IDENTIFIED BY 'sua_senha_forte';

GRANT ALL PRIVILEGES ON zabbix.* TO 'zabbix'@'localhost';

FLUSH PRIVILEGES;
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
