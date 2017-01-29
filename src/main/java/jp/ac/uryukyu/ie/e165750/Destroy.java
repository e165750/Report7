package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2017/01/28.
 */
public class Destroy {
    int x,y;//スイカの位置をxy座標で表す
    int f,p;//初期値を
    //suikaserchクラスでもこの変数は使用したいのでフィールド変数とした
    public void suikaposition(Destroy e){

        String sand[][];//sandという名前の配列を用意

        sand = new String[10][10];//この配列に格納する値をString型に設定、また配列のサイズをを10*10に設定した
        x = (int)(Math.random()*9);
        y = (int)(Math.random()*9);

        sand[x][y] = "suika";//適当な場所にスイカを置く
        System.out.println(sand[x][y]);
        System.out.println(x);
        System.out.println(y);

        e.syokiti();

        if (f==x && p==y){
            e.syokiti();
        }
        sand[f][p] = "syokiti";
        System.out.println(sand[f][p]);
        System.out.println(f);
        System.out.println(p);

    }
    public void syokiti(){
        f = (int)(Math.random()*9);
        p = (int)(Math.random()*9);
    }
}
