import "dart:math";
class Darts {
  num score(num posX, num posY){
    num radius = 10;
    num centerX = 0.0;
    num centerY = 0.0;
    num position = sqrt(pow((centerX - posX),2) + pow((centerY - posY),2));
    
    if(position <= radius){
      if(position <= 1){
        return 10;
      }else if(position <= 5){
        return 5;
      }else {
        return 1;
      }
    }
    return 0;
  }
}
