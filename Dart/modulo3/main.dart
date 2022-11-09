import 'Transporte.dart';
import 'viagem.dart';

void main()
{
  // escolherMeioTransporte(Transporte.carro);
  // registrosVisitados = registrarDestinos("Rio de janeiro", registrosVisitados);
  // registrosVisitados = registrarDestinos("Sao Paulo", registrosVisitados);
  // registrosVisitados = registrarDestinos("Recife", registrosVisitados);
  // registrosVisitados = registrarDestinos("Rio de janeiro", registrosVisitados);
  // registraPrecos["Sao paulo"] = 1200;
  //registraPrecos["Rio de Janeiro"] = 1500;
  // registraPrecos.remove("Sao paulo");
  // print(registraPrecos["Sao paulo"]);

  Viagem viagemMaio = Viagem(locmocao: Transporte.carro);
print(viagemMaio.consultarTotalLocaisVisitados);
viagemMaio.visitar("Museu");
print(viagemMaio.consultarTotalLocaisVisitados);
viagemMaio.alterarLocaisVisitados = 10;
  print(viagemMaio.consultarTotalLocaisVisitados);
}




