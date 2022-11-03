void main()
{
  int idade = 22;
  double altura = 780e7;
  bool compara = (altura == idade);
  String nome = "Victor";
  String apelido = "Çan";
  print(idade);
  print(altura);
  print(compara);
  print(nome + apelido);
  print('Eu sou $apelido mas meu nome e $nome');

  List<String> listanomes = ['Ricaarth','Nathalia','Alex'];
  List<dynamic> victor = ['Victor', 1.87, 22, compara];
  print(victor);
  print(listanomes[2]);
  print(listanomes[0]);

  String frase = ''
  print(listanomes.reversed);
}