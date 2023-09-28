import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Lab {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        //upto 4 because after 3 postition , including 4 , 5 only hourglass can be made, draw a matrix with x ,y values you will understand
        int greatest=-100;
        int hourg=0;

        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                hourg+=arr.get(x).get(y)+arr.get(x).get(y+1)+arr.get(x).get(y+2);
                hourg+=arr.get(x+1).get(y+1);
                hourg+=arr.get(x+2).get(y)+arr.get(x+2).get(y+1)+arr.get(x+2).get(y+2);

                if(hourg>greatest){
                    greatest=hourg;
                }

                hourg=0;
            }



        }
        System.out.println(greatest);
        bufferedReader.close();
    }
}