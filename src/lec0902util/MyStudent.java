package lec0902util;

public class MyStudent {
	// 氏名を記憶する変数を定義
	private String name;
	// 学籍番号を記憶する変数を定義
	private int schoolRegisterNumber;
	// 年齢を記憶する変数を定義
	private int age;
	// 次のデータのポインタを保持する変数を定義
	MyStudent next;

	// MyStudentオブジェクトに値を設定するメソッド
	public MyStudent(String name,int schoolRegisterNumber,int age){
		// それぞれ対応する変数を代入
		this.name=name;
		this.schoolRegisterNumber=schoolRegisterNumber;
		this.age=age;
		this.next=null;
	}

	// MyStudentオブジェクトに値を設定するメソッド
	public MyStudent(String name,int age){
		// それぞれ対応する変数を代入
		this.name=name;
		this.schoolRegisterNumber=0;
		this.age=age;
		this.next=null;
	}

	// 氏名を参照するメソッド
	public String getName(){
		return this.name;
	}

	// 学籍番号を参照するメソッド
	public int getSchoolRegisterNumber(){
		return this.schoolRegisterNumber;
	}

	// 年齢を参照するメソッド
	public int getAge(){
		return this.age;
	}

	// 次の要素のポインタを参照するメソッド
	public MyStudent getNext(){
		return this.next;
	}

	// 次の要素を参照するメソッド
	public void setNext(MyStudent x){
		this.next=x;
	}
}
