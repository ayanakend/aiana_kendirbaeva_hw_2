public class Main {
    public static void main(String[] args) {
        String canWeGoForAWalk = canWeGoForAWalk(8, 18);
        String canWeGoForAWalk1 = canWeGoForAWalk(24, 26);
        String canWeGoForAWalk2 = canWeGoForAWalk(50, 17);
        String canWeGoForAWalk3 = canWeGoForAWalk(38, 28);
        String canWeGoForAWalk4 = canWeGoForAWalk(3, -18);
        String canWeGoForAWalk5 = canWeGoForAWalk(generateRandomAge(), 30);
    }

    public static String canWeGoForAWalk(int age , int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "Можно идти гулять";
    }

    public static int generateRandomAge(){
        int a = (int) ( Math.random() * 50 );
        System.out.println("Возраст человека: " + a);
        return a;
    }

}