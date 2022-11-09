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
  } catch(exception, stackTrace)
  {
    print(exception);
    print(stackTrace);
    rethrow;
  }
  finally
      {
        print("Chegou no finally");
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