//public class Main {
//    public static void main(String args[]){
//packet sort;
//public class sort {
//    public static void printArray(int n, int[] a)
//    public static void insertionSort(int[] a) {int n = a.length;
//            int n = a.length;
//            for(int i=1;i<n;i++){
//            int key = a[i];
//            int j = i - 1;
//            while (j >= 0 && a[j] > key) {
//                a[j] = a[j + 1];
//                key = a[j];
//                j--;
//            }
//        }
//    }
//}


//        System.out.println(">>> HEllo vitamincode");
//    }
//}


//Java Development Kit
// JDK , JRE, JUM
// chỉ chạy duy nhất trong hàm main() và tất cả thực thể khác phải được main gọi ra
// chạy từ trên xuống dưới , từ trái sang phải
// 1.public static void main(string args[]) {....}
// public là access modifier (Phạm vi truy cập) -> 4 đặc tính của java ( Huóng đối tượng)
// static tĩnh ( đúng trước phương thức, thuộc tính, biến là phương thức,thuộc tính, biến tĩnh )
// là khi được khởi tạo và kết thúc không bị tác động bên ngoài
// Void là kiểu trả về
// Nếu là int , double , string thì trả về kiểu dữ liệu tương ứng
// Main tên của hàm -> Main đóng vai trò qtrong ( Không thể thay đổi ), là một key, báo cho zibien chạy rồi , khởi tạo 1 vùng nhớ
// (string args[]) là một tham số ( các đối số ), sử dụng được các thiết bị đầu nối ( Đầu vào ) . cho phép nhận các dữ liệu đầu vào ( CHuột, bàn phím )
//{....} là đoạn code

// Java core
// 1. KHai báo biến Varriables ,kiểu dữ liệu strings, Loops( Vòng lặp), array , Auto boxing ( wrapper class )
// 2. Tư duy lập trình hướng đối tượng classes/ Objects - OOP :
// -> Khai báo classes , tạo đối tượng , access modifier : Public , private , protected , Encapsulation : getter/ setter ( Tính che giấu bảo vệ dữ liệu )
// 3. Tư duy kế thừa Inheritnaces : Implements ( Interfaces ), Extends ( nếu dùng class ), Polymorphism ( Tính đa hình )
// 4. I/O streams : Files/ Path
// xuyên suốt học quá trình cơ bản sẽ học nâng cao ví duj nhuư là
// Advanced
// 1.Arraylist ( Collections )
// 2. Generic
// 3. Multi threading ( Đa luồng )

// lý thuyết Java
// 1991 : Ra đời với tên gọi Oak bởi Sun Microsystem
// 1995 : Đổi tên thành Java ( Tên của hòn đảo trông cà phê tại indonesia
// 2010 : Oracle mua lại
// Đặc điểm :
// Write once, run anywhere ( Viết 1 lần , có thể chạy trên nhiều môi trường khác ( windows, macos, linus,...)
// Đặc điểm nổi bật :
//- Hướng đối tượng ( OOP )
// - Chạy trên mọi nền tảng
// - Bảo mật cao
// - Đa luồng...

// Java có thể làm các sản phẩm
// - Mobie app, game -> android
// web app
// Embedded devices ( Nhúng ) : atm , tivi, tủ lạnh ,....
// JDK : Java developer kit ( Muốn phát triển mới tải ) ( Bộ công cụ phát triển Java)
// Bao gồm : JRE : Java Runtimes Enviroment -> class ( sẽ cung cấp thư viện cho JVM chạy ) + chứa các thư viện : JDBC
// JVM : Java virtual Machine ( Máy ảo Java) Nó sẽ chuyển đổi bytecode sang mã máy 010100001 ( Nhờ nó nên mới chạy được trên mọi nền tảng )
// Byte code -> mã máy 010110
// Nhờ có quá trình dịch code nên mới có câu
// IDE có kiểu gõ tắt
// -> JDK chứa bao gồm : JRE ( MUốn chạy thì chỉ cần tại này ) , JVM

// trong xây dựng : delta là cho phép sai số
// hằng số là không thay đổi được ( bên Java gọi là final)

// Loại dữ liệu Java data types
// PRIMATIVE : Dữ liệu nguyên thủy ( Primitive data types ) : bype , short, int , long , float, double, boolean , char
// -> Biến mà chỉ chứa giá trị thì là Nguyên thủy
// Được lưu trự ở vùng nhớ nhất định
//  Wrapper : Dữ liệu không nguyên thủy : String, Arrays and classes ( là kiểu dữ liệu dựa trên phát triển của số làm tròn xuống (1,5 -> 1))
//-int ---- Integer
//-float--- Float
//double---Double
// khi chấm Double A= 1.5;
//                  A.intValue
// Cách lưu trữ v

// Stringpool : pool là bể bơi , là sẽ chứa String trong cái bể
// Có 2 cách tạo string :
// String kq = "Dung";
// String kq = new String(orginal: "Dung");
// Heap lưu tên biến
//stack lưu địa chỉ

// Độ ưu tiên của phép tử cộng hơn phép bằng ==

// int được bao bọc bởi dữ liệu duoble
// 1,1 -> Double -> not int
// 1,0 -> Double -> is int

// đối với for thì mình biết trước số lần lặp

// While không cần biết trước hoặc biết trước vòng lặp --> check --(true)> Do

// Do while ( có thể biết trước hoặc không beiets trước vòng lặp ) -> Do --> check --(true)> Do

//So sánh giữa 2 hàm Không
// equal là so sánh giữa 2 đối tượng ( so sánh giá trị )
// == so sánh có cùng trỏ cùng địa chỉ không
// Wrapper ( không nguyên thủy ) thì vẫn chứa dữ liệu và còn kèm theo giữa các hàm lưu trữ , và các hàm hỗ trợ nó ( so sánh )
// i++ -> thời điểm hiện tại trước, khi chưa gọi lại thằng i , khi được gọi lại 1 lần nữa mới +
// ++i -> cộng trước khi gọi
//i++ chạy rồi mới cộng
//++i cộng ngay lúc chạy

// java có mấy kiểu dữ liệu
// Sự
// Khi nào áp dụng thằng này , khi nào áp dụng thằng kia ,cách nào tối ưu hơn
// nhẹ hơn , không có phương thức =>
// cần tính toán dựa vào dữ liệu số nguyên , áp dụng kiểu wapper vào qli cho tốt
// Hiệu suất (optimize => tối ưu hóa code )
// System có 3 kiểu : print, println ( line : Xuống dòng ), printf ("%s","....")

// Dòng lặp for
// for(int i = 0 ; i < 5 ; i=i+2)
// start
// condition
//step

//for each thì sẽ dùng cho những thg đối tượng

// trong vòng lặp while
// Khi điều kiện đúng mới chạy code bên trong
// while (true)

// do {
//
//  }while (true)
// Nếu sai thì thoát khỏi vòng lặp

// continue thì bỏ qua

//+ Security
//+ MPA JS/Html/css
//+ SPA -> VueJs
//+ OOP -> JDBC
//+ power BI -> Data Visualization ( trực quan hóa dữ liệu )

// break thoát khỏi vòng lặp
// continue thoát ra cái lần lần đó thực thi tiếp

// Java chỉ là một biến object nên sẽ lưu trữ khác vs lưu trữ biến thông thường


// Cấu trúc dữ liệu và giải thuật
// Cấu trúc dữ liệu là những cách mà ng ta  lưu trữ dữ liệu vào bộ nhớ
// Giải thuật là tìm cách tối ưu nhất để lưu dữ liệu đỡ tốn bộ nhớ để java hoạt động tối ưu đỡ tốn bộ nhớ
// chính vì enzym ( java có thể chịu được hệ thống lớn ,  cơ chế dọn rác và cơ chế tối ưu của java )
// heap và stack :
// Giải toán là tập hợp hữu hạn giúp giải quyết 1 bài toán



//Array giúp chúng ta lưu trữ " nhiều giá trị " bên trong 1 biến duy nhất
// -> Gồm 2 thành phần giá trị của nó lưu trị ,  trị số của nó (index)
// VD : Phải gán giá trị :
// import java.util.Arrays;
// String[] clus = {"MU" , "mancity"," ....};
// System.oyt.println("Run array " +Arrays.toString(clus));

// Array mảng là tập hợp các phần tử có cùng phần tử

// Các thuật toàn sắp xếp cơ bản ( Sorting )
//1. Bubble sort ( Sắp xếp nổi bọt )
//2. Insertion Sort ( Sắp xếp chèn )
//3. Selection sort ( Sắp xếp chọn )

// Bubble sort ( Sắp xếp nổi bọt )
// Index là thứ tự đếm tưf đầu mảng đến cuối mảng bắt đầu từ 0
// Môi vòng lặp sẽ tìm ra được thằng lớn nhất , nên cách từ lớn nhất ra -1
// 1.Chạy từ đầu đến cuối mảng ( Có vòng lặp )
// 2.Nếu phần tử ở trước lớn hơn thì đổi chỗ
// 3. Sau mỗi vòng lặp thì phần tử lớn nhất sẽ đứng cuối mảng
// VD : public static Printarray(int n,int[] a)
//      public static void Bubble sort(int[] a) {
//          int n =a.length;
//          for(int i=0; i<n-1; i++){    ( i chỉ trỏ tới thằng kế cuối nên n-1)
//              for(int j=0; j<n-i-1; j++){  ( n-i-1 là vòng lặp trong ss 2 con số trong ,
//               là ss thằng j và j+1 , lấy index ra nên luôn j< j+1 và j+1<n-i
// => sau khi vòng lặp ngoài xong sẽ trừ i , vì sau khi 1 vòng lặp sẽ phải mất đi ( thằng lớn nhất nămf cuối )
//                  if(a[j] > a[i]) {
//                      Đổi chỗ swap
//                      int temp = a[j];
//                      a[j] = a[j+1];
//                      a[j+1] = temp;
//  }
//}
//public static void main(String[] args) {
//  int [] arr = {1,6,3,4,7,8,9,3};
//}

// int n = arr.length
// boolean is storted
// for (i=0;i<n-1,i++)}
// for (j=0;j<n-1-i,j++){
//      issorted = false;
// if (arr[j] > arr[j+1]){
//
//  if( issorted)


// Insertion Sort ( Sắp xếp chèn )
// Nguyên lý hoạt động
// 1.chạy từ đầu đến cuối mảng
// 2.Tại vòng lặp i , coi nhừ từ [0,i-1] đã được sắp xếp . sau đó chèn a,i vào vị trí thích hợp
// 3. Sau vòng lặp i thì dãy [0,i] đã được sắp xếp

// Thuật toán chạy : sắp xếp nếu số sau bé hơn số trước sẽ đổi chỗ , còn nếu lớn sẽ đổi chỗ ở chỗ đó


// OOP là Object-Oriented Programming ( Lập trình hướng đối tượng )
// OOP là xoanh quanh hướng đối tượng , mô phỏng thế giới thật
// vào chương trình thế giới ảo thông qua suy nghĩ cách lập trình của chúng ta

// Các lợi thế OOP
//- clear Structure : cấu trúc rõ ràng
//- Reuse application code : tính tái sử dụng code cao ==> dễ dàng maintain( bảo trì ),
// modify(sửa đổi) và debug(fix bug)
//- designing larger and complex programs( tương tự argular ):
// --> mục tiêu giải quyết các bài toán phức tạp

// Có rất nhiều cách để hoàn thiện 1 chương :
//- procedural programming (pascal)/structure programming
//- fuctional programming ( react hook and react class component)
//- object oriented programming........

// Class và Object
// Để mô phỏng "real world", chúng ta cần các " đổi tượng"(target)
// VD : Đối tượng là sinh viên
// Đặc điểm : mssv,địa chỉ, tên lớp....
// Hành vi : Ôn tủ bài, ăn , ngủ, xem phim,.....
//=> Sử dụng " đối tượng " để mô hình hóa"
// Tuy nhiên , chúng ta không miêu tả chi tiết", chỉ miêu tả "đối tượng tổng quát"
//(Đây gọi là tính trừu tượng hóa/abstraction)
// Đối tượng tổng quát được gọi là class (lớp) , còn mỗi sinh viên cụ thể gọi là Object(đối tượng).
//Khái niệm :
// class chính là " Đối tượng tổng quát " của real-word được mô phỏng
// Object là các thực tế chi tiết của class đấy (instance)

// Cái hàm mà không có tham số thì java sẽ tự động khởi tạo cho
// Từ this có thể hiểu là tham chiếu

// Modifier là quyền hạn sửa đổi
// Access Modifier ( private , public, protected)
// packeage === folder ( javacript thì chỉ là folder chứa code)
// còn java => Được sử dụng gom nhóm file lại vs nhau => cho gọn
// Đuọc sử dụng để import ( tái sử dụng lại ) các class đã dc định nghĩa trong class

// Access Modifier ( Quyền truy cập sử dụng / sửa đổi )
// - private : chỉ được sử dụng trong nội bộ class
// - public : Công khai hoàn toàn 100%
// -  default : là public đối với class trong cùng package, là private khi khác package

//- protected ( bảo vệ ) : được sử dụng với lớp cha/ con ( tính chất kế thừa : sẽ đề cập sau )
// => public và private là 2 thuộc tính được sử dụng nhiều nhất

// Mức độ bảo mật / che giấu dữ liệu tăng dần theo mũi tên :
// public -> protected -> default -> private ( cao )
// Đối với private thì chỉ được sử đổi bên trong chính nó thôi
// Public là gọi ở đâu cũng được ( công khai ) nếu muốn sử dụng 1 biến mà ở khắp mọi nơi
// còn default nếu dùng trong cùng package thì = public
// còn default nếu dùng khác package thì = private
// protected dùng khác package thì không có quan hệ gì với nhau
// protected có thể kế thừa trực tiếp thông qua extands
// nếu muốn kế thừa có thể dùng protected

// encapsulation là đóng gói

// Non-primitive ( reference ) data type

// Biến thông thường kiểu dữ liệu nguyên thủy sẽ lưu trong stack
// Lưu các object hoặc array chẳng hạn sẽ lưu vào heap

// Java autoBoxing / unboxing (Object wrapper class )

// genaric ( từ java 5 ) không hỗ trợ " kiểu dữ liệu nguyên thủy " hiểu đơn giản thì là đảm bảo hiệu năng cao )

// => Cần có 1 giải pháp để convert " primitive type" => " non-primitive type"
// => Nên từ đó object wrapper class ra đời

// Tạo wrapper class
// => Interger object = new Interger(1)
// => convert ngược lại : int val = object.intValue();

// Autoboxing và un autoboxing
// 'Boxing' convert từ primitive value (GT nguyên thủy )=> chuyển thành object (wrapper class )
// 'Unboxing' là quá trình ngược lại , từ object => GT nguyên thủy
// => Công việc Boxing/ Unboxing do compiler " Tự động làm"

// Generic có thể hiểu là cú pháp được giới thiệu vào v5 của Java, cải thiện chất lượng code
// Tại sao nên dùng
// => Generic giúp " báo lỗi " khi " dịch code " ( code gồm 2 giai đoạn : compile then run )
// => Giúp tái sử dụng code ( VD như viết các hàm , class tổng quát )

// Java Diamond có thể hiểu là đoán type
// VD : Box<Interger>box = new Box<>();
// Thay vì Box<Interger>box = new Box<Interger>();

// Các method hay dùng
// 1. String là object ( class )
// 2. length : lấy độ dài của chuỗi
// 3. trim() : bỏ đi dấu space đầu / cuối của chuỗi
// 4. toLowerCase() : Viết thường tất cả ký tự
// 5. toUpperCase() : Viết hoa tất cả ký tự
// 6. substring() : cắt chuỗi thành chuỗi con

// Equals trong java là so sánh

// Regular Expression (RegE) ( có thể gọi là Biểu thức chính quy )
// Mục đích là : text search , text replace

// Java hỗ trợ gói :java.util.regex để xử lý regular expresion , bao gồm các class chính:
//- Pattern Class : định nghĩa " Hình thức để Search"
//- Matcher Class : được sử dụng để Search
//- PatternSyntaxException Class : xử lý exception về lỗi cú pháp


// Java Inheritance ( Kế thừa )
// Với java , chúng ta có thể "kế thừa /thừa hưởng"(Inherit)
// thuộc tính và phước (attribute & method) từ 1 class khác

// Kế thừa được phân cấp thành :
// subclass (class) : đứa con , sẽ kế thừa lại "thành quả " của các class khác
// superclass ( parent) : cha mẹ, sẽ cho đi " tài sản " để class khác kế thừa lại

// Nguyên tắc kế thừa
// 1 class chỉ có thể kế thừa " duy nhất " 1 class khác ( đơn kế thừa )
// ( nếu muốn kế thừa nhiều , sử dụng interface )

// Để kế thừa , sử dụng keywword " extends "

// 1. Sử dụng keywword super
// Sử dụng keyword super để truy cập tới thuộc tính và method của cha
// VD : function: getPriceTax

// 2. Method Overriding
// Đây là cách đè lên method
//  Tên method ( số lượng tham số ) giống hệt như giữa child/parent

// Lưu ý : Phân biệt method overriding và method overloading


// Polymorphism (Tính đa hình)
// 1.Upcasting và downcasting in java
// 2. Polymorphism ( many-form )

// Interface là một cách để thực hiện tính " kế thừa /inherit" trong java ( bên cạnh abstract class )
// Là một tập hợp của các methods ( không có body )
// ( không đề cập tới default method )

// Đặc điểm của interface
// Interface không có body => body được ghi đè tại các class "implements"
// Khi kế thừa interface, cần ghi đè lên tất cả method của interface ( Ngoại trừ default method )
// Mặc định , tất cả method của interface là "abstract" + "public"
// Thay vì viết : abstract public void animalSound(); => void animalSound();
// Interface không thể có constructor
//=> không thể tạo object từ interface ( VD là không thể tạo Animal Object )
// 1 class có thể kế thừa cùng lúc nhiều interface ( Abstract class là kế thừa 1:1 )

// Kế thừa nhiều interface
// 1 class có thể kế thừa nhiều interface ( Mở overstack đọc )

// Interface với Java 8
// Hãy so sánh Interface và Abstract Class

// Java package
// Package là folder , thùng chứa code
// là tập hợp các class, interface và có thể chứa sub-package ( cha/con )

// Truy cập package
// - các class mà dự định sẽ được sử dụng ngoài package => Định danh puclic (private , deafault , protected, publc )
// - các class khác nhau có thể khai báo các class " Trùng tên "

// SỬ dụng packages

// Ưu điểm của Streams

// I/0 Streams
// byte Streams
// Character Streams
// Buffered Streams

// Path Class ( Bảo nơi nào mà trong máy tính nơi nào tồn tại file )
// Relative Path ( Đường dẫn tương đối )
// Absolute path ( Đường dẫn tuyệt đối )

// Thread Objects

// Application : chương trình chạy trên máy tính
// VD : spring tool suite, google chrome,..

// Task : các nhiệm vụ cần thực hiện
// Multi-tasking : Làm nhiệm vụ cùng lúc
// Processes ( Tiến trình ) : Để chạy 1 applications , cần 1 ( Hoặc nhiều ) processes
// Đặc điểm : Mỗi process " Có không gian riêng " để chạy => Không chia sẻ memory
// VD : 1 tab = 1 process

// Threads ( Luồng )
// 1 process cần ít nhất 1 Thread ( main thread )
// => process chứa Thread
// Đặc điểm : Các Thread chia sẻ nguồn tài nguyên

// Hiểu đơn giản  :
// Thread là đơn vị nhỏ nhất để thực thi code
// Thread giúp thục hiện các " Nhiệm vụ " của chương trình, VD : in ra màn hình, xuất file,..
// Multi-thread là cách thực thi nhiều thread song song


//////////////////Android/////////////////////////////
// uquece
// stack
 // thao tác thêm hoặc xóa



// OOP là một kĩ thuật lập trình ( lập trình hướng đối tượng )
// Công thức OOP = methods + attributes ( Nhiều phương thức , thuộc tính )
// Ngoài OOP Còn có OAP (Lập trình hướng khí cạnh )
// Trước OOP còn có lập trình hướng cấu trúc ( C , C+ , Pascal )
// Phải đảm bảo 4 tính chất mới được gọi là OOP
// 1. Inheritance ( kế thừa )
// 2. Encapsulation ( đóng gói )
// 3. Polymophirm ( đa hình )
// 4. Abstraction ( trừu tượng )
// public mang tính đóng gói ( Encassulation )
// Encapsulation được thể hiện AccessModifier ( Phạm vi truy cập (đối tượng , phương thức , ...)
// AccessModifier ( Public , protected , default , private )
// private là 1 AccessModifier có tính đóng gói
// private có 1 phương thức là get/set
// Class đơn gỉan là khai báo 1 biến
// class là 1 lớp , sẽ chừa nhiều trường
// entity , modal đều là
// có 3 kiểu đặt tên biến trong java : PasCal-lớp,danh từ, caMel-biến/method(kiểu con lạc đà), (kiểu con rắn)
// OOP Đơn giản là định dạng
// 1 class cần có 1 constructor ( hàm tạo, là 1 pt giúp các bann khởi tạo ra 1 hàm có thuộc tính VD ; Sinhvien(){};
// new là khai báo 1 đối tượng cho 1 class

// Sự khác biệt giữa class và object :
// Object là 1 đối tượng được cụ thể từ 1 class
// class là lớp
// Tương tác qua object chứ không qua class

// VD như static , phươg thức static , áp dụng vào thực tế thế nào
// 1 thứ gì đó thuộc về class hoặc về object
// class được sinh ra trước , đối tượng sinh ra sạu
// sẽ quét toàn bộ dự án
// Những thứ của class chưa chắc đã của object
// CÒn object sẽ là của class
// Nếu static đứng trước 1 phương thức, biến thì sẽ là phươg thức tĩnh
// Static có thể là phương thức tĩnh nhưng
// main là key , chương trình chạy thì chỉ chạy trong hàm main
// ĐỐi số của hàm main là  ( VD chuột , bàn phím )
// Khi có 1 đối tượng cụ thể hẵn sài không lạm dụng
// Dùng để lưu trữ những biến hard code trong đó
// lji trường mang tính clobal , còn hard code  , tên công ty , công hòa chủ nghĩa VN ( nên lưu trữ kiếu static )
// còn nếu dữ liệu biến động , thay đổi như cổ phiếu,... thì không nên
// 1 phương thức chỉ lấy , truyền dữ vaf set dữ liệu
// set có giá trị trả về , get không có già trị trả về
