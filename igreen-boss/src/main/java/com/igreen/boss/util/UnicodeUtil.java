package com.igreen.boss.util;

import java.io.UnsupportedEncodingException;

public class UnicodeUtil {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String tstr= "%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%28296312%2C0%29%3B%22%3E%3Ctd%3E1%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5929%u6D25%u5E02%u6280%u672F%u7269%u7406%u7814%u7A76%u6240%22%3E%u5929%u6D25%u5E02%u6280%u672F%u7269%u7406%u7814%u7A76%u6240%3C/td%3E%3Ctd%3E%u5357%u5F00%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5929%u6D25%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103480%2C0%29%3B%22%3E%3Ctd%3E2%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5929%u6D25%u5E02%u4E1C%u4E3D%u533A%u5BCC%u5609%u6728%u95E8%u5382%22%3E%u5929%u6D25%u5E02%u4E1C%u4E3D%u533A%u5BCC%u5609%u6728%u95E8%u5382%3C/td%3E%3Ctd%3E%u4E1C%u4E3D%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5929%u6D25%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103430%2C0%29%3B%22%3E%3Ctd%3E3%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u91CD%u5E86%u6866%u5BCC%u5EFA%u7B51%u52B3%u52A1%u6709%u9650%u516C%u53F8%22%3E%u91CD%u5E86%u6866%u5BCC%u5EFA%u7B51%u52B3%u52A1%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5DF4%u5357%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u91CD%u5E86%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103429%2C0%29%3B%22%3E%3Ctd%3E4%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u91CD%u5E86%u4E09%u4E30%u533B%u7597%u5668%u68B0%u6709%u9650%u516C%u53F8%22%3E%u91CD%u5E86%u4E09%u4E30%u533B%u7597%u5668%u68B0%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5DF4%u5357%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u91CD%u5E86%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103428%2C0%29%3B%22%3E%3Ctd%3E5%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u91CD%u5E86%u7F8E%u521B%u673A%u68B0%u5236%u9020%u6709%u9650%u516C%u53F8%22%3E%u91CD%u5E86%u7F8E%u521B%u673A%u68B0%u5236%u9020%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5DF4%u5357%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u91CD%u5E86%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103426%2C0%29%3B%22%3E%3Ctd%3E6%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u91CD%u5E86%u52B2%u950B%u673A%u68B0%u5236%u9020%u6709%u9650%u516C%u53F8%22%3E%u91CD%u5E86%u52B2%u950B%u673A%u68B0%u5236%u9020%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5DF4%u5357%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u91CD%u5E86%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%28576363%2C0%29%3B%22%3E%3Ctd%3E7%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u91CD%u5E86%u7267%u7530%u6469%u6258%u8F66%u914D%u4EF6%u6709%u9650%u516C%u53F8%22%3E%u91CD%u5E86%u7267%u7530%u6469%u6258%u8F66%u914D%u4EF6%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5DF4%u5357%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u91CD%u5E86%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103271%2C0%29%3B%22%3E%3Ctd%3E8%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u51C0%u6708%u9AD8%u65B0%u6280%u672F%u4EA7%u4E1A%u5F00%u53D1%u533A%u5510%u7C0B%u79C1%u623F%u83DC%u9986%22%3E%u51C0%u6708%u9AD8%u65B0%u6280%u672F%u4EA7%u4E1A%u5F00%u53D1%u533A%u5510%u7C0B%u79C1%u623F%u83DC%u9986%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103270%2C0%29%3B%22%3E%3Ctd%3E9%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u957F%u6625%u7ECF%u6D4E%u6280%u672F%u5F00%u53D1%u533A%u946B%u53D1%u7EB8%u5236%u54C1%u5382%22%3E%u957F%u6625%u7ECF%u6D4E%u6280%u672F%u5F00%u53D1%u533A%u946B%u53D1%u7EB8%u5236%u54C1%u5382%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103269%2C0%29%3B%22%3E%3Ctd%3E10%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u957F%u6625%u7ECF%u6D4E%u6280%u672F%u5F00%u53D1%u533A%u5BCC%u8D35%u8C46%u5236%u54C1%u5382%22%3E%u957F%u6625%u7ECF%u6D4E%u6280%u672F%u5F00%u53D1%u533A%u5BCC%u8D35%u8C46%u5236%u54C1%u5382%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103268%2C0%29%3B%22%3E%3Ctd%3E11%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u7EFF%u56ED%u533A%u5409%u54C1%u6C5F%u57CE%u8001%u80D6%u70E7%u70E4%u5E97%22%3E%u7EFF%u56ED%u533A%u5409%u54C1%u6C5F%u57CE%u8001%u80D6%u70E7%u70E4%u5E97%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103267%2C0%29%3B%22%3E%3Ctd%3E12%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u7EFF%u56ED%u533A%u5C0F%u5149%u5934%u5E72%u9505%u8FA3%u9E2D%u5934%u9986%22%3E%u7EFF%u56ED%u533A%u5C0F%u5149%u5934%u5E72%u9505%u8FA3%u9E2D%u5934%u9986%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103266%2C0%29%3B%22%3E%3Ctd%3E13%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u7EFF%u56ED%u533A%u5FB7%u548C%u6E90%u5DDD%u83DC%u9986%22%3E%u7EFF%u56ED%u533A%u5FB7%u548C%u6E90%u5DDD%u83DC%u9986%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281103265%2C0%29%3B%22%3E%3Ctd%3E14%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u7EFF%u56ED%u533A%u8700%u9053%u4EBA%u5BB6%u706B%u9505%u57CE%22%3E%u7EFF%u56ED%u533A%u8700%u9053%u4EBA%u5BB6%u706B%u9505%u57CE%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281103264%2C0%29%3B%22%3E%3Ctd%3E15%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u7EFF%u56ED%u533A%u4E30%u56ED%u697C%u94C1%u9505%u7096%u83DC%u9986%22%3E%u7EFF%u56ED%u533A%u4E30%u56ED%u697C%u94C1%u9505%u7096%u83DC%u9986%3C/td%3E%3Ctd%3E%u957F%u6625%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5409%u6797%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E";
		String tstr = "%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281107420%2C0%29%3B%22%3E%3Ctd%3E1%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u671D%u9633%u548C%u5149%u65B0%u80FD%u6E90%u6709%u9650%u516C%u53F8%22%3E%u671D%u9633%u548C%u5149%u65B0%u80FD%u6E90%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107419%2C0%29%3B%22%3E%3Ctd%3E2%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u671D%u9633%u5E02%u9F99%u57CE%u533A%u7ECF%u7EAC%u6C34%u6D17%u5E97%22%3E%u671D%u9633%u5E02%u9F99%u57CE%u533A%u7ECF%u7EAC%u6C34%u6D17%u5E97%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%28619163%2C0%29%3B%22%3E%3Ctd%3E3%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u51CC%u6E90%u5E02%u745E%u4E30%u94F8%u9020%u6709%u9650%u516C%u53F8%22%3E%u51CC%u6E90%u5E02%u745E%u4E30%u94F8%u9020%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107418%2C0%29%3B%22%3E%3Ctd%3E4%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u51CC%u6E90%u5E02%u5409%u9686%u94F8%u9020%u6709%u9650%u8D23%u4EFB%u516C%u53F8%22%3E%u51CC%u6E90%u5E02%u5409%u9686%u94F8%u9020%u6709%u9650%u8D23%u4EFB%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%2889325%2C0%29%3B%22%3E%3Ctd%3E5%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u51CC%u6E90%u5E02%u5BCC%u6E90%u77FF%u4E1A%u6709%u9650%u8D23%u4EFB%u516C%u53F8%22%3E%u51CC%u6E90%u5E02%u5BCC%u6E90%u77FF%u4E1A%u6709%u9650%u8D23%u4EFB%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107417%2C0%29%3B%22%3E%3Ctd%3E6%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5EFA%u5E73%u53BF%u57CE%u5E02%u751F%u6D3B%u5783%u573E%u536B%u751F%u586B%u57CB%u5904%u7406%u573A%22%3E%u5EFA%u5E73%u53BF%u57CE%u5E02%u751F%u6D3B%u5783%u573E%u536B%u751F%u586B%u57CB%u5904%u7406%u573A%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%2849811%2C0%29%3B%22%3E%3Ctd%3E7%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5EFA%u5E73%u70ED%u7535%u6709%u9650%u8D23%u4EFB%u516C%u53F8%22%3E%u5EFA%u5E73%u70ED%u7535%u6709%u9650%u8D23%u4EFB%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2017%3C/td%3E%3Ctd%3E9%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107416%2C0%29%3B%22%3E%3Ctd%3E8%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5EFA%u5E73%u7EA2%u5C71%u70ED%u529B%u6709%u9650%u516C%u53F8%22%3E%u5EFA%u5E73%u7EA2%u5C71%u70ED%u529B%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281107414%2C0%29%3B%22%3E%3Ctd%3E9%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5764%u6CF0%uFF08%u671D%u9633%uFF09%u65B0%u80FD%u6E90%u6295%u8D44%u6709%u9650%u516C%u53F8%22%3E%u5764%u6CF0%uFF08%u671D%u9633%uFF09%u65B0%u80FD%u6E90%u6295%u8D44%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107411%2C0%29%3B%22%3E%3Ctd%3E10%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u671D%u9633%u660A%u878D%u65C5%u6E38%u5F00%u53D1%u6709%u9650%u516C%u53F8%22%3E%u671D%u9633%u660A%u878D%u65C5%u6E38%u5F00%u53D1%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u671D%u9633%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u8FBD%u5B81%3C/span%3E%3C/td%3E%3Ctd%3E2016%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%28218484%2C0%29%3B%22%3E%3Ctd%3E11%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5E7F%u5DDE%u5E02%u516D%u76DB%u9910%u996E%u6709%u9650%u516C%u53F8%22%3E%u5E7F%u5DDE%u5E02%u516D%u76DB%u9910%u996E%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5E7F%u5DDE%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5E7F%u4E1C%3C/span%3E%3C/td%3E%3Ctd%3E2015%3C/td%3E%3Ctd%3E2%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%28219818%2C0%29%3B%22%3E%3Ctd%3E12%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5E7F%u5DDE%u4E00%u76C5%u4E24%u4EF6%u996E%u98DF%u6709%u9650%u516C%u53F8%22%3E%u5E7F%u5DDE%u4E00%u76C5%u4E24%u4EF6%u996E%u98DF%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5E7F%u5DDE%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5E7F%u4E1C%3C/span%3E%3C/td%3E%3Ctd%3E2015%3C/td%3E%3Ctd%3E2%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281107409%2C0%29%3B%22%3E%3Ctd%3E13%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5E7F%u5DDE%u5E02%u8D8A%u79C0%u533A%u7EFF%u5B9D%u77F3%u9910%u5385%22%3E%u5E7F%u5DDE%u5E02%u8D8A%u79C0%u533A%u7EFF%u5B9D%u77F3%u9910%u5385%3C/td%3E%3Ctd%3E%u5E7F%u5DDE%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5E7F%u4E1C%3C/span%3E%3C/td%3E%3Ctd%3E2015%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20onclick%3D%22locationUrl%281107408%2C0%29%3B%22%3E%3Ctd%3E14%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5E7F%u5DDE%u5357%u822A%u660E%u73E0%u5546%u52A1%u9152%u5E97%22%3E%u5E7F%u5DDE%u5357%u822A%u660E%u73E0%u5546%u52A1%u9152%u5E97%3C/td%3E%3Ctd%3E%u5E7F%u5DDE%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5E7F%u4E1C%3C/span%3E%3C/td%3E%3Ctd%3E2015%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E%3Ctr%20class%3D%22even%22%20onclick%3D%22locationUrl%281107407%2C0%29%3B%22%3E%3Ctd%3E15%3C/td%3E%3Ctd%20class%3D%22text-left%22%20title%3D%22%u5E7F%u5DDE%u5E02%u81E3%u798F%u9F99%u9910%u996E%u6709%u9650%u516C%u53F8%22%3E%u5E7F%u5DDE%u5E02%u81E3%u798F%u9F99%u9910%u996E%u6709%u9650%u516C%u53F8%3C/td%3E%3Ctd%3E%u5E7F%u5DDE%20/%20%3Cspan%20class%3D%22text-prov%22%3E%u5E7F%u4E1C%3C/span%3E%3C/td%3E%3Ctd%3E2015%3C/td%3E%3Ctd%3E1%3C/td%3E%3C/tr%3E";
		tstr = tstr.replaceAll("%u","\\\\u");
		
		System.out.println(fromUnicode(getURLDecoderString(tstr)));
		
		System.out.println(getURLDecoderString(tstr));
	}
	
	public static String parseHtml(String htmlstr){
		htmlstr = htmlstr.replaceAll("%u","\\\\u");
		return fromUnicode(getURLDecoderString(htmlstr));
	}
	
	public static String fromUnicode(String str) {

		return fromUnicode(str.toCharArray(), 0, str.length(), new char[1024]);

		}
	public static String fromUnicode(char[] in, int off, int len, char[] convtBuf) {

		if (convtBuf.length < len) {

		int newLen = len * 2;

		if (newLen < 0) {

		newLen = Integer.MAX_VALUE;

		}

		convtBuf = new char[newLen];

		}

		char aChar;

		char[] out = convtBuf;

		int outLen = 0;

		int end = off + len;

		 

		         while (off < end) {

		aChar = in[off++];

		if (aChar == '\\') {

		aChar = in[off++];

		if (aChar == 'u') {

		// Read the xxxx

		int value = 0;

		for (int i = 0; i < 4; i++) {

		aChar = in[off++];

		switch (aChar) {

		case '0':

		case '1':

		case '2':

		case '3':

		case '4':

		case '5':

		case '6':

		case '7':

		case '8':

		case '9':

		value = (value << 4) + aChar - '0';

		break;

		case 'a':

		case 'b':

		case 'c':

		case 'd':

		case 'e':

		case 'f':

		value = (value << 4) + 10 + aChar - 'a';

		break;

		case 'A':

		case 'B':

		case 'C':

		case 'D':

		case 'E':

		case 'F':

		value = (value << 4) + 10 + aChar - 'A';

		break;

		default:

		throw new IllegalArgumentException(

		"Malformed \\uxxxx encoding.");

		}

		}

		out[outLen++] = (char) value;

		} else {

		if (aChar == 't') {

		aChar = '\t';

		} else if (aChar == 'r') {

		aChar = '\r';

		} else if (aChar == 'n') {

		aChar = '\n';

		} else if (aChar == 'f') {

		aChar = '\f';

		}

		out[outLen++] = aChar;

		}

		} else {

		out[outLen++] = (char) aChar;

		}

		}

		return new String(out, 0, outLen);

		}
	public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
