# Aula de Herança
## Herança oque é ? Vamos começar com um exemplo de herança.     Os animais eles tem filhotes e esses filhotes vão herdar caracteristicas do pai e da mãe, como cor do pelo, porte fisico, cor dos olhos, mas apesar da alta semelhança não é herdado todas as caracteriscas.     O filhote tera caracteristicas propias definas pela genetica.     A herança na programação permite que as classes compartilhem seus atributos ou metodos AAA classe  *PAI >>base (Superclasse)*: concede as caracterisas a uma outra classe  e a classe *FILHA >> derivada (sub classe):* é a que herda essas carcteristicas da classe base . O objetivo de utilizar herança é facilitar a programação reproveitando codigo para evitar repetição de scripts que fazem as mesmas coisas .

## Exemplo em codigo do uso de classe pai e filha.
```
class Animal:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def fazer_som(self):
        pass  

    def info(self):
        return f"{self.nome} tem {self.idade} anos."

class Cachorro(Animal):
    def __init__(self, nome, idade, raca):
        super().__init__(nome, idade)
        self.raca = raca

    def fazer_som(self):
        return f"{self.nome}: Au au!"

    def abanar_rabo(self):
        return f"{self.nome} está abanando o rabo."

meu_cachorro = Cachorro(nome="Belinha", idade=3, raca="Viralata")
meu_segundoCachorro = Cachorro(nome="Bob", idade=2, raca="Caramelo")

print(meu_segundoCachorro.info())
print(meu_cachorro.info())
print(meu_cachorro.fazer_som())
print(meu_segundoCachorro.fazer_som())
print(meu_cachorro.abanar_rabo())
print(meu_segundoCachorro.abanar_rabo())

``` 
## As vantagens de usar herança é a facil manutenção do codigo por conta da legibilidade do codigo, menor quantidade de linha de codigo a ser escrita assim criando um codigo limpo que segue as boas praticas da programação


# para começarmos entender oque é herança vamos do começo entender oque é classe no python. Classe nada mais é que um molde, esse molde tem atribuídos (características) e métodos (comportamentos), agora vamos criar um exemplo para melhor visualização, vamos criar a classe Pessoa....  Que atributos pessoa tem?? nome , idade , altura,  Vamos fazer com esses 3 atributos primeiro  digitamos def que serve apra criar uma função depois  INIT que é o inicializador de um objeto ou costrutor em seguida digitamos self que é  usada para se referir à instância atual de uma classe e é o primeiro parâmetro detodos os métodos de uma classe 
