import 'dart:io';

void main()
{
  print("Started Main");
  functionOne();
  print("Finishied Main");

}

functionOne()
{
  print("Started F01");
  try{
    functionTwo();
  } on FormatException catch (e)
  {
    print("Foi capturada dentro da functionOne");
    print(e.message);
    print(e.source);
    print(e.toString());
  }on IOException catch(e)
  {
    print("Uma IOException foi encontrado");
    e.toString();
  }on Exception catch(e)
  {
    print(e.toString());
  }
  print("Finishied F02");
}

void functionTwo() {
  print("Started F02");
  for(int i =1; i<=5; i++)
    {
      print(i);
      double amount = double.parse("Not a number");

    }
  print("Finishied F02");

}