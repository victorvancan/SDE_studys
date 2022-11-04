void main()
{
  String nome = 'Laranja';
  double peso = 100.2;
  String cor = "Verde";
  String sabor = "Doce e critica";
  int diasColheita = 40;
  bool isMadura = funcEstaMadura(diasColheita);

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