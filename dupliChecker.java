import java.util.Scanner;

public class dulpliChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int count;

        System.out.print("How many numbers would you want to enter: ");
        count = scanner.nextInt();

        int[] nums = new int[count];

        for(int i = 0; i < count; i++){
            System.out.print("Enter number: ");
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i < nums.length; i++){

            boolean alreadyCounted = false;
            int frequency = 1;

            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    alreadyCounted = true;
                    break;
                }
            }

            if(!alreadyCounted){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        frequency++;
                    }
                }

                if(frequency > 1){
                    System.out.println(nums[i] +" is a duplicate since it appeared " + frequency + " times" );
                }
            }
        }

        scanner.close();

    }
    
}
