void main()
{
  var idade = 22;
  // double altura = 780e7;
  double altura = 1.80;
  bool compara = (altura == idade);
  const String nome = "Victor";
  final apelido = "Çan";
  print(idade);
  print(altura);
  print(compara);
  print(nome + apelido);
  print('Eu sou $apelido mas meu nome e $nome');

  List<String> listanomes = ['Ricaarth','Nathalia','Alex'];
  List<dynamic> victor = [nome, altura, idade, compara];
  print(victor);
  print(listanomes[2]);
  print(listanomes[0]);


  print(listanomes.reversed);
}