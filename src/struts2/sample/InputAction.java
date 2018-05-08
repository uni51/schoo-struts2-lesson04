package struts2.sample;

import org.apache.struts2.convention.annotation.Result;

/**
 * Java入門 Struts2入出力サンプル Action画面
 */
// 初期設定以外の画面に移動する場合はResultアノテーションでキーとロケーションを指定
@Result(name="output", location="output.jsp")
public class InputAction {

	// input.jspで入力される値を格納するための変数（初期値はなし）
	private String text;
	
	/**
	 * テキストボックスの値を格納します.
	 * @param text テキストボックスで入力された値
	 */
	public void setText(String text) {
		
		// 値を設定
		this.text = text;
		// わかりやすいようにコンソールにメッセージを出力
		System.out.println("setTextが呼び出されました！現在の値は「" + this.text + "」です.");
	}
	
	/**
	 * テキストボックスに設定された値を返します.
	 * @return テキストボックスに入力された値
	 */
	public String getText() {
		
		// わかりやすいようにコンソールに出力
		System.out.println("現在の値「" + text + "」を返却します.");
		// 呼び出し元（今回はoutput.jsp）に値を返却
		return this.text;
	}
	
	/**
	 * Actionクラスのメイン処理です.
	 * @return 次画面のキー
	 * @throws Exception
	 */
	public String execute() throws Exception {
		
		// 戻り値
		String ret;
		
		// 今回はテキストボックスの値に基いて画面の移動先を変える
		// 未入力であれば入力画面、入力されていれば出力画面に設定する
		if(text == null) {
			ret = "success";
		} else {
			ret = "output";
		}
		
		return ret;
	}
}