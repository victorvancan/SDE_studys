void main()
{
  escolherMeioTransporte(Transporte.carro);
  Set<String> registrosVisitados = <String>{};
  registrosVisitados = registrarDestinos("Rio de janeiro", registrosVisitados);
  registrosVisitados = registrarDestinos("Sao Paulo", registrosVisitados);
  registrosVisitados = registrarDestinos("Recife", registrosVisitados);
  registrosVisitados = registrarDestinos("Rio de janeiro", registrosVisitados);
  print(registrosVisitados);
}

Set<String> registrarDestinos(String destino, Set<String> banco)
{
  banco.add(destino);
  return banco;
}

void escolherMeioTransporte(Transporte locomocao)
{
  if(locomocao == Transporte.carro)
  {
    print("Vou de carro para a aventura");
  }
  else if(locomocao == Transporte.bike)
  {
    print("Vou de bike pra a aventura");
  }
  else
  {
    print("Vou para aventura");
  }


  switch(locomocao)
  {
    case Transporte.carro:
      print("Vou de carro para a aventura");
      break;
    case Transporte.bike:
      print("Vou de bike para a aventura");
      break;
    default:
      print("Estou indo para a ventura, isso q importa");

  }
}

enum Transporte
{
  carro, bike, andando, skate, aviao, patins
}