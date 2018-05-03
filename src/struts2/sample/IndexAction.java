package struts2.sample;

public class IndexAction {

	private String msg;
	
	public String getMsg() {
		
		return msg;
	}
	
	public void setMsg(String msg) {
		
		this.msg = msg;
	}
	
	
	public String execute() throws Exception {
		
		setMsg("Hello World!!");
		
		return "success";
	}
}