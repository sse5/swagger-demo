package com.example.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/app/sentiment")
@Api(value = "AppUserDefinedSentimentController | 舆情")
public class AppUserDefinedSentimentController {



    /**
     * 查询舆情列表
     *
     * @param
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询舆情", notes="查询舆情")
    @RequestMapping(value = "/TopicList.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="size",value="多少条",paramType = "query",example="20"),
            @ApiImplicitParam(name="currentPage",value="第几页",paramType = "query",example="1"),
            @ApiImplicitParam(name="startTime",value="开始时间",paramType = "query",example="2019-10-15"),
            @ApiImplicitParam(name="endTime",value="结束时间",paramType = "query",example="2019-11-15"),
            @ApiImplicitParam(name="keywords",value="关键词",paramType = "query",example="hh"),
            @ApiImplicitParam(name="emotion",value="正负面",paramType = "query",example="0"),
            @ApiImplicitParam(name="orderName",value="排序字段",paramType = "query",example="publishTime"),
            @ApiImplicitParam(name="orderType",value="排序方式，默认是倒序",paramType = "query",example="desc"),
            @ApiImplicitParam(name="queryType",value="查询类型：1: 公司舆情，2：科创舆情，3：宏观舆情，4：同行业 5：自选公司 6：后台查询舆情",paramType = "query",example="5"),

    })
    public Object topicList(String size,String currentPage,String startTime,String endTime,String keywords,
                            Integer emotion,String orderName,String orderType,Integer queryType){
        Map<String,Object> result = new HashMap<String, Object>();
        Map<String,Object> map = new HashMap<String,Object>();
        String json = "{\n" +
                "  \"status\" : \"SUCCESS\",\n" +
                "  \"result\" : {\n" +
                "    \"currentPage\" : 0,\n" +
                "    \"size\" : 10,\n" +
                "    \"totalItems\" : 2,\n" +
                "    \"orderName\" : null,\n" +
                "    \"orderType\" : null,\n" +
                "    \"data\" : [ {\n" +
                "      \"itemId\" : \"5cac9f8c1eca420b677cee41\",\n" +
                "      \"title\" : \"又一A股旗下网贷平台爆雷：计提减值6.15亿待偿22亿怎么还？\",\n" +
                "      \"content\" : \"距离2017年网贷平台“至暗时刻”已有一年有余，但近期爆雷潮再起，特别是运行多年的老平台或是头部平台，开始出现兑付问题，“雷声”再起。\\r\\n\\r\\n4月8日，杭州市公安局拱墅区分局官方微博“平安拱墅”发布消息称，2019年4月7日，杭州鑫合汇互联网金融服务有限公司（以下简称“鑫合汇”）涉嫌非法吸收公众存款案立案侦查，依法对该平台实际控制人陈某某及相关涉案人员采取刑事强制措施。\\r\\n\\r\\n公司在官网上提到“作为上市公司（美都能源）旗下互联网金融平台”，鑫合汇平台运营时间已有5年，累计成交额超过两千亿元。在经历多次转型后，仍未避免爆雷的命运。目前，该平台待偿金额仍有22.9亿元，出借人数为4135人。\",\n" +
                "      \"summary\" : \"9日晚间，美都能源发布公告称，鉴于鑫合汇的现状，公司在2018年年报审计工作中，聘请审计、评估机构对其进行相应的减值测试，并在2018年度业绩预告中对持有的鑫合汇长期股权投资按照资产法进行评估并计提大额减值准备（约6.15亿元）。警方表示，为保护投资人合法利益，公安机关依法对鑫合汇涉嫌非法吸收公众存款案立案侦查，依法对该平台实际控制人陈某某及相关涉案人员采取刑事强制措施。而在平台停摆、实际控制人自首之下，后续鑫合汇兑付也将遥遥无期\",\n" +
                "      \"publishTime\" : \"2019-04-09 21:35:19\",\n" +
                "      \"dupCounts\" : \"1\",\n" +
                "      \"platform\" : \"微博\",\n" +
                "      \"emotion\" : \"1\",\n" +
                "      \"source\" : \"财联社\",\n" +
                "      \"hot\" : \"高\",\n" +
                "      \"autoTags\" : [ {\n" +
                "        \"code\" : \"SH_600175\",\n" +
                "        \"name\" : \"美都能源\",\n" +
                "        \"source\" : \"SH\",\n" +
                "        \"weight\" : 100.0,\n" +
                "        \"category\" : \"STOCK\"\n" +
                "      }, {\n" +
                "        \"code\" : \"SW_710000\",\n" +
                "        \"name\" : \"计算机\",\n" +
                "        \"source\" : \"SW\",\n" +
                "        \"weight\" : 99.64,\n" +
                "        \"category\" : \"INDUSTRY\"\n" +
                "      } ],\n" +
                "      \"showTags\" : [ {\n" +
                "        \"code\" : \"SH_600175\",\n" +
                "        \"name\" : \"美都能源\",\n" +
                "        \"source\" : \"SH\",\n" +
                "        \"weight\" : 100.0,\n" +
                "        \"category\" : \"STOCK\"\n" +
                "      }, {\n" +
                "        \"code\" : \"SW_710000\",\n" +
                "        \"name\" : \"计算机\",\n" +
                "        \"source\" : \"SW\",\n" +
                "        \"weight\" : 99.64,\n" +
                "        \"category\" : \"INDUSTRY\"\n" +
                "      }, {\n" +
                "        \"code\" : \"CLS_10101006\",\n" +
                "        \"name\" : \"互联网金融大事件\",\n" +
                "        \"source\" : \"CLS\",\n" +
                "        \"weight\" : 99.41,\n" +
                "        \"category\" : \"CONCEPT\"\n" +
                "      } ],\n" +
                "     \"eventTags\" : [ {\n" +
                "       \"code\" : \"EVT00186\",\n" +
                "       \"name\" : \"关联交易异常\"\n" +
                "     }, {\n" +
                "       \"code\" : \"EVT00198\",\n" +
                "       \"name\" : \"项目问题\"\n" +
                "     } ],\n" +
                "     \"recommend\": 1\n" +
                "    } ]\n" +
                "  }\n" +
                "}\n" +
                "\n";
        return json;
    }


    /**
     * 查询舆情详情
     *
     * @param
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询舆情详情", notes="查询舆情详情")
    @RequestMapping(value = "/topicDetail.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="参数说明： id：舆情列表标签响应中的result.data.id字段，itemId",paramType = "query",example="5cb80efae2b7f272b42ad08e"),
    })
    public Object detail(String id){
        Map<String,Object> result = new HashMap<String, Object>();
        Map<String,Object> map = new HashMap<String,Object>();
        String json ="{\n" +
                "  \"status\" : \"SUCCESS\",\n" +
                "  \"result\" : {\n" +
                "    \"itemId\" : \"5cb80efae2b7f272b42ad08e\"\n" +
                "    \"title\" : \"又一A股旗下网贷平台爆雷：计提减值6.15亿待偿22亿怎么还？\",\n" +
                "    \"content\" : \"距离2017年网贷平台“至暗时刻”已有一年有余，但近期爆雷潮再起，特别是运行多年的老平台或是头部平台，开始出现兑付问题，“雷声”再起。\\r\\n\\r\\n4月8日，杭州市公安局拱墅区分局官方微博“平安拱墅”发布消息称，2019年4月7日，杭州鑫合汇互联网金融服务有限公司（以下简称“鑫合汇”）涉嫌非法吸收公众存款案立案侦查，依法对该平台实际控制人陈某某及相关涉案人员采取刑事强制措施。\\r\\n\\r\\n公司在官网上提到“作为上市公司（美都能源）旗下互联网金融平台”，鑫合汇平台运营时间已有5年，累计成交额超过两千亿元。在经历多次转型后，仍未避免爆雷的命运。目前，该平台待偿金额仍有22.9亿元，出借人数为4135人。\",\n" +
                "    \"summary\" : \"9日晚间，美都能源发布公告称，鉴于鑫合汇的现状，公司在2018年年报审计工作中，聘请审计、评估机构对其进行相应的减值测试，并在2018年度业绩预告中对持有的鑫合汇长期股权投资按照资产法进行评估并计提大额减值准备（约6.15亿元）。警方表示，为保护投资人合法利益，公安机关依法对鑫合汇涉嫌非法吸收公众存款案立案侦查，依法对该平台实际控制人陈某某及相关涉案人员采取刑事强制措施。而在平台停摆、实际控制人自首之下，后续鑫合汇兑付也将遥遥无期\",\n" +
                "    \"publishTime\" : \"2019-04-09 21:35:19\",\n" +
                "    \"dupCounts\" : \"1\",\n" +
                "    \"platform\" : \"微博\",\n" +
                "    \"emotion\" : \"Neutral\",\n" +
                "    \"url\":\"http://203.156.205.101:10902/#/article/5cac9f8c1eca420b677cee41\",\n" +
                "    \"source\" : \"财联社\",\n" +
                "    \"hot\" : \"高\",\n" +
                "     \"autoTags\" : [ {\n" +
                "       \"code\" : \"SH_600175\",\n" +
                "       \"name\" : \"美都能源\",\n" +
                "       \"source\" : \"SH\",\n" +
                "       \"weight\" : 100.0,\n" +
                "       \"category\" : \"STOCK\"\n" +
                "     }, {\n" +
                "       \"code\" : \"SW_710000\",\n" +
                "       \"name\" : \"计算机\",\n" +
                "       \"source\" : \"SW\",\n" +
                "       \"weight\" : 99.64,\n" +
                "       \"category\" : \"INDUSTRY\"\n" +
                "     }, {\n" +
                "       \"code\" : \"CLS_10101006\",\n" +
                "       \"name\" : \"互联网金融大事件\",\n" +
                "       \"source\" : \"CLS\",\n" +
                "       \"weight\" : 99.41,\n" +
                "       \"category\" : \"CONCEPT\"\n" +
                "     }, {\n" +
                "       \"code\" : \"TJJ_330000\",\n" +
                "       \"name\" : \"浙江省\",\n" +
                "       \"source\" : \"TJJ\",\n" +
                "       \"weight\" : 74.51,\n" +
                "       \"category\" : \"REGION\"\n" +
                "     }, {\n" +
                "       \"code\" : \"TJJ_310000\",\n" +
                "       \"name\" : \"上海市\",\n" +
                "       \"source\" : \"TJJ\",\n" +
                "       \"weight\" : 99.41,\n" +
                "       \"category\" : \"REGION\"\n" +
                "     }, {\n" +
                "       \"code\" : \"CLS_10102002\",\n" +
                "       \"name\" : \"保险\",\n" +
                "       \"source\" : \"CLS\",\n" +
                "       \"weight\" : 87.85,\n" +
                "       \"category\" : \"INDUSTRY\"\n" +
                "    } ],\n" +
                "    \"showTags\" : [ {\n" +
                "      \"code\" : \"SH_600175\",\n" +
                "      \"name\" : \"美都能源\",\n" +
                "      \"source\" : \"SH\",\n" +
                "      \"weight\" : 100.0,\n" +
                "      \"category\" : \"STOCK\"\n" +
                "    }, {\n" +
                "      \"code\" : \"SW_710000\",\n" +
                "      \"name\" : \"计算机\",\n" +
                "      \"source\" : \"SW\",\n" +
                "      \"weight\" : 99.64,\n" +
                "      \"category\" : \"INDUSTRY\"\n" +
                "    }, {\n" +
                "      \"code\" : \"CLS_10101006\",\n" +
                "      \"name\" : \"互联网金融大事件\",\n" +
                "      \"source\" : \"CLS\",\n" +
                "      \"weight\" : 99.41,\n" +
                "      \"category\" : \"CONCEPT\"\n" +
                "    } ],\n" +
                "    \"eventTags\" : [ {\n" +
                "      \"code\" : \"EVT00186\",\n" +
                "      \"name\" : \"关联交易异常\"\n" +
                "    }, {\n" +
                "      \"code\" : \"EVT00198\",\n" +
                "      \"name\" : \"项目问题\"\n" +
                "    } ]\n" +
                "  }\n" +
                "}";
        return json;
    }



    /**
     * 查看转发
     *
     * @param
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查看转发", notes="查看转发")
    @RequestMapping(value = "/duplicate.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="参数说明： id：舆情列表标签响应中的result.data.id字段，itemId",paramType = "query",example="5cb80efae2b7f272b42ad08e"),
    })
    public Object duplicate(String id){
        Map<String,Object> result = new HashMap<String, Object>();
        Map<String,Object> map = new HashMap<String,Object>();
        String json = "{\n" +
                "  \"status\" : \"SUCCESS\",\n" +
                "  \"result\" : [ {\n" +
                "    \"itemId\" : \"5caceb581eca420b677cee5e\",\n" +
                "    \"title\" : \"稳字当头逾八成科创板受理企业钟爱“标准一”\",\n" +
                "    \"content\" : \"【稳字当头逾八成科创板受理企业钟爱“标准一”】财联社4月10日讯，截至9日，科创板受理企业已达57家。在五套上市标准中，82%的企业选择“标准一”，暂无公司选择“标准五”。业内人士指出，科创板普通企业五套上市标准层层递进，又各有侧重，市值成为硬指标。如果发行询价后达不到当初申报的市值标准，则发行失败。绝大多数企业选择风险较低的标准一是出于求稳心理。（中证报）\",\n" +
                "    \"summary\" : \"【稳字当头逾八成科创板受理企业钟爱“标准一”】财联社4月10日讯，截至9日，科创板受理企业已达57家。在五套上市标准中，82%的企业选择“标准一”，暂无公司选择“标准五”。\",\n" +
                "    \"source\" : \"财联社\",\n" +
                "    \"url\":\"http://203.156.205.101:10902/#/article/5cac9f8c1eca420b677cee41\",\n" +
                "    \"publishTime\" \"2019-04-18 13:45:28\",\n" +
                "    \"showTags\" : [ {\n" +
                "      \"code\" : \"CLS_20203004\",\n" +
                "      \"name\" : \"科创板最新动态\",\n" +
                "      \"source\" : \"CLS\",\n" +
                "      \"weight\" : 98.84,\n" +
                "      \"category\" : \"NEWS\"\n" +
                "    } ]\n" +
                "  } ]\n" +
                "}";
        return json;
    }

}
