import 'Transporte.dart';

class Viagem
{
  static String codigoTrabalho = "fnaodfna";
  double dinheiro = 0;
  Transporte locmocao;
  Set<String> registrosVisitados = <String>{};
  Map<String, dynamic> registraPrecos = {};

  Viagem({required this.locmocao});

  int _totalLocaisVistados =0;

  void set alterarLocaisVisitados(int novaQnt)
  { if(novaQnt <10) {
    _totalLocaisVistados = novaQnt;
    }
    else
      {
        print("Nao eh possivel!");
      }
  }

  int get consultarTotalLocaisVisitados
  {
    return _totalLocaisVistados;
  }

  printCodigo()
  {
    print(codigoTrabalho);
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

  void registrarPrecosVisitas(String local, dynamic preco)
  {
    registraPrecos[local] = preco;
  }


  void visitar(String localvisita)
  {
    registrosVisitados.add(localvisita);
    _totalLocaisVistados += 1;
  }



}


