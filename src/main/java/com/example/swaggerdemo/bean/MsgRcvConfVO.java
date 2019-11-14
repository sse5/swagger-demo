package com.example.swaggerdemo.bean;

import java.io.Serializable;

public class MsgRcvConfVO implements Serializable{

	/**
	 * <p>Description:[字段功能描述]</p>
	 */
	private static final long serialVersionUID = 1L;
	public String id;//'ID';

	public String rcv_id;//'消息接受者ID';

	public String company_code;//'公司代码';

	public String msg_type_1;//'接收的消息类型(1=业务通知，2=公司舆情，3=信息提醒)';

	public String msg_type_2;//'消息二级类型';

	public String msg_type_2_desc;//'消息二级类型描述';

	public String rcv_type;//'接收方式(0=平台，1=EMALI，2=手机短信，3=微信，4=手机APP)';

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRcv_id() {
		return rcv_id;
	}

	public void setRcv_id(String rcv_id) {
		this.rcv_id = rcv_id;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getMsg_type_1() {
		return msg_type_1;
	}

	public void setMsg_type_1(String msg_type_1) {
		this.msg_type_1 = msg_type_1;
	}

	public String getMsg_type_2() {
		return msg_type_2;
	}

	public void setMsg_type_2(String msg_type_2) {
		this.msg_type_2 = msg_type_2;
	}

	public String getMsg_type_2_desc() {
		return msg_type_2_desc;
	}

	public void setMsg_type_2_desc(String msg_type_2_desc) {
		this.msg_type_2_desc = msg_type_2_desc;
	}

	public String getRcv_type() {
		return rcv_type;
	}

	public void setRcv_type(String rcv_type) {
		this.rcv_type = rcv_type;
	}
}
