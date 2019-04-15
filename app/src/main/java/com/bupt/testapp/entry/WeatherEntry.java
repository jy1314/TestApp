package com.bupt.testapp.entry;
/*
* @author Jerry
* create at 2019/4/14 下午11:33
* description:天气类实体，解析天气信息
*/
public class WeatherEntry {

    /**
     * weatherinfo : {"city":"北京","cityid":"101010100","temp1":"24℃","temp2":"11℃","weather":"雷阵雨转多云","img1":"d4.gif","img2":"n1.gif","ptime":"11:00"}
     */

    private WeatherinfoBean weatherinfo;

    public WeatherinfoBean getWeatherinfo() {
        return weatherinfo;
    }

    public void setWeatherinfo(WeatherinfoBean weatherinfo) {
        this.weatherinfo = weatherinfo;
    }

    @Override
    public String toString() {
        return weatherinfo.toString();
    }

    public static class WeatherinfoBean {
        /**
         * city : 北京
         * cityid : 101010100
         * temp1 : 24℃
         * temp2 : 11℃
         * weather : 雷阵雨转多云
         * img1 : d4.gif
         * img2 : n1.gif
         * ptime : 11:00
         */

        private String city;
        private String cityid;
        private String temp1;
        private String temp2;
        private String weather;
        private String img1;
        private String img2;
        private String ptime;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getTemp1() {
            return temp1;
        }

        public void setTemp1(String temp1) {
            this.temp1 = temp1;
        }

        public String getTemp2() {
            return temp2;
        }

        public void setTemp2(String temp2) {
            this.temp2 = temp2;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getImg1() {
            return img1;
        }

        public void setImg1(String img1) {
            this.img1 = img1;
        }

        public String getImg2() {
            return img2;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        @Override
        public String toString() {
            return "城市 ：" + city +" 天气：" + weather + " 最高温度：" + temp1 + " 最低温度：" + temp2;
        }
    }
}
