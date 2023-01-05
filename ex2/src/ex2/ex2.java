package ex2;
import java.util.Scanner;
import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//建立掃描器
        sop("請輸入幾顆骰子\n");//輸出請輸入幾顆骰子，換行
        dice(sc.nextInt());//將掃描器的值傳入method dice中
        //sop("請輸入要幾張牌\n");//輸出請輸入要幾張牌，換行
        //poker(sc.nextInt());//將掃描器的值傳入method poker中
        sc.close();//關閉掃描器
        //majong();
    }
    static void sop(String s){//method sop 傳入值(字串s)
        System.out.print(s);//輸出傳入的 字串s
    }
    //骰子遊戲
    static void dice(int times){//method dice 傳入值(整數times)
        Random ra = new Random();//設ra為新隨機
        int total = 0 ;//設total為0
        sop("you");//輸出you
        for (int i  = 0 ; i<times;i++){//for迴圈，從0~times-1，每次+1
            int playerDicePoint = ra.nextInt(6)+1;//設整數playerDicePoint為ra整數0~5+1
            sop(playerDicePoint+" ");//輸出playerDicePoint+" "
            total+=playerDicePoint;//total為點數加總
        }
        sop("your point is "+total+"\nboss");//輸出"your point is "+total+，換行"\nboss"
        int total1 =0;//設total1為0
        for (int i  = 0 ; i<times;i++){//for迴圈，從0~times-1，每次+1
            int bossDicePoint = ra.nextInt(6)+1;//設整數bossDicePoint為ra整數0~5+1
            sop(bossDicePoint+" ");//輸出bossDicePoint+" "
            total1+=bossDicePoint;//total1為點數加總
        }
        sop("boss point is "+total1+"\n");//輸出"boss point is "+total1+，換行"\n"
        if(total>total1){//如果total>total1
            sop("you win\n");//輸出"you win，換行\n"
        }else if(total<total1){//否則如果total<total1
            sop("you lose\n");//輸出"you lose，換行\n"
        }else{//其他
            sop("tie\n");//輸出"tie，換行\n"
        }
    } 
}