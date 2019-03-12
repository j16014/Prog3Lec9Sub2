package lec0902;

import java.applet.Applet;
import java.awt.Graphics;

import lec0902util.MyStudent;

public class Kadai2 extends Applet {
	@Override
	// paintメソッド
	public void paint(Graphics g){
		// MyStudentで連結リストの先頭を示す変数rootを定義
		MyStudent root;
		// MyStudentクラスのコンストラクタを宣言した変数rootに代入
		root=new MyStudent("吉田",1,28);
		// MyStudentクラスのコンストラクタを宣言した変数pointer2に代入
		MyStudent pointer2=new MyStudent("塩崎",33);
		// 1つのオブジェクトにsetNextメソッドを呼出してポインタを設定する
		root.setNext(pointer2);
		// MyStudentクラスのコンストラクタを宣言した変数pointer3に代入
		MyStudent pointer3=new MyStudent("米山",3,35);
		// 1つのオブジェクトにsetNextメソッドを呼出してポインタを設定する
		pointer2.setNext(pointer3);
		// MyStudentクラスのコンストラクタを宣言した変数pointer4に代入
		MyStudent pointer4=new MyStudent("小沢",40);
		// 1つのオブジェクトにsetNextメソッドを呼出してポインタを設定する
		pointer3.setNext(pointer4);
		// MyStudentクラスのコンストラクタを宣言した変数pointer5に代入
		MyStudent pointer5=new MyStudent("内藤",5,25);
		// 1つのオブジェクトにsetNextメソッドを呼出してポインタを設定する
		pointer4.setNext(pointer5);

		// MyStudentオブジェクトoldest,workを生成する
		MyStudent oldest,work;
		// oldest,workに先頭のポインタを代入する
		oldest=root;
		work=root;
		// 最高齢を探索する
		while(work.getNext()!=null){
			work=work.getNext();
			if(oldest.getAge()<work.getAge()){
				oldest=work;
			}

		}

		// 最高齢の学生の氏名、年齢を描画
		g.drawString("最高齢の学生　氏名:"+oldest.getName()+"　年齢:"+oldest.getAge(), 30, 30);
	}
}
