package com.igreen.common.model;

/**
 * 地理位置Model
 * @author cuiwei
 *
 */
public class EnvicloudLocation extends EnvicloudBase{
	private Info info;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		result.append("城市名称：").append(info.getCityname_cn()).append("\n");
		result.append("邮政编码：").append(info.getZipcode()).append("\n");
		result.append("电话区号：").append(info.getAreanumber()).append("\n");
		result.append("城市经度：").append(info.getLongitude()).append("\n");
		result.append("城市纬度：").append(info.getLatitude()).append("\n");
		result.append("城市海拔(m)：").append(info.getAltitude()).append("\n");
		return result.toString();
	}
}

class Info{
	private String citycode;
	private String countyname_cn;
	private String countyname_en;
	private String cityname_cn;
	private String cityname_en;
	private String provincename_cn;
	private String provincename_en;
	private String nationname_cn;
	private String nationname_en;
	private String citylevel;
	private String zipcode;
	private String areanumber;
	private String uptime;
	private String longitude;
	private String latitude;
	private String altitude;

	public String getCountyname_en() {
		return countyname_en;
	}

	public void setCountyname_en(String countyname_en) {
		this.countyname_en = countyname_en;
	}

	public String getCityname_cn() {
		return cityname_cn;
	}

	public void setCityname_cn(String cityname_cn) {
		this.cityname_cn = cityname_cn;
	}

	public String getCityname_en() {
		return cityname_en;
	}

	public void setCityname_en(String cityname_en) {
		this.cityname_en = cityname_en;
	}

	public String getProvincename_cn() {
		return provincename_cn;
	}

	public void setProvincename_cn(String provincename_cn) {
		this.provincename_cn = provincename_cn;
	}

	public String getProvincename_en() {
		return provincename_en;
	}

	public void setProvincename_en(String provincename_en) {
		this.provincename_en = provincename_en;
	}

	public String getNationname_cn() {
		return nationname_cn;
	}

	public void setNationname_cn(String nationname_cn) {
		this.nationname_cn = nationname_cn;
	}

	public String getNationname_en() {
		return nationname_en;
	}

	public void setNationname_en(String nationname_en) {
		this.nationname_en = nationname_en;
	}

	public String getCitylevel() {
		return citylevel;
	}

	public void setCitylevel(String citylevel) {
		this.citylevel = citylevel;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAreanumber() {
		return areanumber;
	}

	public void setAreanumber(String areanumber) {
		this.areanumber = areanumber;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountyname_cn() {
		return countyname_cn;
	}

	public void setCountyname_cn(String countyname_cn) {
		this.countyname_cn = countyname_cn;
	}
}
