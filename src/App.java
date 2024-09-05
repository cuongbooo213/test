import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Integer> listSo = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] c = {1, 2, 3, 4, 5};
        for(int i = 0; i < c.length; i++){
            listSo.add(i, c[i]);
        }
        System.out.println(listSo);
        System.out.print("nhap mot so vao: ");
        int n = sc.nextInt();
        System.out.print("nhap vi tri muon chen: ");
        int k = sc.nextInt();
        int flag =0;
        ArrayList<Integer> newListSo = new ArrayList<>();
        for(int i = 0; i < listSo.size()+1; i++){
            if (k==i) {
                newListSo.add(i, n);
                flag = 1;
            }else if(flag==1){
                newListSo.add(i, listSo.get(i-1));

            }else{
                newListSo.add(i, listSo.get(i));
            }
        }
        System.out.println(newListSo);

        
    }



}
