
int score(String text){
  var textList  = text.split("");
  int response = 0;
  for (String element in textList) {
    element = element.toUpperCase();
    if(["A", "E", "I", "O", "U", "L", "N", "R", "S", "T"].contains(element)){
      response += 1;
    }

    if(["D", "G"].contains(element)){
      response += 2;
    }
    if(["B", "C", "M", "P"].contains(element)){
      response += 3;
    }
    if(["F", "H", "V", "W", "Y"].contains(element)){
      response += 4;
    }
    if(["K"].contains(element)){
      response += 5;
    }
    if(["J", "X"].contains(element)){
      response += 8;
    }
    if(["Q", "Z"].contains(element)){
      response += 10;
    }
  }
  return response;
}
