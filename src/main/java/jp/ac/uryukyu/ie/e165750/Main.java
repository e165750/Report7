package jp.ac.uryukyu.ie.e165750;

import java.io.IOException;

/**
 * Created by e165750 on 2017/01/28.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("スイカ割りをしよう!!\n");
        System.out.println(" ルール説明：\n\n 1.一度だけヒントが出されるのでそのヒントを元にx:上、z:下、a:右、s:左のキーを使って" +
                "スイカを探そう!\n\n 注)この時、キーを一回押すごとにエンターを押してね\n\n 2.そしてここだと思ったところで¥キーを押そう!");


        System.out.println(" \nエンターでスタート！");

        Destroy destroy = new Destroy();


        destroy.x = (int) (Math.random() * 9);
        destroy.y  =(int) (Math.random() * 9);
        destroy.f = (int) (Math.random() * 9);
        destroy.p  =(int) (Math.random() * 9);

        destroy.suikaposition(destroy);//これでスイカの位置とプレイヤーの初期値を配置

          if (destroy.f == destroy.x && destroy.p == destroy.y) {//初期値がスイカの場所と被らないようにするためのif文
            destroy.syokiti();
        }

        destroy.remainder();

        System.out.println("スイカの位置は...");

        destroy.getHint();//スイカと初期値の距離によってヒントを与えるメソッド

        destroy.serchsuika();//スイカを探すメソッド

        destroy.remainder();

        destroy.¥presssed();//¥キーでスイカはここだ、と決めた時のアクションメソッド
    }
}

