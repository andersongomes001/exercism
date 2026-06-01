class ArmstrongNumbers {
  bool isArmstrongNumber(String number){
    if(number == null){
      return false;
    }
    var lista = number.split("").map((e) => BigInt.parse(e));
    int length = lista.length;
    BigInt increment = BigInt.zero;
    for (BigInt element in lista)  {
      increment += element.pow(length);
    }
    return (increment == BigInt.parse(number));
  }
}