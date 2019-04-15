package com.bupt.testapp.entry;
/*
* @author Jerry
* create at 2019/4/15 上午9:40
* description:天气详细信息实体，包含各种建议
*/
public class WeatherDetailEntry {

    /**
     * zs : {"ac_name":"空调开启指数","ac_hint":"部分时间开启","ac_des":"天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。","cl_name":"晨练指数","cl_hint":"适宜","cl_des":"天气晴朗，空气清新，是您晨练的大好时机，建议不同年龄段的人们积极参加户外健身活动。","co_name":"舒适度指数","co_hint":"较不舒适","co_des":"白天天气晴好，明媚的阳光在给您带来好心情的同时，也会使您感到有些热，不很舒适。","ct_name":"穿衣指数","ct_hint":"炎热","ct_des":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫、敞领短袖棉衫等清凉夏季服装。","dy_name":"钓鱼指数","dy_hint":"较适宜","dy_des":"较适合垂钓，但天气稍热，会对垂钓产生一定的影响。","fs_name":"防晒指数","fs_hint":"较弱","fs_des":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","gj_name":"逛街指数","gj_hint":"较适宜","gj_des":"天气晴朗，风和日丽，虽然天气较热，还是较适宜逛街的，涂上防晒霜，穿上透气的衣服就可放心出门了。","gm_name":"感冒指数","gm_hint":"少发","gm_des":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","hc_name":"划船指数","hc_hint":"适宜","hc_des":"白天天气晴朗，阳光明媚，适宜划船或嬉玩各种水上运动。","jt_name":"交通指数","jt_hint":"良好","jt_des":"天气晴朗，路面干燥，交通气象条件良好，车辆可以正常行驶。","lk_name":"路况指数","lk_hint":"干燥","lk_des":"晴天，条件适宜，路面比较干燥，路况较好。","ls_name":"晾晒指数","ls_hint":"适宜","ls_des":"多云，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","mf_name":"美发指数","mf_hint":"一般","mf_des":"天热，头皮皮脂分泌会增多，这既会助长发丝间细菌滋生，也会使空气中悬浮物更易黏附在头发上，极易弄脏头发，注意保持头发的清洁。","nl_name":"夜生活指数","nl_hint":"较适宜","nl_des":"虽然是阴天，但仍比较适宜夜生活，只要您稍作准备就可以放心外出。","pj_name":"啤酒指数","pj_hint":"适宜","pj_des":"炎热的天气可能增加啤酒对您的诱惑，适量饮用啤酒会给您带来清凉的感觉，但千万注意不要过量呦！","pk_name":"放风筝指数","pk_hint":"较适宜","pk_des":"天气晴朗，万里无云，但风略小，选择合适的地点，还是较适宜放风筝的。","pl_name":"空气污染扩散条件指数","pl_hint":"中","pl_des":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。","pp_name":"化妆指数","pp_hint":"防脱水","pp_des":"天热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。","tr_name":"旅游指数","tr_hint":"适宜","tr_des":"多云，有时云会遮挡阳光，但丝毫不会影响您的心情。微风，虽天气稍热，却仍适宜旅游，不要错过机会呦！","uv_name":"紫外线强度指数","uv_hint":"弱","uv_des":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","xc_name":"洗车指数","xc_hint":"较适宜","xc_des":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","xq_name":"心情指数","xq_hint":"较好","xq_des":"天气晴朗，会使人感觉有点烦躁，注意室内通风降温，保持淡泊宁静的心态。","yd_name":"运动指数","yd_hint":"较不宜","yd_des":"天气较好，但炎热，请注意适当减少运动时间并降低运动强度，又因紫外线强，户外运动注意防晒。","yh_name":"约会指数","yh_hint":"较不适宜","yh_des":"多云、天气热，建议尽量不要去室外约会，如果外出，请您挑选荫凉地点。","ys_name":"雨伞指数","ys_hint":"不带伞","ys_des":"为多云天气，但不会降水，因此您可放心出门，无须带雨伞。","zs_name":"中暑指数","zs_hint":"无","zs_des":"温度不高，其他各项气象条件适宜，中暑机率极低。"}
     */

    private ZsBean zs;

    public ZsBean getZs() {
        return zs;
    }

    public void setZs(ZsBean zs) {
        this.zs = zs;
    }

    public static class ZsBean {
        /**
         * ac_name : 空调开启指数
         * ac_hint : 部分时间开启
         * ac_des : 天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。
         * cl_name : 晨练指数
         * cl_hint : 适宜
         * cl_des : 天气晴朗，空气清新，是您晨练的大好时机，建议不同年龄段的人们积极参加户外健身活动。
         * co_name : 舒适度指数
         * co_hint : 较不舒适
         * co_des : 白天天气晴好，明媚的阳光在给您带来好心情的同时，也会使您感到有些热，不很舒适。
         * ct_name : 穿衣指数
         * ct_hint : 炎热
         * ct_des : 天气炎热，建议着短衫、短裙、短裤、薄型T恤衫、敞领短袖棉衫等清凉夏季服装。
         * dy_name : 钓鱼指数
         * dy_hint : 较适宜
         * dy_des : 较适合垂钓，但天气稍热，会对垂钓产生一定的影响。
         * fs_name : 防晒指数
         * fs_hint : 较弱
         * fs_des : 紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。
         * gj_name : 逛街指数
         * gj_hint : 较适宜
         * gj_des : 天气晴朗，风和日丽，虽然天气较热，还是较适宜逛街的，涂上防晒霜，穿上透气的衣服就可放心出门了。
         * gm_name : 感冒指数
         * gm_hint : 少发
         * gm_des : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
         * hc_name : 划船指数
         * hc_hint : 适宜
         * hc_des : 白天天气晴朗，阳光明媚，适宜划船或嬉玩各种水上运动。
         * jt_name : 交通指数
         * jt_hint : 良好
         * jt_des : 天气晴朗，路面干燥，交通气象条件良好，车辆可以正常行驶。
         * lk_name : 路况指数
         * lk_hint : 干燥
         * lk_des : 晴天，条件适宜，路面比较干燥，路况较好。
         * ls_name : 晾晒指数
         * ls_hint : 适宜
         * ls_des : 多云，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！
         * mf_name : 美发指数
         * mf_hint : 一般
         * mf_des : 天热，头皮皮脂分泌会增多，这既会助长发丝间细菌滋生，也会使空气中悬浮物更易黏附在头发上，极易弄脏头发，注意保持头发的清洁。
         * nl_name : 夜生活指数
         * nl_hint : 较适宜
         * nl_des : 虽然是阴天，但仍比较适宜夜生活，只要您稍作准备就可以放心外出。
         * pj_name : 啤酒指数
         * pj_hint : 适宜
         * pj_des : 炎热的天气可能增加啤酒对您的诱惑，适量饮用啤酒会给您带来清凉的感觉，但千万注意不要过量呦！
         * pk_name : 放风筝指数
         * pk_hint : 较适宜
         * pk_des : 天气晴朗，万里无云，但风略小，选择合适的地点，还是较适宜放风筝的。
         * pl_name : 空气污染扩散条件指数
         * pl_hint : 中
         * pl_des : 气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。
         * pp_name : 化妆指数
         * pp_hint : 防脱水
         * pp_des : 天热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。
         * tr_name : 旅游指数
         * tr_hint : 适宜
         * tr_des : 多云，有时云会遮挡阳光，但丝毫不会影响您的心情。微风，虽天气稍热，却仍适宜旅游，不要错过机会呦！
         * uv_name : 紫外线强度指数
         * uv_hint : 弱
         * uv_des : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
         * xc_name : 洗车指数
         * xc_hint : 较适宜
         * xc_des : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
         * xq_name : 心情指数
         * xq_hint : 较好
         * xq_des : 天气晴朗，会使人感觉有点烦躁，注意室内通风降温，保持淡泊宁静的心态。
         * yd_name : 运动指数
         * yd_hint : 较不宜
         * yd_des : 天气较好，但炎热，请注意适当减少运动时间并降低运动强度，又因紫外线强，户外运动注意防晒。
         * yh_name : 约会指数
         * yh_hint : 较不适宜
         * yh_des : 多云、天气热，建议尽量不要去室外约会，如果外出，请您挑选荫凉地点。
         * ys_name : 雨伞指数
         * ys_hint : 不带伞
         * ys_des : 为多云天气，但不会降水，因此您可放心出门，无须带雨伞。
         * zs_name : 中暑指数
         * zs_hint : 无
         * zs_des : 温度不高，其他各项气象条件适宜，中暑机率极低。
         */

        private String ac_name;
        private String ac_hint;
        private String ac_des;
        private String cl_name;
        private String cl_hint;
        private String cl_des;
        private String co_name;
        private String co_hint;
        private String co_des;
        private String ct_name;
        private String ct_hint;
        private String ct_des;
        private String dy_name;
        private String dy_hint;
        private String dy_des;
        private String fs_name;
        private String fs_hint;
        private String fs_des;
        private String gj_name;
        private String gj_hint;
        private String gj_des;
        private String gm_name;
        private String gm_hint;
        private String gm_des;
        private String hc_name;
        private String hc_hint;
        private String hc_des;
        private String jt_name;
        private String jt_hint;
        private String jt_des;
        private String lk_name;
        private String lk_hint;
        private String lk_des;
        private String ls_name;
        private String ls_hint;
        private String ls_des;
        private String mf_name;
        private String mf_hint;
        private String mf_des;
        private String nl_name;
        private String nl_hint;
        private String nl_des;
        private String pj_name;
        private String pj_hint;
        private String pj_des;
        private String pk_name;
        private String pk_hint;
        private String pk_des;
        private String pl_name;
        private String pl_hint;
        private String pl_des;
        private String pp_name;
        private String pp_hint;
        private String pp_des;
        private String tr_name;
        private String tr_hint;
        private String tr_des;
        private String uv_name;
        private String uv_hint;
        private String uv_des;
        private String xc_name;
        private String xc_hint;
        private String xc_des;
        private String xq_name;
        private String xq_hint;
        private String xq_des;
        private String yd_name;
        private String yd_hint;
        private String yd_des;
        private String yh_name;
        private String yh_hint;
        private String yh_des;
        private String ys_name;
        private String ys_hint;
        private String ys_des;
        private String zs_name;
        private String zs_hint;
        private String zs_des;

        public String getAc_name() {
            return ac_name;
        }

        public void setAc_name(String ac_name) {
            this.ac_name = ac_name;
        }

        public String getAc_hint() {
            return ac_hint;
        }

        public void setAc_hint(String ac_hint) {
            this.ac_hint = ac_hint;
        }

        public String getAc_des() {
            return ac_des;
        }

        public void setAc_des(String ac_des) {
            this.ac_des = ac_des;
        }

        public String getCl_name() {
            return cl_name;
        }

        public void setCl_name(String cl_name) {
            this.cl_name = cl_name;
        }

        public String getCl_hint() {
            return cl_hint;
        }

        public void setCl_hint(String cl_hint) {
            this.cl_hint = cl_hint;
        }

        public String getCl_des() {
            return cl_des;
        }

        public void setCl_des(String cl_des) {
            this.cl_des = cl_des;
        }

        public String getCo_name() {
            return co_name;
        }

        public void setCo_name(String co_name) {
            this.co_name = co_name;
        }

        public String getCo_hint() {
            return co_hint;
        }

        public void setCo_hint(String co_hint) {
            this.co_hint = co_hint;
        }

        public String getCo_des() {
            return co_des;
        }

        public void setCo_des(String co_des) {
            this.co_des = co_des;
        }

        public String getCt_name() {
            return ct_name;
        }

        public void setCt_name(String ct_name) {
            this.ct_name = ct_name;
        }

        public String getCt_hint() {
            return ct_hint;
        }

        public void setCt_hint(String ct_hint) {
            this.ct_hint = ct_hint;
        }

        public String getCt_des() {
            return ct_des;
        }

        public void setCt_des(String ct_des) {
            this.ct_des = ct_des;
        }

        public String getDy_name() {
            return dy_name;
        }

        public void setDy_name(String dy_name) {
            this.dy_name = dy_name;
        }

        public String getDy_hint() {
            return dy_hint;
        }

        public void setDy_hint(String dy_hint) {
            this.dy_hint = dy_hint;
        }

        public String getDy_des() {
            return dy_des;
        }

        public void setDy_des(String dy_des) {
            this.dy_des = dy_des;
        }

        public String getFs_name() {
            return fs_name;
        }

        public void setFs_name(String fs_name) {
            this.fs_name = fs_name;
        }

        public String getFs_hint() {
            return fs_hint;
        }

        public void setFs_hint(String fs_hint) {
            this.fs_hint = fs_hint;
        }

        public String getFs_des() {
            return fs_des;
        }

        public void setFs_des(String fs_des) {
            this.fs_des = fs_des;
        }

        public String getGj_name() {
            return gj_name;
        }

        public void setGj_name(String gj_name) {
            this.gj_name = gj_name;
        }

        public String getGj_hint() {
            return gj_hint;
        }

        public void setGj_hint(String gj_hint) {
            this.gj_hint = gj_hint;
        }

        public String getGj_des() {
            return gj_des;
        }

        public void setGj_des(String gj_des) {
            this.gj_des = gj_des;
        }

        public String getGm_name() {
            return gm_name;
        }

        public void setGm_name(String gm_name) {
            this.gm_name = gm_name;
        }

        public String getGm_hint() {
            return gm_hint;
        }

        public void setGm_hint(String gm_hint) {
            this.gm_hint = gm_hint;
        }

        public String getGm_des() {
            return gm_des;
        }

        public void setGm_des(String gm_des) {
            this.gm_des = gm_des;
        }

        public String getHc_name() {
            return hc_name;
        }

        public void setHc_name(String hc_name) {
            this.hc_name = hc_name;
        }

        public String getHc_hint() {
            return hc_hint;
        }

        public void setHc_hint(String hc_hint) {
            this.hc_hint = hc_hint;
        }

        public String getHc_des() {
            return hc_des;
        }

        public void setHc_des(String hc_des) {
            this.hc_des = hc_des;
        }

        public String getJt_name() {
            return jt_name;
        }

        public void setJt_name(String jt_name) {
            this.jt_name = jt_name;
        }

        public String getJt_hint() {
            return jt_hint;
        }

        public void setJt_hint(String jt_hint) {
            this.jt_hint = jt_hint;
        }

        public String getJt_des() {
            return jt_des;
        }

        public void setJt_des(String jt_des) {
            this.jt_des = jt_des;
        }

        public String getLk_name() {
            return lk_name;
        }

        public void setLk_name(String lk_name) {
            this.lk_name = lk_name;
        }

        public String getLk_hint() {
            return lk_hint;
        }

        public void setLk_hint(String lk_hint) {
            this.lk_hint = lk_hint;
        }

        public String getLk_des() {
            return lk_des;
        }

        public void setLk_des(String lk_des) {
            this.lk_des = lk_des;
        }

        public String getLs_name() {
            return ls_name;
        }

        public void setLs_name(String ls_name) {
            this.ls_name = ls_name;
        }

        public String getLs_hint() {
            return ls_hint;
        }

        public void setLs_hint(String ls_hint) {
            this.ls_hint = ls_hint;
        }

        public String getLs_des() {
            return ls_des;
        }

        public void setLs_des(String ls_des) {
            this.ls_des = ls_des;
        }

        public String getMf_name() {
            return mf_name;
        }

        public void setMf_name(String mf_name) {
            this.mf_name = mf_name;
        }

        public String getMf_hint() {
            return mf_hint;
        }

        public void setMf_hint(String mf_hint) {
            this.mf_hint = mf_hint;
        }

        public String getMf_des() {
            return mf_des;
        }

        public void setMf_des(String mf_des) {
            this.mf_des = mf_des;
        }

        public String getNl_name() {
            return nl_name;
        }

        public void setNl_name(String nl_name) {
            this.nl_name = nl_name;
        }

        public String getNl_hint() {
            return nl_hint;
        }

        public void setNl_hint(String nl_hint) {
            this.nl_hint = nl_hint;
        }

        public String getNl_des() {
            return nl_des;
        }

        public void setNl_des(String nl_des) {
            this.nl_des = nl_des;
        }

        public String getPj_name() {
            return pj_name;
        }

        public void setPj_name(String pj_name) {
            this.pj_name = pj_name;
        }

        public String getPj_hint() {
            return pj_hint;
        }

        public void setPj_hint(String pj_hint) {
            this.pj_hint = pj_hint;
        }

        public String getPj_des() {
            return pj_des;
        }

        public void setPj_des(String pj_des) {
            this.pj_des = pj_des;
        }

        public String getPk_name() {
            return pk_name;
        }

        public void setPk_name(String pk_name) {
            this.pk_name = pk_name;
        }

        public String getPk_hint() {
            return pk_hint;
        }

        public void setPk_hint(String pk_hint) {
            this.pk_hint = pk_hint;
        }

        public String getPk_des() {
            return pk_des;
        }

        public void setPk_des(String pk_des) {
            this.pk_des = pk_des;
        }

        public String getPl_name() {
            return pl_name;
        }

        public void setPl_name(String pl_name) {
            this.pl_name = pl_name;
        }

        public String getPl_hint() {
            return pl_hint;
        }

        public void setPl_hint(String pl_hint) {
            this.pl_hint = pl_hint;
        }

        public String getPl_des() {
            return pl_des;
        }

        public void setPl_des(String pl_des) {
            this.pl_des = pl_des;
        }

        public String getPp_name() {
            return pp_name;
        }

        public void setPp_name(String pp_name) {
            this.pp_name = pp_name;
        }

        public String getPp_hint() {
            return pp_hint;
        }

        public void setPp_hint(String pp_hint) {
            this.pp_hint = pp_hint;
        }

        public String getPp_des() {
            return pp_des;
        }

        public void setPp_des(String pp_des) {
            this.pp_des = pp_des;
        }

        public String getTr_name() {
            return tr_name;
        }

        public void setTr_name(String tr_name) {
            this.tr_name = tr_name;
        }

        public String getTr_hint() {
            return tr_hint;
        }

        public void setTr_hint(String tr_hint) {
            this.tr_hint = tr_hint;
        }

        public String getTr_des() {
            return tr_des;
        }

        public void setTr_des(String tr_des) {
            this.tr_des = tr_des;
        }

        public String getUv_name() {
            return uv_name;
        }

        public void setUv_name(String uv_name) {
            this.uv_name = uv_name;
        }

        public String getUv_hint() {
            return uv_hint;
        }

        public void setUv_hint(String uv_hint) {
            this.uv_hint = uv_hint;
        }

        public String getUv_des() {
            return uv_des;
        }

        public void setUv_des(String uv_des) {
            this.uv_des = uv_des;
        }

        public String getXc_name() {
            return xc_name;
        }

        public void setXc_name(String xc_name) {
            this.xc_name = xc_name;
        }

        public String getXc_hint() {
            return xc_hint;
        }

        public void setXc_hint(String xc_hint) {
            this.xc_hint = xc_hint;
        }

        public String getXc_des() {
            return xc_des;
        }

        public void setXc_des(String xc_des) {
            this.xc_des = xc_des;
        }

        public String getXq_name() {
            return xq_name;
        }

        public void setXq_name(String xq_name) {
            this.xq_name = xq_name;
        }

        public String getXq_hint() {
            return xq_hint;
        }

        public void setXq_hint(String xq_hint) {
            this.xq_hint = xq_hint;
        }

        public String getXq_des() {
            return xq_des;
        }

        public void setXq_des(String xq_des) {
            this.xq_des = xq_des;
        }

        public String getYd_name() {
            return yd_name;
        }

        public void setYd_name(String yd_name) {
            this.yd_name = yd_name;
        }

        public String getYd_hint() {
            return yd_hint;
        }

        public void setYd_hint(String yd_hint) {
            this.yd_hint = yd_hint;
        }

        public String getYd_des() {
            return yd_des;
        }

        public void setYd_des(String yd_des) {
            this.yd_des = yd_des;
        }

        public String getYh_name() {
            return yh_name;
        }

        public void setYh_name(String yh_name) {
            this.yh_name = yh_name;
        }

        public String getYh_hint() {
            return yh_hint;
        }

        public void setYh_hint(String yh_hint) {
            this.yh_hint = yh_hint;
        }

        public String getYh_des() {
            return yh_des;
        }

        public void setYh_des(String yh_des) {
            this.yh_des = yh_des;
        }

        public String getYs_name() {
            return ys_name;
        }

        public void setYs_name(String ys_name) {
            this.ys_name = ys_name;
        }

        public String getYs_hint() {
            return ys_hint;
        }

        public void setYs_hint(String ys_hint) {
            this.ys_hint = ys_hint;
        }

        public String getYs_des() {
            return ys_des;
        }

        public void setYs_des(String ys_des) {
            this.ys_des = ys_des;
        }

        public String getZs_name() {
            return zs_name;
        }

        public void setZs_name(String zs_name) {
            this.zs_name = zs_name;
        }

        public String getZs_hint() {
            return zs_hint;
        }

        public void setZs_hint(String zs_hint) {
            this.zs_hint = zs_hint;
        }

        public String getZs_des() {
            return zs_des;
        }

        public void setZs_des(String zs_des) {
            this.zs_des = zs_des;
        }
    }
}
