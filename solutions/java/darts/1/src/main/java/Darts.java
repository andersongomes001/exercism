class Darts {
    int score(double xOfDart, double yOfDart) {
        int radius = 10;
        double xCenter = 0.0;
        double yCenter = 0.0;
        //"(x – a)² + (y – b)² = r²"
        double distancia =  Math.sqrt(Math.pow((xOfDart - xCenter),2) + Math.pow((yOfDart - yCenter), 2));
        if(distancia <= radius){
            if(distancia <= 1){
                return 10;
            }else if (distancia <= 5){
                return 5;
            }else {
                return 1;
            }
        }
        return 0;
    }
}
