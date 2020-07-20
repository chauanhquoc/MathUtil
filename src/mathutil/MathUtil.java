/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static quoc.util.MathUtil.computeFactorial;

/**
 *
 * @author chaua
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        // tao muốn biết xem 5! chạy đúng không  
        // vậy tao in kết quả xử lí của hàm ra (actual value)
        //tao so sánh nó coi có bằng 120 mà tao tính trước không (experted value)
        // nếu hàm có 1 value trả về (actual - giả sử 120)
        // và khớp với cái tui cần nó phải thế (experted - giả sử mình cần hàm trả về 120)
        // actual khớp với experted, hàm chạy như mong đợi, hàm chạy đúng 
        // testing chẳng qua là chạy app, chạy hàm, coi kết quả trả về có đúng như mình mong đợi hay không - actual và expected là như nhau 
        // nếu không khớp, code có bug, hoặc mình kì vọng sai

        //expected: 1 
        System.out.println("1! = " + computeFactorial(1));
        //expected: 720 
        System.out.println("6! = " + computeFactorial(6));
        //expected: 1 
        System.out.println("0! = " + computeFactorial(0));

        // cách test kiểu này phải:
        // -chuẩn bị data đầu vào
        // -gọi hàm với data đầu vào
        // -tính trước kq trả về (expected)
        // -so sánh kq trả về từ hàm (actual) với expected = mắt
        // -tự đưa ra kết luận => luận hàm bằng mắt
        
        //expected: exception 
        System.out.println("-5! = " + computeFactorial(-5));
        
        // kĩ thuật dùng mắt đối chiếu kết quả ỔN, Nhưng KHÔNG HIỆU QUẢ
        // vì máy có thể đối chiếu kq được luôn mà, máy so được expected và actual 
        // đưa ra 1 bộ thư viện, 1 framework giúp mình tự động so sánh 2 kết quả expected và actual
        // framework này sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng hàm chạy đúng, màu xanh
        // hàm chạy sai, không như kì vọng màu đỏ
        // áp dụng cho 1 loạt data đầu vào 
        
        
    }

}
