public class sec {
    public static void main(String[] args) {
        ageAndTemperature(28, 34);
        ageAndTemperature(23, 24);
    }

    public static void ageAndTemperature(int age , int temperature) {
        // возвращаемый метод с входящими параметрами
        if(age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            System.out.println("Можно идти гулять");
        }
    }

}
