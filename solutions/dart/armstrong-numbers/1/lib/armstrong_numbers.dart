class ArmstrongNumbers {
  bool isArmstrongNumber(String number){
    var lista = number.split("").map((e) => int.parse(e));
    int length = lista.length;
    int increment = 0;
    for (var element in lista)  {
      increment += (element * length);
    }
    return (increment == int.parse(number));
  }
}
