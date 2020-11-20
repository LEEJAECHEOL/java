package sms;

public class Response {
	String group_id;
	String error_list;
	String scucces_count;
	String error_count;
	
	
	@Override
	public String toString() {
		return "Response [group_id=" + group_id + ", error_list=" + error_list + ", scucces_count=" + scucces_count
				+ ", error_count=" + error_count + "]";
	}


	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GH36wg4kTyhWSU\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		data = data.substring(data.indexOf("{") + 1,  data.lastIndexOf("}") );
		String[] datas = data.split(",");
		String[] groupId = datas[0].split(":");
		datas[1] = datas[1].replace("{", "");
		datas[1] = datas[1].replace("}", "");
		String[] errorList = (datas[1].split(":"));
		String[] scuccesCount = datas[2].split(":");
		String[] errorCount = datas[3].split(":");
		
		Response res = new Response();
		res.group_id = groupId[1];
		res.error_list = errorList[2];
		res.scucces_count = scuccesCount[1];
		res.error_count = errorCount[1];
		
		System.out.println(res);
		
		
	}
	
	
	
}
