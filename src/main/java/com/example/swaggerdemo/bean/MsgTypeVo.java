package com.example.swaggerdemo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description= "通知类型")
public class MsgTypeVo implements Serializable{

	private static final long serialVersionUID = 5427742054769600935L;
	@ApiModelProperty(value = "消息类型id",name="id")
	private Long id;
	@ApiModelProperty(value = "消息类型",name="msg_type")
	private String msg_type;
	@ApiModelProperty(value = "消息类型描述",name="msg_type_desc")
	private String msg_type_desc;
	@ApiModelProperty(value = "上级节点ID",name="parent_node_id")
	private String parent_node_id;
	@ApiModelProperty(value = "获取消息的顺序",name="msg_sequence")
	private String msg_sequence;
	@ApiModelProperty(value = "是否有效（1：有效；0：无效）",name="is_valid")
	private String is_valid;

	private List<MsgTypeVo> msgTypeVos = new ArrayList<MsgTypeVo>();
	private List<MsgRcvConfVO> msgRcvConfVOs = new ArrayList<MsgRcvConfVO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg_type() {
		return msg_type;
	}

	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}

	public String getMsg_type_desc() {
		return msg_type_desc;
	}

	public void setMsg_type_desc(String msg_type_desc) {
		this.msg_type_desc = msg_type_desc;
	}

	public String getParent_node_id() {
		return parent_node_id;
	}

	public void setParent_node_id(String parent_node_id) {
		this.parent_node_id = parent_node_id;
	}

	public String getMsg_sequence() {
		return msg_sequence;
	}

	public void setMsg_sequence(String msg_sequence) {
		this.msg_sequence = msg_sequence;
	}

	public String getIs_valid() {
		return is_valid;
	}

	public void setIs_valid(String is_valid) {
		this.is_valid = is_valid;
	}

	public List<MsgTypeVo> getMsgTypeVos() {
		return msgTypeVos;
	}

	public void setMsgTypeVos(List<MsgTypeVo> msgTypeVos) {
		this.msgTypeVos = msgTypeVos;
	}

	public List<MsgRcvConfVO> getMsgRcvConfVOs() {
		return msgRcvConfVOs;
	}

	public void setMsgRcvConfVOs(List<MsgRcvConfVO> msgRcvConfVOs) {
		this.msgRcvConfVOs = msgRcvConfVOs;
	}

}
