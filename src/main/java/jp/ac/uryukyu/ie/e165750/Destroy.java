package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2017/01/28.
 */
public class Destroy {
    public void suikaposition(){
        String sand[][];//sandという名前の配列を用意
        int i,j;
        sand = new String[10][10];//この配列に格納する値をString型に設定、また配列のサイズをを10*10に設定した
        i = (int)(Math.random()*9);
        j = (int)(Math.random()*9);

        sand[i][j] = "suika";//適当な場所にスイカを置く
        System.out.println(sand[i][j]);
        System.out.println(i);
        System.out.println(j);
    }
}
