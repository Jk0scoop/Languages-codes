public class Loops {
    public static void main(String[] args) {
        int i = 1;
        int num = 310;

        while(i<=num)
        {
            if(num%i==0)
            {
                System.out.print(i+",");
            }
            i++;
        }

        for(int k=0;k<10;k++){

            if(k==5){
                continue;
            }
            System.out.println(k);
        }

        i=1;
        do{
            System.out.println(i);
            i++;
            if(i==8){
                break;
            }

        }
        while (i<20);
    }
}
