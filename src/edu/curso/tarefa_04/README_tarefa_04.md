# Tarefa 04

## Exercício 1 || Exercício 19

Exercício - Curso (Boundary, Control e Entity) – Simplificado Usando Java FX<br>

Crie um CRUD para fazer a manutenção de cursos, contendo o Boundary, o Control e a Entidade (BCE), contendo um botão para adicionar novo curso e outro para pesquisar, conforme layout abaixo: <br>

Curso:<br>
- Id        
- Nome
- Código do Curso
- Nome do Coordenador
- Quantidade de alunos

Faça com que o Control guarde a lista de cursos e tenha uma função para gravar novos cursos [ `public void gravar(Curso c) `] e outra função para pesquisar [ `public Curso pesquisar( String parteNome ) `] para localizar um curso pelo nome <br>
Faça com que o Boundary tenha uma instância de Control e acione os métodos gravar e pesquisar desta instância conforme os botões gravar e pesquisar são acionados.<br>

Dentro do Boundary crie uma função [ `public Curso toEntity() `] que irá gerar e retornar um objeto do tipo Curso com os dados que estiverem na tela. Crie também uma função chamada [ `public void fromEntity(Curso c)` ] que deverá pegar os dados do objeto do tipo Curso informado no parâmetro colocando-os na tela.

<img src="./exercicio1/Tela do Curso.png" alt="Imagem de como deve ser a tela de gestão de cursos, indicando que deve ser informado: id, nome, código de curso,  nome do curso e quantidade de alunos. Pra cada informação necessária tem um campo de texto, por fim tem dois botões 'Adicionar' e 'Pesqusiar'"/>

## Exercício 2 || Exercício 20

Exercício - Aluno (Boundary, Control, Entity) BCE Simplificado – Usando Java FX

Crie um CRUD para fazer a manutenção de alunos, contendo o Boundary, o Control e a Entidade (BCE - Simplificado) conforme arquivo em anexo: