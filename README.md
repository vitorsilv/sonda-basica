

# Sonda :movie_camera: :first_quarter_moon:
Este projeto é um implementação simples de uma sonda utilizando conceitos de orientação a objetos seguindo o enunciado do [explorando_marte.md](https://gist.github.com/elo7-developer/1a40c96a5d062b69f02c)
## Ideação
Uma **Sonda** precisa de um local para pousar e realizar sua **Movimentação**, então é necessário uma **Planície** em um **Planeta**, com isso,  já temos as principais classes do projeto.

## Classes
### Planicie
A classe **Planicie** tem os atributos ***limiteX*** e ***limiteY*** para delimitar o tamanho da planície que a sonda pode explorar.
###  Planeta
Um **Planeta herda de Planicie** os atributos e métodos e também adiciona ***nomePlaneta*** que o identifica como "Marte".
### Direcao
Uma classe de enums com os valores de **Direcao** (N, W, S, E)

### Controle
A classe abstrata **Controle** cria os atributos necessários para qualquer tipo de robô se movimentar na planície os atributos ***posicaoX***, ***posicaoY*** , uma instância de **Planice** para saber quais os limites(***limiteX, limiteY***) da área que tem para andar,  uma instancia de **Direcao** para saber qual direção a sonda está apontando, além de conter os *métodos abstratos*(**virarEsquerda()**, **virarDireita()** e **mover()**), o método que lê todos os **comandos()** enviados para o robô e os gettters e setters.
### Sonda
A classe **Sonda** representa uma sonda,  ela contém as implementações dos *métodos abstratos*(**virarEsquerda()**, **virarDireita()** e **mover()**) da classe **Controle**

### Main
Cria um planeta com todos os atributos necessário, entra em um while enquanto o não selecionar a opção 0. Dentro do while cria e coordena sondas
