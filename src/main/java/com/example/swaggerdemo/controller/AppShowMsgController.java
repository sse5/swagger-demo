package com.example.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.swaggerdemo.bean.MessageVO;
import com.example.swaggerdemo.bean.MsgTypeVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;



@RestController
@RequestMapping("/api/v1/app/msg")
@Api(value = "AppShowMsgController | 消息通知类")
public class AppShowMsgController {

	
	@RequestMapping(value = "/showMsg.do",method = RequestMethod.POST)
	@ApiOperation(value="通知", notes="通知")
	public Map<String, Object> newShowMsgByType(@RequestBody @ApiParam(name="通知类型",value="传入json格式",required=true)MsgTypeVo msgTypeVo) {
		Map<String, Object> map=new HashMap<>();
		String aaString="[{\"msg_id\":41583016,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-22 10:51:30\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":41568379,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-21 12:00:13\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41563976,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-21 11:51:04\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41552995,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-21 11:40:55\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41541148,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-18 16:20:12\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41524061,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-17 11:00:33\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41518138,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-17 10:51:21\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41517988,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-17 10:51:18\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":41496635,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-15 17:01:00\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":41395453,\"msg_title\":\"专业版付款通知\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"01\",\"msg_type_2_desc\":\"付款通知\",\"msg_time\":\"2019-08-22 10:32:01\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"2\",\"msg_content\":\"\\r\\n\\r\\n\\r\\n\\r\\n\r\n" + 
				"\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"上证所信息网络有限公司\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"付 款 通 知\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"688002 ：\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"您好！\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"贵公司订购了上证所信息网络有限公司的专业版产品服务,订单编号为：\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"2019082200006739\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"具体信息如下：\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"服务期限：自2019-08-21 至2020-08-23\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"数据开通日期：2019-08-21\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"服务费用：30,000元\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"请将上述款项于10个工作日内汇至上证所信息网络有限公司如下银行账户：\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"户 名：上证所信息网络有限公司\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"开户银行：招商银行上海分行金桥支行\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"账 号：096945-216580801810001\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"若有疑问，可致电咨询：\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"何老师 021-50671215\r\n" + 
				"\r\n" + 
				"\\r\\n\\r\\n\\r\\n\\r\\n\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"日期：2019-08-22\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":41395445,\"msg_title\":\"专业版订单审核通知\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"1\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"订单通知\",\"msg_time\":\"2019-08-22 10:32:00\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"贵司的专业版订单已审核通过，有效期截止至2020年08月23日。\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":41387261,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-08-12 17:11:10\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":41348449,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-08-02 18:40:47\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":40242141,\"msg_title\":\"不呢个为空-688002jiehsouba\",\"msg_abstruct\":\"消息摘要：消息摘要：消息摘要：消息摘要：消息摘要：!\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-22 13:47:25\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\tsFDDDDDDDDDDS\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\\t\\t\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\r\n" + 
				"\\r\\n\\t\r\n" + 
				"\\r\\n\r\n" + 
				"\r\n" + 
				"\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":40073013,\"msg_title\":\"业务测试:这是一个很长很长的标题，这是一个很长很长的标题1234567890\",\"msg_abstruct\":null,\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-22 10:24:25\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"这是一个很长很长的标题，这是一个很长很长的标题12345，这是一个很长很长的标题，这是一个很长很长的标题12345，这是一个很长很长的标题，这是一个很长很长的标题12345，这是一个很长很长的标题，这是一个很长很长的标题12345，这是一个很长很长的标题，这是一个很长很长的标题12345，\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":40028956,\"msg_title\":\"@sos!@#$%^&*()嘻嘻很喜欢\",\"msg_abstruct\":null,\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-19 14:21:19\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息平台消息@sos!@#$%^&*()嘻嘻很喜欢\r\n" + 
				"\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":40028926,\"msg_title\":\"盘中股价异动预警\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-19 14:02:36\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\" 今日14时02分贵公司股价涨跌幅偏离值达到+12.51%。可能会导致\\r\\n 2019年07月17日至2019年07月19日，连续3个交易日内收盘价格涨跌幅偏离值累计达到+44.05%（阈值为+30.00%/-30.00%）。\\r\\n 请关注股价。\r\n" + 
				"\\r\\n 点击查看异常波动公告指引\r\n" + 
				"\\r\\n 点击查看异常波动相关规则\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39906586,\"msg_title\":\"盘中股价异动预警\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 15:44:05\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\" 今日15时44分贵公司股价涨跌幅偏离值达到+11.27%。可能会导致\\r\\n 2019年07月16日至2019年07月18日，连续3个交易日内收盘价格涨跌幅偏离值累计达到+30.80%（阈值为+30.00%/-30.00%）。\\r\\n 请关注股价。\r\n" + 
				"\\r\\n 点击查看异常波动公告指引\r\n" + 
				"\\r\\n 点击查看异常波动相关规则\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39898046,\"msg_title\":\"业务02gao\",\"msg_abstruct\":\"天空很蓝，我需要上班\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-18 14:51:07\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘摘\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39898031,\"msg_title\":\"业务01\",\"msg_abstruct\":\"开心的一天\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-18 14:31:47\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"开心的一天开心的一天开心的一天开心的一天开心的一天\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39898022,\"msg_title\":\"测试业务消息通知\",\"msg_abstruct\":\"测试业务消息通知\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-18 14:29:36\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"测试\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39891712,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-07-18 14:02:03\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39891536,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-07-18 14:02:01\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39888085,\"msg_title\":\"业务提醒测试\",\"msg_abstruct\":\"业务提醒测试\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-18 13:55:09\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"测试测试\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39886275,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-07-18 13:52:27\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39875062,\"msg_title\":\"[盘中]振幅达到50.00% \",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 13:47:31\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"13时47分 股价振幅达到50%，请关注。\\r\\n\\r\\n\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39875050,\"msg_title\":\"[盘中.累计]跌幅偏离值达到25.40%\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 13:47:31\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"13时47分股价跌幅偏离值达到25.40%。可能会导致2019年07月18日至2019年07月18日，连续1个交易日内收盘价格跌幅偏离值累计达到25.40%（>=20%）。请关注专管员通知以确定是否要发布异常波动公告。\\r\\n\r\n" + 
				"\\r\\n当前公司股价：507.02(-2.20%)，A股指数：3553.98(-27.60%)\\r\\n\r\n" + 
				"\\r\\n点击查看异常波动公告指引\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39875038,\"msg_title\":\"[盘中.单日]跌幅偏离值达到25.40%\",\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 13:47:30\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"13时47分股价跌幅偏离值达到25.40%，请关注。\r\n" + 
				"\\r\\n当前公司股价：507.02(-2.20%)，A股指数：3553.98(-27.60%)\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"0\"},{\"msg_id\":39874174,\"msg_title\":\"test\",\"msg_abstruct\":\"test\",\"msg_format\":\"Text\",\"msg_type_1\":\"1\",\"msg_type_2\":\"03\",\"msg_type_2_desc\":\"平台通知\",\"msg_time\":\"2019-07-18 13:44:50\",\"msg_source\":\"1\",\"read_type\":\"0\",\"is_popup\":\"0\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"testetset\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39868255,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-07-18 13:40:55\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39851606,\"msg_title\":null,\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 10:16:26\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\" 今日10时16分贵公司股价涨跌幅偏离值达到+13.93%。可能会导致\\r\\n 2019年07月16日至2019年07月18日，连续3个交易日内收盘价格涨跌幅偏离值累计达到+33.46%（阈值为+30.00%/-30.00%）。\\r\\n 请关注股价。\\r\\n 点击查看异常波动公告指引\\r\\n 点击查看异常波动相关规则\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"},{\"msg_id\":39851586,\"msg_title\":null,\"msg_abstruct\":null,\"msg_format\":\"html\",\"msg_type_1\":\"4\",\"msg_type_2\":\"4\",\"msg_type_2_desc\":\"异常波动提醒\",\"msg_time\":\"2019-07-18 09:54:07\",\"msg_source\":\"0\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\" 今日09时54分贵公司股价涨跌幅偏离值达到+13%。可能会导致\\r\\n 2019年07月16日至2019年07月18日，连续3个交易日内收盘价格涨跌幅偏离值累计达到0.3262%（阈值为+30%/--30%）。\\r\\n 请关注股价。\\r\\n 点击查看异常波动公告指引\\r\\n 点击查看异常波动相关规则\\r\\n\",\"msg_other_json\":\"json\",\"rcv_type\":\"0\",\"is_read\":\"1\"}]";
		//json转换为list
    	List<MessageVO> list = new ArrayList<MessageVO>();  
    	list = JSONObject.parseArray(aaString, MessageVO.class);
				map.put("result", list);
		return map;	
	}
	@RequestMapping(value = "/selectMsgTypeAll.do",method = RequestMethod.POST)
	@ApiOperation(value="查询通知类型", notes="查询通知类型")
	public Map<String, Object> selectMsgTypeAll(){
		String aaString="[{\"id\":2,\"msg_type\":\"2\",\"msg_type_desc\":\"舆情提醒\",\"parent_node_id\":null,\"msg_sequence\":\"1\",\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":3,\"msg_type\":\"3\",\"msg_type_desc\":\"业务协同提醒\",\"parent_node_id\":null,\"msg_sequence\":\"2\",\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":5,\"msg_type\":\"5\",\"msg_type_desc\":\"投资者关系提醒\",\"parent_node_id\":null,\"msg_sequence\":\"3\",\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":4,\"msg_type\":\"4\",\"msg_type_desc\":\"指标提醒\",\"parent_node_id\":null,\"msg_sequence\":\"4\",\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":1,\"msg_type\":\"1\",\"msg_type_desc\":\"系统提醒\",\"parent_node_id\":null,\"msg_sequence\":\"5\",\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":13,\"msg_type\":\"6\",\"msg_type_desc\":\"网络投票申请通知\",\"parent_node_id\":\"3\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":12,\"msg_type\":\"03\",\"msg_type_desc\":\"企业培训\",\"parent_node_id\":\"3\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":11,\"msg_type\":\"06\",\"msg_type_desc\":\"e互动提问\",\"parent_node_id\":\"5\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":10,\"msg_type\":\"05\",\"msg_type_desc\":\"待办事项提醒\",\"parent_node_id\":\"3\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":8,\"msg_type\":\"03\",\"msg_type_desc\":\"路演业务提醒\",\"parent_node_id\":\"5\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":14,\"msg_type\":\"07\",\"msg_type_desc\":\"你问我答\",\"parent_node_id\":\"3\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":6,\"msg_type\":\"01\",\"msg_type_desc\":\"付款通知\",\"parent_node_id\":\"3\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]},{\"id\":7,\"msg_type\":\"02\",\"msg_type_desc\":\"e访谈业务提醒\",\"parent_node_id\":\"5\",\"msg_sequence\":null,\"is_valid\":\"1\",\"msgTypeVos\":[],\"msgRcvConfVOs\":[]}]";
		
		Map<String, Object> map=new HashMap<String, Object>();
		//json转换为list
    	List<MsgTypeVo> list = new ArrayList<MsgTypeVo>();  
    	list = JSONObject.parseArray(aaString, MsgTypeVo.class);
				map.put("result", list);
		map.put("result", list);
		return map;
	}
	// 查询信息详情
	@RequestMapping(value = "/showMsgInfo.do",method = RequestMethod.POST)
	@ApiOperation(value="根据消息id获取消息详情", notes="根据消息id获取消息详情")
	public Object  ShowMsgInfo(String msg_id, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		String aaString="{\"msg_id\":41524061,\"msg_title\":\"公司董监高数量异常\",\"msg_abstruct\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_format\":\"html\",\"msg_type_1\":\"3\",\"msg_type_2\":\"02\",\"msg_type_2_desc\":\"董监高持股变动提醒\",\"msg_time\":\"2019-10-17 11:00:33\",\"msg_source\":\"2\",\"read_type\":\"1\",\"is_popup\":\"1\",\"is_publish\":\"1\",\"send_status\":\"0\",\"msg_content\":\"科创板二:688002在任董监高人数已低于合理数量，请尽快维护，保证该数据的准确完整。\",\"msg_other_json\":null,\"rcv_type\":\"0\",\"is_read\":null}";
		JSONObject jsStr = JSONObject.parseObject(aaString); //将字符串{“id”：1}
		MessageVO message = (MessageVO) JSONObject.toJavaObject(jsStr,MessageVO.class);
		result.put("message", message);
		return result;
	}
}
