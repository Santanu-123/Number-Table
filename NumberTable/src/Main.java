public class Main {
    public static String numberTable(int number){
        StringBuilder table = new StringBuilder();
        for(int i = 0; i <= 10; i++){
            table.append(number).append(" x ").append(i).append(" = ").append(number*i).append("\n");
        }
        return table.toString();
    }
    public static void main(String[] args) {
        System.out.println(numberTable(11));
    }
}