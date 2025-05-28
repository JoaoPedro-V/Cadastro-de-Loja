Estrutura das Classes 

 

Classe Produto 

 

A classe Produto representa itens genéricos da loja.  

Possui os seguintes atributos privados:  

Int id 

String nome 

double preco 

Métodos usados:  Construtor com parâmetros Getters e Setters  

Método toString(): retorna os dados do produto como string 

 

Classe Livro 

A classe Livro herda de Produto e adiciona o atributo: 

String autor; 

Ela sobrescreve o método toString() para incluir o autor na descrição 

 

Classe Cliente 

 

A classe Cliente possui os seguintes atributos: 

String nome  

String cpf (deve conter exatamente 11 dígitos numéricos)  

Métodos usados :  

Construtor com validação de CPF 

Getters e Setters  

Método toString() 

 

Classe Venda  

A classe Venda armazena uma transação com:  

Cliente cliente 

Produto[] produtos 

int qtdProdutos Métodos usados : 

calcularTotal() : soma o preço dos produtos 

listarProdutos() : retorna os produtos em string 

toString() : exibe os dados da venda 

 

Classe Loja A classe Loja gerencia os dados com os vetores:  

Cliente[] clientes (até 100)  

Produto[] produtos (até 100)  

Venda[] vendas (até 100)  

Métodos usados :  

adicionarCliente(Cliente) 

 

adicionarProduto(Produto)  

realizarVenda(Cliente, Produto[], int)  

listarClientes(), listarProdutos(), listarVendas() 

 

Classe Principal (Main)  

Exibe um menu principal via JOptionPane com as opções de cadastro, listagem e venda.  

Utiliza controle de fluxo com switch-case. 
