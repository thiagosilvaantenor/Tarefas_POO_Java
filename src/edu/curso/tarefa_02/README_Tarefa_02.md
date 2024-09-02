# Tarefa 02
## Exercícios:

<div align="center">

  - 1:
    
    ![image](https://github.com/user-attachments/assets/dd4e79ed-0636-4d8d-9e30-91e9f6a0f50f)
  
    ![image](https://github.com/user-attachments/assets/7da53cc9-9217-42bf-9dec-4a71eaa4c138)
  
  - 2:
    
    ![image](https://github.com/user-attachments/assets/47c26e3d-e39a-4899-aef8-6725965114fe)

  - 3:
    
    ![image](https://github.com/user-attachments/assets/cf55ea45-ef42-47c9-8f01-b1d45aebacf5)

  - 4:
  
    // Imagem muito grande, por isso decidi copiar o texto:

     Ex12 - Dinossauro Skeep
    Nesta atividade vamos criar um pequeno jogo, estilo Tamagochi
    Jogo do Dinossauro - skeep

    O Skeep é um dinossauro e será o personagem do nosso jogo, ele possui as seguintes características e comportamentos:

    Características:
    
    - energia
    - velocidade
    - temperatura
    - humor
      
    <br>
    Comportamentos:

    - pular()
    - correr()
    - comer()
    - cantar()
    - tomarSol()
    - ficarNaSombra()
      
    <br>
    Regras:<br>

    O dinossauro precisa:
    <br>
    Tomar Sol para aumentar a velocidade, a temperatura, além de deixa-lo com o humor feliz<br>
    Comer para aumentar a energia, diminui a velocidade, e deixar o humor feliz<br>
    Correr gasta energia e velocidade, mas deixa o humor feliz<br>
    ficarNaSombra recupera energia deixa o humor triste e diminui a temperatura<br>
    cantar gasta energia e deixa o humor feliz<br>
    pular gasta energia e velocidade e deixa o humor feliz<br>
    <br>

    - Faça uma classe chamada Dinossauro, contendo as características e comportamentos do Skeep.
    - Crie uma classe de Teste com o método main, para executar as atividades abaixo:
    - Crie uma instância do classe Dinossauro chamada de skeep
    - Crie uma instância da classe Scanner chamada de scan
    <br>
    Em um loop inifinito:<br>
    - Mostre na tela as características do objeto skeep
    - Mostre um menu de opções para o usuário com as seguintes opções:
      - (P)ular
      - (C)orre
      - Co(M)er
      - C(A)ntar
      - Tomar (S)ol
      - Ficar na S(O)mbra

        
    - Pegue a primeira letra do que o usuário digitar como sendo a opção escolhida
      <br>
      - String textoMaiusculo = scan.nextLine().toUpperCase();
      - char letra = textoMaiusculo.charAt(0);
        
    - Conforme a opção escolhida execute o método correspondente no objeto skeep

<div>
