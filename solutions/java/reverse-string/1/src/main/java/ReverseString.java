import java.util.Arrays;

class ReverseString {

    String reverse(String inputString) {
        StringBuilder response = new StringBuilder();
        response.append(inputString);
        response.reverse();
        return response.toString();
    }
  
}
