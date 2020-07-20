/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quoc.util;

/**
 *
 * @author chaua
 */
//class chứa các hàm toán học ta tự viêt, công cụ 
//xài chung mọi nơi. cái gì mà được thiết kế sài chung 
//dùng kĩ thuật STATIC
public class MathUtil {

    // long for 15! largest number
    public static long computeFactorial(int n) {
        // nếu ng dùng nhập sai, ném ngoại lệ
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid argument, n must be >=0 and n<=15");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
