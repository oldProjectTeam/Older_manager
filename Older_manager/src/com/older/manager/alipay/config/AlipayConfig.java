package com.older.manager.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016080800192663";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCJmKoCuBcOmcyd8Lks0zRfXccIN4jdf8TylMj2yki0xqFtNPYgdvYwSgAj2HyV/qTxG5hmCNIn/vygPChXVLo/j2Le5lPOEMM486SPF6ie5yfaCZx5JxUBsxVxytN07OtP5xpL3622wHSGmioIttu1gmT9JSO3agdEOR/lfFXFxH5ONwAK2Zu/pPAEbdZMh8aNkSkFnuNt4my/EaAKExP3LXDhjdTeebszUjVXSdrgy2EAZctciiyujA+SRCvRuU+C4tzM7FPPAuuIvT0/d2EjWMGsIIdGMooqj1tvB9ttPXaedaJy8TBe1Gtxp9qlGvZBfcH4Ml49h5wpcJEyVcxrAgMBAAECggEBAIGWL/ejnMN5gcX14tAekaKHVV2dv96r6LZ1/da/qD3pHDsXt/3XTAEqkHsx9hPl4T3aOWtPP22/rfjS70NgXpBh4EIBNkhKbTID9KV3KK2PEm88wgswDY6uNLIYzZG/V9bG1nNC0/3bv2LNam0OmlmV1rq68apZx0IvcqTUtossEyt9GWzy6Q+EigBE349AwV7PbveymrYUUWVsRweQIuJw/yevHfq6VLJjVEDkk0jkQyaU4FrGysvuJKbGU2q5gI/H8H6OeA6Y0Rz/MRjXkH8T2tMjgfbrnxrR7HwPTzhYAyldHBLEQCBCauTHz18Vd/WO7SD930DUslVIFAsbJUECgYEA/5tGRXKRBXQLaNL6p3WPYdSCMQBm2WyOsY+gw/ms0bRet0z0KKF9KA+JCcOYxGTGgJqJ3txz7W6BnYetamej6RVVES6cTVdH3wFmvPbZ9XH9OxEU+yOfcJFX2WYumccU7VUpPSfIYhaFJzd/TZmgXJoR7Bx2tr+5EfWmuoxLiXsCgYEAic7izj8CMYfw66/XVzQ1K5QiCEIAAt5RGpC2YVx6jjOgsBq95kwh6gNXy9clNmHGVILs8RsLvz42QjUD3L4vd36IPqWPBFTWURCbSPZhmzazzep2aSCV4PklsU8vXT2TLIPFRKs5t1PN+uihMlL9JYydlmZiVpOZQSvBxR2k/dECgYBKTG5OvZCeDy9J1xn5F1kITOdTKxS6Wq3XuzI2BRtREab+jSXjsZ1ZybpB1lNPsyNoOoOc/mPMPnT6v3ePGHUyyXqitfPFH3vKvPOKNg8BI5NCWiLJJX+xDu6ESQl+tbnFix2joy7CJF2sGpusiN1uTXKsOVHgqTY4nDlMvH8whQKBgEenRs6ufFl8sYwalgFFqA/MqhVZG+Bh8BG8BNiC2UZvGbH3dZ31H/0pV9EpQLQSCqmOmdyTj3wUwOmT3zo7uTqMlBLeyooaAoWL+PHrCb1GqB79NixbQRME+NBEt//nMEsJCN03mn70GDnKE2azN+T6REYbXi5d+GWmds4jJ9LBAoGBAPDEXPm3OlzowBv3lJKqYBlfYwdE513JfrpZP84GdhJJ/mcu8bo1rplLqTNSSDIalECt5vH4qg/uw90N4b59ESw/o13VxqEt15soqyj8yzk08pdAABsBD3TFPwsSdhqH7C1vnhQIOMlYukV0yiT5uoOxakBQz0QxVJsKE180nA60";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOC"
			+ "AQ8AMIIBCgKCAQEArx81cEyq6Cf7+Wwyd1xT8io68AnsrCPm+ptoG0JoDNFcxGIHxX"
			+ "wpHcTRiA+Mb976025krBWgiPwKXkHR5vSvTWbbsNFF1YII4fCz5rreGMwFiq1yuiUEm"
			+ "suY6FXcfxKas/WiwkkckMeyIWQH/qHKfibfk/uzaNcgn4M0VYaZKACdxtHCnG6PkNO++6z"
			+ "YQPD2GNs96IsnWiatsMrQaSpFzGZK4picjqlKKlcXJnhsED3hU1S6lG4edn7ORIDHvm"
			+ "8eWcJ/FXCvgo1lHrZmz7MfzDeV3FIN4rh/zOHVtUNx2WupDh3U19uaHeCCci9Fy59wgu/1l"
			+ "y8PDdCpmIkagXoMfQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://z6we6j.natappfree.cc/Older_manager/order/notifyUrl";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://z6we6j.natappfree.cc/Older_manager/order/returnUrl";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "\\alipay_log\\shopping1_Log.txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

