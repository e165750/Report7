package jp.ac.uryukyu.ie.e165750;
import java.io.*;
/**
 * Created by e165750 on 2017/01/28.
 */
public class Destroy {

    int x, y;//スイカの位置をxy座標で表す
    int f, p;//プレイヤーの初期値を表す

    public Destroy() throws IOException {
    }

    public void suikaposition(Destroy e) {//スイカとプレイヤーの初期値を保存するメソッド

        String sand[][];//sandという名前の配列を用意

        sand = new String[10][10];//この配列に格納する値をString型に設定、また配列のサイズを10*10に設定した

        sand[x][y] = "suika";//適当な場所にスイカを置く

        sand[f][p] = "syokiti";//初期値を適当なところに配置

    }

    public void syokiti() {//プレイヤーの初期値を決めるメソッド
        f = (int) (Math.random() * 9);
        p = (int) (Math.random() * 9);
    }
    int length;
    int tatesa;
    int width;
    int yokosa;

    public int getHint() {//スイカと初期値の距離によってヒントを与えるメソッド
        if (x > f) {
            if (yokosa < 2) {
                System.out.println("もう少し上!!");
            } else if (yokosa < 5) {
                System.out.println("まぁまぁ上!!");
            } else if (yokosa >= 5) {
                System.out.println("ずっと上!!");
            }
        } else {
            if (yokosa < 2) {
                System.out.println("もう少し下!!");
            } else if (yokosa < 5) {
                System.out.println("まぁまぁ下!!");
            } else if (yokosa >= 5) {
                System.out.println("ずっと下!!");
            }

        }
        if (y > p) {
            if (tatesa < 2) {
                System.out.println("もう少し左!!");
            } else if (tatesa < 5) {
                System.out.println("まぁまぁ左!!");
            } else if (tatesa >= 5) {
                System.out.println("ずっと左!!");
            }
        } else {
            if (tatesa < 2) {
                System.out.println("もう少し右!!");
            } else if (tatesa < 5) {
                System.out.println("まぁまぁ右!!");
            } else if (tatesa >= 5) {
                System.out.println("ずっと右!!");
            }
        }

        return 0;

    }

         InputStreamReader is = new InputStreamReader(System.in);
    int charCode = is.read();

     /*
        キーコード一覧
        ¥キー；165
        enterキー；10
        a；97
        s；115;
        z；122
        x；120
         */

    public void serchsuika() throws IOException {
        while (charCode != 165) {//¥が押されるまでこの処理を続ける
            if (charCode == 97&&f<9) {// a(右)が押された時の処理
                f += 1;
                if (f == 9) {
                    System.out.println("これ以上進めないよ!");
                }

            }
            else if (charCode == 115&&f>0) {// s(左)キーが押された時の処理
                f -= 1;
                if (f == 0) {
                    System.out.println("これ以上進めないよ!");
                }

            }
            else if (charCode == 120&&p<9) {// x(上)キーが押された時の処理
                p += 1;
                if (p == 9) {
                    System.out.println("これ以上進めないよ!");
                }
                if (charCode == 10) {
                    continue;
                }
            }
            else if (charCode == 122&&p>0) {// z(下)キーが押された時の処理
                p -= 1;
                if (p == 0) {
                    System.out.println("これ以上進めないよ!");
                }
            }
            else if(charCode == 165) {
                break;
            }
            else if (charCode == 10){
                System.out.println("ザッ");
            }
            else {
                System.out.println("ミスタイプだよ");
            }

            charCode = is.read();
        }

    }


    public void ¥presssed(){
        if (tatesa + yokosa < 2) {
            System.out.println("惜しい!!");
        } else if (tatesa + yokosa < 5) {
            System.out.println("もう少し!!");
        } else if(tatesa + yokosa < 10){
            System.out.println("まだまだ遠い..");
        } else if (tatesa + yokosa > 10) {
            System.out.println("全然遠い!!");
        }
    }


}

