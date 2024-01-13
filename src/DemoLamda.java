


interface Task1{
    int getNum(int a ,int b);
}
public class DemoLamda {
    public static void main(String[] args){
        Task1 task1 =(a,b)->a+b;
        System.out.println(task1.getNum(30,40));
    }
}
