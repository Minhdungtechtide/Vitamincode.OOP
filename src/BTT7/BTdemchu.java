package BTT7;

public class BTdemchu {
        public static void main(String[] args) {
            String name = "Lớp Học VitaminCode01";
            int demchuA = 0;
            int demchuB = 0;
            int demchuC = 0;

            for (int i = 0; i < name.length(); i++) {
                char chu = name.charAt(i);
                if (chu == 'a' || chu == 'A') {
                    demchuA++;
                } else if (chu == 'b' || chu == 'B') {
                    demchuB++;
                } else if (chu == 'c' || chu == 'C') {
                    demchuC++;
                }
            }
            System.out.println("Số lần xuất hiện của chữ 'a' và 'A' trong chuỗi là: " + demchuA);
            System.out.println("Số lần xuất hiện của chữ 'b' và 'B' trong chuỗi là: " + demchuB);
            System.out.println("Số lần xuất hiện của chữ 'c' và 'C' trong chuỗi là: " + demchuC);
        }
    }
