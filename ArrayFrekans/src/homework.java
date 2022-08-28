import java.util.Arrays;

public class homework {


    public static void main(String[] args) {
        int[] list = {10,20,20,10,10,20,5,20};

        int counter = 0;
        int temp = 0;
        Arrays.sort(list);

        for (int i = 0; i< list.length;i++){
            if (list[i] != temp){
                counter = 0;

                for (int j = 0; j< list.length;j++){
                    if (list[i]== list[j]){
                        counter += 1;
                        temp = list[i];
                    }
                }
                System.out.println("Dizide "+ list[i] + " elemanindan " + counter + "kadar var.");
            }


        }
    }
}
