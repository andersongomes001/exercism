import 'dart:math';

class DifferenceOfSquares {
  num squareOfSum(int value){
    if(value == null){
      return 0;
    }
    num resultInteract = 0;
    for (int i = 0; i <= value; i++) {
      resultInteract += i;
    }
    return pow(resultInteract, 2);
  }
  num sumOfSquares(int value){
    if(value == null){
      return 0;
    }
    num resultInteract = 0;
    for (int i = 0; i <= value; i++) {
      resultInteract += pow(i, 2);
    }
    return resultInteract;
  }
  num differenceOfSquares(int value){
    if(value == null){
      return 0;
    }
    return (squareOfSum(value) - sumOfSquares(value));
  }
}
