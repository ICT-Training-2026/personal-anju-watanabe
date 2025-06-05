package driver;

//
//実行クラス
//@author M.Takahashi
//
public class driver {
//
	//メインメソット
	//@param args　未使用
	//
	public static void maun(String[]args) {
		//店舗名の表示
		System.out.println();
		Product.displayStoreName();
		
		//インスタンス化（2商品）
		Product keyboard=new Product("キーボード",4500);
		Product mouse=new Product("マウス",2000);
		
		//値下げ・値上げ
		keyboard.down();
		mouse.up(500);
		
		//商品情報の表示
		System.out.println();
		keyboard.display();
		mouse.display();
	}
}
