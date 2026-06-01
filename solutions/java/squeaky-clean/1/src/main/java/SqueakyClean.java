import java.util.Arrays;

class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        if(identifier.contains(" ")){
            identifier = identifier.replaceAll(" ", "_");
        }
        if (identifier.contains("-")) {
            String[] dados = identifier.split("");
            StringBuilder builder = new StringBuilder();
            for (int i=0; i < dados.length; i++){
                if(dados[i].equals("-")){
                    dados[i+1] = dados[i+1].toUpperCase();
                }
                builder.append(dados[i]);
            }
            identifier = builder.toString().replaceAll("-","");
        }
        //4, 3, 0, 1 and 7
        identifier = identifier
                .replaceAll("3", "e")
                .replaceAll("4", "a")
                .replaceAll("0", "o")
                .replaceAll("1", "l")
                .replaceAll("7", "t");
        identifier = identifier.replaceAll("[^a-zA-Z_]","");
        return identifier;
    }
}
