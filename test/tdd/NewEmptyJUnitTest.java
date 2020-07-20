/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import quoc.util.MathUtil;

/**
 *
 * @author chaua
 */
public class NewEmptyJUnitTest {

    //đây là class đb, chứa các hàm, mà mỗi hàm dùng để test các hàm bên class của dự án, ví dụ test hàm cF() coi chạy đúng không
    //mỗi hàm sẽ chạy 1 hoặc nhiều lệnh cF() tùy bạn, để kiểm tra coi actual có khớp với expected hay 
    @Test
    public void testSuccessfulCase() {
        assertEquals(1, MathUtil.computeFactorial(1));

        assertEquals(1, MathUtil.computeFactorial(0));

        assertEquals(2, MathUtil.computeFactorial(2));

        assertEquals(6, MathUtil.computeFactorial(3));

        assertEquals(6, MathUtil.computeFactorial(3));

        assertEquals(720, MathUtil.computeFactorial(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testfailedCase() {
        MathUtil.computeFactorial(-5);
    }
}
