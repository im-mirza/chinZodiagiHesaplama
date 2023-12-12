import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dogum Tarihinizi Girin: ");
        int dogumYili=sc.nextInt();

        if(dogumYili%12==0){
            System.out.println("Maymun Burcusunuz");
        }else if (dogumYili%12==1){
            System.out.println("Horoz Burcusunuz");
        }else if (dogumYili%12==2){
            System.out.println("Kopek Burcusunuz");
        }else if (dogumYili%12==3){
            System.out.println("Domuz Burcusunuz");
        }else if (dogumYili%12==4){
            System.out.println("Fare Burcusunuz");
        }else if (dogumYili%12==5){
            System.out.println("Okuz Burcusunuz");
        }else if (dogumYili%12==6){
            System.out.println("Kaplan Burcusunuz");
        }else if (dogumYili%12==7){
            System.out.println("Tavshan Burcusunuz");
        }else if (dogumYili%12==8){
            System.out.println("Ejderha Burcusunuz");
        }else if (dogumYili%12==9){
            System.out.println("Yilan Burcusunuz");
        }else if (dogumYili%12==10){
            System.out.println("At Burcusunuz");
        }else if (dogumYili%12==11){
            System.out.println("Koyun Burcusunuz");
        }


    }
}