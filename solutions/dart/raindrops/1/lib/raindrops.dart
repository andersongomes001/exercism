class Raindrops {
  String convert(num value){
    String response = "";
    if(value % 3 == 0){
      response += "Pling";
    }
    if(value % 5 == 0){
      response += "Plang";
    }
    if(value % 7 == 0){
      response += "Plong";
    }
    return (response.length == 0)? value.toString() : response;
  }
}