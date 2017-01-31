package jp.ac.uryukyu.ie.e165750;
import java.awt.event.KeyEvent;



/**
 * Created by e165750 on 2017/01/28.
 */
public class Destroy {
    int x, y;//スイカの位置をxy座標で表す
    int f, p;//プレイヤーの初期値を表す
    //suikaserchクラスでもこれらの変数は使用したいのでフィールド変数とした

    public void suikaposition(Destroy e) {//スイカとプレイヤーの初期値を保存するメソッド

        String sand[][];//sandという名前の配列を用意

        sand = new String[10][10];//この配列に格納する値をString型に設定、また配列のサイズをを10*10に設定した
        x = (int) (Math.random() * 9);
        y = (int) (Math.random() * 9);

        sand[x][y] = "suika";//適当な場所にスイカを置く
        //System.out.println(sand[x][y]);
        //System.out.println(x);
        //System.out.println(y);

        e.syokiti();

        if (f == x && p == y) {//初期値がスイカの場所と被らないようにするためのif文
            e.syokiti();
        }
        sand[f][p] = "syokiti";//初期値を適当なところに配置
        //System.out.println(sand[f][p]);
        //System.out.println(f);
        //System.out.println(p);
        }

    public void syokiti() {//プレイヤーの初期値を決めるメソッド
        f = (int) (Math.random() * 9);
        p = (int) (Math.random() * 9);
    }



        public int getHint() {//スイカと初期値の距離によってヒントを与えるメソッド
            int length = f - x;//・・・(1)
            int tatesa = Math.abs(length);//(1)とこのコードでスイカと初期値の縦の距離を測る
            int width = p - y;//・・・(2)
            int yokosa = Math.abs(width);//(2)とこのコードでスイカと初期値の横の距離を測る
            if (x > f) {
                if (tatesa < 2) {
                    System.out.println("もう少し上!!");
                } else if (tatesa < 5) {
                    System.out.println("まぁまぁ上!!");
                } else if (tatesa >= 5) {
                    System.out.println("ずっと上!!");
                }
            } else {
                if (tatesa < 2) {
                    System.out.println("もう少し下!!");
                } else if (tatesa < 5) {
                    System.out.println("まぁまぁ下!!");
                } else if (tatesa >= 5) {
                    System.out.println("ずっと下!!");
                }

            }
            if (y > p) {
                if (yokosa < 2) {
                    System.out.println("もう少し左!!");
                } else if (yokosa < 5) {
                    System.out.println("まぁまぁ左!!");
                } else if (yokosa >= 5) {
                    System.out.println("ずっと左!!");
                }
            } else {
                if (yokosa < 2) {
                    System.out.println("もう少し右!!");
                } else if (yokosa < 5) {
                    System.out.println("まぁまぁ右!!");
                } else if (yokosa >= 5) {
                    System.out.println("ずっと右!!");
                }
            }

            return 0;
        }


    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_UP) {// 矢印↑キーが押された時の処理
            f += 1;
            //System.out.println(x);
            if (f == 9) ;
            System.out.println("これ以上進めないよ!");
        }
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {// 矢印↓キーが押された時の処理
            f -= 1;
            //System.out.println(x);
            if (f == 0) ;
            System.out.println("これ以上進めないよ!");
        }
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {// 矢印→キーが押された時の処理
            p += 1;
            //System.out.println(x);
            if (p == 9) ;
            System.out.println("これ以上進めないよ!");
        }
        else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {// 矢印←キーが押された時の処理
            p -= 1;
            //System.out.println(x);
            if (p == 0) ;
            System.out.println("これ以上進めないよ!");
        }


    }

}

