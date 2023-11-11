# Aula de Herança
## Herança oque é ? Vamos começar com um exemplo de herança.     Os animais eles tem filhotes e esses filhotes vão herdar caracteristicas do pai e da mãe, como cor do pelo, porte fisico, cor dos olhos, mas apesar da alta semelhança não é herdado todas as caracteriscas.     O filhote tera caracteristicas propias definas pela genetica.     A herança na programação permite que as classes compartilhem seus atributos ou metodos AAA classe  *PAI >>base (Superclasse)*: concede as caracterisas a uma outra classe  e a classe *FILHA >> derivada (sub classe):* é a que herda essas carcteristicas da classe base . O objetivo de utilizar herança é facilitar a programação reproveitando codigo para evitar repetição de codigo que faz as mesmas coisas .

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
        return "Au au!"

    def abanar_rabo(self):
        return f"{self.nome} está abanando o rabo."

meu_cachorro = Cachorro(nome="Buddy", idade=3, raca="Golden Retriever")

print(meu_cachorro.info())

print(meu_cachorro.fazer_som())
print(meu_cachorro.abanar_rabo())

``` 
## As vantagens de usar herança é a facil manutenção do codigo por conta da legibilidade do codigo, menor quantidade de linha de codigo a ser escrita assim criando um codigo limpo que segue as boas praticas da programação
