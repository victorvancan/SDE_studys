import 'dart:io';

void main()
{
  print("Qual a sua idade: ");
  String? input = stdin.readLineSync();
  if(input != null)
    {
      int idade = int.parse(input);
      print("Sua idade no ano que vem sera ${idade + 1}");
    }

}