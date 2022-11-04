void main()
{
  int idade = 17;
  bool maiorDeIdade;
  int energia = 100;

  // for(int i = 0; i<5; i++)
  //   {
  //     idade += i;
  //     print(idade);
  //     if(idade >= 18)
  //     {
  //       maiorDeIdade = true;
  //       print("maior de idade: $maiorDeIdade");
  //     }
  //     else
  //     {
  //       maiorDeIdade = false;
  //       print("Menor de idade: $maiorDeIdade");
  //     }
  //   }

  do
  {
    print("Mais uma repeticao : $energia descendo");
    energia -= 10;
  }
  while(energia > 0);
}