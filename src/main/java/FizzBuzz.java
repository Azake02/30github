import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            } else if(i%3==0){
                result.add("Fizz");
            } else if(i%5==0){
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));  // Преобразуем число в строку
            }
        }
        return result;
    }
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(5));
    }
}
