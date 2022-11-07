void main()
{
  Fruta fruta1 = new Fruta("maca", 10, "Verde", "Doce", 40);
  Fruta fruta2 = new Fruta("uva", 10, "roxa", "Doce", 40);
  fruta1.estaMadura(30);
  fruta2.estaMadura(40);
  Legumes mandioca1 = Legumes('Macaxeira', 1200, 'Marrom', true);
  Fruta banana1 = Fruta('Banana', 75, 'Amarela', 'Doce', 12);
  Nozes macadamia1 = Nozes('Macadâmia', 2, 'Branco Amarelado', 'Doce', 20, 35);
  Citricas limao1 = Citricas('Limão', 100, 'Verde', 'Azedo', 5, 9);
  macadamia1.printAlimento();
  banana1.printAlimento();
  mandioca1.printAlimento();
  limao1.printAlimento();
  mandioca1.cozinhar();
  //limao1.cozinhar(); // não funciona
  //mandioca1.fazerSuco(); // não funciona
  limao1.fazerSuco();
  limao1.fazerMassa();

}

bool funcEstaMadura(int diasColhidos)
{

  if(diasColhidos >= 30)
  {
    return  true;
  }
  else
  {
    return  false;
  }
}

mostarMadura(String nome, int dias, {String? cor})
{
  if(dias >= 30){
    print("A $nome está madura");
  }else{
    print("A $nome não está madura");
  }

  if(cor != null) {
    print("A $nome é $cor");
  }
}

funcQuantosDiasMadura(int dias){
  int diasParaMadura = 30;
  int quantosDiasFaltam = dias - diasParaMadura;
  return quantosDiasFaltam;
}

class Fruta extends Alimento implements Bolo
{

  String sabor;
  int diasColheita;
  bool? isMadura ;

  Fruta(String nome,double peso,String cor, this.sabor, this.diasColheita,
      {this.isMadura}) : super(nome, peso, cor);

  estaMadura(int diasParaMadura)
  {
    isMadura = diasColheita >= diasParaMadura;
    print("A sua $nome foi colhida a $diasColheita dias e precisa de $diasParaMadura para poder comer");
  }

  void fazerSuco()
  {
    print("Voce esta fazendo um otimo suco de $nome");
  }

  @override
  void assar() {
    print("Ligando e colocando no forno");
  }

  @override
  void fazerMassa() {
    print("Preparando a massa");
  }

  @override
  void separaIngredientes() {
    print("Pegando a fruta");
  }

}

class Alimento
{
  String nome;
  double peso;
  String cor;

  Alimento(this.nome, this.peso, this.cor);

  void printAlimento()
  {
    print("Este(a) $nome pesa $peso gramas e tem a cor $cor");
  }
}

class Legumes extends Alimento implements Bolo{

  bool isPrecisaCozinhar;

  Legumes(String nome,double peso,String cor, this.isPrecisaCozinhar) : super(nome, peso, cor);

  void cozinhar()
  {
    if(isPrecisaCozinhar)
      {
        print("Cozinhando o legume");
      }
    else
      {
        print("nao precisa cozinhar");
      }
  }

  @override
  void assar() {
    print("Ligando e colocando no forno");
  }

  @override
  void fazerMassa() {
    print("Preparando a massa");
  }

  @override
  void separaIngredientes() {
    print("Pegando o legume");
  }


}

class Citricas extends Fruta{

  double niveldeAzedo;

  Citricas(String nome,double peso,String cor, String sabor, int diaDesdeColheita, this.niveldeAzedo): super(nome, peso, cor, sabor, diaDesdeColheita);
  
  void existeRefri(bool existe)
  {
    if(existe)
      {
        print('Existe refrigerante de $nome');
      }
    else
      {
        print('Nao existe refri de $nome');
      }
  }
}

class Nozes extends Fruta{

  double porcentagemOleoNatural;

  Nozes(String nome,double peso,String cor, String sabor, int diaDesdeColheita, this.porcentagemOleoNatural) : super(nome, peso, cor, sabor, diaDesdeColheita);

  @override
  void fazerMassa()
  { print('preparando a $nome');
    super.fazerMassa();
  }
}

abstract class Bolo
{
  void separaIngredientes();

  void fazerMassa();

  void assar();
}