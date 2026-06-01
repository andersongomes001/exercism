import 'dart:math';

class DifferenceOfSquares {
  num squareOfSum(int value){
    num resultInteract = 0;
    for (int i = 0; i <= value; i++) {
      resultInteract += i;
    }
    return pow(resultInteract, 2);
  }
  num sumOfSquares(int value){
    num resultInteract = 0;
    for (int i = 0; i <= value; i++) {
      resultInteract += pow(i, 2);
    }
    return resultInteract;
  }
  num differenceOfSquares(int value){
    return (squareOfSum(value) - sumOfSquares(value));
  }
}
