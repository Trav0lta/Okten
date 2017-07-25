import java.util.Scanner;

public class Mass {

    Gen gen = new Gen();
    private  int[]gmass = new int[4];
    private  int[]umass = new int[4];
    private boolean s;
    private int n;
    private int p;
    private int bul=0;
    private int cow=0;

    public void gm(){
        for (int i = 0; i < gmass.length ; i++) {
            n = gen.genNum();
            s = true;
            for (int j = 0; j <=i ; j++) {
                if(n == gmass[j]){
                    s = false;
                }
            }
            if(s){
                gmass[i] = n;
                //System.out.print(gmass[i] + " ");
            }else {
                i--;
            }
        }
        System.out.println();
    }


    public void um(){
        for (int i = 0; i < umass.length ; i++) {
            System.out.println("введіть число від 1 до 9");
            Scanner sc = new Scanner(System.in);
            umass[i] = sc.nextInt();
        }
        for (int j = 0; j < umass.length ; j++) {
            System.out.print(umass[j]);
        }
        System.out.println();
    }

    public void bulls(){
        for (int i = 0; i < gmass.length ; i++) {
                if(gmass[i]==umass[i]){
                    bul++;
                }

        }System.out.println(bul + " bulls");
    }

    public void cow(){
        for (int i = 0; i < gmass.length ; i++) {
            n = gmass[i];
            for (int j = 0; j < umass.length ; j++) {
                if(n == umass[j]){
                    cow++;
                }
            }
        }
        System.out.println(cow + " cows");
    }

    public void game(){
        gm();
        while (bul !=4){
            bul=0;
            cow=0;
            um();
            bulls();
            cow();
            p++;
        }
        System.out.println("you win from  " + p + " attempts");
    }
}
