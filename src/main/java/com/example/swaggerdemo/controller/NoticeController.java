package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.bean.JsonResult;
import com.example.swaggerdemo.bean.User;
import com.example.swaggerdemo.res.ZxTopicRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

@RestController
@RequestMapping(value = "app/testApi/notice")
@Api(value = "NoticeController | 公告接口")
public class NoticeController {

    /**
     * @param
     * @return
     */


    @ApiOperation(value="获取公告列表", notes="获取公告列表")
    @RequestMapping(value = "getNotices", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="userId",paramType = "query",example="123")

    })
    public ResponseEntity getNotices (Integer userId){
        JsonResult r = new JsonResult();

        r.setStatus("ok");
        r.setResult("{\"total\":158,\"rows\":[{\"id\":46527721,\"securitycode\":\"600593\",\"securityname\":\"大连圣亚\",\"infocode\":\"AN201904191320925585\",\"noticetitle\":\"600593:大连圣亚股东减持股份进展公告\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/20/大连圣亚股东减持股份进展公告-1636667575.pdf\",\"noticedate\":\"2019-04-20\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904191320925585_1.pdf\",\"eid\":173000003151238604,\"eseqid\":82655039584,\"saveTime\":1555689600000,\"isValid\":\"1\"},{\"id\":46508516,\"securitycode\":\"000978\",\"securityname\":\"桂林旅游\",\"infocode\":\"AN201904191320895016\",\"noticetitle\":\"桂林旅游:关于召开2018年年度股东大会的提示性公告\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/20/桂林旅游关于召开2018年年度股东大会的提示性公告1145315711.pdf\",\"noticedate\":\"2019-04-20\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904191320895016_1.pdf\",\"eid\":173000003150009482,\"eseqid\":82634948795,\"saveTime\":1555603200000,\"isValid\":\"1\"},{\"id\":46548361,\"securitycode\":\"600593\",\"securityname\":\"大连圣亚\",\"infocode\":\"AN201904191320925584\",\"noticetitle\":\"600593:大连圣亚2019年第一次临时股东大会的法律意见书\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/20/大连圣亚2019年第一次临时股东大会的法律意见书-1637591096.pdf\",\"noticedate\":\"2019-04-20\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904191320925584_1.pdf\",\"eid\":173000003151238595,\"eseqid\":82675611059,\"saveTime\":1555689600000,\"isValid\":\"1\"},{\"id\":46548359,\"securitycode\":\"600593\",\"securityname\":\"大连圣亚\",\"infocode\":\"AN201904191320925583\",\"noticetitle\":\"600593:大连圣亚2019年第一次临时股东大会决议公告\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/20/大连圣亚2019年第一次临时股东大会决议公告-1638514617.pdf\",\"noticedate\":\"2019-04-20\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904191320925583_1.pdf\",\"eid\":173000003151231230,\"eseqid\":82675680204,\"saveTime\":1555689600000,\"isValid\":\"1\"},{\"id\":46526302,\"securitycode\":\"600054\",\"securityname\":\"黄山旅游\",\"infocode\":\"AN201904191320915946\",\"noticetitle\":\"600054:黄山旅游关于召开2018年年度股东大会的通知\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/20/黄山旅游关于召开2018年年度股东大会的通知1718041479.pdf\",\"noticedate\":\"2019-04-20\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904191320915946_1.pdf\",\"eid\":173000003150813616,\"eseqid\":82644922507,\"saveTime\":1555689600000,\"isValid\":\"1\"},{\"id\":46238363,\"securitycode\":\"600054\",\"securityname\":\"黄山旅游\",\"infocode\":\"AN201904121318746241\",\"noticetitle\":\"600054:黄山旅游:国元证券股份有限公司关于黄山旅游发展股份有限公司非公开发行股票募集资金2018年度存放与实际使用情况的核查意见\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/13/黄山旅游国元证券股份有限公司关于黄山旅游发展股份有限公司非公开发行股票募集资金2018年度存放与实际使用情况的核查意见2045404749.pdf\",\"noticedate\":\"2019-04-13\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904121318746241_1.pdf\",\"eid\":173000003137265054,\"eseqid\":82433796288,\"saveTime\":1554998400000,\"isValid\":\"1\"},{\"id\":46244917,\"securitycode\":\"600593\",\"securityname\":\"大连圣亚\",\"infocode\":\"AN201904121318805442\",\"noticetitle\":\"600593:大连圣亚持股5%以上股东减持股份计划公告\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/13/大连圣亚持股5以上股东减持股份计划公告-1212481009.pdf\",\"noticedate\":\"2019-04-13\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904121318805442_1.pdf\",\"eid\":173000003137742669,\"eseqid\":82436124651,\"saveTime\":1555084800000,\"isValid\":\"1\"},{\"id\":46238401,\"securitycode\":\"600054\",\"securityname\":\"黄山旅游\",\"infocode\":\"AN201904121318746239\",\"noticetitle\":\"600054:黄山旅游:华普天健会计师事务所关于黄山旅游2018年度募集资金年度存放与使用情况鉴证报告\",\"attachname\":\"/ANNOUNCE/COMP/2019/04/13/黄山旅游华普天健会计师事务所关于黄山旅游2018年度募集资金年度存放与使用情况鉴证报告-2145351083.pdf\",\"noticedate\":\"2019-04-13\",\"url\":\"http://pdf.dfcfw.com/pdf/H2_AN201904121318746239_1.pdf\",\"eid\":173000003137270892,\"eseqid\":82433802131,\"saveTime\":1554998400000,\"isValid\":\"1\"}]}");
        return ResponseEntity.ok(r);
    }


}
