package jp.ac.uryukyu.ie.e165750;

import java.io.IOException;

/**
 * Created by e165750 on 2017/01/28.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("エンターを押してね");

        Destroy destroy = new Destroy();


        destroy.x = (int) (Math.random() * 9);
        destroy.y  =(int) (Math.random() * 9);
        destroy.f = (int) (Math.random() * 9);
        destroy.p  =(int) (Math.random() * 9);

        destroy.suikaposition(destroy);//これでスイカの位置とプレイヤーの初期値を配置

          if (destroy.f == destroy.x && destroy.p == destroy.y) {//初期値がスイカの場所と被らないようにするためのif文
            destroy.syokiti();
        }

        destroy.length = destroy.f - destroy.x;//・・・(1)
        destroy.tatesa = Math.abs(destroy.length);//(1)とこのコードでスイカと初期値の縦の距離を測る
        destroy.width = destroy.p - destroy.y;//・・・(2)
        destroy.yokosa = Math.abs(destroy.width);//(2)とこのコードでスイカと初期値の横の距離を測る

        System.out.println("スイカの位置は...");

        destroy.getHint();//スイカと初期値の距離によってヒントを与えるメソッド

        destroy.serchsuika();//スイカを探すメソッド

        destroy.¥presssed();//¥キーでスイカはここだ、と決めた時のアクションメソッド
    }
}

