package pingAnZuLin.encryption;

/**
 * 非对称加密
 */
public class Asymmertic {
    /**
     * RSA算法
     * @param baseNum 基数
     * @param key 公钥或密钥
     * @param message 加密或者解密的数据
     * @return
     */
    public static long rsa(int baseNum, int key, long message){
        if(baseNum < 1 || key < 1){
            return 0L;
        }
        //加密或者解密之后的数据
        long rsaMessage = 0L;
        double pow = Math.pow(message, key);
        System.out.println("pow="+pow);
        long round = Math.round(pow);
        System.out.println("roud="+round);
        //核心算法
        rsaMessage = Math.round(Math.pow(message, key)) % baseNum;
        return rsaMessage;
    }

    public static void main(String[] args){
        //基数
        int baseNum = 3 * 11;
        //公钥
        int keyPublic = 3;
        //密钥
        int keyPrivate = 7;
        //未加密的数据
        long msg = 24L;
        //获得公钥加密后的数据
        long encodeMsg = rsa(baseNum, keyPublic, msg);
        //获得私钥解密后的数据
        long decodeMsg = rsa(baseNum, keyPrivate, encodeMsg);

        System.out.println("加密前：" + msg);
        System.out.println("加密后：" + encodeMsg);
        System.out.println("解密后：" + decodeMsg);
    }
}
