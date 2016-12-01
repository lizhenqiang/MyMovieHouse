package com.example.hasee.mymoviehouse.movie.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lzq on 2016/11/30.
 */
public class ListViewBean {

    /**
     * expires : 1800
     */

    private ControlBean control;
    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"cnms":0,"sn":0,"showInfo":"今天165家影院放映2088场","late":false,"scm":"神奇动物城，法师显超能","src":"","pn":236,"dir":"大卫·叶茨","star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","cat":"冒险,奇幻,家庭","wish":130686,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕","rt":"2016-11-25上映","imax":true,"snum":99535,"showDate":"","dur":133,"nm":"神奇动物在哪里","time":"","id":248918},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"寻君千里行，心系君之名","src":"","pn":166,"dir":"新海诚","star":"上白石萌音,神木隆之介,长泽雅美","cat":"剧情,爱情,动画","wish":255509,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":17493,"showDate":"","dur":107,"nm":"你的名字。","time":"","id":344881},{"cnms":0,"sn":0,"showInfo":"今天162家影院放映960场","late":false,"scm":"航海家后代，征程向大海","src":"","pn":128,"dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","cat":"动画,动作,冒险","wish":42849,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","sc":9.2,"ver":"2D/3D/中国巨幕/全景声","rt":"2016-11-25上映","imax":false,"snum":30745,"showDate":"","dur":107,"nm":"海洋奇缘","time":"","id":246222},{"cnms":0,"sn":0,"showInfo":"今天154家影院放映953场","late":false,"scm":"夫妇皆仇敌，枕边藏杀机","src":"","pn":210,"dir":"罗伯特·泽米吉斯","star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","cat":"爱情,动作,战争","wish":42631,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","sc":8.8,"ver":"2D/中国巨幕","rt":"本周三上映","imax":false,"snum":28892,"showDate":"","dur":124,"nm":"间谍同盟","time":"","id":346564},{"cnms":0,"sn":0,"showInfo":"今天158家影院放映806场","late":false,"scm":"金莲戏中戏，官场局中局","src":"","pn":211,"dir":"冯小刚","star":"范冰冰,郭涛,董成鹏","cat":"剧情,喜剧","wish":185572,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","sc":7.9,"ver":"2D/中国巨幕/全景声","rt":"2016-11-18上映","imax":false,"snum":180928,"showDate":"","dur":140,"nm":"我不是潘金莲","time":"","id":341749},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"异能桃花源，穿越时光圈","src":"","pn":107,"dir":"蒂姆·波顿","star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","cat":"冒险,奇幻","wish":98202,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","sc":0,"ver":"2D/3D/中国巨幕/全景声","rt":"本周五上映","imax":false,"snum":1190,"showDate":"","dur":126,"nm":"佩小姐的奇幻城堡","time":"","id":246373},{"cnms":0,"sn":0,"showInfo":"今天115家影院放映332场","late":false,"scm":"美女有异瞳，黑暗再行动","src":"","pn":80,"dir":"静野孔文","star":"高山南,天海佑希,林原惠美","cat":"动画,悬疑","wish":43219,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/6742d5169d136a58a3b1ca2fd071e88c248086.jpg","sc":8.8,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":19321,"showDate":"","dur":112,"nm":"名侦探柯南：纯黑的恶梦","time":"","id":344073},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"冬升携老怪，千仗无一败","src":"","pn":115,"dir":"尔冬升","star":"林更新,何润东,蒋梦婕","cat":"剧情,动作,武侠","wish":94799,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","sc":0,"ver":"3D/中国巨幕","rt":"本周五上映","imax":false,"snum":1192,"showDate":"","dur":107,"nm":"三少爷的剑","time":"","id":79088},{"cnms":0,"sn":0,"showInfo":"今天74家影院放映195场","late":false,"scm":"车祸手迟钝，修炼成神棍","src":"","pn":534,"dir":"斯科特·德瑞克森","star":"本尼迪克特·康伯巴奇,切瓦特·埃加福特,瑞秋·麦克亚当斯","cat":"动作,冒险,奇幻","wish":205273,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/aa492b57443fc95a5b3b46c459d59e50898549.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-11-04上映","imax":true,"snum":335420,"showDate":"","dur":115,"nm":"奇异博士","time":"","id":246124},{"cnms":0,"sn":0,"showInfo":"今天73家影院放映150场","late":false,"scm":"血清三路抢，大火吞真相","src":"","pn":188,"dir":"林岭东,钱文锜","star":"吴彦祖,张孝全,张若昀","cat":"剧情,动作,悬疑","wish":29674,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/a4469e30fc41d262ad021d5dd0dd73aa767743.jpg","sc":7.1,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":20656,"showDate":"","dur":100,"nm":"冲天火","time":"","id":341529},{"cnms":0,"sn":0,"showInfo":"今天44家影院放映106场","late":false,"scm":"半场无战事，少年初长时","src":"","pn":281,"dir":"李安","star":"乔·阿尔文,克里斯汀·斯图尔特,加内特·赫德兰","cat":"剧情,战争","wish":33615,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/0469a4bbcf69d46357256bc100bed703787664.jpg","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-11-11上映","imax":false,"snum":55062,"showDate":"","dur":113,"nm":"比利·林恩的中场战事","time":"","id":247736},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"中法韩跑男，为夺宝闯关","src":"","pn":143,"dir":"宋啸","star":"陈赫,宋智孝,大卫·贝利","cat":"喜剧,动作,冒险","wish":42368,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/658b714699f37110db35e343474ccf12808915.png","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","imax":false,"snum":1584,"showDate":"","dur":91,"nm":"超级快递","time":"","id":343866},{"cnms":0,"sn":0,"showInfo":"2016-12-08 下周四上映","late":false,"scm":"士兵有信仰，战场拒拿枪","src":"","pn":98,"dir":"梅尔·吉布森","star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","cat":"剧情,战争","wish":13060,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","sc":0,"ver":"2D/中国巨幕","rt":"下周四上映","imax":false,"snum":222,"showDate":"","dur":139,"nm":"血战钢锯岭","time":"","id":338349},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"驴友去探险，误闯食人岛","src":"","pn":47,"dir":"李凯","star":"娄淇,杨凯迪,谢波","cat":"恐怖,惊悚,科幻","wish":7231,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/99b80de56746a9de620f08cb33bd21e15407178.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":135,"showDate":"","dur":94,"nm":"食人岛","time":"","id":1132403},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"绑架十二年，归家惹事端","src":"","pn":52,"dir":"周隼","star":"胡歌,宋佳,颜卓灵","cat":"爱情,悬疑,犯罪","wish":30619,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","sc":0,"ver":"2D","rt":"下周五上映","imax":false,"snum":727,"showDate":"","dur":0,"nm":"那年夏天你去了哪里","time":"","id":1187526},{"cnms":0,"sn":0,"showInfo":"今天5家影院放映28场","late":false,"scm":"至尊宝归来，穿越寻真爱","src":"","pn":200,"dir":"刘镇伟","star":"韩庚,唐嫣,吴京","cat":"喜剧,奇幻,爱情","wish":287204,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/c5c37139438c203a623e95d71a0181f0919589.jpg","sc":7,"ver":"2D/3D/中国巨幕","rt":"2016-09-14上映","imax":false,"snum":292538,"showDate":"","dur":93,"nm":"大话西游3","time":"","id":247259},{"cnms":0,"sn":0,"showInfo":"今天23家影院放映28场","late":false,"scm":"身高有差距，恋爱零距离","src":"","pn":72,"dir":"马侃","star":"高以翔,王水林,秦晓飞","cat":"喜剧,爱情","wish":40251,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/63df54245e2a87bcbe4d9f7a4ee496e6963165.jpg","sc":7.8,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":5677,"showDate":"","dur":91,"nm":"最萌身高差","time":"","id":345105},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"舍命战毒枭，为爱去狂飙","src":"","pn":90,"dir":"埃兰·克里维","star":"尼古拉斯·霍尔特,菲丽希缇·琼斯,Johny Mathew","cat":"动作,惊悚","wish":20000,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/394490e44943bebd375ffae1a7fe113e492426.jpg","sc":0,"ver":"2D/中国巨幕/3D","rt":"本周五上映","imax":false,"snum":94,"showDate":"","dur":88,"nm":"极速之巅","time":"","id":336835},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映21场","late":false,"scm":"海上遇井喷，英勇救同伴","src":"","pn":228,"dir":"彼得·博格","star":"马克·沃尔伯格,吉娜·罗德里格兹,库尔特·拉塞尔","cat":"剧情,动作,灾难","wish":26131,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/c8d8a0a51af8da4489727296ebf2d548617916.jpg","sc":8.3,"ver":"2D/中国巨幕","rt":"2016-11-15上映","imax":false,"snum":30761,"showDate":"","dur":108,"nm":"深海浩劫","time":"","id":248675},{"cnms":0,"sn":0,"showInfo":"今天21家影院放映21场","late":false,"scm":"夫人突暴毙，地下藏玄机","src":"","pn":33,"dir":"周广兴","star":"那威,倪新宇,陈美行","cat":"恐怖,惊悚,悬疑","wish":17215,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b313dcb28fbd25fd116485ee9ada2737980656.jpeg","sc":3.3,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":2067,"showDate":"","dur":89,"nm":"怨灵地下室","time":"","id":1182756},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映20场","late":false,"scm":"商船藏毒品，冤屈难洗清","src":"","pn":296,"dir":"林超贤","star":"张涵予,彭于晏,冯文娟","cat":"动作,犯罪,剧情","wish":57407,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/8f8efcd7a8c3dbcbe13fe2cd855ea6a42750455.jpg","sc":9.3,"ver":"2D/中国巨幕","rt":"2016-09-30上映","imax":false,"snum":821394,"showDate":"","dur":124,"nm":"湄公河行动","time":"","id":338391},{"cnms":0,"sn":0,"showInfo":"今天11家影院放映20场","late":false,"scm":"热血海贼王，冒险新起航","src":"","pn":108,"dir":"宫元宏彰","star":"田中真弓,大谷育江,冈村明美","cat":"动画,冒险","wish":118442,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/e17eb219908416b7ee3bf07c2dc295ac945415.jpg","sc":9.1,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":96216,"showDate":"","dur":121,"nm":"航海王之黄金城","time":"","id":344902},{"cnms":0,"sn":0,"showInfo":"今天15家影院放映16场","late":false,"scm":"只是被车撞，生活却变样","src":"","pn":39,"dir":"林浩然","star":"陈妍希,杰克逊·拉斯波恩,成康","cat":"剧情,爱情,悬疑","wish":11823,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/501b866b4605b4933b1ebec67bc49da74245946.jpg","sc":7.3,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":594,"showDate":"","dur":95,"nm":"夏威夷之恋","time":"","id":337195},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映11场","late":false,"scm":"哭成小笨蛋，笑回长大前","src":"","pn":140,"dir":"张末","star":"倪妮,霍建华,马苏","cat":"喜剧,爱情,奇幻","wish":91678,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/f85de4d42c6fe3e958bd204fcb6a76f59235962.jpg","sc":9.3,"ver":"2D","rt":"下周五上映","imax":false,"snum":71,"showDate":"","dur":109,"nm":"28岁未成年","time":"","id":343413},{"cnms":0,"sn":0,"showInfo":"今天10家影院放映15场","late":false,"scm":"谎言圆不上，人比驴荒唐","src":"","pn":157,"dir":"周申,刘露","star":"任素汐,大力,刘帅良","cat":"剧情,喜剧","wish":29385,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/13d4883803f25244d266c7cd3ac2f15d327618.jpg","sc":8.5,"ver":"2D","rt":"2016-10-28上映","imax":false,"snum":135645,"showDate":"","dur":111,"nm":"驴得水","time":"","id":410612},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映15场","late":false,"scm":"处女爱处男，结局并不惨","src":"","pn":70,"dir":"陈兵","star":"安宰贤,安以轩,方中信","cat":"剧情,爱情","wish":20845,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/98d1eac6f63b475e1d937c19666029c4238607.jpg","sc":7.9,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":1553,"showDate":"","dur":90,"nm":"我是处女座","time":"","id":344437},{"cnms":0,"sn":0,"showInfo":"2016-12-01 本周四上映","late":false,"scm":"女孩遭性侵，山村来打拼","src":"","pn":265,"dir":"谢云鹏,杜昌博","star":"郑昊,张墨锡,王佳琦","cat":"剧情,爱情","wish":2122,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/808a19b387ec5dcbbb016513f9634a9d1415574.jpg","sc":0,"ver":"2D","rt":"本周四上映","imax":false,"snum":68,"showDate":"","dur":92,"nm":"爱你的人","time":"","id":345529},{"cnms":0,"sn":0,"showInfo":"今天5家影院放映8场","late":false,"scm":"不惑未婚男，追女赴越南","src":"","pn":77,"dir":"郭翔","star":"马德钟,王大治,刘力扬","cat":"剧情,喜剧,爱情","wish":3016,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/69920759ab83d5343db11ef889946ff0107209.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":246,"showDate":"","dur":96,"nm":"越囧","time":"","id":246674},{"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","late":false,"scm":"主播有点烦，儿孙太能缠","src":"","pn":166,"dir":"安兵基","star":"佟大为,陈妍希,吕云骢","cat":"剧情,喜剧,家庭","wish":39153,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/119fc2dd0b9c55001831e6fc5dd2a374115176.jpg","sc":8.3,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":36962,"showDate":"","dur":103,"nm":"外公芳龄38","time":"","id":342427},{"cnms":0,"sn":0,"showInfo":"今天4家影院放映6场","late":false,"scm":"穷人爱公主，神灯来帮助","src":"","pn":76,"dir":"亚瑟·本扎昆","star":"凯文·亚当斯,让-保罗·卢弗,凡妮莎·吉德","cat":"喜剧,爱情","wish":19648,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/2d5fb108c7868e870daa1787cee484b7697168.jpg","sc":7.4,"ver":"2D","rt":"2016-11-18上映","imax":false,"snum":11089,"showDate":"","dur":101,"nm":"阿拉丁与神灯","time":"","id":346365},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映4场","late":false,"scm":"夜奔百余里，行军创奇迹","src":"","pn":134,"dir":"宁海强","star":"李东学,聂远,于小伟","cat":"历史,战争,动作","wish":10456,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/487c91816e531c33063fefa657d4c6e4656569.jpeg","sc":8.8,"ver":"2D/中国巨幕","rt":"2016-10-14上映","imax":false,"snum":17413,"showDate":"","dur":102,"nm":"勇士","time":"","id":346759},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映4场","late":false,"scm":"异世来相逢，勇者得重生","src":"","pn":212,"dir":"马蒂亚斯·霍恩","star":"赵又廷,倪妮,尤赖亚·谢尔顿","cat":"动作,冒险,奇幻","wish":23294,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/c3cb7d5ec4d961c793bd812805a30bc4621134.jpg","sc":6.5,"ver":"2D/3D/中国巨幕","rt":"2016-11-18上映","imax":false,"snum":19291,"showDate":"","dur":108,"nm":"勇士之门","time":"","id":248637},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"飞机遇意外，机长险被害","src":"","pn":79,"dir":"克林特·伊斯特伍德","star":"汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","cat":"剧情,传记","wish":12505,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/470b3d85956f801fdcdeaa1d1c1a5c84234487.jpg","sc":0,"ver":"2D/IMAX 2D/中国巨幕","rt":"下周五上映","imax":true,"snum":194,"showDate":"","dur":96,"nm":"萨利机长","time":"","id":342003},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映2场","late":false,"scm":"婚后无话讲，与谁诉短长","src":"","pn":176,"dir":"刘雨霖","star":"毛孩,李倩,刘蓓","cat":"剧情","wish":11050,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/44e7bf41b8d9bf7a061b5647bb3f0fc9586345.jpg","sc":7.7,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":6787,"showDate":"","dur":110,"nm":"一句顶一万句","time":"","id":345216},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"scm":"神秘白云桥，阴阳交界处","src":"","pn":47,"dir":"钟萱","star":"钟萱,温兆伦,刘宇珽","cat":"恐怖,惊悚,悬疑","wish":4173,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/0b5e98a4b7044cc7e445da18c460e104373854.jpg","sc":5.9,"ver":"2D","rt":"2016-11-18上映","imax":false,"snum":2364,"showDate":"","dur":94,"nm":"白云桥","time":"","id":1187417},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"新郎要逃婚，中了大陷阱","src":"","pn":35,"dir":"蒋钦民","star":"袁成杰,曹云金,江若琳","cat":"剧情,喜剧,爱情","wish":16812,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d0ccc26a636ae1a6ea4dcb7453758888675237.jpg","sc":7.3,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":828,"showDate":"","dur":96,"nm":"不离不弃","time":"","id":345494},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"哥哥久失踪，符号引惶恐","src":"","pn":153,"dir":"刘杰","star":"霍建华,秦海璐,万茜","cat":"惊悚,悬疑,犯罪","wish":42092,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/584a35567b3baecfe7347481ba09d9a8418043.jpg","sc":8.2,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":53281,"showDate":"","dur":105,"nm":"捉迷藏","time":"","id":346299},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"时光终将老，陪伴少不了","src":"","pn":55,"dir":"朱员成","star":"颜丙燕,王德顺,艾丽娅","cat":"剧情","wish":9000,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/447cc8fdcac0d0bcfaeca531b9f49ed2591404.jpg","sc":8.2,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":289,"showDate":"","dur":90,"nm":"盛先生的花儿","time":"","id":621219},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"红军开道路，迎接大部队","src":"","pn":11,"dir":"苑本立","star":"聂远,叶一云","cat":"剧情","wish":46,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/e6bc541ab839d55e868948f850bc1d9c141987.jpg","sc":0,"ver":"2D","rt":"2016-11-09上映","imax":false,"snum":54,"showDate":"","dur":97,"nm":"生死96小时","time":"","id":1196221},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"育儿新绝招，假装被破产","src":"","pn":61,"dir":"张坚庭","star":"郑嘉颖,小小彬,李呈媛","cat":"剧情,喜剧,爱情","wish":16655,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/34f14bdd361cae758f52dae3436082d1801317.jpg","sc":8.2,"ver":"2D","rt":"2016-11-10上映","imax":false,"snum":1932,"showDate":"","dur":96,"nm":"贫穷富爸爸","time":"","id":336061},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"燕赵大地上，鬼子无处藏","src":"","pn":7,"dir":"崔志敏","star":"邹德江,章宇,卢倩文","cat":"剧情,战争","wish":7,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/04f0da4d0be4067a3a8066982ae63dfc64193.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":8,"showDate":"","dur":90,"nm":"热土悲歌","time":"","id":1189305},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"沙漠越野赛，飙车为求爱","src":"","pn":68,"dir":"李柯","star":"隋咏良,尤靖茹,薛祺","cat":"剧情,爱情,冒险","wish":2156,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/afb1ae81d7ef6a57c5abc20d9fcdd35920580551.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":15,"showDate":"","dur":94,"nm":"沙漠之心","time":"","id":1197460},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"牧羊人进城，打碎纯真梦","src":"","pn":44,"dir":"万玛才旦","star":"西德尼玛,杨秀措,扎西","cat":"剧情","wish":2137,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/edb74b337c4f3175b2a45b045619963d460760.jpg","sc":0,"ver":"2D","rt":"下周五上映","imax":false,"snum":425,"showDate":"","dur":120,"nm":"塔洛","time":"","id":337708},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"医生有武器，心计和身体","src":"","pn":88,"dir":"孙亮","star":"吴镇宇,戴立忍,李昕芸","cat":"悬疑,剧情","wish":5709,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/917740c10fed0a65f057c3acc14f4eab393827.jpg","sc":6.5,"ver":"2D","rt":"2016-05-06上映","imax":false,"snum":1348,"showDate":"","dur":102,"nm":"判我有罪","time":"","id":343082},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"离家把侄寻，帮人带书信","src":"","pn":95,"dir":"毕赣","star":"陈永忠,郭月,余世学","cat":"剧情,悬疑","wish":5647,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d089ecbfb74fc1a234b7b1b8c5cadcf0516192.jpg","sc":8.1,"ver":"2D","rt":"2016-07-15上映","imax":false,"snum":6049,"showDate":"","dur":113,"nm":"路边野餐","time":"","id":342073},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"东方魔幻书，怪力乱神出","src":"","pn":34,"dir":"摩撒利","star":"殷果儿,丁汇宇,刘小奇","cat":"爱情,惊悚,悬疑","wish":17879,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/dd9d76aaa8a1bdad4f2907b78efb594f95916.jpeg","sc":5,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":4416,"showDate":"","dur":88,"nm":"聊斋新编之画皮新娘","time":"","id":346546}]}
     */

    private int status;
    /**
     * hasNext : false
     * movies : [{"cnms":0,"sn":0,"showInfo":"今天165家影院放映2088场","late":false,"scm":"神奇动物城，法师显超能","src":"","pn":236,"dir":"大卫·叶茨","star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","cat":"冒险,奇幻,家庭","wish":130686,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕","rt":"2016-11-25上映","imax":true,"snum":99535,"showDate":"","dur":133,"nm":"神奇动物在哪里","time":"","id":248918},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"寻君千里行，心系君之名","src":"","pn":166,"dir":"新海诚","star":"上白石萌音,神木隆之介,长泽雅美","cat":"剧情,爱情,动画","wish":255509,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":17493,"showDate":"","dur":107,"nm":"你的名字。","time":"","id":344881},{"cnms":0,"sn":0,"showInfo":"今天162家影院放映960场","late":false,"scm":"航海家后代，征程向大海","src":"","pn":128,"dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","cat":"动画,动作,冒险","wish":42849,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","sc":9.2,"ver":"2D/3D/中国巨幕/全景声","rt":"2016-11-25上映","imax":false,"snum":30745,"showDate":"","dur":107,"nm":"海洋奇缘","time":"","id":246222},{"cnms":0,"sn":0,"showInfo":"今天154家影院放映953场","late":false,"scm":"夫妇皆仇敌，枕边藏杀机","src":"","pn":210,"dir":"罗伯特·泽米吉斯","star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","cat":"爱情,动作,战争","wish":42631,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","sc":8.8,"ver":"2D/中国巨幕","rt":"本周三上映","imax":false,"snum":28892,"showDate":"","dur":124,"nm":"间谍同盟","time":"","id":346564},{"cnms":0,"sn":0,"showInfo":"今天158家影院放映806场","late":false,"scm":"金莲戏中戏，官场局中局","src":"","pn":211,"dir":"冯小刚","star":"范冰冰,郭涛,董成鹏","cat":"剧情,喜剧","wish":185572,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","sc":7.9,"ver":"2D/中国巨幕/全景声","rt":"2016-11-18上映","imax":false,"snum":180928,"showDate":"","dur":140,"nm":"我不是潘金莲","time":"","id":341749},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"异能桃花源，穿越时光圈","src":"","pn":107,"dir":"蒂姆·波顿","star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","cat":"冒险,奇幻","wish":98202,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","sc":0,"ver":"2D/3D/中国巨幕/全景声","rt":"本周五上映","imax":false,"snum":1190,"showDate":"","dur":126,"nm":"佩小姐的奇幻城堡","time":"","id":246373},{"cnms":0,"sn":0,"showInfo":"今天115家影院放映332场","late":false,"scm":"美女有异瞳，黑暗再行动","src":"","pn":80,"dir":"静野孔文","star":"高山南,天海佑希,林原惠美","cat":"动画,悬疑","wish":43219,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/6742d5169d136a58a3b1ca2fd071e88c248086.jpg","sc":8.8,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":19321,"showDate":"","dur":112,"nm":"名侦探柯南：纯黑的恶梦","time":"","id":344073},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"冬升携老怪，千仗无一败","src":"","pn":115,"dir":"尔冬升","star":"林更新,何润东,蒋梦婕","cat":"剧情,动作,武侠","wish":94799,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","sc":0,"ver":"3D/中国巨幕","rt":"本周五上映","imax":false,"snum":1192,"showDate":"","dur":107,"nm":"三少爷的剑","time":"","id":79088},{"cnms":0,"sn":0,"showInfo":"今天74家影院放映195场","late":false,"scm":"车祸手迟钝，修炼成神棍","src":"","pn":534,"dir":"斯科特·德瑞克森","star":"本尼迪克特·康伯巴奇,切瓦特·埃加福特,瑞秋·麦克亚当斯","cat":"动作,冒险,奇幻","wish":205273,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/aa492b57443fc95a5b3b46c459d59e50898549.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-11-04上映","imax":true,"snum":335420,"showDate":"","dur":115,"nm":"奇异博士","time":"","id":246124},{"cnms":0,"sn":0,"showInfo":"今天73家影院放映150场","late":false,"scm":"血清三路抢，大火吞真相","src":"","pn":188,"dir":"林岭东,钱文锜","star":"吴彦祖,张孝全,张若昀","cat":"剧情,动作,悬疑","wish":29674,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/a4469e30fc41d262ad021d5dd0dd73aa767743.jpg","sc":7.1,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":20656,"showDate":"","dur":100,"nm":"冲天火","time":"","id":341529},{"cnms":0,"sn":0,"showInfo":"今天44家影院放映106场","late":false,"scm":"半场无战事，少年初长时","src":"","pn":281,"dir":"李安","star":"乔·阿尔文,克里斯汀·斯图尔特,加内特·赫德兰","cat":"剧情,战争","wish":33615,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/0469a4bbcf69d46357256bc100bed703787664.jpg","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-11-11上映","imax":false,"snum":55062,"showDate":"","dur":113,"nm":"比利·林恩的中场战事","time":"","id":247736},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"中法韩跑男，为夺宝闯关","src":"","pn":143,"dir":"宋啸","star":"陈赫,宋智孝,大卫·贝利","cat":"喜剧,动作,冒险","wish":42368,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/658b714699f37110db35e343474ccf12808915.png","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","imax":false,"snum":1584,"showDate":"","dur":91,"nm":"超级快递","time":"","id":343866},{"cnms":0,"sn":0,"showInfo":"2016-12-08 下周四上映","late":false,"scm":"士兵有信仰，战场拒拿枪","src":"","pn":98,"dir":"梅尔·吉布森","star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","cat":"剧情,战争","wish":13060,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","sc":0,"ver":"2D/中国巨幕","rt":"下周四上映","imax":false,"snum":222,"showDate":"","dur":139,"nm":"血战钢锯岭","time":"","id":338349},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"驴友去探险，误闯食人岛","src":"","pn":47,"dir":"李凯","star":"娄淇,杨凯迪,谢波","cat":"恐怖,惊悚,科幻","wish":7231,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/99b80de56746a9de620f08cb33bd21e15407178.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":135,"showDate":"","dur":94,"nm":"食人岛","time":"","id":1132403},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"绑架十二年，归家惹事端","src":"","pn":52,"dir":"周隼","star":"胡歌,宋佳,颜卓灵","cat":"爱情,悬疑,犯罪","wish":30619,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","sc":0,"ver":"2D","rt":"下周五上映","imax":false,"snum":727,"showDate":"","dur":0,"nm":"那年夏天你去了哪里","time":"","id":1187526},{"cnms":0,"sn":0,"showInfo":"今天5家影院放映28场","late":false,"scm":"至尊宝归来，穿越寻真爱","src":"","pn":200,"dir":"刘镇伟","star":"韩庚,唐嫣,吴京","cat":"喜剧,奇幻,爱情","wish":287204,"3d":true,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/c5c37139438c203a623e95d71a0181f0919589.jpg","sc":7,"ver":"2D/3D/中国巨幕","rt":"2016-09-14上映","imax":false,"snum":292538,"showDate":"","dur":93,"nm":"大话西游3","time":"","id":247259},{"cnms":0,"sn":0,"showInfo":"今天23家影院放映28场","late":false,"scm":"身高有差距，恋爱零距离","src":"","pn":72,"dir":"马侃","star":"高以翔,王水林,秦晓飞","cat":"喜剧,爱情","wish":40251,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/63df54245e2a87bcbe4d9f7a4ee496e6963165.jpg","sc":7.8,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":5677,"showDate":"","dur":91,"nm":"最萌身高差","time":"","id":345105},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"舍命战毒枭，为爱去狂飙","src":"","pn":90,"dir":"埃兰·克里维","star":"尼古拉斯·霍尔特,菲丽希缇·琼斯,Johny Mathew","cat":"动作,惊悚","wish":20000,"3d":true,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/394490e44943bebd375ffae1a7fe113e492426.jpg","sc":0,"ver":"2D/中国巨幕/3D","rt":"本周五上映","imax":false,"snum":94,"showDate":"","dur":88,"nm":"极速之巅","time":"","id":336835},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映21场","late":false,"scm":"海上遇井喷，英勇救同伴","src":"","pn":228,"dir":"彼得·博格","star":"马克·沃尔伯格,吉娜·罗德里格兹,库尔特·拉塞尔","cat":"剧情,动作,灾难","wish":26131,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/c8d8a0a51af8da4489727296ebf2d548617916.jpg","sc":8.3,"ver":"2D/中国巨幕","rt":"2016-11-15上映","imax":false,"snum":30761,"showDate":"","dur":108,"nm":"深海浩劫","time":"","id":248675},{"cnms":0,"sn":0,"showInfo":"今天21家影院放映21场","late":false,"scm":"夫人突暴毙，地下藏玄机","src":"","pn":33,"dir":"周广兴","star":"那威,倪新宇,陈美行","cat":"恐怖,惊悚,悬疑","wish":17215,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/b313dcb28fbd25fd116485ee9ada2737980656.jpeg","sc":3.3,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":2067,"showDate":"","dur":89,"nm":"怨灵地下室","time":"","id":1182756},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映20场","late":false,"scm":"商船藏毒品，冤屈难洗清","src":"","pn":296,"dir":"林超贤","star":"张涵予,彭于晏,冯文娟","cat":"动作,犯罪,剧情","wish":57407,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/8f8efcd7a8c3dbcbe13fe2cd855ea6a42750455.jpg","sc":9.3,"ver":"2D/中国巨幕","rt":"2016-09-30上映","imax":false,"snum":821394,"showDate":"","dur":124,"nm":"湄公河行动","time":"","id":338391},{"cnms":0,"sn":0,"showInfo":"今天11家影院放映20场","late":false,"scm":"热血海贼王，冒险新起航","src":"","pn":108,"dir":"宫元宏彰","star":"田中真弓,大谷育江,冈村明美","cat":"动画,冒险","wish":118442,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/e17eb219908416b7ee3bf07c2dc295ac945415.jpg","sc":9.1,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":96216,"showDate":"","dur":121,"nm":"航海王之黄金城","time":"","id":344902},{"cnms":0,"sn":0,"showInfo":"今天15家影院放映16场","late":false,"scm":"只是被车撞，生活却变样","src":"","pn":39,"dir":"林浩然","star":"陈妍希,杰克逊·拉斯波恩,成康","cat":"剧情,爱情,悬疑","wish":11823,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/501b866b4605b4933b1ebec67bc49da74245946.jpg","sc":7.3,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":594,"showDate":"","dur":95,"nm":"夏威夷之恋","time":"","id":337195},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映11场","late":false,"scm":"哭成小笨蛋，笑回长大前","src":"","pn":140,"dir":"张末","star":"倪妮,霍建华,马苏","cat":"喜剧,爱情,奇幻","wish":91678,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/f85de4d42c6fe3e958bd204fcb6a76f59235962.jpg","sc":9.3,"ver":"2D","rt":"下周五上映","imax":false,"snum":71,"showDate":"","dur":109,"nm":"28岁未成年","time":"","id":343413},{"cnms":0,"sn":0,"showInfo":"今天10家影院放映15场","late":false,"scm":"谎言圆不上，人比驴荒唐","src":"","pn":157,"dir":"周申,刘露","star":"任素汐,大力,刘帅良","cat":"剧情,喜剧","wish":29385,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/13d4883803f25244d266c7cd3ac2f15d327618.jpg","sc":8.5,"ver":"2D","rt":"2016-10-28上映","imax":false,"snum":135645,"showDate":"","dur":111,"nm":"驴得水","time":"","id":410612},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映15场","late":false,"scm":"处女爱处男，结局并不惨","src":"","pn":70,"dir":"陈兵","star":"安宰贤,安以轩,方中信","cat":"剧情,爱情","wish":20845,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/98d1eac6f63b475e1d937c19666029c4238607.jpg","sc":7.9,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":1553,"showDate":"","dur":90,"nm":"我是处女座","time":"","id":344437},{"cnms":0,"sn":0,"showInfo":"2016-12-01 本周四上映","late":false,"scm":"女孩遭性侵，山村来打拼","src":"","pn":265,"dir":"谢云鹏,杜昌博","star":"郑昊,张墨锡,王佳琦","cat":"剧情,爱情","wish":2122,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/808a19b387ec5dcbbb016513f9634a9d1415574.jpg","sc":0,"ver":"2D","rt":"本周四上映","imax":false,"snum":68,"showDate":"","dur":92,"nm":"爱你的人","time":"","id":345529},{"cnms":0,"sn":0,"showInfo":"今天5家影院放映8场","late":false,"scm":"不惑未婚男，追女赴越南","src":"","pn":77,"dir":"郭翔","star":"马德钟,王大治,刘力扬","cat":"剧情,喜剧,爱情","wish":3016,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/69920759ab83d5343db11ef889946ff0107209.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":246,"showDate":"","dur":96,"nm":"越囧","time":"","id":246674},{"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","late":false,"scm":"主播有点烦，儿孙太能缠","src":"","pn":166,"dir":"安兵基","star":"佟大为,陈妍希,吕云骢","cat":"剧情,喜剧,家庭","wish":39153,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/119fc2dd0b9c55001831e6fc5dd2a374115176.jpg","sc":8.3,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":36962,"showDate":"","dur":103,"nm":"外公芳龄38","time":"","id":342427},{"cnms":0,"sn":0,"showInfo":"今天4家影院放映6场","late":false,"scm":"穷人爱公主，神灯来帮助","src":"","pn":76,"dir":"亚瑟·本扎昆","star":"凯文·亚当斯,让-保罗·卢弗,凡妮莎·吉德","cat":"喜剧,爱情","wish":19648,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/2d5fb108c7868e870daa1787cee484b7697168.jpg","sc":7.4,"ver":"2D","rt":"2016-11-18上映","imax":false,"snum":11089,"showDate":"","dur":101,"nm":"阿拉丁与神灯","time":"","id":346365},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映4场","late":false,"scm":"夜奔百余里，行军创奇迹","src":"","pn":134,"dir":"宁海强","star":"李东学,聂远,于小伟","cat":"历史,战争,动作","wish":10456,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/487c91816e531c33063fefa657d4c6e4656569.jpeg","sc":8.8,"ver":"2D/中国巨幕","rt":"2016-10-14上映","imax":false,"snum":17413,"showDate":"","dur":102,"nm":"勇士","time":"","id":346759},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映4场","late":false,"scm":"异世来相逢，勇者得重生","src":"","pn":212,"dir":"马蒂亚斯·霍恩","star":"赵又廷,倪妮,尤赖亚·谢尔顿","cat":"动作,冒险,奇幻","wish":23294,"3d":true,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/c3cb7d5ec4d961c793bd812805a30bc4621134.jpg","sc":6.5,"ver":"2D/3D/中国巨幕","rt":"2016-11-18上映","imax":false,"snum":19291,"showDate":"","dur":108,"nm":"勇士之门","time":"","id":248637},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"飞机遇意外，机长险被害","src":"","pn":79,"dir":"克林特·伊斯特伍德","star":"汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","cat":"剧情,传记","wish":12505,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/470b3d85956f801fdcdeaa1d1c1a5c84234487.jpg","sc":0,"ver":"2D/IMAX 2D/中国巨幕","rt":"下周五上映","imax":true,"snum":194,"showDate":"","dur":96,"nm":"萨利机长","time":"","id":342003},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映2场","late":false,"scm":"婚后无话讲，与谁诉短长","src":"","pn":176,"dir":"刘雨霖","star":"毛孩,李倩,刘蓓","cat":"剧情","wish":11050,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/44e7bf41b8d9bf7a061b5647bb3f0fc9586345.jpg","sc":7.7,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":6787,"showDate":"","dur":110,"nm":"一句顶一万句","time":"","id":345216},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"scm":"神秘白云桥，阴阳交界处","src":"","pn":47,"dir":"钟萱","star":"钟萱,温兆伦,刘宇珽","cat":"恐怖,惊悚,悬疑","wish":4173,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/0b5e98a4b7044cc7e445da18c460e104373854.jpg","sc":5.9,"ver":"2D","rt":"2016-11-18上映","imax":false,"snum":2364,"showDate":"","dur":94,"nm":"白云桥","time":"","id":1187417},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"新郎要逃婚，中了大陷阱","src":"","pn":35,"dir":"蒋钦民","star":"袁成杰,曹云金,江若琳","cat":"剧情,喜剧,爱情","wish":16812,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d0ccc26a636ae1a6ea4dcb7453758888675237.jpg","sc":7.3,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":828,"showDate":"","dur":96,"nm":"不离不弃","time":"","id":345494},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"哥哥久失踪，符号引惶恐","src":"","pn":153,"dir":"刘杰","star":"霍建华,秦海璐,万茜","cat":"惊悚,悬疑,犯罪","wish":42092,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/584a35567b3baecfe7347481ba09d9a8418043.jpg","sc":8.2,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":53281,"showDate":"","dur":105,"nm":"捉迷藏","time":"","id":346299},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"时光终将老，陪伴少不了","src":"","pn":55,"dir":"朱员成","star":"颜丙燕,王德顺,艾丽娅","cat":"剧情","wish":9000,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/447cc8fdcac0d0bcfaeca531b9f49ed2591404.jpg","sc":8.2,"ver":"2D","rt":"2016-11-04上映","imax":false,"snum":289,"showDate":"","dur":90,"nm":"盛先生的花儿","time":"","id":621219},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"红军开道路，迎接大部队","src":"","pn":11,"dir":"苑本立","star":"聂远,叶一云","cat":"剧情","wish":46,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/e6bc541ab839d55e868948f850bc1d9c141987.jpg","sc":0,"ver":"2D","rt":"2016-11-09上映","imax":false,"snum":54,"showDate":"","dur":97,"nm":"生死96小时","time":"","id":1196221},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"育儿新绝招，假装被破产","src":"","pn":61,"dir":"张坚庭","star":"郑嘉颖,小小彬,李呈媛","cat":"剧情,喜剧,爱情","wish":16655,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/34f14bdd361cae758f52dae3436082d1801317.jpg","sc":8.2,"ver":"2D","rt":"2016-11-10上映","imax":false,"snum":1932,"showDate":"","dur":96,"nm":"贫穷富爸爸","time":"","id":336061},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"scm":"燕赵大地上，鬼子无处藏","src":"","pn":7,"dir":"崔志敏","star":"邹德江,章宇,卢倩文","cat":"剧情,战争","wish":7,"3d":false,"preSale":0,"vd":"","img":"http://p1.meituan.net/165.220/movie/04f0da4d0be4067a3a8066982ae63dfc64193.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","imax":false,"snum":8,"showDate":"","dur":90,"nm":"热土悲歌","time":"","id":1189305},{"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","late":false,"scm":"沙漠越野赛，飙车为求爱","src":"","pn":68,"dir":"李柯","star":"隋咏良,尤靖茹,薛祺","cat":"剧情,爱情,冒险","wish":2156,"3d":false,"preSale":1,"vd":"","img":"http://p0.meituan.net/165.220/movie/afb1ae81d7ef6a57c5abc20d9fcdd35920580551.jpg","sc":0,"ver":"2D","rt":"本周五上映","imax":false,"snum":15,"showDate":"","dur":94,"nm":"沙漠之心","time":"","id":1197460},{"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","late":false,"scm":"牧羊人进城，打碎纯真梦","src":"","pn":44,"dir":"万玛才旦","star":"西德尼玛,杨秀措,扎西","cat":"剧情","wish":2137,"3d":false,"preSale":1,"vd":"","img":"http://p1.meituan.net/165.220/movie/edb74b337c4f3175b2a45b045619963d460760.jpg","sc":0,"ver":"2D","rt":"下周五上映","imax":false,"snum":425,"showDate":"","dur":120,"nm":"塔洛","time":"","id":337708},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"医生有武器，心计和身体","src":"","pn":88,"dir":"孙亮","star":"吴镇宇,戴立忍,李昕芸","cat":"悬疑,剧情","wish":5709,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/917740c10fed0a65f057c3acc14f4eab393827.jpg","sc":6.5,"ver":"2D","rt":"2016-05-06上映","imax":false,"snum":1348,"showDate":"","dur":102,"nm":"判我有罪","time":"","id":343082},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"离家把侄寻，帮人带书信","src":"","pn":95,"dir":"毕赣","star":"陈永忠,郭月,余世学","cat":"剧情,悬疑","wish":5647,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/d089ecbfb74fc1a234b7b1b8c5cadcf0516192.jpg","sc":8.1,"ver":"2D","rt":"2016-07-15上映","imax":false,"snum":6049,"showDate":"","dur":113,"nm":"路边野餐","time":"","id":342073},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"scm":"东方魔幻书，怪力乱神出","src":"","pn":34,"dir":"摩撒利","star":"殷果儿,丁汇宇,刘小奇","cat":"爱情,惊悚,悬疑","wish":17879,"3d":false,"preSale":0,"vd":"","img":"http://p0.meituan.net/165.220/movie/dd9d76aaa8a1bdad4f2907b78efb594f95916.jpeg","sc":5,"ver":"2D","rt":"2016-11-11上映","imax":false,"snum":4416,"showDate":"","dur":88,"nm":"聊斋新编之画皮新娘","time":"","id":346546}]
     */

    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        private boolean hasNext;
        /**
         * cnms : 0
         * sn : 0
         * showInfo : 今天165家影院放映2088场
         * late : false
         * scm : 神奇动物城，法师显超能
         * src :
         * pn : 236
         * dir : 大卫·叶茨
         * star : 埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔
         * cat : 冒险,奇幻,家庭
         * wish : 130686
         * 3d : true
         * preSale : 0
         * vd :
         * img : http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg
         * sc : 9.0
         * ver : 3D/IMAX 3D/中国巨幕
         * rt : 2016-11-25上映
         * imax : true
         * snum : 99535
         * showDate :
         * dur : 133
         * nm : 神奇动物在哪里
         * time :
         * id : 248918
         */

        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            private int cnms;
            private int sn;
            private String showInfo;
            private boolean late;
            private String scm;
            private String src;
            private int pn;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean value3d;
            private int preSale;
            private String vd;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private boolean imax;
            private int snum;
            private String showDate;
            private int dur;
            private String nm;
            private String time;
            private int id;

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
